#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_input_touch_wrapper.h"
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

int32_t windowssys_windows_win32_ui_input_touch_CloseGestureInfoHandle(void* hgestureinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseGestureInfoHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgestureinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgestureinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_touch_CloseTouchInputHandle(void* htouchinput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseTouchInputHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htouchinput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htouchinput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_touch_GetGestureConfig(void* hwnd, uint32_t dwreserved, uint32_t dwflags, void* pcids, void* pgestureconfig, uint32_t cbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGestureConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwreserved, dwflags, pcids, pgestureconfig, cbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwreserved;
    (void)dwflags;
    (void)pcids;
    (void)pgestureconfig;
    (void)cbsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_touch_GetGestureExtraArgs(void* hgestureinfo, uint32_t cbextraargs, void* pextraargs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGestureExtraArgs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgestureinfo, cbextraargs, pextraargs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgestureinfo;
    (void)cbextraargs;
    (void)pextraargs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_touch_GetGestureInfo(void* hgestureinfo, void* pgestureinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGestureInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgestureinfo, pgestureinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgestureinfo;
    (void)pgestureinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_touch_GetTouchInputInfo(void* htouchinput, uint32_t cinputs, void* pinputs, int32_t cbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTouchInputInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htouchinput, cinputs, pinputs, cbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htouchinput;
    (void)cinputs;
    (void)pinputs;
    (void)cbsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_touch_IsTouchWindow(void* hwnd, void* pulflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsTouchWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pulflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pulflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_touch_RegisterTouchWindow(void* hwnd, uint32_t ulflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTouchWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ulflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)ulflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_touch_SetGestureConfig(void* hwnd, uint32_t dwreserved, uint32_t cids, void* pgestureconfig, uint32_t cbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGestureConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwreserved, cids, pgestureconfig, cbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwreserved;
    (void)cids;
    (void)pgestureconfig;
    (void)cbsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_touch_UnregisterTouchWindow(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterTouchWindow");
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

