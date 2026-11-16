#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_input_wrapper.h"
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

int64_t windowssysWindowsWin32UiInputDefRawInputProc(void* parawinput, int32_t ninput, uint32_t cbsizeheader) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefRawInputProc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parawinput, ninput, cbsizeheader);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)parawinput;
    (void)ninput;
    (void)cbsizeheader;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputGetCIMSSM(void* inputmessagesource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCIMSSM");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inputmessagesource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inputmessagesource;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputGetCurrentInputMessageSource(void* inputmessagesource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentInputMessageSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inputmessagesource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inputmessagesource;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32UiInputGetRawInputBuffer(void* pdata, void* pcbsize, uint32_t cbsizeheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawInputBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdata, pcbsize, cbsizeheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdata;
    (void)pcbsize;
    (void)cbsizeheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputGetRawInputData(void* hrawinput, uint32_t uicommand, void* pdata, void* pcbsize, uint32_t cbsizeheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawInputData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrawinput, uicommand, pdata, pcbsize, cbsizeheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrawinput;
    (void)uicommand;
    (void)pdata;
    (void)pcbsize;
    (void)cbsizeheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputGetRawInputDeviceInfoA(void* hdevice, uint32_t uicommand, void* pdata, void* pcbsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawInputDeviceInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, uicommand, pdata, pcbsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    (void)uicommand;
    (void)pdata;
    (void)pcbsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputGetRawInputDeviceInfoW(void* hdevice, uint32_t uicommand, void* pdata, void* pcbsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawInputDeviceInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, uicommand, pdata, pcbsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    (void)uicommand;
    (void)pdata;
    (void)pcbsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputGetRawInputDeviceList(void* prawinputdevicelist, void* puinumdevices, uint32_t cbsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawInputDeviceList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prawinputdevicelist, puinumdevices, cbsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prawinputdevicelist;
    (void)puinumdevices;
    (void)cbsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputGetRegisteredRawInputDevices(void* prawinputdevices, void* puinumdevices, uint32_t cbsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegisteredRawInputDevices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prawinputdevices, puinumdevices, cbsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prawinputdevices;
    (void)puinumdevices;
    (void)cbsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32UiInputRegisterRawInputDevices(void* prawinputdevices, uint32_t uinumdevices, uint32_t cbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterRawInputDevices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prawinputdevices, uinumdevices, cbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prawinputdevices;
    (void)uinumdevices;
    (void)cbsize;
    errno = ENOSYS;
    return -1;
#endif
}

