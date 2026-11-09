#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_graphics_gdi_wrapper.h"
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

int32_t windowssys_windows_win32_graphics_gdi_AbortPath(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AbortPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_AddFontMemResourceEx(void* pfileview, uint32_t cjsize, void* pvresrved, void* pnumfonts) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontMemResourceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfileview, cjsize, pvresrved, pnumfonts);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pfileview;
    (void)cjsize;
    (void)pvresrved;
    (void)pnumfonts;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_AddFontResourceA(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceA");
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

int32_t windowssys_windows_win32_graphics_gdi_AddFontResourceExA(void* name, uint32_t fl, void* res) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, fl, res);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)fl;
    (void)res;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_AddFontResourceExW(void* name, uint32_t fl, void* res) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, fl, res);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)fl;
    (void)res;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_AddFontResourceW(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddFontResourceW");
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

int32_t windowssys_windows_win32_graphics_gdi_AngleArc(void* hdc, int32_t x, int32_t y, uint32_t r, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AngleArc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, r, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)r;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_AnimatePalette(void* hpal, uint32_t istartindex, uint32_t centries, void* ppe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AnimatePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpal, istartindex, centries, ppe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpal;
    (void)istartindex;
    (void)centries;
    (void)ppe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_Arc(void* hdc, int32_t x1, int32_t y1, int32_t x2, int32_t y2, int32_t x3, int32_t y3, int32_t x4, int32_t y4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Arc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x1, y1, x2, y2, x3, y3, x4, y4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ArcTo(void* hdc, int32_t left, int32_t top, int32_t right, int32_t bottom, int32_t xr1, int32_t yr1, int32_t xr2, int32_t yr2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ArcTo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, left, top, right, bottom, xr1, yr1, xr2, yr2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    (void)xr1;
    (void)yr1;
    (void)xr2;
    (void)yr2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_BeginPaint(void* hwnd, void* lppaint) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginPaint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lppaint);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)lppaint;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_BeginPath(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_BitBlt(void* hdc, int32_t x, int32_t y, int32_t cx, int32_t cy, void* hdcsrc, int32_t x1, int32_t y1, uint32_t rop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BitBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, cx, cy, hdcsrc, x1, y1, rop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)hdcsrc;
    (void)x1;
    (void)y1;
    (void)rop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_CancelDC(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsA(void* lpdevmode, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdevmode, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdevmode;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsExA(void* lpszdevicename, void* lpdevmode, void* hwnd, uint32_t dwflags, void* lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdevicename, lpdevmode, hwnd, dwflags, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdevicename;
    (void)lpdevmode;
    (void)hwnd;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsExW(void* lpszdevicename, void* lpdevmode, void* hwnd, uint32_t dwflags, void* lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdevicename, lpdevmode, hwnd, dwflags, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdevicename;
    (void)lpdevmode;
    (void)hwnd;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsW(void* lpdevmode, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeDisplaySettingsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdevmode, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdevmode;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_Chord(void* hdc, int32_t x1, int32_t y1, int32_t x2, int32_t y2, int32_t x3, int32_t y3, int32_t x4, int32_t y4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Chord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x1, y1, x2, y2, x3, y3, x4, y4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ClientToScreen(void* hwnd, void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClientToScreen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CloseEnhMetaFile(void* hdc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseEnhMetaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_CloseFigure(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseFigure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CloseMetaFile(void* hdc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseMetaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_CombineRgn(void* hrgndst, void* hrgnsrc1, void* hrgnsrc2, int32_t imode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CombineRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrgndst, hrgnsrc1, hrgnsrc2, imode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrgndst;
    (void)hrgnsrc1;
    (void)hrgnsrc2;
    (void)imode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_CombineTransform(void* lpxfout, void* lpxf1, void* lpxf2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CombineTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpxfout, lpxf1, lpxf2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpxfout;
    (void)lpxf1;
    (void)lpxf2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CopyEnhMetaFileA(void* henh, void* lpfilename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyEnhMetaFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henh, lpfilename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)henh;
    (void)lpfilename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CopyEnhMetaFileW(void* henh, void* lpfilename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyEnhMetaFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henh, lpfilename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)henh;
    (void)lpfilename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CopyMetaFileA(void* param0, void* param1) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyMetaFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CopyMetaFileW(void* param0, void* param1) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyMetaFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_CopyRect(void* lprcdst, void* lprcsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprcdst, lprcsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprcdst;
    (void)lprcsrc;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateBitmap(int32_t nwidth, int32_t nheight, uint32_t nplanes, uint32_t nbitcount, void* lpbits) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nwidth, nheight, nplanes, nbitcount, lpbits);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)nwidth;
    (void)nheight;
    (void)nplanes;
    (void)nbitcount;
    (void)lpbits;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateBitmapIndirect(void* pbm) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBitmapIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbm);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pbm;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateBrushIndirect(void* plbrush) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBrushIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plbrush);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)plbrush;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateCompatibleBitmap(void* hdc, int32_t cx, int32_t cy) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCompatibleBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, cx, cy);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)cx;
    (void)cy;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateCompatibleDC(void* hdc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCompatibleDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateDCA(void* pwszdriver, void* pwszdevice, void* pszport, void* pdm) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDCA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszdriver, pwszdevice, pszport, pdm);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pwszdriver;
    (void)pwszdevice;
    (void)pszport;
    (void)pdm;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateDCW(void* pwszdriver, void* pwszdevice, void* pszport, void* pdm) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDCW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszdriver, pwszdevice, pszport, pdm);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pwszdriver;
    (void)pwszdevice;
    (void)pszport;
    (void)pdm;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateDIBPatternBrush(void* h, uint32_t iusage) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBPatternBrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(h, iusage);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)h;
    (void)iusage;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateDIBPatternBrushPt(void* lppackeddib, uint32_t iusage) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBPatternBrushPt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppackeddib, iusage);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lppackeddib;
    (void)iusage;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateDIBSection(void* hdc, void* pbmi, uint32_t usage, void* ppvbits, void* hsection, uint32_t offset) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pbmi, usage, ppvbits, hsection, offset);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)pbmi;
    (void)usage;
    (void)ppvbits;
    (void)hsection;
    (void)offset;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateDIBitmap(void* hdc, void* pbmih, uint32_t flinit, void* pjbits, void* pbmi, uint32_t iusage) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDIBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pbmih, flinit, pjbits, pbmi, iusage);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)pbmih;
    (void)flinit;
    (void)pjbits;
    (void)pbmi;
    (void)iusage;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateDiscardableBitmap(void* hdc, int32_t cx, int32_t cy) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDiscardableBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, cx, cy);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)cx;
    (void)cy;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateEllipticRgn(int32_t x1, int32_t y1, int32_t x2, int32_t y2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEllipticRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(x1, y1, x2, y2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateEllipticRgnIndirect(void* lprect) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEllipticRgnIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprect);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lprect;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateEnhMetaFileA(void* hdc, void* lpfilename, void* lprc, void* lpdesc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnhMetaFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpfilename, lprc, lpdesc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)lpfilename;
    (void)lprc;
    (void)lpdesc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateEnhMetaFileW(void* hdc, void* lpfilename, void* lprc, void* lpdesc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnhMetaFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpfilename, lprc, lpdesc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)lpfilename;
    (void)lprc;
    (void)lpdesc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateFontA(int32_t cheight, int32_t cwidth, int32_t cescapement, int32_t corientation, int32_t cweight, uint32_t bitalic, uint32_t bunderline, uint32_t bstrikeout, uint32_t icharset, uint32_t ioutprecision, uint32_t iclipprecision, uint32_t iquality, uint32_t ipitchandfamily, void* pszfacename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cheight, cwidth, cescapement, corientation, cweight, bitalic, bunderline, bstrikeout, icharset, ioutprecision, iclipprecision, iquality, ipitchandfamily, pszfacename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cheight;
    (void)cwidth;
    (void)cescapement;
    (void)corientation;
    (void)cweight;
    (void)bitalic;
    (void)bunderline;
    (void)bstrikeout;
    (void)icharset;
    (void)ioutprecision;
    (void)iclipprecision;
    (void)iquality;
    (void)ipitchandfamily;
    (void)pszfacename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateFontIndirectA(void* lplf) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplf);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lplf;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateFontIndirectExA(void* param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateFontIndirectExW(void* param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateFontIndirectW(void* lplf) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontIndirectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplf);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lplf;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_CreateFontPackage(void* puchsrcbuffer, uint32_t ulsrcbuffersize, void* ppuchfontpackagebuffer, void* pulfontpackagebuffersize, void* pulbyteswritten, uint16_t usflag, uint16_t usttcindex, uint16_t ussubsetformat, uint16_t ussubsetlanguage, int16_t ussubsetplatform, int16_t ussubsetencoding, void* pussubsetkeeplist, uint16_t ussubsetlistcount, void* lpfnallocate, void* lpfnreallocate, void* lpfnfree, void* lpvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint16_t, uint16_t, uint16_t, uint16_t, int16_t, int16_t, void*, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fontsub.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontPackage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puchsrcbuffer, ulsrcbuffersize, ppuchfontpackagebuffer, pulfontpackagebuffersize, pulbyteswritten, usflag, usttcindex, ussubsetformat, ussubsetlanguage, ussubsetplatform, ussubsetencoding, pussubsetkeeplist, ussubsetlistcount, lpfnallocate, lpfnreallocate, lpfnfree, lpvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)puchsrcbuffer;
    (void)ulsrcbuffersize;
    (void)ppuchfontpackagebuffer;
    (void)pulfontpackagebuffersize;
    (void)pulbyteswritten;
    (void)usflag;
    (void)usttcindex;
    (void)ussubsetformat;
    (void)ussubsetlanguage;
    (void)ussubsetplatform;
    (void)ussubsetencoding;
    (void)pussubsetkeeplist;
    (void)ussubsetlistcount;
    (void)lpfnallocate;
    (void)lpfnreallocate;
    (void)lpfnfree;
    (void)lpvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateFontW(int32_t cheight, int32_t cwidth, int32_t cescapement, int32_t corientation, int32_t cweight, uint32_t bitalic, uint32_t bunderline, uint32_t bstrikeout, uint32_t icharset, uint32_t ioutprecision, uint32_t iclipprecision, uint32_t iquality, uint32_t ipitchandfamily, void* pszfacename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFontW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cheight, cwidth, cescapement, corientation, cweight, bitalic, bunderline, bstrikeout, icharset, ioutprecision, iclipprecision, iquality, ipitchandfamily, pszfacename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cheight;
    (void)cwidth;
    (void)cescapement;
    (void)corientation;
    (void)cweight;
    (void)bitalic;
    (void)bunderline;
    (void)bstrikeout;
    (void)icharset;
    (void)ioutprecision;
    (void)iclipprecision;
    (void)iquality;
    (void)ipitchandfamily;
    (void)pszfacename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateHalftonePalette(void* hdc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHalftonePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateHatchBrush(int32_t ihatch, uint32_t color) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHatchBrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ihatch, color);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ihatch;
    (void)color;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateICA(void* pszdriver, void* pszdevice, void* pszport, void* pdm) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateICA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdriver, pszdevice, pszport, pdm);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszdriver;
    (void)pszdevice;
    (void)pszport;
    (void)pdm;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateICW(void* pszdriver, void* pszdevice, void* pszport, void* pdm) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateICW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdriver, pszdevice, pszport, pdm);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszdriver;
    (void)pszdevice;
    (void)pszport;
    (void)pdm;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateMetaFileA(void* pszfile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMetaFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfile;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateMetaFileW(void* pszfile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMetaFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszfile;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreatePalette(void* plpal) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plpal);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)plpal;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreatePatternBrush(void* hbm) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatternBrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbm);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hbm;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreatePen(int32_t istyle, int32_t cwidth, uint32_t color) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(istyle, cwidth, color);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)istyle;
    (void)cwidth;
    (void)color;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreatePenIndirect(void* plpen) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePenIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plpen);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)plpen;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreatePolyPolygonRgn(void* pptl, void* pc, int32_t cpoly, int32_t imode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePolyPolygonRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pptl, pc, cpoly, imode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pptl;
    (void)pc;
    (void)cpoly;
    (void)imode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreatePolygonRgn(void* pptl, int32_t cpoint, int32_t imode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePolygonRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pptl, cpoint, imode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pptl;
    (void)cpoint;
    (void)imode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateRectRgn(int32_t x1, int32_t y1, int32_t x2, int32_t y2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRectRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(x1, y1, x2, y2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateRectRgnIndirect(void* lprect) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRectRgnIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprect);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lprect;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateRoundRectRgn(int32_t x1, int32_t y1, int32_t x2, int32_t y2, int32_t w, int32_t h) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRoundRectRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(x1, y1, x2, y2, w, h);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)w;
    (void)h;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_CreateScalableFontResourceA(uint32_t fdwhidden, void* lpszfont, void* lpszfile, void* lpszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateScalableFontResourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fdwhidden, lpszfont, lpszfile, lpszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fdwhidden;
    (void)lpszfont;
    (void)lpszfile;
    (void)lpszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_CreateScalableFontResourceW(uint32_t fdwhidden, void* lpszfont, void* lpszfile, void* lpszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateScalableFontResourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fdwhidden, lpszfont, lpszfile, lpszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fdwhidden;
    (void)lpszfont;
    (void)lpszfile;
    (void)lpszpath;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_CreateSolidBrush(uint32_t color) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSolidBrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(color);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)color;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DPtoLP(void* hdc, void* lppt, int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DPtoLP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lppt, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lppt;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DeleteDC(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DeleteEnhMetaFile(void* hmf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteEnhMetaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DeleteMetaFile(void* hmf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteMetaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DeleteObject(void* ho) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ho);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ho;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawAnimatedRects(void* hwnd, int32_t idani, void* lprcfrom, void* lprcto) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawAnimatedRects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, idani, lprcfrom, lprcto);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)idani;
    (void)lprcfrom;
    (void)lprcto;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawCaption(void* hwnd, void* hdc, void* lprect, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawCaption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hdc, lprect, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hdc;
    (void)lprect;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawEdge(void* hdc, void* qrc, uint32_t edge, uint32_t grfflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawEdge");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, qrc, edge, grfflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)qrc;
    (void)edge;
    (void)grfflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawEscape(void* hdc, int32_t iescape, int32_t cjin, void* lpin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawEscape");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, iescape, cjin, lpin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)iescape;
    (void)cjin;
    (void)lpin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawFocusRect(void* hdc, void* lprc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawFocusRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lprc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawFrameControl(void* param0, void* param1, uint32_t param2, uint32_t param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawFrameControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawStateA(void* hdc, void* hbrfore, void* qfncallback, int64_t ldata, uint64_t wdata, int32_t x, int32_t y, int32_t cx, int32_t cy, uint32_t uflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint64_t, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawStateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hbrfore, qfncallback, ldata, wdata, x, y, cx, cy, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hbrfore;
    (void)qfncallback;
    (void)ldata;
    (void)wdata;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawStateW(void* hdc, void* hbrfore, void* qfncallback, int64_t ldata, uint64_t wdata, int32_t x, int32_t y, int32_t cx, int32_t cy, uint32_t uflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint64_t, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawStateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hbrfore, qfncallback, ldata, wdata, x, y, cx, cy, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hbrfore;
    (void)qfncallback;
    (void)ldata;
    (void)wdata;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawTextA(void* hdc, void* lpchtext, int32_t cchtext, void* lprc, uint32_t format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpchtext, cchtext, lprc, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawTextExA(void* hdc, void* lpchtext, int32_t cchtext, void* lprc, uint32_t format, void* lpdtp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpchtext, cchtext, lprc, format, lpdtp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    (void)lpdtp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawTextExW(void* hdc, void* lpchtext, int32_t cchtext, void* lprc, uint32_t format, void* lpdtp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpchtext, cchtext, lprc, format, lpdtp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    (void)lpdtp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_DrawTextW(void* hdc, void* lpchtext, int32_t cchtext, void* lprc, uint32_t format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpchtext, cchtext, lprc, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpchtext;
    (void)cchtext;
    (void)lprc;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_Ellipse(void* hdc, int32_t left, int32_t top, int32_t right, int32_t bottom) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ellipse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, left, top, right, bottom);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EndPaint(void* hwnd, void* lppaint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndPaint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lppaint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lppaint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EndPath(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumDisplayDevicesA(void* lpdevice, uint32_t idevnum, void* lpdisplaydevice, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplayDevicesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdevice, idevnum, lpdisplaydevice, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdevice;
    (void)idevnum;
    (void)lpdisplaydevice;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumDisplayDevicesW(void* lpdevice, uint32_t idevnum, void* lpdisplaydevice, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplayDevicesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdevice, idevnum, lpdisplaydevice, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdevice;
    (void)idevnum;
    (void)lpdisplaydevice;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumDisplayMonitors(void* hdc, void* lprcclip, void* lpfnenum, int64_t dwdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplayMonitors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprcclip, lpfnenum, dwdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lprcclip;
    (void)lpfnenum;
    (void)dwdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsA(void* lpszdevicename, uint32_t imodenum, void* lpdevmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdevicename, imodenum, lpdevmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsExA(void* lpszdevicename, uint32_t imodenum, void* lpdevmode, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdevicename, imodenum, lpdevmode, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsExW(void* lpszdevicename, uint32_t imodenum, void* lpdevmode, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdevicename, imodenum, lpdevmode, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsW(void* lpszdevicename, uint32_t imodenum, void* lpdevmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDisplaySettingsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdevicename, imodenum, lpdevmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdevicename;
    (void)imodenum;
    (void)lpdevmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumEnhMetaFile(void* hdc, void* hmf, void* proc, void* param3, void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumEnhMetaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hmf, proc, param3, lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hmf;
    (void)proc;
    (void)param3;
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumFontFamiliesA(void* hdc, void* lplogfont, void* lpproc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lplogfont, lpproc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumFontFamiliesExA(void* hdc, void* lplogfont, void* lpproc, int64_t lparam, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lplogfont, lpproc, lparam, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumFontFamiliesExW(void* hdc, void* lplogfont, void* lpproc, int64_t lparam, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lplogfont, lpproc, lparam, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumFontFamiliesW(void* hdc, void* lplogfont, void* lpproc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontFamiliesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lplogfont, lpproc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumFontsA(void* hdc, void* lplogfont, void* lpproc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lplogfont, lpproc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumFontsW(void* hdc, void* lplogfont, void* lpproc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumFontsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lplogfont, lpproc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lplogfont;
    (void)lpproc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumMetaFile(void* hdc, void* hmf, void* proc, int64_t param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumMetaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hmf, proc, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hmf;
    (void)proc;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EnumObjects(void* hdc, int32_t ntype, void* lpfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumObjects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ntype, lpfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ntype;
    (void)lpfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EqualRect(void* lprc1, void* lprc2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprc1, lprc2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprc1;
    (void)lprc2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_EqualRgn(void* hrgn1, void* hrgn2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrgn1, hrgn2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrgn1;
    (void)hrgn2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ExcludeClipRect(void* hdc, int32_t left, int32_t top, int32_t right, int32_t bottom) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExcludeClipRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, left, top, right, bottom);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ExcludeUpdateRgn(void* hdc, void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExcludeUpdateRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_ExtCreatePen(uint32_t ipenstyle, uint32_t cwidth, void* plbrush, uint32_t cstyle, void* pstyle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtCreatePen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ipenstyle, cwidth, plbrush, cstyle, pstyle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ipenstyle;
    (void)cwidth;
    (void)plbrush;
    (void)cstyle;
    (void)pstyle;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_ExtCreateRegion(void* lpx, uint32_t ncount, void* lpdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtCreateRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpx, ncount, lpdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpx;
    (void)ncount;
    (void)lpdata;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ExtFloodFill(void* hdc, int32_t x, int32_t y, uint32_t color, uint32_t type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtFloodFill");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, color, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ExtSelectClipRgn(void* hdc, void* hrgn, int32_t mode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtSelectClipRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hrgn, mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hrgn;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ExtTextOutA(void* hdc, int32_t x, int32_t y, uint32_t options, void* lprect, void* lpstring, uint32_t c, void* lpdx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtTextOutA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, options, lprect, lpstring, c, lpdx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)options;
    (void)lprect;
    (void)lpstring;
    (void)c;
    (void)lpdx;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ExtTextOutW(void* hdc, int32_t x, int32_t y, uint32_t options, void* lprect, void* lpstring, uint32_t c, void* lpdx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtTextOutW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, options, lprect, lpstring, c, lpdx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)options;
    (void)lprect;
    (void)lpstring;
    (void)c;
    (void)lpdx;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_FillPath(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FillPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_FillRect(void* hdc, void* lprc, void* hbr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FillRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprc, hbr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lprc;
    (void)hbr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_FillRgn(void* hdc, void* hrgn, void* hbr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FillRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hrgn, hbr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hrgn;
    (void)hbr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_FixBrushOrgEx(void* hdc, int32_t x, int32_t y, void* ptl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FixBrushOrgEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, ptl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)ptl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_FlattenPath(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlattenPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_FloodFill(void* hdc, int32_t x, int32_t y, uint32_t color) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FloodFill");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, color);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_FrameRect(void* hdc, void* lprc, void* hbr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FrameRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprc, hbr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lprc;
    (void)hbr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_FrameRgn(void* hdc, void* hrgn, void* hbr, int32_t w, int32_t h) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FrameRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hrgn, hbr, w, h);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hrgn;
    (void)hbr;
    (void)w;
    (void)h;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GdiComment(void* hdc, uint32_t nsize, void* lpdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiComment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, nsize, lpdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)nsize;
    (void)lpdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GdiFlush(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiFlush");
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

uint32_t windowssys_windows_win32_graphics_gdi_GdiGetBatchLimit(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetBatchLimit");
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

int32_t windowssys_windows_win32_graphics_gdi_GdiGradientFill(void* hdc, void* pvertex, uint32_t nvertex, void* pmesh, uint32_t ncount, uint32_t ulmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGradientFill");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pvertex, nvertex, pmesh, ncount, ulmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pvertex;
    (void)nvertex;
    (void)pmesh;
    (void)ncount;
    (void)ulmode;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GdiSetBatchLimit(uint32_t dw) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiSetBatchLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dw);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dw;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GdiTransparentBlt(void* hdcdest, int32_t xorigindest, int32_t yorigindest, int32_t wdest, int32_t hdest, void* hdcsrc, int32_t xoriginsrc, int32_t yoriginsrc, int32_t wsrc, int32_t hsrc, uint32_t crtransparent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiTransparentBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdcdest, xorigindest, yorigindest, wdest, hdest, hdcsrc, xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdcdest;
    (void)xorigindest;
    (void)yorigindest;
    (void)wdest;
    (void)hdest;
    (void)hdcsrc;
    (void)xoriginsrc;
    (void)yoriginsrc;
    (void)wsrc;
    (void)hsrc;
    (void)crtransparent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetArcDirection(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetArcDirection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetAspectRatioFilterEx(void* hdc, void* lpsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAspectRatioFilterEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetBitmapBits(void* hbit, int32_t cb, void* lpvbits) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBitmapBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbit, cb, lpvbits);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbit;
    (void)cb;
    (void)lpvbits;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetBitmapDimensionEx(void* hbit, void* lpsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBitmapDimensionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbit, lpsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbit;
    (void)lpsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetBkColor(void* hdc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBkColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetBkMode(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBkMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetBoundsRect(void* hdc, void* lprect, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBoundsRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprect, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)lprect;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetBrushOrgEx(void* hdc, void* lppt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBrushOrgEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lppt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lppt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharABCWidthsA(void* hdc, uint32_t wfirst, uint32_t wlast, void* lpabc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, wfirst, wlast, lpabc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)wfirst;
    (void)wlast;
    (void)lpabc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharABCWidthsFloatA(void* hdc, uint32_t ifirst, uint32_t ilast, void* lpabc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsFloatA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ifirst, ilast, lpabc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpabc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharABCWidthsFloatW(void* hdc, uint32_t ifirst, uint32_t ilast, void* lpabc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsFloatW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ifirst, ilast, lpabc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpabc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharABCWidthsI(void* hdc, uint32_t gifirst, uint32_t cgi, void* pgi, void* pabc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, gifirst, cgi, pgi, pabc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)gifirst;
    (void)cgi;
    (void)pgi;
    (void)pabc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharABCWidthsW(void* hdc, uint32_t wfirst, uint32_t wlast, void* lpabc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharABCWidthsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, wfirst, wlast, lpabc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)wfirst;
    (void)wlast;
    (void)lpabc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharWidth32A(void* hdc, uint32_t ifirst, uint32_t ilast, void* lpbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidth32A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ifirst, ilast, lpbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharWidth32W(void* hdc, uint32_t ifirst, uint32_t ilast, void* lpbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidth32W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ifirst, ilast, lpbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharWidthA(void* hdc, uint32_t ifirst, uint32_t ilast, void* lpbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ifirst, ilast, lpbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharWidthFloatA(void* hdc, uint32_t ifirst, uint32_t ilast, void* lpbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthFloatA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ifirst, ilast, lpbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharWidthFloatW(void* hdc, uint32_t ifirst, uint32_t ilast, void* lpbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthFloatW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ifirst, ilast, lpbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharWidthI(void* hdc, uint32_t gifirst, uint32_t cgi, void* pgi, void* piwidths) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, gifirst, cgi, pgi, piwidths);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)gifirst;
    (void)cgi;
    (void)pgi;
    (void)piwidths;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCharWidthW(void* hdc, uint32_t ifirst, uint32_t ilast, void* lpbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharWidthW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ifirst, ilast, lpbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ifirst;
    (void)ilast;
    (void)lpbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetCharacterPlacementA(void* hdc, void* lpstring, int32_t ncount, int32_t nmexextent, void* lpresults, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharacterPlacementA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpstring, ncount, nmexextent, lpresults, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)lpstring;
    (void)ncount;
    (void)nmexextent;
    (void)lpresults;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetCharacterPlacementW(void* hdc, void* lpstring, int32_t ncount, int32_t nmexextent, void* lpresults, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCharacterPlacementW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpstring, ncount, nmexextent, lpresults, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)lpstring;
    (void)ncount;
    (void)nmexextent;
    (void)lpresults;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetClipBox(void* hdc, void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipBox");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetClipRgn(void* hdc, void* hrgn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hrgn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hrgn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetColorAdjustment(void* hdc, void* lpca) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorAdjustment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpca);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpca;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_GetCurrentObject(void* hdc, uint32_t type) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, type);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)type;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetCurrentPositionEx(void* hdc, void* lppt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPositionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lppt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lppt;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_GetDC(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDC");
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

uint32_t windowssys_windows_win32_graphics_gdi_GetDCBrushColor(void* hdc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCBrushColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_graphics_gdi_GetDCEx(void* hwnd, void* hrgnclip, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hrgnclip, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)hrgnclip;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetDCOrgEx(void* hdc, void* lppt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCOrgEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lppt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lppt;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetDCPenColor(void* hdc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCPenColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetDIBColorTable(void* hdc, uint32_t istart, uint32_t centries, void* prgbq) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDIBColorTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, istart, centries, prgbq);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)istart;
    (void)centries;
    (void)prgbq;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetDIBits(void* hdc, void* hbm, uint32_t start, uint32_t clines, void* lpvbits, void* lpbmi, uint32_t usage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDIBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hbm, start, clines, lpvbits, lpbmi, usage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hbm;
    (void)start;
    (void)clines;
    (void)lpvbits;
    (void)lpbmi;
    (void)usage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetDeviceCaps(void* hdc, int32_t arg_1_index) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, arg_1_index);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)arg_1_index;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_GetEnhMetaFileA(void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetEnhMetaFileBits(void* hemf, uint32_t nsize, void* lpdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hemf, nsize, lpdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hemf;
    (void)nsize;
    (void)lpdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetEnhMetaFileDescriptionA(void* hemf, uint32_t cchbuffer, void* lpdescription) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileDescriptionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hemf, cchbuffer, lpdescription);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hemf;
    (void)cchbuffer;
    (void)lpdescription;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetEnhMetaFileDescriptionW(void* hemf, uint32_t cchbuffer, void* lpdescription) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileDescriptionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hemf, cchbuffer, lpdescription);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hemf;
    (void)cchbuffer;
    (void)lpdescription;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetEnhMetaFileHeader(void* hemf, uint32_t nsize, void* lpenhmetaheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hemf, nsize, lpenhmetaheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hemf;
    (void)nsize;
    (void)lpenhmetaheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetEnhMetaFilePaletteEntries(void* hemf, uint32_t nnumentries, void* lppaletteentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFilePaletteEntries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hemf, nnumentries, lppaletteentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hemf;
    (void)nnumentries;
    (void)lppaletteentries;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_graphics_gdi_GetEnhMetaFileW(void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetFontData(void* hdc, uint32_t dwtable, uint32_t dwoffset, void* pvbuffer, uint32_t cjbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFontData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, dwtable, dwoffset, pvbuffer, cjbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)dwtable;
    (void)dwoffset;
    (void)pvbuffer;
    (void)cjbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetFontLanguageInfo(void* hdc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFontLanguageInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetFontUnicodeRanges(void* hdc, void* lpgs) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFontUnicodeRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpgs);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)lpgs;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetGlyphIndicesA(void* hdc, void* lpstr, int32_t c, void* pgi, uint32_t fl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphIndicesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpstr, c, pgi, fl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)lpstr;
    (void)c;
    (void)pgi;
    (void)fl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetGlyphIndicesW(void* hdc, void* lpstr, int32_t c, void* pgi, uint32_t fl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphIndicesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpstr, c, pgi, fl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)lpstr;
    (void)c;
    (void)pgi;
    (void)fl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetGlyphOutlineA(void* hdc, uint32_t uchar, uint32_t fuformat, void* lpgm, uint32_t cjbuffer, void* pvbuffer, void* lpmat2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphOutlineA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, uchar, fuformat, lpgm, cjbuffer, pvbuffer, lpmat2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)uchar;
    (void)fuformat;
    (void)lpgm;
    (void)cjbuffer;
    (void)pvbuffer;
    (void)lpmat2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetGlyphOutlineW(void* hdc, uint32_t uchar, uint32_t fuformat, void* lpgm, uint32_t cjbuffer, void* pvbuffer, void* lpmat2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGlyphOutlineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, uchar, fuformat, lpgm, cjbuffer, pvbuffer, lpmat2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)uchar;
    (void)fuformat;
    (void)lpgm;
    (void)cjbuffer;
    (void)pvbuffer;
    (void)lpmat2;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetGraphicsMode(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGraphicsMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetKerningPairsA(void* hdc, uint32_t npairs, void* lpkernpair) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKerningPairsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, npairs, lpkernpair);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)npairs;
    (void)lpkernpair;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetKerningPairsW(void* hdc, uint32_t npairs, void* lpkernpair) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKerningPairsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, npairs, lpkernpair);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)npairs;
    (void)lpkernpair;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetLayout(void* hdc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLayout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetMapMode(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMapMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_GetMetaFileA(void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetMetaFileBitsEx(void* hmf, uint32_t cbbuffer, void* lpdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaFileBitsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmf, cbbuffer, lpdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmf;
    (void)cbbuffer;
    (void)lpdata;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_graphics_gdi_GetMetaFileW(void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetMetaRgn(void* hdc, void* hrgn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMetaRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hrgn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hrgn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetMiterLimit(void* hdc, void* plimit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMiterLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, plimit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)plimit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetMonitorInfoA(void* hmonitor, void* lpmi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, lpmi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)lpmi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetMonitorInfoW(void* hmonitor, void* lpmi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, lpmi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)lpmi;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetNearestColor(void* hdc, uint32_t color) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNearestColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, color);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)color;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetNearestPaletteIndex(void* h, uint32_t color) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNearestPaletteIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(h, color);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)h;
    (void)color;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetObjectA(void* h, int32_t c, void* pv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetObjectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(h, c, pv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)h;
    (void)c;
    (void)pv;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetObjectType(void* h) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetObjectType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(h);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)h;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetObjectW(void* h, int32_t c, void* pv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetObjectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(h, c, pv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)h;
    (void)c;
    (void)pv;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetOutlineTextMetricsA(void* hdc, uint32_t cjcopy, void* potm) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOutlineTextMetricsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, cjcopy, potm);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)cjcopy;
    (void)potm;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetOutlineTextMetricsW(void* hdc, uint32_t cjcopy, void* potm) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOutlineTextMetricsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, cjcopy, potm);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)cjcopy;
    (void)potm;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetPaletteEntries(void* hpal, uint32_t istart, uint32_t centries, void* ppalentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPaletteEntries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpal, istart, centries, ppalentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpal;
    (void)istart;
    (void)centries;
    (void)ppalentries;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetPath(void* hdc, void* apt, void* aj, int32_t cpt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, apt, aj, cpt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)apt;
    (void)aj;
    (void)cpt;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetPixel(void* hdc, int32_t x, int32_t y) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPixel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetPolyFillMode(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPolyFillMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetROP2(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetROP2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetRandomRgn(void* hdc, void* hrgn, int32_t i) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRandomRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hrgn, i);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hrgn;
    (void)i;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetRasterizerCaps(void* lpraststat, uint32_t cjbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRasterizerCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpraststat, cjbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpraststat;
    (void)cjbytes;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetRegionData(void* hrgn, uint32_t ncount, void* lprgndata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegionData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrgn, ncount, lprgndata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrgn;
    (void)ncount;
    (void)lprgndata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetRgnBox(void* hrgn, void* lprc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRgnBox");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrgn, lprc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrgn;
    (void)lprc;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_GetStockObject(int32_t i) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStockObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(i);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)i;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetStretchBltMode(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStretchBltMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetSysColor(int32_t nindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSysColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nindex;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_graphics_gdi_GetSysColorBrush(int32_t nindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSysColorBrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)nindex;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetSystemPaletteEntries(void* hdc, uint32_t istart, uint32_t centries, void* ppalentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemPaletteEntries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, istart, centries, ppalentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)istart;
    (void)centries;
    (void)ppalentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetSystemPaletteUse(void* hdc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemPaletteUse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetTabbedTextExtentA(void* hdc, void* lpstring, int32_t chcount, int32_t ntabpositions, void* lpntabstoppositions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTabbedTextExtentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpstring, chcount, ntabpositions, lpntabstoppositions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetTabbedTextExtentW(void* hdc, void* lpstring, int32_t chcount, int32_t ntabpositions, void* lpntabstoppositions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTabbedTextExtentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpstring, chcount, ntabpositions, lpntabstoppositions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetTextAlign(void* hdc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextAlign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextCharacterExtra(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextCharacterExtra");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetTextColor(void* hdc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextExtentExPointA(void* hdc, void* lpszstring, int32_t cchstring, int32_t nmaxextent, void* lpnfit, void* lpndx, void* lpsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentExPointA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpszstring, cchstring, nmaxextent, lpnfit, lpndx, lpsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpszstring;
    (void)cchstring;
    (void)nmaxextent;
    (void)lpnfit;
    (void)lpndx;
    (void)lpsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextExtentExPointI(void* hdc, void* lpwszstring, int32_t cwchstring, int32_t nmaxextent, void* lpnfit, void* lpndx, void* lpsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentExPointI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpwszstring, cwchstring, nmaxextent, lpnfit, lpndx, lpsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpwszstring;
    (void)cwchstring;
    (void)nmaxextent;
    (void)lpnfit;
    (void)lpndx;
    (void)lpsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextExtentExPointW(void* hdc, void* lpszstring, int32_t cchstring, int32_t nmaxextent, void* lpnfit, void* lpndx, void* lpsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentExPointW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpszstring, cchstring, nmaxextent, lpnfit, lpndx, lpsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpszstring;
    (void)cchstring;
    (void)nmaxextent;
    (void)lpnfit;
    (void)lpndx;
    (void)lpsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextExtentPoint32A(void* hdc, void* lpstring, int32_t c, void* psizl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPoint32A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpstring, c, psizl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)psizl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextExtentPoint32W(void* hdc, void* lpstring, int32_t c, void* psizl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPoint32W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpstring, c, psizl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)psizl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextExtentPointA(void* hdc, void* lpstring, int32_t c, void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPointA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpstring, c, lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextExtentPointI(void* hdc, void* pgiin, int32_t cgi, void* psize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPointI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pgiin, cgi, psize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pgiin;
    (void)cgi;
    (void)psize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextExtentPointW(void* hdc, void* lpstring, int32_t c, void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextExtentPointW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpstring, c, lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpstring;
    (void)c;
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextFaceA(void* hdc, int32_t c, void* lpname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextFaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, c, lpname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)c;
    (void)lpname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextFaceW(void* hdc, int32_t c, void* lpname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextFaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, c, lpname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)c;
    (void)lpname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextMetricsA(void* hdc, void* lptm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextMetricsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lptm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lptm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetTextMetricsW(void* hdc, void* lptm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextMetricsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lptm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lptm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetUpdateRect(void* hwnd, void* lprect, int32_t berase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUpdateRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lprect, berase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lprect;
    (void)berase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetUpdateRgn(void* hwnd, void* hrgn, int32_t berase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUpdateRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hrgn, berase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hrgn;
    (void)berase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetViewportExtEx(void* hdc, void* lpsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetViewportExtEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetViewportOrgEx(void* hdc, void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetViewportOrgEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_GetWinMetaFileBits(void* hemf, uint32_t cbdata16, void* pdata16, int32_t imapmode, void* hdcref) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWinMetaFileBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hemf, cbdata16, pdata16, imapmode, hdcref);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hemf;
    (void)cbdata16;
    (void)pdata16;
    (void)imapmode;
    (void)hdcref;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_graphics_gdi_GetWindowDC(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowDC");
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

int32_t windowssys_windows_win32_graphics_gdi_GetWindowExtEx(void* hdc, void* lpsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowExtEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetWindowOrgEx(void* hdc, void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowOrgEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetWindowRgn(void* hwnd, void* hrgn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hrgn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hrgn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetWindowRgnBox(void* hwnd, void* lprc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowRgnBox");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lprc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lprc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GetWorldTransform(void* hdc, void* lpxf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWorldTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpxf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpxf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GradientFill(void* hdc, void* pvertex, uint32_t nvertex, void* pmesh, uint32_t nmesh, uint32_t ulmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msimg32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GradientFill");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pvertex, nvertex, pmesh, nmesh, ulmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pvertex;
    (void)nvertex;
    (void)pmesh;
    (void)nmesh;
    (void)ulmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GrayStringA(void* hdc, void* hbrush, void* lpoutputfunc, int64_t lpdata, int32_t ncount, int32_t x, int32_t y, int32_t nwidth, int32_t nheight) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GrayStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hbrush, lpoutputfunc, lpdata, ncount, x, y, nwidth, nheight);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hbrush;
    (void)lpoutputfunc;
    (void)lpdata;
    (void)ncount;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_GrayStringW(void* hdc, void* hbrush, void* lpoutputfunc, int64_t lpdata, int32_t ncount, int32_t x, int32_t y, int32_t nwidth, int32_t nheight) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GrayStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hbrush, lpoutputfunc, lpdata, ncount, x, y, nwidth, nheight);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hbrush;
    (void)lpoutputfunc;
    (void)lpdata;
    (void)ncount;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_InflateRect(void* lprc, int32_t dx, int32_t dy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InflateRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprc, dx, dy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprc;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_IntersectClipRect(void* hdc, int32_t left, int32_t top, int32_t right, int32_t bottom) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IntersectClipRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, left, top, right, bottom);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_IntersectRect(void* lprcdst, void* lprcsrc1, void* lprcsrc2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IntersectRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprcdst, lprcsrc1, lprcsrc2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprcdst;
    (void)lprcsrc1;
    (void)lprcsrc2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_InvalidateRect(void* hwnd, void* lprect, int32_t berase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvalidateRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lprect, berase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lprect;
    (void)berase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_InvalidateRgn(void* hwnd, void* hrgn, int32_t berase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvalidateRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hrgn, berase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hrgn;
    (void)berase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_InvertRect(void* hdc, void* lprc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvertRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lprc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_InvertRgn(void* hdc, void* hrgn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvertRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hrgn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hrgn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_IsRectEmpty(void* lprc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsRectEmpty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_LPtoDP(void* hdc, void* lppt, int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPtoDP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lppt, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lppt;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_LineDDA(int32_t xstart, int32_t ystart, int32_t xend, int32_t yend, void* lpproc, int64_t data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LineDDA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(xstart, ystart, xend, yend, lpproc, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)xstart;
    (void)ystart;
    (void)xend;
    (void)yend;
    (void)lpproc;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_LineTo(void* hdc, int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LineTo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_LoadBitmapA(void* hinstance, void* lpbitmapname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadBitmapA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpbitmapname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lpbitmapname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_LoadBitmapW(void* hinstance, void* lpbitmapname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadBitmapW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpbitmapname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lpbitmapname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_LockWindowUpdate(void* hwndlock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockWindowUpdate");
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

int32_t windowssys_windows_win32_graphics_gdi_MapWindowPoints(void* hwndfrom, void* hwndto, void* lppoints, uint32_t cpoints) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapWindowPoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndfrom, hwndto, lppoints, cpoints);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndfrom;
    (void)hwndto;
    (void)lppoints;
    (void)cpoints;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_MaskBlt(void* hdcdest, int32_t xdest, int32_t ydest, int32_t width, int32_t height, void* hdcsrc, int32_t xsrc, int32_t ysrc, void* hbmmask, int32_t xmask, int32_t ymask, uint32_t rop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MaskBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdcdest, xdest, ydest, width, height, hdcsrc, xsrc, ysrc, hbmmask, xmask, ymask, rop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdcdest;
    (void)xdest;
    (void)ydest;
    (void)width;
    (void)height;
    (void)hdcsrc;
    (void)xsrc;
    (void)ysrc;
    (void)hbmmask;
    (void)xmask;
    (void)ymask;
    (void)rop;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_MergeFontPackage(void* puchmergefontbuffer, uint32_t ulmergefontbuffersize, void* puchfontpackagebuffer, uint32_t ulfontpackagebuffersize, void* ppuchdestbuffer, void* puldestbuffersize, void* pulbyteswritten, uint16_t usmode, void* lpfnallocate, void* lpfnreallocate, void* lpfnfree, void* lpvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fontsub.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MergeFontPackage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puchmergefontbuffer, ulmergefontbuffersize, puchfontpackagebuffer, ulfontpackagebuffersize, ppuchdestbuffer, puldestbuffersize, pulbyteswritten, usmode, lpfnallocate, lpfnreallocate, lpfnfree, lpvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)puchmergefontbuffer;
    (void)ulmergefontbuffersize;
    (void)puchfontpackagebuffer;
    (void)ulfontpackagebuffersize;
    (void)ppuchdestbuffer;
    (void)puldestbuffersize;
    (void)pulbyteswritten;
    (void)usmode;
    (void)lpfnallocate;
    (void)lpfnreallocate;
    (void)lpfnfree;
    (void)lpvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ModifyWorldTransform(void* hdc, void* lpxf, uint32_t mode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ModifyWorldTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpxf, mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpxf;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_MonitorFromRect(void* lprc, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MonitorFromRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprc, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lprc;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_MonitorFromWindow(void* hwnd, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MonitorFromWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_MoveToEx(void* hdc, int32_t x, int32_t y, void* lppt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveToEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lppt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_OffsetClipRgn(void* hdc, int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetClipRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_OffsetRect(void* lprc, int32_t dx, int32_t dy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprc, dx, dy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprc;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_OffsetRgn(void* hrgn, int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrgn, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrgn;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_OffsetViewportOrgEx(void* hdc, int32_t x, int32_t y, void* lppt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetViewportOrgEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lppt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_OffsetWindowOrgEx(void* hdc, int32_t x, int32_t y, void* lppt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OffsetWindowOrgEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lppt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PaintDesktop(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PaintDesktop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PaintRgn(void* hdc, void* hrgn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PaintRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hrgn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hrgn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PatBlt(void* hdc, int32_t x, int32_t y, int32_t w, int32_t h, uint32_t rop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PatBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, w, h, rop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)w;
    (void)h;
    (void)rop;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_PathToRegion(void* hdc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathToRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_Pie(void* hdc, int32_t left, int32_t top, int32_t right, int32_t bottom, int32_t xr1, int32_t yr1, int32_t xr2, int32_t yr2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Pie");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, left, top, right, bottom, xr1, yr1, xr2, yr2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    (void)xr1;
    (void)yr1;
    (void)xr2;
    (void)yr2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PlayEnhMetaFile(void* hdc, void* hmf, void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayEnhMetaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hmf, lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hmf;
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PlayEnhMetaFileRecord(void* hdc, void* pht, void* pmr, uint32_t cht) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayEnhMetaFileRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pht, pmr, cht);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pht;
    (void)pmr;
    (void)cht;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PlayMetaFile(void* hdc, void* hmf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayMetaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hmf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hmf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PlayMetaFileRecord(void* hdc, void* lphandletable, void* lpmr, uint32_t noobjs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayMetaFileRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lphandletable, lpmr, noobjs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lphandletable;
    (void)lpmr;
    (void)noobjs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PlgBlt(void* hdcdest, void* lppoint, void* hdcsrc, int32_t xsrc, int32_t ysrc, int32_t width, int32_t height, void* hbmmask, int32_t xmask, int32_t ymask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlgBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdcdest, lppoint, hdcsrc, xsrc, ysrc, width, height, hbmmask, xmask, ymask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdcdest;
    (void)lppoint;
    (void)hdcsrc;
    (void)xsrc;
    (void)ysrc;
    (void)width;
    (void)height;
    (void)hbmmask;
    (void)xmask;
    (void)ymask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PolyBezier(void* hdc, void* apt, uint32_t cpt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyBezier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, apt, cpt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PolyBezierTo(void* hdc, void* apt, uint32_t cpt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyBezierTo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, apt, cpt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PolyDraw(void* hdc, void* apt, void* aj, int32_t cpt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyDraw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, apt, aj, cpt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)apt;
    (void)aj;
    (void)cpt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PolyPolygon(void* hdc, void* apt, void* asz, int32_t csz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyPolygon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, apt, asz, csz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)apt;
    (void)asz;
    (void)csz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PolyPolyline(void* hdc, void* apt, void* asz, uint32_t csz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyPolyline");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, apt, asz, csz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)apt;
    (void)asz;
    (void)csz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PolyTextOutA(void* hdc, void* ppt, int32_t nstrings) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyTextOutA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ppt, nstrings);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ppt;
    (void)nstrings;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PolyTextOutW(void* hdc, void* ppt, int32_t nstrings) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolyTextOutW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ppt, nstrings);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ppt;
    (void)nstrings;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_Polygon(void* hdc, void* apt, int32_t cpt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Polygon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, apt, cpt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_Polyline(void* hdc, void* apt, int32_t cpt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Polyline");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, apt, cpt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PolylineTo(void* hdc, void* apt, uint32_t cpt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PolylineTo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, apt, cpt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)apt;
    (void)cpt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PtInRegion(void* hrgn, int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PtInRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrgn, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrgn;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_PtVisible(void* hdc, int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PtVisible");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_RealizePalette(void* hdc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RealizePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_RectInRegion(void* hrgn, void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RectInRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrgn, lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrgn;
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_RectVisible(void* hdc, void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RectVisible");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_Rectangle(void* hdc, int32_t left, int32_t top, int32_t right, int32_t bottom) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Rectangle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, left, top, right, bottom);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_RedrawWindow(void* hwnd, void* lprcupdate, void* hrgnupdate, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RedrawWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lprcupdate, hrgnupdate, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lprcupdate;
    (void)hrgnupdate;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ReleaseDC(void* hwnd, void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_RemoveFontMemResourceEx(void* h) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontMemResourceEx");
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

int32_t windowssys_windows_win32_graphics_gdi_RemoveFontResourceA(void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_RemoveFontResourceExA(void* name, uint32_t fl, void* pdv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, fl, pdv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)fl;
    (void)pdv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_RemoveFontResourceExW(void* name, uint32_t fl, void* pdv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, fl, pdv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)fl;
    (void)pdv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_RemoveFontResourceW(void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveFontResourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_ResetDCA(void* hdc, void* lpdm) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetDCA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpdm);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)lpdm;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_ResetDCW(void* hdc, void* lpdm) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetDCW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpdm);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)lpdm;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ResizePalette(void* hpal, uint32_t n) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResizePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpal, n);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpal;
    (void)n;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_RestoreDC(void* hdc, int32_t nsaveddc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, nsaveddc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)nsaveddc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_RoundRect(void* hdc, int32_t left, int32_t top, int32_t right, int32_t bottom, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RoundRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, left, top, right, bottom, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SaveDC(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaveDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ScaleViewportExtEx(void* hdc, int32_t xn, int32_t dx, int32_t yn, int32_t yd, void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScaleViewportExtEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, xn, dx, yn, yd, lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)xn;
    (void)dx;
    (void)yn;
    (void)yd;
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ScaleWindowExtEx(void* hdc, int32_t xn, int32_t xd, int32_t yn, int32_t yd, void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScaleWindowExtEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, xn, xd, yn, yd, lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)xn;
    (void)xd;
    (void)yn;
    (void)yd;
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ScreenToClient(void* hwnd, void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScreenToClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SelectClipPath(void* hdc, int32_t mode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectClipPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SelectClipRgn(void* hdc, void* hrgn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectClipRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hrgn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hrgn;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_SelectObject(void* hdc, void* h) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, h);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)h;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_gdi_SelectPalette(void* hdc, void* hpal, int32_t bforcebkgd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectPalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hpal, bforcebkgd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)hpal;
    (void)bforcebkgd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetArcDirection(void* hdc, int32_t dir) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetArcDirection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, dir);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)dir;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetBitmapBits(void* hbm, uint32_t cb, void* pvbits) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBitmapBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbm, cb, pvbits);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbm;
    (void)cb;
    (void)pvbits;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetBitmapDimensionEx(void* hbm, int32_t w, int32_t h, void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBitmapDimensionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbm, w, h, lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbm;
    (void)w;
    (void)h;
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetBkColor(void* hdc, uint32_t color) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBkColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, color);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)color;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetBkMode(void* hdc, int32_t mode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBkMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetBoundsRect(void* hdc, void* lprect, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBoundsRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprect, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)lprect;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetBrushOrgEx(void* hdc, int32_t x, int32_t y, void* lppt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetBrushOrgEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lppt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetColorAdjustment(void* hdc, void* lpca) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorAdjustment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpca);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpca;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetDCBrushColor(void* hdc, uint32_t color) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDCBrushColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, color);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)color;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetDCPenColor(void* hdc, uint32_t color) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDCPenColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, color);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)color;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetDIBColorTable(void* hdc, uint32_t istart, uint32_t centries, void* prgbq) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDIBColorTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, istart, centries, prgbq);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)istart;
    (void)centries;
    (void)prgbq;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetDIBits(void* hdc, void* hbm, uint32_t start, uint32_t clines, void* lpbits, void* lpbmi, uint32_t coloruse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDIBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hbm, start, clines, lpbits, lpbmi, coloruse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hbm;
    (void)start;
    (void)clines;
    (void)lpbits;
    (void)lpbmi;
    (void)coloruse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetDIBitsToDevice(void* hdc, int32_t xdest, int32_t ydest, uint32_t w, uint32_t h, int32_t xsrc, int32_t ysrc, uint32_t startscan, uint32_t clines, void* lpvbits, void* lpbmi, uint32_t coloruse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, uint32_t, int32_t, int32_t, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDIBitsToDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, xdest, ydest, w, h, xsrc, ysrc, startscan, clines, lpvbits, lpbmi, coloruse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)xdest;
    (void)ydest;
    (void)w;
    (void)h;
    (void)xsrc;
    (void)ysrc;
    (void)startscan;
    (void)clines;
    (void)lpvbits;
    (void)lpbmi;
    (void)coloruse;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_SetEnhMetaFileBits(uint32_t nsize, void* pb) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnhMetaFileBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nsize, pb);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)nsize;
    (void)pb;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetGraphicsMode(void* hdc, int32_t imode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGraphicsMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, imode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)imode;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetLayout(void* hdc, uint32_t l) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLayout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, l);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)l;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetMapMode(void* hdc, int32_t imode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMapMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, imode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)imode;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetMapperFlags(void* hdc, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMapperFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_graphics_gdi_SetMetaFileBitsEx(uint32_t cbbuffer, void* lpdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMetaFileBitsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cbbuffer, lpdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cbbuffer;
    (void)lpdata;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetMetaRgn(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMetaRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetMiterLimit(void* hdc, float limit, void* old) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMiterLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, limit, old);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)limit;
    (void)old;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetPaletteEntries(void* hpal, uint32_t istart, uint32_t centries, void* ppalentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPaletteEntries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpal, istart, centries, ppalentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpal;
    (void)istart;
    (void)centries;
    (void)ppalentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetPixel(void* hdc, int32_t x, int32_t y, uint32_t color) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPixel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, color);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetPixelV(void* hdc, int32_t x, int32_t y, uint32_t color) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPixelV");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, color);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)color;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetPolyFillMode(void* hdc, int32_t mode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPolyFillMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetROP2(void* hdc, int32_t rop2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetROP2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, rop2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)rop2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetRect(void* lprc, int32_t xleft, int32_t ytop, int32_t xright, int32_t ybottom) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprc, xleft, ytop, xright, ybottom);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprc;
    (void)xleft;
    (void)ytop;
    (void)xright;
    (void)ybottom;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetRectEmpty(void* lprc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetRectEmpty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetRectRgn(void* hrgn, int32_t left, int32_t top, int32_t right, int32_t bottom) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetRectRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrgn, left, top, right, bottom);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrgn;
    (void)left;
    (void)top;
    (void)right;
    (void)bottom;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetStretchBltMode(void* hdc, int32_t mode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStretchBltMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetSysColors(int32_t celements, void* lpaelements, void* lpargbvalues) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSysColors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(celements, lpaelements, lpargbvalues);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)celements;
    (void)lpaelements;
    (void)lpargbvalues;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetSystemPaletteUse(void* hdc, uint32_t use) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemPaletteUse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, use);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)use;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetTextAlign(void* hdc, uint32_t align) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextAlign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, align);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)align;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetTextCharacterExtra(void* hdc, int32_t extra) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextCharacterExtra");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, extra);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)extra;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_SetTextColor(void* hdc, uint32_t color) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, color);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)color;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetTextJustification(void* hdc, int32_t extra, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextJustification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, extra, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)extra;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetViewportExtEx(void* hdc, int32_t x, int32_t y, void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetViewportExtEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetViewportOrgEx(void* hdc, int32_t x, int32_t y, void* lppt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetViewportOrgEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lppt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetWindowExtEx(void* hdc, int32_t x, int32_t y, void* lpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowExtEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetWindowOrgEx(void* hdc, int32_t x, int32_t y, void* lppt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowOrgEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lppt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lppt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetWindowRgn(void* hwnd, void* hrgn, int32_t bredraw) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hrgn, bredraw);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hrgn;
    (void)bredraw;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SetWorldTransform(void* hdc, void* lpxf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWorldTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpxf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpxf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_StretchBlt(void* hdcdest, int32_t xdest, int32_t ydest, int32_t wdest, int32_t hdest, void* hdcsrc, int32_t xsrc, int32_t ysrc, int32_t wsrc, int32_t hsrc, uint32_t rop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StretchBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdcdest, xdest, ydest, wdest, hdest, hdcsrc, xsrc, ysrc, wsrc, hsrc, rop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdcdest;
    (void)xdest;
    (void)ydest;
    (void)wdest;
    (void)hdest;
    (void)hdcsrc;
    (void)xsrc;
    (void)ysrc;
    (void)wsrc;
    (void)hsrc;
    (void)rop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_StretchDIBits(void* hdc, int32_t xdest, int32_t ydest, int32_t destwidth, int32_t destheight, int32_t xsrc, int32_t ysrc, int32_t srcwidth, int32_t srcheight, void* lpbits, void* lpbmi, uint32_t iusage, uint32_t rop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StretchDIBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, xdest, ydest, destwidth, destheight, xsrc, ysrc, srcwidth, srcheight, lpbits, lpbmi, iusage, rop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)xdest;
    (void)ydest;
    (void)destwidth;
    (void)destheight;
    (void)xsrc;
    (void)ysrc;
    (void)srcwidth;
    (void)srcheight;
    (void)lpbits;
    (void)lpbmi;
    (void)iusage;
    (void)rop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_StrokeAndFillPath(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrokeAndFillPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_StrokePath(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrokePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_SubtractRect(void* lprcdst, void* lprcsrc1, void* lprcsrc2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubtractRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprcdst, lprcsrc1, lprcsrc2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprcdst;
    (void)lprcsrc1;
    (void)lprcsrc2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTCharToUnicode(void* hdc, void* puccharcodes, uint32_t ulcharcodesize, void* pusshortcodes, uint32_t ulshortcodesize, uint32_t ulflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTCharToUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, puccharcodes, ulcharcodesize, pusshortcodes, ulshortcodesize, ulflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)puccharcodes;
    (void)ulcharcodesize;
    (void)pusshortcodes;
    (void)ulshortcodesize;
    (void)ulflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTDeleteEmbeddedFont(void* hfontreference, uint32_t ulflags, void* pulstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTDeleteEmbeddedFont");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfontreference, ulflags, pulstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfontreference;
    (void)ulflags;
    (void)pulstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTEmbedFont(void* hdc, uint32_t ulflags, uint32_t ulcharset, void* pulprivstatus, void* pulstatus, void* lpfnwritetostream, void* lpvwritestream, void* puscharcodeset, uint16_t uscharcodecount, uint16_t uslanguage, void* pttembedinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEmbedFont");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ulflags, ulcharset, pulprivstatus, pulstatus, lpfnwritetostream, lpvwritestream, puscharcodeset, uscharcodecount, uslanguage, pttembedinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ulflags;
    (void)ulcharset;
    (void)pulprivstatus;
    (void)pulstatus;
    (void)lpfnwritetostream;
    (void)lpvwritestream;
    (void)puscharcodeset;
    (void)uscharcodecount;
    (void)uslanguage;
    (void)pttembedinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTEmbedFontEx(void* hdc, uint32_t ulflags, uint32_t ulcharset, void* pulprivstatus, void* pulstatus, void* lpfnwritetostream, void* lpvwritestream, void* pulcharcodeset, uint16_t uscharcodecount, uint16_t uslanguage, void* pttembedinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEmbedFontEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ulflags, ulcharset, pulprivstatus, pulstatus, lpfnwritetostream, lpvwritestream, pulcharcodeset, uscharcodecount, uslanguage, pttembedinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ulflags;
    (void)ulcharset;
    (void)pulprivstatus;
    (void)pulstatus;
    (void)lpfnwritetostream;
    (void)lpvwritestream;
    (void)pulcharcodeset;
    (void)uscharcodecount;
    (void)uslanguage;
    (void)pttembedinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTEmbedFontFromFileA(void* hdc, void* szfontfilename, uint16_t usttcindex, uint32_t ulflags, uint32_t ulcharset, void* pulprivstatus, void* pulstatus, void* lpfnwritetostream, void* lpvwritestream, void* puscharcodeset, uint16_t uscharcodecount, uint16_t uslanguage, void* pttembedinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEmbedFontFromFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, szfontfilename, usttcindex, ulflags, ulcharset, pulprivstatus, pulstatus, lpfnwritetostream, lpvwritestream, puscharcodeset, uscharcodecount, uslanguage, pttembedinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)szfontfilename;
    (void)usttcindex;
    (void)ulflags;
    (void)ulcharset;
    (void)pulprivstatus;
    (void)pulstatus;
    (void)lpfnwritetostream;
    (void)lpvwritestream;
    (void)puscharcodeset;
    (void)uscharcodecount;
    (void)uslanguage;
    (void)pttembedinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTEnableEmbeddingForFacename(void* lpszfacename, int32_t benable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTEnableEmbeddingForFacename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfacename, benable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfacename;
    (void)benable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTGetEmbeddedFontInfo(uint32_t ulflags, void* pulprivstatus, uint32_t ulprivs, void* pulstatus, void* lpfnreadfromstream, void* lpvreadstream, void* pttloadinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTGetEmbeddedFontInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulflags, pulprivstatus, ulprivs, pulstatus, lpfnreadfromstream, lpvreadstream, pttloadinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulflags;
    (void)pulprivstatus;
    (void)ulprivs;
    (void)pulstatus;
    (void)lpfnreadfromstream;
    (void)lpvreadstream;
    (void)pttloadinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTGetEmbeddingType(void* hdc, void* pulembedtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTGetEmbeddingType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pulembedtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pulembedtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTGetNewFontName(void* phfontreference, void* wzwinfamilyname, int32_t cchmaxwinname, void* szmacfamilyname, int32_t cchmaxmacname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTGetNewFontName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phfontreference, wzwinfamilyname, cchmaxwinname, szmacfamilyname, cchmaxmacname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phfontreference;
    (void)wzwinfamilyname;
    (void)cchmaxwinname;
    (void)szmacfamilyname;
    (void)cchmaxmacname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTIsEmbeddingEnabled(void* hdc, void* pbenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTIsEmbeddingEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pbenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pbenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTIsEmbeddingEnabledForFacename(void* lpszfacename, void* pbenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTIsEmbeddingEnabledForFacename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfacename, pbenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfacename;
    (void)pbenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTLoadEmbeddedFont(void* phfontreference, uint32_t ulflags, void* pulprivstatus, uint32_t ulprivs, void* pulstatus, void* lpfnreadfromstream, void* lpvreadstream, void* szwinfamilyname, void* szmacfamilyname, void* pttloadinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTLoadEmbeddedFont");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phfontreference, ulflags, pulprivstatus, ulprivs, pulstatus, lpfnreadfromstream, lpvreadstream, szwinfamilyname, szmacfamilyname, pttloadinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phfontreference;
    (void)ulflags;
    (void)pulprivstatus;
    (void)ulprivs;
    (void)pulstatus;
    (void)lpfnreadfromstream;
    (void)lpvreadstream;
    (void)szwinfamilyname;
    (void)szmacfamilyname;
    (void)pttloadinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTRunValidationTests(void* hdc, void* ptestparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTRunValidationTests");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ptestparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ptestparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TTRunValidationTestsEx(void* hdc, void* ptestparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("t2embed.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TTRunValidationTestsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ptestparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ptestparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TabbedTextOutA(void* hdc, int32_t x, int32_t y, void* lpstring, int32_t chcount, int32_t ntabpositions, void* lpntabstoppositions, int32_t ntaborigin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TabbedTextOutA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lpstring, chcount, ntabpositions, lpntabstoppositions, ntaborigin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    (void)ntaborigin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TabbedTextOutW(void* hdc, int32_t x, int32_t y, void* lpstring, int32_t chcount, int32_t ntabpositions, void* lpntabstoppositions, int32_t ntaborigin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TabbedTextOutW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lpstring, chcount, ntabpositions, lpntabstoppositions, ntaborigin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)chcount;
    (void)ntabpositions;
    (void)lpntabstoppositions;
    (void)ntaborigin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TextOutA(void* hdc, int32_t x, int32_t y, void* lpstring, int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextOutA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lpstring, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TextOutW(void* hdc, int32_t x, int32_t y, void* lpstring, int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextOutW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, lpstring, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)lpstring;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_TransparentBlt(void* hdcdest, int32_t xorigindest, int32_t yorigindest, int32_t wdest, int32_t hdest, void* hdcsrc, int32_t xoriginsrc, int32_t yoriginsrc, int32_t wsrc, int32_t hsrc, uint32_t crtransparent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msimg32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransparentBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdcdest, xorigindest, yorigindest, wdest, hdest, hdcsrc, xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdcdest;
    (void)xorigindest;
    (void)yorigindest;
    (void)wdest;
    (void)hdest;
    (void)hdcsrc;
    (void)xoriginsrc;
    (void)yoriginsrc;
    (void)wsrc;
    (void)hsrc;
    (void)crtransparent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_UnionRect(void* lprcdst, void* lprcsrc1, void* lprcsrc2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnionRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprcdst, lprcsrc1, lprcsrc2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprcdst;
    (void)lprcsrc1;
    (void)lprcsrc2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_UnrealizeObject(void* h) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnrealizeObject");
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

int32_t windowssys_windows_win32_graphics_gdi_UpdateColors(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateColors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_UpdateWindow(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateWindow");
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

int32_t windowssys_windows_win32_graphics_gdi_ValidateRect(void* hwnd, void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidateRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_ValidateRgn(void* hwnd, void* hrgn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidateRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hrgn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hrgn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_gdi_WidenPath(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WidenPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_gdi_WindowFromDC(void* hdc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowFromDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_graphics_gdi_wglSwapMultipleBuffers(uint32_t param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglSwapMultipleBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

