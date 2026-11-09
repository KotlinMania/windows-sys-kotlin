#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_input_pointer_wrapper.h"
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

int32_t windowssys_windows_win32_ui_input_pointer_EnableMouseInPointer(int32_t fenable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableMouseInPointer");
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

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerCursorId(uint32_t pointerid, void* cursorid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerCursorId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, cursorid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)cursorid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerDevice(void* device, void* pointerdevice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(device, pointerdevice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)device;
    (void)pointerdevice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerDeviceCursors(void* device, void* cursorcount, void* devicecursors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerDeviceCursors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(device, cursorcount, devicecursors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)device;
    (void)cursorcount;
    (void)devicecursors;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerDeviceProperties(void* device, void* propertycount, void* pointerproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerDeviceProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(device, propertycount, pointerproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)device;
    (void)propertycount;
    (void)pointerproperties;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerDeviceRects(void* device, void* pointerdevicerect, void* displayrect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerDeviceRects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(device, pointerdevicerect, displayrect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)device;
    (void)pointerdevicerect;
    (void)displayrect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerDevices(void* devicecount, void* pointerdevices) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerDevices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicecount, pointerdevices);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)devicecount;
    (void)pointerdevices;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfo(uint32_t pointerid, void* pointercount, void* pointerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFrameInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, pointercount, pointerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)pointercount;
    (void)pointerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* pointerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFrameInfoHistory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, entriescount, pointercount, pointerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)pointercount;
    (void)pointerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfo(uint32_t pointerid, void* pointercount, void* peninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFramePenInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, pointercount, peninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)pointercount;
    (void)peninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* peninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFramePenInfoHistory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, entriescount, pointercount, peninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)pointercount;
    (void)peninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfo(uint32_t pointerid, void* pointercount, void* touchinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFrameTouchInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, pointercount, touchinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)pointercount;
    (void)touchinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* touchinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerFrameTouchInfoHistory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, entriescount, pointercount, touchinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)pointercount;
    (void)touchinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerInfo(uint32_t pointerid, void* pointerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, pointerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)pointerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerInfoHistory(uint32_t pointerid, void* entriescount, void* pointerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerInfoHistory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, entriescount, pointerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)pointerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerInputTransform(uint32_t pointerid, uint32_t historycount, void* inputtransform) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerInputTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, historycount, inputtransform);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)historycount;
    (void)inputtransform;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerPenInfo(uint32_t pointerid, void* peninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerPenInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, peninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)peninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerPenInfoHistory(uint32_t pointerid, void* entriescount, void* peninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerPenInfoHistory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, entriescount, peninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)peninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfo(uint32_t pointerid, void* touchinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerTouchInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, touchinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)touchinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfoHistory(uint32_t pointerid, void* entriescount, void* touchinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerTouchInfoHistory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, entriescount, touchinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)entriescount;
    (void)touchinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetPointerType(uint32_t pointerid, void* pointertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPointerType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, pointertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)pointertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_GetRawPointerDeviceData(uint32_t pointerid, uint32_t historycount, uint32_t propertiescount, void* pproperties, void* pvalues) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawPointerDeviceData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid, historycount, propertiescount, pproperties, pvalues);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    (void)historycount;
    (void)propertiescount;
    (void)pproperties;
    (void)pvalues;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_input_pointer_GetUnpredictedMessagePos(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUnpredictedMessagePos");
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

int32_t windowssys_windows_win32_ui_input_pointer_InitializeTouchInjection(uint32_t maxcount, uint32_t dwmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeTouchInjection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maxcount, dwmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)maxcount;
    (void)dwmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_InjectSyntheticPointerInput(void* device, void* pointerinfo, uint32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InjectSyntheticPointerInput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(device, pointerinfo, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)device;
    (void)pointerinfo;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_InjectTouchInput(uint32_t count, void* contacts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InjectTouchInput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(count, contacts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)count;
    (void)contacts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_pointer_IsMouseInPointerEnabled(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsMouseInPointerEnabled");
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

int32_t windowssys_windows_win32_ui_input_pointer_SkipPointerFrameMessages(uint32_t pointerid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SkipPointerFrameMessages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pointerid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pointerid;
    errno = ENOSYS;
    return -1;
#endif
}

