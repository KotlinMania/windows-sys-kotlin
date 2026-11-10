#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1brushobjHGetColorTransform(JNIEnv* km_env, jclass km_clazz, jlong pbo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BRUSHOBJ_hGetColorTransform");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pbo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1brushobjPvAllocRbrush(JNIEnv* km_env, jclass km_clazz, jlong pbo, jint cj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BRUSHOBJ_pvAllocRbrush");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbo, (uint32_t)cj);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pbo;
    (void)cj;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1brushobjPvGetRbrush(JNIEnv* km_env, jclass km_clazz, jlong pbo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BRUSHOBJ_pvGetRbrush");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pbo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1brushobjUlGetBrushColor(JNIEnv* km_env, jclass km_clazz, jlong pbo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BRUSHOBJ_ulGetBrushColor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1clipobjBEnum(JNIEnv* km_env, jclass km_clazz, jlong pco, jint cj, jlong pul) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPOBJ_bEnum");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pco, (uint32_t)cj, (void*)(uintptr_t)pul);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pco;
    (void)cj;
    (void)pul;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1clipobjCEnumStart(JNIEnv* km_env, jclass km_clazz, jlong pco, jint ball, jint itype, jint idirection, jint climit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPOBJ_cEnumStart");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pco, (int32_t)ball, (uint32_t)itype, (uint32_t)idirection, (uint32_t)climit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pco;
    (void)ball;
    (void)itype;
    (void)idirection;
    (void)climit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1clipobjPpoGetPath(JNIEnv* km_env, jclass km_clazz, jlong pco) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLIPOBJ_ppoGetPath");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pco);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pco;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1capabilitiesRequestAndCapabilitiesReply(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong pszasciicapabilitiesstring, jint dwcapabilitiesstringlengthincharacters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CapabilitiesRequestAndCapabilitiesReply");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)pszasciicapabilitiesstring, (uint32_t)dwcapabilitiesstringlengthincharacters);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)pszasciicapabilitiesstring;
    (void)dwcapabilitiesstringlengthincharacters;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1degaussMonitor(JNIEnv* km_env, jclass km_clazz, jlong hmonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DegaussMonitor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1destroyPhysicalMonitor(JNIEnv* km_env, jclass km_clazz, jlong hmonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyPhysicalMonitor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1destroyPhysicalMonitors(JNIEnv* km_env, jclass km_clazz, jint dwphysicalmonitorarraysize, jlong pphysicalmonitorarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyPhysicalMonitors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwphysicalmonitorarraysize, (void*)(uintptr_t)pphysicalmonitorarray);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwphysicalmonitorarraysize;
    (void)pphysicalmonitorarray;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1displayConfigGetDeviceInfo(JNIEnv* km_env, jclass km_clazz, jlong requestpacket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisplayConfigGetDeviceInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestpacket);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestpacket;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1displayConfigSetDeviceInfo(JNIEnv* km_env, jclass km_clazz, jlong setpacket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisplayConfigSetDeviceInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)setpacket);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)setpacket;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engAcquireSemaphore(JNIEnv* km_env, jclass km_clazz, jlong hsem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngAcquireSemaphore");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hsem);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hsem;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engAlphaBlend(JNIEnv* km_env, jclass km_clazz, jlong psodest, jlong psosrc, jlong pco, jlong pxlo, jlong prcldest, jlong prclsrc, jlong pblendobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngAlphaBlend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psodest, (void*)(uintptr_t)psosrc, (void*)(uintptr_t)pco, (void*)(uintptr_t)pxlo, (void*)(uintptr_t)prcldest, (void*)(uintptr_t)prclsrc, (void*)(uintptr_t)pblendobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psodest;
    (void)psosrc;
    (void)pco;
    (void)pxlo;
    (void)prcldest;
    (void)prclsrc;
    (void)pblendobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engAssociateSurface(JNIEnv* km_env, jclass km_clazz, jlong hsurf, jlong hdev, jint flhooks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngAssociateSurface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsurf, (void*)(uintptr_t)hdev, (uint32_t)flhooks);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsurf;
    (void)hdev;
    (void)flhooks;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engBitBlt(JNIEnv* km_env, jclass km_clazz, jlong psotrg, jlong psosrc, jlong psomask, jlong pco, jlong pxlo, jlong prcltrg, jlong pptlsrc, jlong pptlmask, jlong pbo, jlong pptlbrush, jint rop4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngBitBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psotrg, (void*)(uintptr_t)psosrc, (void*)(uintptr_t)psomask, (void*)(uintptr_t)pco, (void*)(uintptr_t)pxlo, (void*)(uintptr_t)prcltrg, (void*)(uintptr_t)pptlsrc, (void*)(uintptr_t)pptlmask, (void*)(uintptr_t)pbo, (void*)(uintptr_t)pptlbrush, (uint32_t)rop4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engCheckAbort(JNIEnv* km_env, jclass km_clazz, jlong pso) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngCheckAbort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pso);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pso;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engComputeGlyphSet(JNIEnv* km_env, jclass km_clazz, jint ncodepage, jint nfirstchar, jint cchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngComputeGlyphSet");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)ncodepage, (int32_t)nfirstchar, (int32_t)cchars);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ncodepage;
    (void)nfirstchar;
    (void)cchars;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engCopyBits(JNIEnv* km_env, jclass km_clazz, jlong psodest, jlong psosrc, jlong pco, jlong pxlo, jlong prcldest, jlong pptlsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngCopyBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psodest, (void*)(uintptr_t)psosrc, (void*)(uintptr_t)pco, (void*)(uintptr_t)pxlo, (void*)(uintptr_t)prcldest, (void*)(uintptr_t)pptlsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psodest;
    (void)psosrc;
    (void)pco;
    (void)pxlo;
    (void)prcldest;
    (void)pptlsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engCreateClip(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngCreateClip");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engCreatePalette(JNIEnv* km_env, jclass km_clazz, jint imode, jint ccolors, jlong pulcolors, jint flred, jint flgreen, jint flblue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngCreatePalette");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)imode, (uint32_t)ccolors, (void*)(uintptr_t)pulcolors, (uint32_t)flred, (uint32_t)flgreen, (uint32_t)flblue);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)imode;
    (void)ccolors;
    (void)pulcolors;
    (void)flred;
    (void)flgreen;
    (void)flblue;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engCreateSemaphore(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngCreateSemaphore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engDeleteClip(JNIEnv* km_env, jclass km_clazz, jlong pco) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngDeleteClip");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pco);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pco;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engDeletePalette(JNIEnv* km_env, jclass km_clazz, jlong hpal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngDeletePalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engDeletePath(JNIEnv* km_env, jclass km_clazz, jlong ppo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngDeletePath");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ppo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ppo;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engDeleteSemaphore(JNIEnv* km_env, jclass km_clazz, jlong hsem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngDeleteSemaphore");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hsem);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hsem;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engDeleteSurface(JNIEnv* km_env, jclass km_clazz, jlong hsurf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngDeleteSurface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsurf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsurf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engEraseSurface(JNIEnv* km_env, jclass km_clazz, jlong pso, jlong prcl, jint icolor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngEraseSurface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pso, (void*)(uintptr_t)prcl, (uint32_t)icolor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pso;
    (void)prcl;
    (void)icolor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engFillPath(JNIEnv* km_env, jclass km_clazz, jlong pso, jlong ppo, jlong pco, jlong pbo, jlong pptlbrushorg, jint mix, jint floptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngFillPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pso, (void*)(uintptr_t)ppo, (void*)(uintptr_t)pco, (void*)(uintptr_t)pbo, (void*)(uintptr_t)pptlbrushorg, (uint32_t)mix, (uint32_t)floptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pso;
    (void)ppo;
    (void)pco;
    (void)pbo;
    (void)pptlbrushorg;
    (void)mix;
    (void)floptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engFindResource(JNIEnv* km_env, jclass km_clazz, jlong h, jint iname, jint itype, jlong pulsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngFindResource");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)h, (int32_t)iname, (int32_t)itype, (void*)(uintptr_t)pulsize);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)h;
    (void)iname;
    (void)itype;
    (void)pulsize;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engFreeModule(JNIEnv* km_env, jclass km_clazz, jlong h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngFreeModule");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)h);
    } else {
        errno = ENOSYS;
    }
#else
    (void)h;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engGetCurrentCodePage(JNIEnv* km_env, jclass km_clazz, jlong oemcodepage, jlong ansicodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngGetCurrentCodePage");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)oemcodepage, (void*)(uintptr_t)ansicodepage);
    } else {
        errno = ENOSYS;
    }
#else
    (void)oemcodepage;
    (void)ansicodepage;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engGetDriverName(JNIEnv* km_env, jclass km_clazz, jlong hdev) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngGetDriverName");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdev);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdev;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engGetPrinterDataFileName(JNIEnv* km_env, jclass km_clazz, jlong hdev) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngGetPrinterDataFileName");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdev);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdev;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engGradientFill(JNIEnv* km_env, jclass km_clazz, jlong psodest, jlong pco, jlong pxlo, jlong pvertex, jint nvertex, jlong pmesh, jint nmesh, jlong prclextents, jlong pptlditherorg, jint ulmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngGradientFill");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psodest, (void*)(uintptr_t)pco, (void*)(uintptr_t)pxlo, (void*)(uintptr_t)pvertex, (uint32_t)nvertex, (void*)(uintptr_t)pmesh, (uint32_t)nmesh, (void*)(uintptr_t)prclextents, (void*)(uintptr_t)pptlditherorg, (uint32_t)ulmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engLineTo(JNIEnv* km_env, jclass km_clazz, jlong pso, jlong pco, jlong pbo, jint x1, jint y1, jint x2, jint y2, jlong prclbounds, jint mix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngLineTo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pso, (void*)(uintptr_t)pco, (void*)(uintptr_t)pbo, (int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2, (void*)(uintptr_t)prclbounds, (uint32_t)mix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engLoadModule(JNIEnv* km_env, jclass km_clazz, jlong pwsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngLoadModule");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwsz);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pwsz;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engLockSurface(JNIEnv* km_env, jclass km_clazz, jlong hsurf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngLockSurface");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsurf);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hsurf;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engMarkBandingSurface(JNIEnv* km_env, jclass km_clazz, jlong hsurf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngMarkBandingSurface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsurf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsurf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engMultiByteToUnicodeN(JNIEnv* km_env, jclass km_clazz, jlong unicodestring, jint maxbytesinunicodestring, jlong bytesinunicodestring, jlong multibytestring, jint bytesinmultibytestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngMultiByteToUnicodeN");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)unicodestring, (uint32_t)maxbytesinunicodestring, (void*)(uintptr_t)bytesinunicodestring, (void*)(uintptr_t)multibytestring, (uint32_t)bytesinmultibytestring);
    } else {
        errno = ENOSYS;
    }
#else
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engMultiByteToWideChar(JNIEnv* km_env, jclass km_clazz, jint codepage, jlong widecharstring, jint bytesinwidecharstring, jlong multibytestring, jint bytesinmultibytestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngMultiByteToWideChar");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)codepage, (void*)(uintptr_t)widecharstring, (int32_t)bytesinwidecharstring, (void*)(uintptr_t)multibytestring, (int32_t)bytesinmultibytestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)codepage;
    (void)widecharstring;
    (void)bytesinwidecharstring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engPaint(JNIEnv* km_env, jclass km_clazz, jlong pso, jlong pco, jlong pbo, jlong pptlbrushorg, jint mix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngPaint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pso, (void*)(uintptr_t)pco, (void*)(uintptr_t)pbo, (void*)(uintptr_t)pptlbrushorg, (uint32_t)mix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pso;
    (void)pco;
    (void)pbo;
    (void)pptlbrushorg;
    (void)mix;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engPlgBlt(JNIEnv* km_env, jclass km_clazz, jlong psotrg, jlong psosrc, jlong psomsk, jlong pco, jlong pxlo, jlong pca, jlong pptlbrushorg, jlong pptfx, jlong prcl, jlong pptl, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngPlgBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psotrg, (void*)(uintptr_t)psosrc, (void*)(uintptr_t)psomsk, (void*)(uintptr_t)pco, (void*)(uintptr_t)pxlo, (void*)(uintptr_t)pca, (void*)(uintptr_t)pptlbrushorg, (void*)(uintptr_t)pptfx, (void*)(uintptr_t)prcl, (void*)(uintptr_t)pptl, (uint32_t)imode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engQueryEMFInfo(JNIEnv* km_env, jclass km_clazz, jlong hdev, jlong pemfinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngQueryEMFInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdev, (void*)(uintptr_t)pemfinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdev;
    (void)pemfinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engQueryLocalTime(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngQueryLocalTime");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engReleaseSemaphore(JNIEnv* km_env, jclass km_clazz, jlong hsem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngReleaseSemaphore");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hsem);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hsem;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engStretchBlt(JNIEnv* km_env, jclass km_clazz, jlong psodest, jlong psosrc, jlong psomask, jlong pco, jlong pxlo, jlong pca, jlong pptlhtorg, jlong prcldest, jlong prclsrc, jlong pptlmask, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngStretchBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psodest, (void*)(uintptr_t)psosrc, (void*)(uintptr_t)psomask, (void*)(uintptr_t)pco, (void*)(uintptr_t)pxlo, (void*)(uintptr_t)pca, (void*)(uintptr_t)pptlhtorg, (void*)(uintptr_t)prcldest, (void*)(uintptr_t)prclsrc, (void*)(uintptr_t)pptlmask, (uint32_t)imode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engStretchBltROP(JNIEnv* km_env, jclass km_clazz, jlong psodest, jlong psosrc, jlong psomask, jlong pco, jlong pxlo, jlong pca, jlong pptlhtorg, jlong prcldest, jlong prclsrc, jlong pptlmask, jint imode, jlong pbo, jint rop4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngStretchBltROP");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psodest, (void*)(uintptr_t)psosrc, (void*)(uintptr_t)psomask, (void*)(uintptr_t)pco, (void*)(uintptr_t)pxlo, (void*)(uintptr_t)pca, (void*)(uintptr_t)pptlhtorg, (void*)(uintptr_t)prcldest, (void*)(uintptr_t)prclsrc, (void*)(uintptr_t)pptlmask, (uint32_t)imode, (void*)(uintptr_t)pbo, (uint32_t)rop4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engStrokeAndFillPath(JNIEnv* km_env, jclass km_clazz, jlong pso, jlong ppo, jlong pco, jlong pxo, jlong pbostroke, jlong plineattrs, jlong pbofill, jlong pptlbrushorg, jint mixfill, jint floptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngStrokeAndFillPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pso, (void*)(uintptr_t)ppo, (void*)(uintptr_t)pco, (void*)(uintptr_t)pxo, (void*)(uintptr_t)pbostroke, (void*)(uintptr_t)plineattrs, (void*)(uintptr_t)pbofill, (void*)(uintptr_t)pptlbrushorg, (uint32_t)mixfill, (uint32_t)floptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engStrokePath(JNIEnv* km_env, jclass km_clazz, jlong pso, jlong ppo, jlong pco, jlong pxo, jlong pbo, jlong pptlbrushorg, jlong plineattrs, jint mix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngStrokePath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pso, (void*)(uintptr_t)ppo, (void*)(uintptr_t)pco, (void*)(uintptr_t)pxo, (void*)(uintptr_t)pbo, (void*)(uintptr_t)pptlbrushorg, (void*)(uintptr_t)plineattrs, (uint32_t)mix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engTextOut(JNIEnv* km_env, jclass km_clazz, jlong pso, jlong pstro, jlong pfo, jlong pco, jlong prclextra, jlong prclopaque, jlong pbofore, jlong pboopaque, jlong pptlorg, jint mix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngTextOut");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pso, (void*)(uintptr_t)pstro, (void*)(uintptr_t)pfo, (void*)(uintptr_t)pco, (void*)(uintptr_t)prclextra, (void*)(uintptr_t)prclopaque, (void*)(uintptr_t)pbofore, (void*)(uintptr_t)pboopaque, (void*)(uintptr_t)pptlorg, (uint32_t)mix);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engTransparentBlt(JNIEnv* km_env, jclass km_clazz, jlong psodst, jlong psosrc, jlong pco, jlong pxlo, jlong prcldst, jlong prclsrc, jint transcolor, jint bcalledfrombitblt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngTransparentBlt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psodst, (void*)(uintptr_t)psosrc, (void*)(uintptr_t)pco, (void*)(uintptr_t)pxlo, (void*)(uintptr_t)prcldst, (void*)(uintptr_t)prclsrc, (uint32_t)transcolor, (uint32_t)bcalledfrombitblt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engUnicodeToMultiByteN(JNIEnv* km_env, jclass km_clazz, jlong multibytestring, jint maxbytesinmultibytestring, jlong bytesinmultibytestring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngUnicodeToMultiByteN");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)multibytestring, (uint32_t)maxbytesinmultibytestring, (void*)(uintptr_t)bytesinmultibytestring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring);
    } else {
        errno = ENOSYS;
    }
#else
    (void)multibytestring;
    (void)maxbytesinmultibytestring;
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engUnlockSurface(JNIEnv* km_env, jclass km_clazz, jlong pso) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngUnlockSurface");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pso);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pso;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1engWideCharToMultiByte(JNIEnv* km_env, jclass km_clazz, jint codepage, jlong widecharstring, jint bytesinwidecharstring, jlong multibytestring, jint bytesinmultibytestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EngWideCharToMultiByte");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)codepage, (void*)(uintptr_t)widecharstring, (int32_t)bytesinwidecharstring, (void*)(uintptr_t)multibytestring, (int32_t)bytesinmultibytestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)codepage;
    (void)widecharstring;
    (void)bytesinwidecharstring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1fontobjCGetAllGlyphHandles(JNIEnv* km_env, jclass km_clazz, jlong pfo, jlong phg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_cGetAllGlyphHandles");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfo, (void*)(uintptr_t)phg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pfo;
    (void)phg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1fontobjCGetGlyphs(JNIEnv* km_env, jclass km_clazz, jlong pfo, jint imode, jint cglyph, jlong phg, jlong ppvglyph) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_cGetGlyphs");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfo, (uint32_t)imode, (uint32_t)cglyph, (void*)(uintptr_t)phg, (void*)(uintptr_t)ppvglyph);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pfo;
    (void)imode;
    (void)cglyph;
    (void)phg;
    (void)ppvglyph;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1fontobjPQueryGlyphAttrs(JNIEnv* km_env, jclass km_clazz, jlong pfo, jint imode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_pQueryGlyphAttrs");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfo, (uint32_t)imode);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pfo;
    (void)imode;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1fontobjPfdg(JNIEnv* km_env, jclass km_clazz, jlong pfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_pfdg");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pfo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1fontobjPifi(JNIEnv* km_env, jclass km_clazz, jlong pfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_pifi");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pfo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1fontobjPvTrueTypeFontFile(JNIEnv* km_env, jclass km_clazz, jlong pfo, jlong pcjfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_pvTrueTypeFontFile");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfo, (void*)(uintptr_t)pcjfile);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pfo;
    (void)pcjfile;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1fontobjPxoGetXform(JNIEnv* km_env, jclass km_clazz, jlong pfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_pxoGetXform");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pfo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1fontobjVGetInfo(JNIEnv* km_env, jclass km_clazz, jlong pfo, jint cjsize, jlong pfi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FONTOBJ_vGetInfo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pfo, (uint32_t)cjsize, (void*)(uintptr_t)pfi);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pfo;
    (void)cjsize;
    (void)pfi;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getAutoRotationState(JNIEnv* km_env, jclass km_clazz, jlong pstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAutoRotationState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getCapabilitiesStringLength(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong pdwcapabilitiesstringlengthincharacters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCapabilitiesStringLength");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)pdwcapabilitiesstringlengthincharacters);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)pdwcapabilitiesstringlengthincharacters;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getDisplayAutoRotationPreferences(JNIEnv* km_env, jclass km_clazz, jlong porientation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDisplayAutoRotationPreferences");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)porientation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)porientation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getDisplayConfigBufferSizes(JNIEnv* km_env, jclass km_clazz, jint flags, jlong numpatharrayelements, jlong nummodeinfoarrayelements) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDisplayConfigBufferSizes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)numpatharrayelements, (void*)(uintptr_t)nummodeinfoarrayelements);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)numpatharrayelements;
    (void)nummodeinfoarrayelements;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getMonitorBrightness(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong pdwminimumbrightness, jlong pdwcurrentbrightness, jlong pdwmaximumbrightness) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorBrightness");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)pdwminimumbrightness, (void*)(uintptr_t)pdwcurrentbrightness, (void*)(uintptr_t)pdwmaximumbrightness);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)pdwminimumbrightness;
    (void)pdwcurrentbrightness;
    (void)pdwmaximumbrightness;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getMonitorCapabilities(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong pdwmonitorcapabilities, jlong pdwsupportedcolortemperatures) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorCapabilities");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)pdwmonitorcapabilities, (void*)(uintptr_t)pdwsupportedcolortemperatures);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)pdwmonitorcapabilities;
    (void)pdwsupportedcolortemperatures;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getMonitorColorTemperature(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong pctcurrentcolortemperature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorColorTemperature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)pctcurrentcolortemperature);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)pctcurrentcolortemperature;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getMonitorContrast(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong pdwminimumcontrast, jlong pdwcurrentcontrast, jlong pdwmaximumcontrast) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorContrast");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)pdwminimumcontrast, (void*)(uintptr_t)pdwcurrentcontrast, (void*)(uintptr_t)pdwmaximumcontrast);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)pdwminimumcontrast;
    (void)pdwcurrentcontrast;
    (void)pdwmaximumcontrast;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getMonitorDisplayAreaPosition(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint ptpositiontype, jlong pdwminimumposition, jlong pdwcurrentposition, jlong pdwmaximumposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorDisplayAreaPosition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (int32_t)ptpositiontype, (void*)(uintptr_t)pdwminimumposition, (void*)(uintptr_t)pdwcurrentposition, (void*)(uintptr_t)pdwmaximumposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)ptpositiontype;
    (void)pdwminimumposition;
    (void)pdwcurrentposition;
    (void)pdwmaximumposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getMonitorDisplayAreaSize(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint stsizetype, jlong pdwminimumwidthorheight, jlong pdwcurrentwidthorheight, jlong pdwmaximumwidthorheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorDisplayAreaSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (int32_t)stsizetype, (void*)(uintptr_t)pdwminimumwidthorheight, (void*)(uintptr_t)pdwcurrentwidthorheight, (void*)(uintptr_t)pdwmaximumwidthorheight);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)stsizetype;
    (void)pdwminimumwidthorheight;
    (void)pdwcurrentwidthorheight;
    (void)pdwmaximumwidthorheight;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getMonitorRedGreenOrBlueDrive(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint dtdrivetype, jlong pdwminimumdrive, jlong pdwcurrentdrive, jlong pdwmaximumdrive) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorRedGreenOrBlueDrive");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (int32_t)dtdrivetype, (void*)(uintptr_t)pdwminimumdrive, (void*)(uintptr_t)pdwcurrentdrive, (void*)(uintptr_t)pdwmaximumdrive);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)dtdrivetype;
    (void)pdwminimumdrive;
    (void)pdwcurrentdrive;
    (void)pdwmaximumdrive;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getMonitorRedGreenOrBlueGain(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint gtgaintype, jlong pdwminimumgain, jlong pdwcurrentgain, jlong pdwmaximumgain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorRedGreenOrBlueGain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (int32_t)gtgaintype, (void*)(uintptr_t)pdwminimumgain, (void*)(uintptr_t)pdwcurrentgain, (void*)(uintptr_t)pdwmaximumgain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)gtgaintype;
    (void)pdwminimumgain;
    (void)pdwcurrentgain;
    (void)pdwmaximumgain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getMonitorTechnologyType(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong pdtydisplaytechnologytype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMonitorTechnologyType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)pdtydisplaytechnologytype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)pdtydisplaytechnologytype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getNumberOfPhysicalMonitorsFromHMONITOR(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong pdwnumberofphysicalmonitors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfPhysicalMonitorsFromHMONITOR");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)pdwnumberofphysicalmonitors);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)pdwnumberofphysicalmonitors;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getPhysicalMonitorsFromHMONITOR(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint dwphysicalmonitorarraysize, jlong pphysicalmonitorarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPhysicalMonitorsFromHMONITOR");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (uint32_t)dwphysicalmonitorarraysize, (void*)(uintptr_t)pphysicalmonitorarray);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)dwphysicalmonitorarraysize;
    (void)pphysicalmonitorarray;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getTimingReport(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jlong pmtrmonitortimingreport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimingReport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (void*)(uintptr_t)pmtrmonitortimingreport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)pmtrmonitortimingreport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1getVCPFeatureAndVCPFeatureReply(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jbyte bvcpcode, jlong pvct, jlong pdwcurrentvalue, jlong pdwmaximumvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVCPFeatureAndVCPFeatureReply");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (uint8_t)bvcpcode, (void*)(uintptr_t)pvct, (void*)(uintptr_t)pdwcurrentvalue, (void*)(uintptr_t)pdwmaximumvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)bvcpcode;
    (void)pvct;
    (void)pdwcurrentvalue;
    (void)pdwmaximumvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1htGet8BppformatPalette(JNIEnv* km_env, jclass km_clazz, jlong ppaletteentry, jshort redgamma, jshort greengamma, jshort bluegamma) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HT_Get8BPPFormatPalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppaletteentry, (uint16_t)redgamma, (uint16_t)greengamma, (uint16_t)bluegamma);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppaletteentry;
    (void)redgamma;
    (void)greengamma;
    (void)bluegamma;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1htGet8BppmaskPalette(JNIEnv* km_env, jclass km_clazz, jlong ppaletteentry, jint use8bppmaskpal, jbyte cmymask, jshort redgamma, jshort greengamma, jshort bluegamma) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint8_t, uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HT_Get8BPPMaskPalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppaletteentry, (int32_t)use8bppmaskpal, (uint8_t)cmymask, (uint16_t)redgamma, (uint16_t)greengamma, (uint16_t)bluegamma);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppaletteentry;
    (void)use8bppmaskpal;
    (void)cmymask;
    (void)redgamma;
    (void)greengamma;
    (void)bluegamma;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1pathobjBEnum(JNIEnv* km_env, jclass km_clazz, jlong ppo, jlong ppd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PATHOBJ_bEnum");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppo, (void*)(uintptr_t)ppd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppo;
    (void)ppd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1pathobjBEnumClipLines(JNIEnv* km_env, jclass km_clazz, jlong ppo, jint cb, jlong pcl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PATHOBJ_bEnumClipLines");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppo, (uint32_t)cb, (void*)(uintptr_t)pcl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppo;
    (void)cb;
    (void)pcl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1pathobjVEnumStart(JNIEnv* km_env, jclass km_clazz, jlong ppo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PATHOBJ_vEnumStart");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ppo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ppo;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1pathobjVEnumStartClipLines(JNIEnv* km_env, jclass km_clazz, jlong ppo, jlong pco, jlong pso, jlong pla) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PATHOBJ_vEnumStartClipLines");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ppo, (void*)(uintptr_t)pco, (void*)(uintptr_t)pso, (void*)(uintptr_t)pla);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ppo;
    (void)pco;
    (void)pso;
    (void)pla;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1pathobjVGetBounds(JNIEnv* km_env, jclass km_clazz, jlong ppo, jlong prectfx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PATHOBJ_vGetBounds");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ppo, (void*)(uintptr_t)prectfx);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ppo;
    (void)prectfx;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1queryDisplayConfig(JNIEnv* km_env, jclass km_clazz, jint flags, jlong numpatharrayelements, jlong patharray, jlong nummodeinfoarrayelements, jlong modeinfoarray, jlong currenttopologyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryDisplayConfig");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)numpatharrayelements, (void*)(uintptr_t)patharray, (void*)(uintptr_t)nummodeinfoarrayelements, (void*)(uintptr_t)modeinfoarray, (void*)(uintptr_t)currenttopologyid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)numpatharrayelements;
    (void)patharray;
    (void)nummodeinfoarrayelements;
    (void)modeinfoarray;
    (void)currenttopologyid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1restoreMonitorFactoryColorDefaults(JNIEnv* km_env, jclass km_clazz, jlong hmonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreMonitorFactoryColorDefaults");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1restoreMonitorFactoryDefaults(JNIEnv* km_env, jclass km_clazz, jlong hmonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreMonitorFactoryDefaults");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1strobjBEnum(JNIEnv* km_env, jclass km_clazz, jlong pstro, jlong pc, jlong ppgpos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STROBJ_bEnum");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstro, (void*)(uintptr_t)pc, (void*)(uintptr_t)ppgpos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstro;
    (void)pc;
    (void)ppgpos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1strobjBEnumPositionsOnly(JNIEnv* km_env, jclass km_clazz, jlong pstro, jlong pc, jlong ppgpos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STROBJ_bEnumPositionsOnly");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstro, (void*)(uintptr_t)pc, (void*)(uintptr_t)ppgpos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstro;
    (void)pc;
    (void)ppgpos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1strobjBGetAdvanceWidths(JNIEnv* km_env, jclass km_clazz, jlong pso, jint ifirst, jint c, jlong pptqd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STROBJ_bGetAdvanceWidths");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pso, (uint32_t)ifirst, (uint32_t)c, (void*)(uintptr_t)pptqd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pso;
    (void)ifirst;
    (void)c;
    (void)pptqd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1strobjDwGetCodePage(JNIEnv* km_env, jclass km_clazz, jlong pstro) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STROBJ_dwGetCodePage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstro);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstro;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1strobjVEnumStart(JNIEnv* km_env, jclass km_clazz, jlong pstro) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "STROBJ_vEnumStart");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstro);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstro;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1saveCurrentMonitorSettings(JNIEnv* km_env, jclass km_clazz, jlong hmonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaveCurrentMonitorSettings");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1saveCurrentSettings(JNIEnv* km_env, jclass km_clazz, jlong hmonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaveCurrentSettings");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1setDisplayAutoRotationPreferences(JNIEnv* km_env, jclass km_clazz, jint orientation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDisplayAutoRotationPreferences");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)orientation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)orientation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1setDisplayConfig(JNIEnv* km_env, jclass km_clazz, jint numpatharrayelements, jlong patharray, jint nummodeinfoarrayelements, jlong modeinfoarray, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDisplayConfig");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)numpatharrayelements, (void*)(uintptr_t)patharray, (uint32_t)nummodeinfoarrayelements, (void*)(uintptr_t)modeinfoarray, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)numpatharrayelements;
    (void)patharray;
    (void)nummodeinfoarrayelements;
    (void)modeinfoarray;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1setMonitorBrightness(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint dwnewbrightness) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorBrightness");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (uint32_t)dwnewbrightness);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)dwnewbrightness;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1setMonitorColorTemperature(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint ctcurrentcolortemperature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorColorTemperature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (int32_t)ctcurrentcolortemperature);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)ctcurrentcolortemperature;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1setMonitorContrast(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint dwnewcontrast) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorContrast");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (uint32_t)dwnewcontrast);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)dwnewcontrast;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1setMonitorDisplayAreaPosition(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint ptpositiontype, jint dwnewposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorDisplayAreaPosition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (int32_t)ptpositiontype, (uint32_t)dwnewposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)ptpositiontype;
    (void)dwnewposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1setMonitorDisplayAreaSize(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint stsizetype, jint dwnewdisplayareawidthorheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorDisplayAreaSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (int32_t)stsizetype, (uint32_t)dwnewdisplayareawidthorheight);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)stsizetype;
    (void)dwnewdisplayareawidthorheight;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1setMonitorRedGreenOrBlueDrive(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint dtdrivetype, jint dwnewdrive) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorRedGreenOrBlueDrive");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (int32_t)dtdrivetype, (uint32_t)dwnewdrive);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)dtdrivetype;
    (void)dwnewdrive;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1setMonitorRedGreenOrBlueGain(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jint gtgaintype, jint dwnewgain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMonitorRedGreenOrBlueGain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (int32_t)gtgaintype, (uint32_t)dwnewgain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)gtgaintype;
    (void)dwnewgain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1setVCPFeature(JNIEnv* km_env, jclass km_clazz, jlong hmonitor, jbyte bvcpcode, jint dwnewvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dxva2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVCPFeature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmonitor, (uint8_t)bvcpcode, (uint32_t)dwnewvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmonitor;
    (void)bvcpcode;
    (void)dwnewvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1xformobjBApplyXform(JNIEnv* km_env, jclass km_clazz, jlong pxo, jint imode, jint cpoints, jlong pvin, jlong pvout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XFORMOBJ_bApplyXform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pxo, (uint32_t)imode, (uint32_t)cpoints, (void*)(uintptr_t)pvin, (void*)(uintptr_t)pvout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pxo;
    (void)imode;
    (void)cpoints;
    (void)pvin;
    (void)pvout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1xformobjIGetXform(JNIEnv* km_env, jclass km_clazz, jlong pxo, jlong pxform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XFORMOBJ_iGetXform");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pxo, (void*)(uintptr_t)pxform);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pxo;
    (void)pxform;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1xlateobjCGetPalette(JNIEnv* km_env, jclass km_clazz, jlong pxlo, jint ipal, jint cpal, jlong ppal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XLATEOBJ_cGetPalette");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pxlo, (uint32_t)ipal, (uint32_t)cpal, (void*)(uintptr_t)ppal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pxlo;
    (void)ipal;
    (void)cpal;
    (void)ppal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1xlateobjHGetColorTransform(JNIEnv* km_env, jclass km_clazz, jlong pxlo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XLATEOBJ_hGetColorTransform");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pxlo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pxlo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1xlateobjIXlate(JNIEnv* km_env, jclass km_clazz, jlong pxlo, jint icolor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XLATEOBJ_iXlate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pxlo, (uint32_t)icolor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pxlo;
    (void)icolor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_display_WindowsWin32DevicesDisplayJniBridge_windowssys_1windows_1win32_1devices_1display_1xlateobjPiVector(JNIEnv* km_env, jclass km_clazz, jlong pxlo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XLATEOBJ_piVector");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pxlo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pxlo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

