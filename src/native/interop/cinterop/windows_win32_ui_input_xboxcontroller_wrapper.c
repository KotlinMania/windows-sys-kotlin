#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_input_xboxcontroller_wrapper.h"
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

void windowssys_windows_win32_ui_input_xboxcontroller_xInputEnable(int32_t enable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputEnable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(enable);
        return;
    }
    errno = ENOSYS;
#else
    (void)enable;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputGetAudioDeviceIds(uint32_t dwuserindex, void* prenderdeviceid, void* prendercount, void* pcapturedeviceid, void* pcapturecount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputGetAudioDeviceIds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwuserindex, prenderdeviceid, prendercount, pcapturedeviceid, pcapturecount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwuserindex;
    (void)prenderdeviceid;
    (void)prendercount;
    (void)pcapturedeviceid;
    (void)pcapturecount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputGetBatteryInformation(uint32_t dwuserindex, uint8_t devtype, void* pbatteryinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputGetBatteryInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwuserindex, devtype, pbatteryinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwuserindex;
    (void)devtype;
    (void)pbatteryinformation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputGetCapabilities(uint32_t dwuserindex, uint32_t dwflags, void* pcapabilities) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputGetCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwuserindex, dwflags, pcapabilities);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwuserindex;
    (void)dwflags;
    (void)pcapabilities;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputGetKeystroke(uint32_t dwuserindex, uint32_t dwreserved, void* pkeystroke) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputGetKeystroke");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwuserindex, dwreserved, pkeystroke);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwuserindex;
    (void)dwreserved;
    (void)pkeystroke;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputGetState(uint32_t dwuserindex, void* pstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputGetState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwuserindex, pstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwuserindex;
    (void)pstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputSetState(uint32_t dwuserindex, void* pvibration) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputSetState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwuserindex, pvibration);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwuserindex;
    (void)pvibration;
    errno = ENOSYS;
    return 0;
#endif
}

