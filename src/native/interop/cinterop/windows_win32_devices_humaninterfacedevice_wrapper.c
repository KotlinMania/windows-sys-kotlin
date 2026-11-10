#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_humaninterfacedevice_wrapper.h"
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

int32_t windowssys_windows_win32_devices_humaninterfacedevice_directInput8Create(void* hinst, uint32_t dwversion, void* riidltf, void* ppvout, void* punkouter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dinput8.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DirectInput8Create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, dwversion, riidltf, ppvout, punkouter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinst;
    (void)dwversion;
    (void)riidltf;
    (void)ppvout;
    (void)punkouter;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDFlushQueue(void* hiddeviceobject) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_FlushQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDFreePreparsedData(int64_t preparseddata) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_FreePreparsedData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preparseddata);
    }
    errno = ENOSYS;
    return false;
#else
    (void)preparseddata;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetAttributes(void* hiddeviceobject, void* attributes) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, attributes);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)attributes;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetConfiguration(void* hiddeviceobject, void* configuration, uint32_t configurationlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, configuration, configurationlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)configuration;
    (void)configurationlength;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetFeature(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetFeature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_win32_devices_humaninterfacedevice_hidDGetHidGuid(void* hidguid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetHidGuid");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hidguid);
        return;
    }
    errno = ENOSYS;
#else
    (void)hidguid;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetIndexedString(void* hiddeviceobject, uint32_t stringindex, void* buffer, uint32_t bufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetIndexedString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, stringindex, buffer, bufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)stringindex;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetInputReport(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetInputReport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetManufacturerString(void* hiddeviceobject, void* buffer, uint32_t bufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetManufacturerString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, buffer, bufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetMsGenreDescriptor(void* hiddeviceobject, void* buffer, uint32_t bufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetMsGenreDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, buffer, bufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetNumInputBuffers(void* hiddeviceobject, void* numberbuffers) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetNumInputBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, numberbuffers);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)numberbuffers;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPhysicalDescriptor(void* hiddeviceobject, void* buffer, uint32_t bufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetPhysicalDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, buffer, bufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPreparsedData(void* hiddeviceobject, void* preparseddata) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetPreparsedData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, preparseddata);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)preparseddata;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetProductString(void* hiddeviceobject, void* buffer, uint32_t bufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetProductString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, buffer, bufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDGetSerialNumberString(void* hiddeviceobject, void* buffer, uint32_t bufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_GetSerialNumberString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, buffer, bufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)buffer;
    (void)bufferlength;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDSetConfiguration(void* hiddeviceobject, void* configuration, uint32_t configurationlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_SetConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, configuration, configurationlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)configuration;
    (void)configurationlength;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDSetFeature(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_SetFeature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDSetNumInputBuffers(void* hiddeviceobject, uint32_t numberbuffers) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_SetNumInputBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, numberbuffers);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)numberbuffers;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_humaninterfacedevice_hidDSetOutputReport(void* hiddeviceobject, void* reportbuffer, uint32_t reportbufferlength) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidD_SetOutputReport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hiddeviceobject, reportbuffer, reportbufferlength);
    }
    errno = ENOSYS;
    return false;
#else
    (void)hiddeviceobject;
    (void)reportbuffer;
    (void)reportbufferlength;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttondata, void* buttondatalength, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetButtonArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usage, buttondata, buttondatalength, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)buttondata;
    (void)buttondatalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonCaps(int32_t reporttype, void* buttoncaps, void* buttoncapslength, int64_t preparseddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetButtonCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, buttoncaps, buttoncapslength, preparseddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)buttoncaps;
    (void)buttoncapslength;
    (void)preparseddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetCaps(int64_t preparseddata, void* capabilities) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preparseddata, capabilities);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)preparseddata;
    (void)capabilities;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetData(int32_t reporttype, void* datalist, void* datalength, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, datalist, datalength, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)datalist;
    (void)datalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetExtendedAttributes(int32_t reporttype, uint16_t dataindex, int64_t preparseddata, void* attributes, void* lengthattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetExtendedAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, dataindex, preparseddata, attributes, lengthattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)dataindex;
    (void)preparseddata;
    (void)attributes;
    (void)lengthattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetLinkCollectionNodes(void* linkcollectionnodes, void* linkcollectionnodeslength, int64_t preparseddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetLinkCollectionNodes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(linkcollectionnodes, linkcollectionnodeslength, preparseddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)linkcollectionnodes;
    (void)linkcollectionnodeslength;
    (void)preparseddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetScaledUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetScaledUsageValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificButtonCaps(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttoncaps, void* buttoncapslength, int64_t preparseddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetSpecificButtonCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usage, buttoncaps, buttoncapslength, preparseddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)buttoncaps;
    (void)buttoncapslength;
    (void)preparseddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificValueCaps(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* valuecaps, void* valuecapslength, int64_t preparseddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetSpecificValueCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usage, valuecaps, valuecapslength, preparseddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)valuecaps;
    (void)valuecapslength;
    (void)preparseddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetUsageValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValueArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, uint16_t usagevaluebytelength, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, uint16_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetUsageValueArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, usagevaluebytelength, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)usagevaluebytelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetUsages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usagelist, usagelength, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsagesEx(int32_t reporttype, uint16_t linkcollection, void* buttonlist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetUsagesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, linkcollection, buttonlist, usagelength, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)linkcollection;
    (void)buttonlist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPGetValueCaps(int32_t reporttype, void* valuecaps, void* valuecapslength, int64_t preparseddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_GetValueCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, valuecaps, valuecapslength, preparseddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)valuecaps;
    (void)valuecapslength;
    (void)preparseddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPInitializeReportForId(int32_t reporttype, uint8_t reportid, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint8_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_InitializeReportForID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, reportid, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)reportid;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxDataListLength(int32_t reporttype, int64_t preparseddata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_MaxDataListLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, preparseddata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reporttype;
    (void)preparseddata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxUsageListLength(int32_t reporttype, uint16_t usagepage, int64_t preparseddata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_MaxUsageListLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, preparseddata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reporttype;
    (void)usagepage;
    (void)preparseddata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetButtonArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* buttondata, uint16_t buttondatalength, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, uint16_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetButtonArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usage, buttondata, buttondatalength, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)buttondata;
    (void)buttondatalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetData(int32_t reporttype, void* datalist, void* datalength, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, datalist, datalength, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)datalist;
    (void)datalength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetScaledUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, int32_t usagevalue, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, int32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetScaledUsageValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValue(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, uint32_t usagevalue, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, uint32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetUsageValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValueArray(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, uint16_t usage, void* usagevalue, uint16_t usagevaluebytelength, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, uint16_t, void*, uint16_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetUsageValueArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usage, usagevalue, usagevaluebytelength, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usage;
    (void)usagevalue;
    (void)usagevaluebytelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_SetUsages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usagelist, usagelength, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPTranslateUsagesToI8042ScanCodes(void* changedusagelist, uint32_t usagelistlength, int32_t keyaction, void* modifierstate, void* insertcodesprocedure, void* insertcodescontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_TranslateUsagesToI8042ScanCodes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(changedusagelist, usagelistlength, keyaction, modifierstate, insertcodesprocedure, insertcodescontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)changedusagelist;
    (void)usagelistlength;
    (void)keyaction;
    (void)modifierstate;
    (void)insertcodesprocedure;
    (void)insertcodescontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPUnsetUsages(int32_t reporttype, uint16_t usagepage, uint16_t linkcollection, void* usagelist, void* usagelength, int64_t preparseddata, void* report, uint32_t reportlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, uint16_t, void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_UnsetUsages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reporttype, usagepage, linkcollection, usagelist, usagelength, preparseddata, report, reportlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reporttype;
    (void)usagepage;
    (void)linkcollection;
    (void)usagelist;
    (void)usagelength;
    (void)preparseddata;
    (void)report;
    (void)reportlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_humaninterfacedevice_hidPUsageListDifference(void* previoususagelist, void* currentusagelist, void* breakusagelist, void* makeusagelist, uint32_t usagelistlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hid.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HidP_UsageListDifference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(previoususagelist, currentusagelist, breakusagelist, makeusagelist, usagelistlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)previoususagelist;
    (void)currentusagelist;
    (void)breakusagelist;
    (void)makeusagelist;
    (void)usagelistlength;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyConfigChanged");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

