#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_display_wrapper.h"
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

void* windowssys_windows_win32_devices_display_brushobjHGetColorTransform(void* pbo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BRUSHOBJ_hGetColorTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pbo;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_display_brushobjPvAllocRbrush(void* pbo, uint32_t cj) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BRUSHOBJ_pvAllocRbrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbo, cj);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pbo;
    (void)cj;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_display_brushobjPvGetRbrush(void* pbo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BRUSHOBJ_pvGetRbrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pbo;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_devices_display_brushobjUlGetBrushColor(void* pbo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BRUSHOBJ_ulGetBrushColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbo;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_display_clipobjBEnum(void* pco, uint32_t cj, void* pul) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPOBJ_bEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pco, cj, pul);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pco;
    (void)cj;
    (void)pul;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_display_clipobjCEnumStart(void* pco, int32_t ball, uint32_t itype, uint32_t idirection, uint32_t climit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPOBJ_cEnumStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pco, ball, itype, idirection, climit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pco;
    (void)ball;
    (void)itype;
    (void)idirection;
    (void)climit;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_display_clipobjPpoGetPath(void* pco) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPOBJ_ppoGetPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pco);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pco;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_display_capabilitiesRequestAndCapabilitiesReply(void* hmonitor, void* pszasciicapabilitiesstring, uint32_t dwcapabilitiesstringlengthincharacters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CapabilitiesRequestAndCapabilitiesReply");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, pszasciicapabilitiesstring, dwcapabilitiesstringlengthincharacters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)pszasciicapabilitiesstring;
    (void)dwcapabilitiesstringlengthincharacters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_degaussMonitor(void* hmonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DegaussMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_destroyPhysicalMonitor(void* hmonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyPhysicalMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_destroyPhysicalMonitors(uint32_t dwphysicalmonitorarraysize, void* pphysicalmonitorarray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyPhysicalMonitors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwphysicalmonitorarraysize, pphysicalmonitorarray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwphysicalmonitorarraysize;
    (void)pphysicalmonitorarray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_displayConfigGetDeviceInfo(void* requestpacket) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisplayConfigGetDeviceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestpacket);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)requestpacket;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_displayConfigSetDeviceInfo(void* setpacket) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisplayConfigSetDeviceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(setpacket);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)setpacket;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_display_engAcquireSemaphore(void* hsem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngAcquireSemaphore");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hsem);
        return;
    }
    errno = ENOSYS;
#else
    (void)hsem;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_display_engAlphaBlend(void* psodest, void* psosrc, void* pco, void* pxlo, void* prcldest, void* prclsrc, void* pblendobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngAlphaBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psodest, psosrc, pco, pxlo, prcldest, prclsrc, pblendobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psodest;
    (void)psosrc;
    (void)pco;
    (void)pxlo;
    (void)prcldest;
    (void)prclsrc;
    (void)pblendobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engAssociateSurface(void* hsurf, void* hdev, uint32_t flhooks) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngAssociateSurface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsurf, hdev, flhooks);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsurf;
    (void)hdev;
    (void)flhooks;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engBitBlt(void* psotrg, void* psosrc, void* psomask, void* pco, void* pxlo, void* prcltrg, void* pptlsrc, void* pptlmask, void* pbo, void* pptlbrush, uint32_t rop4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngBitBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psotrg, psosrc, psomask, pco, pxlo, prcltrg, pptlsrc, pptlmask, pbo, pptlbrush, rop4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psotrg;
    (void)psosrc;
    (void)psomask;
    (void)pco;
    (void)pxlo;
    (void)prcltrg;
    (void)pptlsrc;
    (void)pptlmask;
    (void)pbo;
    (void)pptlbrush;
    (void)rop4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engCheckAbort(void* pso) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngCheckAbort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pso);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pso;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_display_engComputeGlyphSet(int32_t ncodepage, int32_t nfirstchar, int32_t cchars) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngComputeGlyphSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ncodepage, nfirstchar, cchars);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ncodepage;
    (void)nfirstchar;
    (void)cchars;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_display_engCopyBits(void* psodest, void* psosrc, void* pco, void* pxlo, void* prcldest, void* pptlsrc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngCopyBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psodest, psosrc, pco, pxlo, prcldest, pptlsrc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psodest;
    (void)psosrc;
    (void)pco;
    (void)pxlo;
    (void)prcldest;
    (void)pptlsrc;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_display_engCreateClip(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngCreateClip");
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

void* windowssys_windows_win32_devices_display_engCreatePalette(uint32_t imode, uint32_t ccolors, void* pulcolors, uint32_t flred, uint32_t flgreen, uint32_t flblue) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngCreatePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imode, ccolors, pulcolors, flred, flgreen, flblue);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)imode;
    (void)ccolors;
    (void)pulcolors;
    (void)flred;
    (void)flgreen;
    (void)flblue;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_display_engCreateSemaphore(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngCreateSemaphore");
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

void windowssys_windows_win32_devices_display_engDeleteClip(void* pco) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngDeleteClip");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pco);
        return;
    }
    errno = ENOSYS;
#else
    (void)pco;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_display_engDeletePalette(void* hpal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngDeletePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpal;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_display_engDeletePath(void* ppo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngDeletePath");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ppo);
        return;
    }
    errno = ENOSYS;
#else
    (void)ppo;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_display_engDeleteSemaphore(void* hsem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngDeleteSemaphore");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hsem);
        return;
    }
    errno = ENOSYS;
#else
    (void)hsem;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_display_engDeleteSurface(void* hsurf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngDeleteSurface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsurf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsurf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engEraseSurface(void* pso, void* prcl, uint32_t icolor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngEraseSurface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pso, prcl, icolor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pso;
    (void)prcl;
    (void)icolor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engFillPath(void* pso, void* ppo, void* pco, void* pbo, void* pptlbrushorg, uint32_t mix, uint32_t floptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngFillPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pso, ppo, pco, pbo, pptlbrushorg, mix, floptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pso;
    (void)ppo;
    (void)pco;
    (void)pbo;
    (void)pptlbrushorg;
    (void)mix;
    (void)floptions;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_display_engFindResource(void* h, int32_t iname, int32_t itype, void* pulsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngFindResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(h, iname, itype, pulsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)h;
    (void)iname;
    (void)itype;
    (void)pulsize;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_devices_display_engFreeModule(void* h) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngFreeModule");
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

void windowssys_windows_win32_devices_display_engGetCurrentCodePage(void* oemcodepage, void* ansicodepage) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngGetCurrentCodePage");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(oemcodepage, ansicodepage);
        return;
    }
    errno = ENOSYS;
#else
    (void)oemcodepage;
    (void)ansicodepage;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_devices_display_engGetDriverName(void* hdev) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngGetDriverName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdev);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdev;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_display_engGetPrinterDataFileName(void* hdev) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngGetPrinterDataFileName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdev);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdev;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_display_engGradientFill(void* psodest, void* pco, void* pxlo, void* pvertex, uint32_t nvertex, void* pmesh, uint32_t nmesh, void* prclextents, void* pptlditherorg, uint32_t ulmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngGradientFill");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psodest, pco, pxlo, pvertex, nvertex, pmesh, nmesh, prclextents, pptlditherorg, ulmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psodest;
    (void)pco;
    (void)pxlo;
    (void)pvertex;
    (void)nvertex;
    (void)pmesh;
    (void)nmesh;
    (void)prclextents;
    (void)pptlditherorg;
    (void)ulmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engLineTo(void* pso, void* pco, void* pbo, int32_t x1, int32_t y1, int32_t x2, int32_t y2, void* prclbounds, uint32_t mix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngLineTo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pso, pco, pbo, x1, y1, x2, y2, prclbounds, mix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pso;
    (void)pco;
    (void)pbo;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)prclbounds;
    (void)mix;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_display_engLoadModule(void* pwsz) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngLoadModule");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwsz);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pwsz;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_display_engLockSurface(void* hsurf) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngLockSurface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsurf);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hsurf;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_display_engMarkBandingSurface(void* hsurf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngMarkBandingSurface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsurf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsurf;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_display_engMultiByteToUnicodeN(void* unicodestring, uint32_t maxbytesinunicodestring, void* bytesinunicodestring, void* multibytestring, uint32_t bytesinmultibytestring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngMultiByteToUnicodeN");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(unicodestring, maxbytesinunicodestring, bytesinunicodestring, multibytestring, bytesinmultibytestring);
        return;
    }
    errno = ENOSYS;
#else
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_display_engMultiByteToWideChar(uint32_t codepage, void* widecharstring, int32_t bytesinwidecharstring, void* multibytestring, int32_t bytesinmultibytestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngMultiByteToWideChar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, widecharstring, bytesinwidecharstring, multibytestring, bytesinmultibytestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)codepage;
    (void)widecharstring;
    (void)bytesinwidecharstring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engPaint(void* pso, void* pco, void* pbo, void* pptlbrushorg, uint32_t mix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngPaint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pso, pco, pbo, pptlbrushorg, mix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pso;
    (void)pco;
    (void)pbo;
    (void)pptlbrushorg;
    (void)mix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engPlgBlt(void* psotrg, void* psosrc, void* psomsk, void* pco, void* pxlo, void* pca, void* pptlbrushorg, void* pptfx, void* prcl, void* pptl, uint32_t imode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngPlgBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psotrg, psosrc, psomsk, pco, pxlo, pca, pptlbrushorg, pptfx, prcl, pptl, imode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psotrg;
    (void)psosrc;
    (void)psomsk;
    (void)pco;
    (void)pxlo;
    (void)pca;
    (void)pptlbrushorg;
    (void)pptfx;
    (void)prcl;
    (void)pptl;
    (void)imode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engQueryEMFInfo(void* hdev, void* pemfinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngQueryEMFInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdev, pemfinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdev;
    (void)pemfinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_display_engQueryLocalTime(void* param0) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngQueryLocalTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(param0);
        return;
    }
    errno = ENOSYS;
#else
    (void)param0;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_display_engReleaseSemaphore(void* hsem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngReleaseSemaphore");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hsem);
        return;
    }
    errno = ENOSYS;
#else
    (void)hsem;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_display_engStretchBlt(void* psodest, void* psosrc, void* psomask, void* pco, void* pxlo, void* pca, void* pptlhtorg, void* prcldest, void* prclsrc, void* pptlmask, uint32_t imode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngStretchBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psodest, psosrc, psomask, pco, pxlo, pca, pptlhtorg, prcldest, prclsrc, pptlmask, imode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psodest;
    (void)psosrc;
    (void)psomask;
    (void)pco;
    (void)pxlo;
    (void)pca;
    (void)pptlhtorg;
    (void)prcldest;
    (void)prclsrc;
    (void)pptlmask;
    (void)imode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engStretchBltROP(void* psodest, void* psosrc, void* psomask, void* pco, void* pxlo, void* pca, void* pptlhtorg, void* prcldest, void* prclsrc, void* pptlmask, uint32_t imode, void* pbo, uint32_t rop4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngStretchBltROP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psodest, psosrc, psomask, pco, pxlo, pca, pptlhtorg, prcldest, prclsrc, pptlmask, imode, pbo, rop4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psodest;
    (void)psosrc;
    (void)psomask;
    (void)pco;
    (void)pxlo;
    (void)pca;
    (void)pptlhtorg;
    (void)prcldest;
    (void)prclsrc;
    (void)pptlmask;
    (void)imode;
    (void)pbo;
    (void)rop4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engStrokeAndFillPath(void* pso, void* ppo, void* pco, void* pxo, void* pbostroke, void* plineattrs, void* pbofill, void* pptlbrushorg, uint32_t mixfill, uint32_t floptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngStrokeAndFillPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pso, ppo, pco, pxo, pbostroke, plineattrs, pbofill, pptlbrushorg, mixfill, floptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pso;
    (void)ppo;
    (void)pco;
    (void)pxo;
    (void)pbostroke;
    (void)plineattrs;
    (void)pbofill;
    (void)pptlbrushorg;
    (void)mixfill;
    (void)floptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engStrokePath(void* pso, void* ppo, void* pco, void* pxo, void* pbo, void* pptlbrushorg, void* plineattrs, uint32_t mix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngStrokePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pso, ppo, pco, pxo, pbo, pptlbrushorg, plineattrs, mix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pso;
    (void)ppo;
    (void)pco;
    (void)pxo;
    (void)pbo;
    (void)pptlbrushorg;
    (void)plineattrs;
    (void)mix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engTextOut(void* pso, void* pstro, void* pfo, void* pco, void* prclextra, void* prclopaque, void* pbofore, void* pboopaque, void* pptlorg, uint32_t mix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngTextOut");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pso, pstro, pfo, pco, prclextra, prclopaque, pbofore, pboopaque, pptlorg, mix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pso;
    (void)pstro;
    (void)pfo;
    (void)pco;
    (void)prclextra;
    (void)prclopaque;
    (void)pbofore;
    (void)pboopaque;
    (void)pptlorg;
    (void)mix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_engTransparentBlt(void* psodst, void* psosrc, void* pco, void* pxlo, void* prcldst, void* prclsrc, uint32_t transcolor, uint32_t bcalledfrombitblt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngTransparentBlt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psodst, psosrc, pco, pxlo, prcldst, prclsrc, transcolor, bcalledfrombitblt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psodst;
    (void)psosrc;
    (void)pco;
    (void)pxlo;
    (void)prcldst;
    (void)prclsrc;
    (void)transcolor;
    (void)bcalledfrombitblt;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_display_engUnicodeToMultiByteN(void* multibytestring, uint32_t maxbytesinmultibytestring, void* bytesinmultibytestring, void* unicodestring, uint32_t bytesinunicodestring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngUnicodeToMultiByteN");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(multibytestring, maxbytesinmultibytestring, bytesinmultibytestring, unicodestring, bytesinunicodestring);
        return;
    }
    errno = ENOSYS;
#else
    (void)multibytestring;
    (void)maxbytesinmultibytestring;
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_display_engUnlockSurface(void* pso) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngUnlockSurface");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pso);
        return;
    }
    errno = ENOSYS;
#else
    (void)pso;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_display_engWideCharToMultiByte(uint32_t codepage, void* widecharstring, int32_t bytesinwidecharstring, void* multibytestring, int32_t bytesinmultibytestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngWideCharToMultiByte");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, widecharstring, bytesinwidecharstring, multibytestring, bytesinmultibytestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)codepage;
    (void)widecharstring;
    (void)bytesinwidecharstring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_display_fontobjCGetAllGlyphHandles(void* pfo, void* phg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_cGetAllGlyphHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfo, phg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pfo;
    (void)phg;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_display_fontobjCGetGlyphs(void* pfo, uint32_t imode, uint32_t cglyph, void* phg, void* ppvglyph) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_cGetGlyphs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfo, imode, cglyph, phg, ppvglyph);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pfo;
    (void)imode;
    (void)cglyph;
    (void)phg;
    (void)ppvglyph;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_display_fontobjPQueryGlyphAttrs(void* pfo, uint32_t imode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_pQueryGlyphAttrs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfo, imode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pfo;
    (void)imode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_display_fontobjPfdg(void* pfo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_pfdg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pfo;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_display_fontobjPifi(void* pfo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_pifi");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pfo;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_display_fontobjPvTrueTypeFontFile(void* pfo, void* pcjfile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_pvTrueTypeFontFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfo, pcjfile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pfo;
    (void)pcjfile;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_display_fontobjPxoGetXform(void* pfo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_pxoGetXform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pfo;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_devices_display_fontobjVGetInfo(void* pfo, uint32_t cjsize, void* pfi) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_vGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pfo, cjsize, pfi);
        return;
    }
    errno = ENOSYS;
#else
    (void)pfo;
    (void)cjsize;
    (void)pfi;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_display_getAutoRotationState(void* pstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAutoRotationState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getCapabilitiesStringLength(void* hmonitor, void* pdwcapabilitiesstringlengthincharacters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCapabilitiesStringLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, pdwcapabilitiesstringlengthincharacters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)pdwcapabilitiesstringlengthincharacters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getDisplayAutoRotationPreferences(void* porientation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDisplayAutoRotationPreferences");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(porientation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)porientation;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_display_getDisplayConfigBufferSizes(uint32_t flags, void* numpatharrayelements, void* nummodeinfoarrayelements) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDisplayConfigBufferSizes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, numpatharrayelements, nummodeinfoarrayelements);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)numpatharrayelements;
    (void)nummodeinfoarrayelements;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_display_getMonitorBrightness(void* hmonitor, void* pdwminimumbrightness, void* pdwcurrentbrightness, void* pdwmaximumbrightness) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorBrightness");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, pdwminimumbrightness, pdwcurrentbrightness, pdwmaximumbrightness);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)pdwminimumbrightness;
    (void)pdwcurrentbrightness;
    (void)pdwmaximumbrightness;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getMonitorCapabilities(void* hmonitor, void* pdwmonitorcapabilities, void* pdwsupportedcolortemperatures) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, pdwmonitorcapabilities, pdwsupportedcolortemperatures);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)pdwmonitorcapabilities;
    (void)pdwsupportedcolortemperatures;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getMonitorColorTemperature(void* hmonitor, void* pctcurrentcolortemperature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorColorTemperature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, pctcurrentcolortemperature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)pctcurrentcolortemperature;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getMonitorContrast(void* hmonitor, void* pdwminimumcontrast, void* pdwcurrentcontrast, void* pdwmaximumcontrast) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorContrast");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, pdwminimumcontrast, pdwcurrentcontrast, pdwmaximumcontrast);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)pdwminimumcontrast;
    (void)pdwcurrentcontrast;
    (void)pdwmaximumcontrast;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getMonitorDisplayAreaPosition(void* hmonitor, int32_t ptpositiontype, void* pdwminimumposition, void* pdwcurrentposition, void* pdwmaximumposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorDisplayAreaPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, ptpositiontype, pdwminimumposition, pdwcurrentposition, pdwmaximumposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)ptpositiontype;
    (void)pdwminimumposition;
    (void)pdwcurrentposition;
    (void)pdwmaximumposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getMonitorDisplayAreaSize(void* hmonitor, int32_t stsizetype, void* pdwminimumwidthorheight, void* pdwcurrentwidthorheight, void* pdwmaximumwidthorheight) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorDisplayAreaSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, stsizetype, pdwminimumwidthorheight, pdwcurrentwidthorheight, pdwmaximumwidthorheight);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)stsizetype;
    (void)pdwminimumwidthorheight;
    (void)pdwcurrentwidthorheight;
    (void)pdwmaximumwidthorheight;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueDrive(void* hmonitor, int32_t dtdrivetype, void* pdwminimumdrive, void* pdwcurrentdrive, void* pdwmaximumdrive) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorRedGreenOrBlueDrive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, dtdrivetype, pdwminimumdrive, pdwcurrentdrive, pdwmaximumdrive);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)dtdrivetype;
    (void)pdwminimumdrive;
    (void)pdwcurrentdrive;
    (void)pdwmaximumdrive;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueGain(void* hmonitor, int32_t gtgaintype, void* pdwminimumgain, void* pdwcurrentgain, void* pdwmaximumgain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorRedGreenOrBlueGain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, gtgaintype, pdwminimumgain, pdwcurrentgain, pdwmaximumgain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)gtgaintype;
    (void)pdwminimumgain;
    (void)pdwcurrentgain;
    (void)pdwmaximumgain;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getMonitorTechnologyType(void* hmonitor, void* pdtydisplaytechnologytype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorTechnologyType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, pdtydisplaytechnologytype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)pdtydisplaytechnologytype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getNumberOfPhysicalMonitorsFromHMONITOR(void* hmonitor, void* pdwnumberofphysicalmonitors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfPhysicalMonitorsFromHMONITOR");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, pdwnumberofphysicalmonitors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)pdwnumberofphysicalmonitors;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getPhysicalMonitorsFromHMONITOR(void* hmonitor, uint32_t dwphysicalmonitorarraysize, void* pphysicalmonitorarray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPhysicalMonitorsFromHMONITOR");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, dwphysicalmonitorarraysize, pphysicalmonitorarray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)dwphysicalmonitorarraysize;
    (void)pphysicalmonitorarray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getTimingReport(void* hmonitor, void* pmtrmonitortimingreport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimingReport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, pmtrmonitortimingreport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)pmtrmonitortimingreport;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_getVCPFeatureAndVCPFeatureReply(void* hmonitor, uint8_t bvcpcode, void* pvct, void* pdwcurrentvalue, void* pdwmaximumvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVCPFeatureAndVCPFeatureReply");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, bvcpcode, pvct, pdwcurrentvalue, pdwmaximumvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)bvcpcode;
    (void)pvct;
    (void)pdwcurrentvalue;
    (void)pdwmaximumvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_htGet8BppformatPalette(void* ppaletteentry, uint16_t redgamma, uint16_t greengamma, uint16_t bluegamma) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HT_Get8BPPFormatPalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppaletteentry, redgamma, greengamma, bluegamma);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppaletteentry;
    (void)redgamma;
    (void)greengamma;
    (void)bluegamma;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_htGet8BppmaskPalette(void* ppaletteentry, int32_t use8bppmaskpal, uint8_t cmymask, uint16_t redgamma, uint16_t greengamma, uint16_t bluegamma) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint8_t, uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HT_Get8BPPMaskPalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppaletteentry, use8bppmaskpal, cmymask, redgamma, greengamma, bluegamma);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppaletteentry;
    (void)use8bppmaskpal;
    (void)cmymask;
    (void)redgamma;
    (void)greengamma;
    (void)bluegamma;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_pathobjBEnum(void* ppo, void* ppd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PATHOBJ_bEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppo, ppd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppo;
    (void)ppd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_pathobjBEnumClipLines(void* ppo, uint32_t cb, void* pcl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PATHOBJ_bEnumClipLines");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppo, cb, pcl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppo;
    (void)cb;
    (void)pcl;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_display_pathobjVEnumStart(void* ppo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PATHOBJ_vEnumStart");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ppo);
        return;
    }
    errno = ENOSYS;
#else
    (void)ppo;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_display_pathobjVEnumStartClipLines(void* ppo, void* pco, void* pso, void* pla) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PATHOBJ_vEnumStartClipLines");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ppo, pco, pso, pla);
        return;
    }
    errno = ENOSYS;
#else
    (void)ppo;
    (void)pco;
    (void)pso;
    (void)pla;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_display_pathobjVGetBounds(void* ppo, void* prectfx) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PATHOBJ_vGetBounds");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ppo, prectfx);
        return;
    }
    errno = ENOSYS;
#else
    (void)ppo;
    (void)prectfx;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_devices_display_queryDisplayConfig(uint32_t flags, void* numpatharrayelements, void* patharray, void* nummodeinfoarrayelements, void* modeinfoarray, void* currenttopologyid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryDisplayConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, numpatharrayelements, patharray, nummodeinfoarrayelements, modeinfoarray, currenttopologyid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)numpatharrayelements;
    (void)patharray;
    (void)nummodeinfoarrayelements;
    (void)modeinfoarray;
    (void)currenttopologyid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_display_restoreMonitorFactoryColorDefaults(void* hmonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreMonitorFactoryColorDefaults");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_restoreMonitorFactoryDefaults(void* hmonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreMonitorFactoryDefaults");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_strobjBEnum(void* pstro, void* pc, void* ppgpos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STROBJ_bEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstro, pc, ppgpos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstro;
    (void)pc;
    (void)ppgpos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_strobjBEnumPositionsOnly(void* pstro, void* pc, void* ppgpos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STROBJ_bEnumPositionsOnly");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstro, pc, ppgpos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstro;
    (void)pc;
    (void)ppgpos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_strobjBGetAdvanceWidths(void* pso, uint32_t ifirst, uint32_t c, void* pptqd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STROBJ_bGetAdvanceWidths");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pso, ifirst, c, pptqd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pso;
    (void)ifirst;
    (void)c;
    (void)pptqd;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_display_strobjDwGetCodePage(void* pstro) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STROBJ_dwGetCodePage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstro);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstro;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_devices_display_strobjVEnumStart(void* pstro) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STROBJ_vEnumStart");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstro);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstro;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_display_saveCurrentMonitorSettings(void* hmonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaveCurrentMonitorSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_saveCurrentSettings(void* hmonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaveCurrentSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_setDisplayAutoRotationPreferences(int32_t orientation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDisplayAutoRotationPreferences");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(orientation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)orientation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_setDisplayConfig(uint32_t numpatharrayelements, void* patharray, uint32_t nummodeinfoarrayelements, void* modeinfoarray, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDisplayConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numpatharrayelements, patharray, nummodeinfoarrayelements, modeinfoarray, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)numpatharrayelements;
    (void)patharray;
    (void)nummodeinfoarrayelements;
    (void)modeinfoarray;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_setMonitorBrightness(void* hmonitor, uint32_t dwnewbrightness) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorBrightness");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, dwnewbrightness);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)dwnewbrightness;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_setMonitorColorTemperature(void* hmonitor, int32_t ctcurrentcolortemperature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorColorTemperature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, ctcurrentcolortemperature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)ctcurrentcolortemperature;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_setMonitorContrast(void* hmonitor, uint32_t dwnewcontrast) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorContrast");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, dwnewcontrast);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)dwnewcontrast;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_setMonitorDisplayAreaPosition(void* hmonitor, int32_t ptpositiontype, uint32_t dwnewposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorDisplayAreaPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, ptpositiontype, dwnewposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)ptpositiontype;
    (void)dwnewposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_setMonitorDisplayAreaSize(void* hmonitor, int32_t stsizetype, uint32_t dwnewdisplayareawidthorheight) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorDisplayAreaSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, stsizetype, dwnewdisplayareawidthorheight);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)stsizetype;
    (void)dwnewdisplayareawidthorheight;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueDrive(void* hmonitor, int32_t dtdrivetype, uint32_t dwnewdrive) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorRedGreenOrBlueDrive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, dtdrivetype, dwnewdrive);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)dtdrivetype;
    (void)dwnewdrive;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueGain(void* hmonitor, int32_t gtgaintype, uint32_t dwnewgain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorRedGreenOrBlueGain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, gtgaintype, dwnewgain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)gtgaintype;
    (void)dwnewgain;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_setVCPFeature(void* hmonitor, uint8_t bvcpcode, uint32_t dwnewvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVCPFeature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, bvcpcode, dwnewvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)bvcpcode;
    (void)dwnewvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_display_xformobjBApplyXform(void* pxo, uint32_t imode, uint32_t cpoints, void* pvin, void* pvout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XFORMOBJ_bApplyXform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pxo, imode, cpoints, pvin, pvout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pxo;
    (void)imode;
    (void)cpoints;
    (void)pvin;
    (void)pvout;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_display_xformobjIGetXform(void* pxo, void* pxform) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XFORMOBJ_iGetXform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pxo, pxform);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pxo;
    (void)pxform;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_display_xlateobjCGetPalette(void* pxlo, uint32_t ipal, uint32_t cpal, void* ppal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XLATEOBJ_cGetPalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pxlo, ipal, cpal, ppal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pxlo;
    (void)ipal;
    (void)cpal;
    (void)ppal;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_display_xlateobjHGetColorTransform(void* pxlo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XLATEOBJ_hGetColorTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pxlo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pxlo;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_devices_display_xlateobjIXlate(void* pxlo, uint32_t icolor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XLATEOBJ_iXlate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pxlo, icolor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pxlo;
    (void)icolor;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_display_xlateobjPiVector(void* pxlo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XLATEOBJ_piVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pxlo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pxlo;
    errno = ENOSYS;
    return NULL;
#endif
}

