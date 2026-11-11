#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_alljoyn_wrapper.h"
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

uint32_t windowssys_windows_win32_devices_alljoyn_allJoynAcceptBusConnection(void* serverbushandle, void* abortevent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynAcceptBusConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serverbushandle, abortevent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serverbushandle;
    (void)abortevent;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_allJoynCloseBusHandle(void* bushandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynCloseBusHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bushandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bushandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_allJoynConnectToBus(void* connectionspec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynConnectToBus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionspec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)connectionspec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_allJoynCreateBus(uint32_t outbuffersize, uint32_t inbuffersize, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynCreateBus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(outbuffersize, inbuffersize, lpsecurityattributes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)outbuffersize;
    (void)inbuffersize;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_allJoynEnumEvents(void* connectedbushandle, void* eventtoreset, void* eventtypes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynEnumEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectedbushandle, eventtoreset, eventtypes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectedbushandle;
    (void)eventtoreset;
    (void)eventtypes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_allJoynEventSelect(void* connectedbushandle, void* eventhandle, uint32_t eventtypes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynEventSelect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectedbushandle, eventhandle, eventtypes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectedbushandle;
    (void)eventhandle;
    (void)eventtypes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_allJoynReceiveFromBus(void* connectedbushandle, void* buffer, uint32_t bytestoread, void* bytestransferred, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynReceiveFromBus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectedbushandle, buffer, bytestoread, bytestransferred, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectedbushandle;
    (void)buffer;
    (void)bytestoread;
    (void)bytestransferred;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_allJoynSendToBus(void* connectedbushandle, void* buffer, uint32_t bytestowrite, void* bytestransferred, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllJoynSendToBus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectedbushandle, buffer, bytestowrite, bytestransferred, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectedbushandle;
    (void)buffer;
    (void)bytestowrite;
    (void)bytestransferred;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_qccStatusText(int32_t status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QCC_StatusText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreate(void* defaultlanguage) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(defaultlanguage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)defaultlanguage;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateEmpty(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_create_empty");
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

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateFull(int64_t arg, void* language) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_create_full");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefrommsgarg(int64_t data, int64_t arg, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_createfrommsgarg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, arg, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)arg;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefromxml(int64_t data, void* aboutdataxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_createfromxml");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, aboutdataxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)aboutdataxml;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAboutdataDestroy(int64_t data) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(data);
        return;
    }
    errno = ENOSYS;
#else
    (void)data;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetaboutdata(int64_t data, int64_t msgarg, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getaboutdata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, msgarg, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)msgarg;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetajsoftwareversion(int64_t data, void* ajsoftwareversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getajsoftwareversion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, ajsoftwareversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)ajsoftwareversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetannouncedaboutdata(int64_t data, int64_t msgarg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getannouncedaboutdata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, msgarg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)msgarg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappid(int64_t data, void* appid, void* num) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getappid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, appid, num);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)appid;
    (void)num;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappname(int64_t data, void* appname, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getappname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, appname, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)appname;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdateofmanufacture(int64_t data, void* dateofmanufacture) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdateofmanufacture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, dateofmanufacture);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)dateofmanufacture;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdefaultlanguage(int64_t data, void* defaultlanguage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdefaultlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, defaultlanguage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)defaultlanguage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdescription(int64_t data, void* description, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, description, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)description;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdeviceid(int64_t data, void* deviceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdeviceid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, deviceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)deviceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdevicename(int64_t data, void* devicename, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getdevicename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, devicename, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)devicename;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfield(int64_t data, void* name, void* value, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getfield");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, name, value, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)name;
    (void)value;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfields(int64_t data, void* fields, uint64_t num_fields) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getfields");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, fields, num_fields);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)data;
    (void)fields;
    (void)num_fields;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfieldsignature(int64_t data, void* fieldname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getfieldsignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, fieldname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGethardwareversion(int64_t data, void* hardwareversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_gethardwareversion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, hardwareversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)hardwareversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmanufacturer(int64_t data, void* manufacturer, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getmanufacturer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, manufacturer, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)manufacturer;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmodelnumber(int64_t data, void* modelnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getmodelnumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, modelnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)modelnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsoftwareversion(int64_t data, void* softwareversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getsoftwareversion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, softwareversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)softwareversion;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupportedlanguages(int64_t data, void* languagetags, uint64_t num) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getsupportedlanguages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, languagetags, num);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)data;
    (void)languagetags;
    (void)num;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupporturl(int64_t data, void* supporturl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_getsupporturl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, supporturl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)supporturl;
    errno = ENOSYS;
    return -1;
#endif
}

uint8_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldannounced(int64_t data, void* fieldname) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_isfieldannounced");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, fieldname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldlocalized(int64_t data, void* fieldname) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_isfieldlocalized");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, fieldname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldrequired(int64_t data, void* fieldname) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_isfieldrequired");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, fieldname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)data;
    (void)fieldname;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsvalid(int64_t data, void* language) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_isvalid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, language);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)data;
    (void)language;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappid(int64_t data, void* appid, uint64_t num) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setappid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, appid, num);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)appid;
    (void)num;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappidFromstring(int64_t data, void* appid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setappid_fromstring");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, appid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)appid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappname(int64_t data, void* appname, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setappname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, appname, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)appname;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdateofmanufacture(int64_t data, void* dateofmanufacture) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdateofmanufacture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, dateofmanufacture);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)dateofmanufacture;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdefaultlanguage(int64_t data, void* defaultlanguage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdefaultlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, defaultlanguage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)defaultlanguage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdescription(int64_t data, void* description, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, description, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)description;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdeviceid(int64_t data, void* deviceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdeviceid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, deviceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)deviceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdevicename(int64_t data, void* devicename, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setdevicename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, devicename, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)devicename;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetfield(int64_t data, void* name, int64_t value, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setfield");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, name, value, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)name;
    (void)value;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSethardwareversion(int64_t data, void* hardwareversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_sethardwareversion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, hardwareversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)hardwareversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmanufacturer(int64_t data, void* manufacturer, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setmanufacturer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, manufacturer, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)manufacturer;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmodelnumber(int64_t data, void* modelnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setmodelnumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, modelnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)modelnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsoftwareversion(int64_t data, void* softwareversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setsoftwareversion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, softwareversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)softwareversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupportedlanguage(int64_t data, void* language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setsupportedlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupporturl(int64_t data, void* supporturl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdata_setsupporturl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, supporturl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    (void)supporturl;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerCreate(void* callbacks, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdatalistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutdatalistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAbouticonClear(int64_t icon) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_clear");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(icon);
        return;
    }
    errno = ENOSYS;
#else
    (void)icon;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAbouticonCreate(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_create");
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

void windowssys_windows_win32_devices_alljoyn_alljoynAbouticonDestroy(int64_t icon) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(icon);
        return;
    }
    errno = ENOSYS;
#else
    (void)icon;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGetcontent(int64_t icon, void* data, void* size) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_getcontent");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(icon, data, size);
        return;
    }
    errno = ENOSYS;
#else
    (void)icon;
    (void)data;
    (void)size;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGeturl(int64_t icon, void* type, void* url) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_geturl");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(icon, type, url);
        return;
    }
    errno = ENOSYS;
#else
    (void)icon;
    (void)type;
    (void)url;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontent(int64_t icon, void* type, void* data, uint64_t csize, uint8_t ownsdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_setcontent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(icon, type, data, csize, ownsdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)icon;
    (void)type;
    (void)data;
    (void)csize;
    (void)ownsdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontentFrommsgarg(int64_t icon, int64_t arg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_setcontent_frommsgarg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(icon, arg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)icon;
    (void)arg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSeturl(int64_t icon, void* type, void* url) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticon_seturl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(icon, type, url);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)icon;
    (void)type;
    (void)url;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjCreate(int64_t bus, int64_t icon) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonobj_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, icon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)icon;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjDestroy(int64_t icon) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonobj_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(icon);
        return;
    }
    errno = ENOSYS;
#else
    (void)icon;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyCreate(int64_t bus, void* busname, uint32_t sessionid) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, busname, sessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)busname;
    (void)sessionid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyDestroy(int64_t proxy) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(proxy);
        return;
    }
    errno = ENOSYS;
#else
    (void)proxy;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGeticon(int64_t proxy, int64_t icon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_geticon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, icon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)icon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGetversion(int64_t proxy, void* version) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_abouticonproxy_getversion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, version);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)version;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerCreate(void* callback, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutlistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutlistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounce(int64_t obj, uint16_t sessionport, int64_t aboutdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobj_announce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(obj, sessionport, aboutdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)obj;
    (void)sessionport;
    (void)aboutdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounceUsingDatalistener(int64_t obj, uint16_t sessionport, int64_t aboutlistener) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobj_announce_using_datalistener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(obj, sessionport, aboutlistener);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)obj;
    (void)sessionport;
    (void)aboutlistener;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjCreate(int64_t bus, int32_t isannounced) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobj_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, isannounced);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)isannounced;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAboutobjDestroy(int64_t obj) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobj_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(obj);
        return;
    }
    errno = ENOSYS;
#else
    (void)obj;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjUnannounce(int64_t obj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobj_unannounce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(obj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)obj;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionClear(int64_t description) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_clear");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(description);
        return;
    }
    errno = ENOSYS;
#else
    (void)description;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreate(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_create");
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

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreateFull(int64_t arg) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_create_full");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreatefrommsgarg(int64_t description, int64_t arg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_createfrommsgarg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(description, arg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)description;
    (void)arg;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionDestroy(int64_t description) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(description);
        return;
    }
    errno = ENOSYS;
#else
    (void)description;
    errno = ENOSYS;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfacepaths(int64_t description, void* interfacename, void* paths, uint64_t numpaths) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getinterfacepaths");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(description, interfacename, paths, numpaths);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)description;
    (void)interfacename;
    (void)paths;
    (void)numpaths;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfaces(int64_t description, void* path, void* interfaces, uint64_t numinterfaces) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getinterfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(description, path, interfaces, numinterfaces);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)description;
    (void)path;
    (void)interfaces;
    (void)numinterfaces;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetmsgarg(int64_t description, int64_t msgarg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getmsgarg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(description, msgarg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)description;
    (void)msgarg;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetpaths(int64_t description, void* paths, uint64_t numpaths) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_getpaths");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(description, paths, numpaths);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)description;
    (void)paths;
    (void)numpaths;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterface(int64_t description, void* interfacename) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_hasinterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(description, interfacename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)description;
    (void)interfacename;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterfaceatpath(int64_t description, void* path, void* interfacename) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_hasinterfaceatpath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(description, path, interfacename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)description;
    (void)path;
    (void)interfacename;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHaspath(int64_t description, void* path) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutobjectdescription_haspath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(description, path);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)description;
    (void)path;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyCreate(int64_t bus, void* busname, uint32_t sessionid) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutproxy_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, busname, sessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)busname;
    (void)sessionid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyDestroy(int64_t proxy) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutproxy_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(proxy);
        return;
    }
    errno = ENOSYS;
#else
    (void)proxy;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetaboutdata(int64_t proxy, void* language, int64_t data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutproxy_getaboutdata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, language, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)language;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetobjectdescription(int64_t proxy, int64_t objectdesc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutproxy_getobjectdescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, objectdesc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)objectdesc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetversion(int64_t proxy, void* version) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_aboutproxy_getversion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, version);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)version;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerCreate(void* callbacks, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_applicationstatelistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_applicationstatelistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerCreate(void* callbacks, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerRequestcredentialsresponse(int64_t listener, void* authcontext, int32_t arg_2_accept, int64_t credentials) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistener_requestcredentialsresponse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, authcontext, arg_2_accept, credentials);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)authcontext;
    (void)arg_2_accept;
    (void)credentials;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerSetsharedsecret(int64_t listener, void* sharedsecret, uint64_t sharedsecretsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistener_setsharedsecret");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, sharedsecret, sharedsecretsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)sharedsecret;
    (void)sharedsecretsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerVerifycredentialsresponse(int64_t listener, void* authcontext, int32_t arg_2_accept) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistener_verifycredentialsresponse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, authcontext, arg_2_accept);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)authcontext;
    (void)arg_2_accept;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncCreate(void* callbacks, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistenerasync_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_authlistenerasync_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAdddestination(int64_t autopinger, void* group, void* destination) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_adddestination");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(autopinger, group, destination);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)autopinger;
    (void)group;
    (void)destination;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAddpinggroup(int64_t autopinger, void* group, int64_t listener, uint32_t pinginterval) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_addpinggroup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(autopinger, group, listener, pinginterval);
        return;
    }
    errno = ENOSYS;
#else
    (void)autopinger;
    (void)group;
    (void)listener;
    (void)pinginterval;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynAutopingerCreate(int64_t bus) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAutopingerDestroy(int64_t autopinger) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(autopinger);
        return;
    }
    errno = ENOSYS;
#else
    (void)autopinger;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAutopingerPause(int64_t autopinger) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_pause");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(autopinger);
        return;
    }
    errno = ENOSYS;
#else
    (void)autopinger;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovedestination(int64_t autopinger, void* group, void* destination, int32_t removeall) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_removedestination");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(autopinger, group, destination, removeall);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)autopinger;
    (void)group;
    (void)destination;
    (void)removeall;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovepinggroup(int64_t autopinger, void* group) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_removepinggroup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(autopinger, group);
        return;
    }
    errno = ENOSYS;
#else
    (void)autopinger;
    (void)group;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynAutopingerResume(int64_t autopinger) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_resume");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(autopinger);
        return;
    }
    errno = ENOSYS;
#else
    (void)autopinger;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynAutopingerSetpinginterval(int64_t autopinger, void* group, uint32_t pinginterval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_autopinger_setpinginterval");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(autopinger, group, pinginterval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)autopinger;
    (void)group;
    (void)pinginterval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddlogonentry(int64_t bus, void* authmechanism, void* username, void* password) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_addlogonentry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, authmechanism, username, password);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)authmechanism;
    (void)username;
    (void)password;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddmatch(int64_t bus, void* rule) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_addmatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, rule);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)rule;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAdvertisename(int64_t bus, void* name, uint16_t transports) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_advertisename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name, transports);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    (void)transports;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentBindsessionport(int64_t bus, void* sessionport, int64_t opts, int64_t listener) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_bindsessionport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, sessionport, opts, listener);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)sessionport;
    (void)opts;
    (void)listener;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCanceladvertisename(int64_t bus, void* name, uint16_t transports) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_canceladvertisename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name, transports);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    (void)transports;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisedname(int64_t bus, void* nameprefix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelfindadvertisedname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, nameprefix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)nameprefix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisednamebytransport(int64_t bus, void* nameprefix, uint16_t transports) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelfindadvertisednamebytransport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, nameprefix, transports);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)nameprefix;
    (void)transports;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterface(int64_t bus, void* implementsinterface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelwhoimplements_interface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, implementsinterface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)implementsinterface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterfaces(int64_t bus, void* implementsinterfaces, uint64_t numberinterfaces) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_cancelwhoimplements_interfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, implementsinterfaces, numberinterfaces);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)implementsinterfaces;
    (void)numberinterfaces;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeys(int64_t bus, void* guid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_clearkeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, guid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)guid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeystore(int64_t bus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_clearkeystore");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentConnect(int64_t bus, void* connectspec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_connect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, connectspec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)connectspec;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreate(void* applicationname, int32_t allowremotemessages) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(applicationname, allowremotemessages);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)applicationname;
    (void)allowremotemessages;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateConcurrency(void* applicationname, int32_t allowremotemessages, uint32_t concurrency) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_create_concurrency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(applicationname, allowremotemessages, concurrency);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)applicationname;
    (void)allowremotemessages;
    (void)concurrency;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterface(int64_t bus, void* name, void* iface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_createinterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name, iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfaceSecure(int64_t bus, void* name, void* iface, int32_t secpolicy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_createinterface_secure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name, iface, secpolicy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    (void)iface;
    (void)secpolicy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfacesfromxml(int64_t bus, void* xml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_createinterfacesfromxml");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, xml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)xml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeletedefaultkeystore(void* applicationname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_deletedefaultkeystore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(applicationname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)applicationname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeleteinterface(int64_t bus, int64_t iface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_deleteinterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDestroy(int64_t bus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDisconnect(int64_t bus, void* unused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_disconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, unused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)unused;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnableconcurrentcallbacks(int64_t bus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_enableconcurrentcallbacks");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecurity(int64_t bus, void* authmechanisms, int64_t listener, void* keystorefilename, int32_t isshared) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_enablepeersecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, authmechanisms, listener, keystorefilename, isshared);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)authmechanisms;
    (void)listener;
    (void)keystorefilename;
    (void)isshared;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(int64_t bus, void* authmechanisms, int64_t authlistener, void* keystorefilename, int32_t isshared, int64_t permissionconfigurationlistener) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, authmechanisms, authlistener, keystorefilename, isshared, permissionconfigurationlistener);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)authmechanisms;
    (void)authlistener;
    (void)keystorefilename;
    (void)isshared;
    (void)permissionconfigurationlistener;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisedname(int64_t bus, void* nameprefix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_findadvertisedname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, nameprefix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)nameprefix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisednamebytransport(int64_t bus, void* nameprefix, uint16_t transports) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_findadvertisednamebytransport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, nameprefix, transports);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)nameprefix;
    (void)transports;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoyndebugobj(int64_t bus) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getalljoyndebugobj");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoynproxyobj(int64_t bus) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getalljoynproxyobj");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconcurrency(int64_t bus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getconcurrency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bus;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconnectspec(int64_t bus) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getconnectspec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bus;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetdbusproxyobj(int64_t bus) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getdbusproxyobj");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetglobalguidstring(int64_t bus) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getglobalguidstring");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bus;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterface(int64_t bus, void* name) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getinterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterfaces(int64_t bus, void* ifaces, uint64_t numifaces) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getinterfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, ifaces, numifaces);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bus;
    (void)ifaces;
    (void)numifaces;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetkeyexpiration(int64_t bus, void* guid, void* timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getkeyexpiration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, guid, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)guid;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpeerguid(int64_t bus, void* name, void* guid, void* guidsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getpeerguid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name, guid, guidsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    (void)guid;
    (void)guidsz;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpermissionconfigurator(int64_t bus) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getpermissionconfigurator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGettimestamp(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_gettimestamp");
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

void* windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetuniquename(int64_t bus) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_getuniquename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bus;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsconnected(int64_t bus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_isconnected");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIspeersecurityenabled(int64_t bus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_ispeersecurityenabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstarted(int64_t bus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_isstarted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstopping(int64_t bus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_isstopping");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoin(int64_t bus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_join");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsession(int64_t bus, void* sessionhost, uint16_t sessionport, int64_t listener, void* sessionid, int64_t opts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t, int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_joinsession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, sessionhost, sessionport, listener, sessionid, opts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)sessionhost;
    (void)sessionport;
    (void)listener;
    (void)sessionid;
    (void)opts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsessionasync(int64_t bus, void* sessionhost, uint16_t sessionport, int64_t listener, int64_t opts, void* callback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint16_t, int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_joinsessionasync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, sessionhost, sessionport, listener, opts, callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)sessionhost;
    (void)sessionport;
    (void)listener;
    (void)opts;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentLeavesession(int64_t bus, uint32_t sessionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_leavesession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, sessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)sessionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentNamehasowner(int64_t bus, void* name, void* hasowner) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_namehasowner");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name, hasowner);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    (void)hasowner;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentPing(int64_t bus, void* name, uint32_t timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_ping");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisteraboutlistener(int64_t bus, int64_t aboutlistener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registeraboutlistener");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus, aboutlistener);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    (void)aboutlistener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterapplicationstatelistener(int64_t bus, int64_t listener) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registerapplicationstatelistener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, listener);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbuslistener(int64_t bus, int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registerbuslistener");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus, listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobject(int64_t bus, int64_t obj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registerbusobject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, obj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)obj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobjectSecure(int64_t bus, int64_t obj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registerbusobject_secure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, obj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)obj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterkeystorelistener(int64_t bus, int64_t listener) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_registerkeystorelistener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, listener);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReleasename(int64_t bus, void* name) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_releasename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReloadkeystore(int64_t bus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_reloadkeystore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovematch(int64_t bus, void* rule) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_removematch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, rule);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)rule;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovesessionmember(int64_t bus, uint32_t sessionid, void* membername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_removesessionmember");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, sessionid, membername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)sessionid;
    (void)membername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRequestname(int64_t bus, void* requestedname, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_requestname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, requestedname, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)requestedname;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnection(int64_t bus, void* name, int32_t forceauth) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_secureconnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name, forceauth);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    (void)forceauth;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnectionasync(int64_t bus, void* name, int32_t forceauth) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_secureconnectionasync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, name, forceauth);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)name;
    (void)forceauth;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetdaemondebug(int64_t bus, void* module, uint32_t level) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_setdaemondebug");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, module, level);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)module;
    (void)level;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetkeyexpiration(int64_t bus, void* guid, uint32_t timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_setkeyexpiration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, guid, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)guid;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeout(int64_t bus, uint32_t sessionid, void* linktimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_setlinktimeout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, sessionid, linktimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)sessionid;
    (void)linktimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeoutasync(int64_t bus, uint32_t sessionid, uint32_t linktimeout, void* callback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_setlinktimeoutasync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, sessionid, linktimeout, callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)sessionid;
    (void)linktimeout;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetsessionlistener(int64_t bus, uint32_t sessionid, int64_t listener) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_setsessionlistener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, sessionid, listener);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)sessionid;
    (void)listener;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStart(int64_t bus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_start");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStop(int64_t bus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_stop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnbindsessionport(int64_t bus, uint16_t sessionport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unbindsessionport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, sessionport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)sessionport;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisteraboutlistener(int64_t bus, int64_t aboutlistener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisteraboutlistener");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus, aboutlistener);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    (void)aboutlistener;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallaboutlisteners(int64_t bus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterallaboutlisteners");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallhandlers(int64_t bus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterallhandlers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterapplicationstatelistener(int64_t bus, int64_t listener) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterapplicationstatelistener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, listener);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbuslistener(int64_t bus, int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterbuslistener");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus, listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    (void)listener;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbusobject(int64_t bus, int64_t object) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_unregisterbusobject");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus, object);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    (void)object;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterface(int64_t bus, void* implementsinterface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_whoimplements_interface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, implementsinterface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)implementsinterface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterfaces(int64_t bus, void* implementsinterfaces, uint64_t numberinterfaces) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busattachment_whoimplements_interfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, implementsinterfaces, numberinterfaces);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)implementsinterfaces;
    (void)numberinterfaces;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerCreate(void* callbacks, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_buslistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_buslistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterface(int64_t bus, int64_t iface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_addinterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterfaceAnnounced(int64_t bus, int64_t iface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_addinterface_announced");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddmethodhandlers(int64_t bus, void* entries, uint64_t numentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_addmethodhandlers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, entries, numentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessage(int64_t bus, int64_t msg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_cancelsessionlessmessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, msg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)msg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessageSerial(int64_t bus, uint32_t serialnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_cancelsessionlessmessage_serial");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, serialnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)serialnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCreate(void* path, int32_t isplaceholder, void* callbacks_in, void* context_in) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, isplaceholder, callbacks_in, context_in);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)isplaceholder;
    (void)callbacks_in;
    (void)context_in;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusobjectDestroy(int64_t bus) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertieschanged(int64_t bus, void* ifcname, void* propnames, uint64_t numprops, uint32_t id) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_emitpropertieschanged");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus, ifcname, propnames, numprops, id);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    (void)ifcname;
    (void)propnames;
    (void)numprops;
    (void)id;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertychanged(int64_t bus, void* ifcname, void* propname, int64_t val, uint32_t id) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_emitpropertychanged");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bus, ifcname, propname, val, id);
        return;
    }
    errno = ENOSYS;
#else
    (void)bus;
    (void)ifcname;
    (void)propname;
    (void)val;
    (void)id;
    errno = ENOSYS;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetannouncedinterfacenames(int64_t bus, void* interfaces, uint64_t numinterfaces) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_getannouncedinterfacenames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, interfaces, numinterfaces);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bus;
    (void)interfaces;
    (void)numinterfaces;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetbusattachment(int64_t bus) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_getbusattachment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetname(int64_t bus, void* buffer, uint64_t buffersz) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_getname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, buffer, buffersz);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bus;
    (void)buffer;
    (void)buffersz;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetpath(int64_t bus) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_getpath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bus;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectIssecure(int64_t bus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_issecure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyArgs(int64_t bus, int64_t msg, int64_t args, uint64_t numargs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_methodreply_args");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, msg, args, numargs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)msg;
    (void)args;
    (void)numargs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyErr(int64_t bus, int64_t msg, void* error, void* errormessage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_methodreply_err");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, msg, error, errormessage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)msg;
    (void)error;
    (void)errormessage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyStatus(int64_t bus, int64_t msg, int32_t status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_methodreply_status");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, msg, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)msg;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynBusobjectSetannounceflag(int64_t bus, int64_t iface, int32_t isannounced) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_busobject_setannounceflag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, iface, isannounced);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)iface;
    (void)isannounced;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynCredentialsClear(int64_t cred) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_clear");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cred);
        return;
    }
    errno = ENOSYS;
#else
    (void)cred;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynCredentialsCreate(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_create");
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

void windowssys_windows_win32_devices_alljoyn_alljoynCredentialsDestroy(int64_t cred) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cred);
        return;
    }
    errno = ENOSYS;
#else
    (void)cred;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetcertchain(int64_t cred) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getcertchain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cred);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cred;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetexpiration(int64_t cred) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getexpiration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cred);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cred;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetlogonentry(int64_t cred) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getlogonentry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cred);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cred;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetpassword(int64_t cred) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getpassword");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cred);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cred;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetprivateKey(int64_t cred) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getprivateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cred);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cred;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetusername(int64_t cred) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_getusername");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cred);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cred;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynCredentialsIsset(int64_t cred, uint16_t creds) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_isset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cred, creds);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cred;
    (void)creds;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetcertchain(int64_t cred, void* certchain) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setcertchain");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cred, certchain);
        return;
    }
    errno = ENOSYS;
#else
    (void)cred;
    (void)certchain;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetexpiration(int64_t cred, uint32_t expiration) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setexpiration");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cred, expiration);
        return;
    }
    errno = ENOSYS;
#else
    (void)cred;
    (void)expiration;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetlogonentry(int64_t cred, void* logonentry) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setlogonentry");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cred, logonentry);
        return;
    }
    errno = ENOSYS;
#else
    (void)cred;
    (void)logonentry;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetpassword(int64_t cred, void* pwd) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setpassword");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cred, pwd);
        return;
    }
    errno = ENOSYS;
#else
    (void)cred;
    (void)pwd;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetprivatekey(int64_t cred, void* pk) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setprivatekey");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cred, pk);
        return;
    }
    errno = ENOSYS;
#else
    (void)cred;
    (void)pk;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetusername(int64_t cred, void* username) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_credentials_setusername");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cred, username);
        return;
    }
    errno = ENOSYS;
#else
    (void)cred;
    (void)username;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynGetbuildinfo(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_getbuildinfo");
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

uint32_t windowssys_windows_win32_devices_alljoyn_alljoynGetnumericversion(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_getnumericversion");
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

void* windowssys_windows_win32_devices_alljoyn_alljoynGetversion(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_getversion");
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

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInit(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_init");
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

void windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionActivate(int64_t iface) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_activate");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(iface);
        return;
    }
    errno = ENOSYS;
#else
    (void)iface;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddannotation(int64_t iface, void* name, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addannotation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddargannotation(int64_t iface, void* member, void* argname, void* name, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addargannotation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, member, argname, name, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)name;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmember(int64_t iface, int32_t type, void* name, void* inputsig, void* outsig, void* argnames, uint8_t annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addmember");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, type, name, inputsig, outsig, argnames, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)type;
    (void)name;
    (void)inputsig;
    (void)outsig;
    (void)argnames;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmemberannotation(int64_t iface, void* member, void* name, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addmemberannotation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, member, name, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)member;
    (void)name;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmethod(int64_t iface, void* name, void* inputsig, void* outsig, void* argnames, uint8_t annotation, void* accessperms) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addmethod");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, inputsig, outsig, argnames, annotation, accessperms);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)inputsig;
    (void)outsig;
    (void)argnames;
    (void)annotation;
    (void)accessperms;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddproperty(int64_t iface, void* name, void* signature, uint8_t access) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addproperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, signature, access);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)signature;
    (void)access;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddpropertyannotation(int64_t iface, void* property, void* name, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addpropertyannotation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, property, name, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)property;
    (void)name;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddsignal(int64_t iface, void* name, void* sig, void* argnames, uint8_t annotation, void* accessperms) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_addsignal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, sig, argnames, annotation, accessperms);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)sig;
    (void)argnames;
    (void)annotation;
    (void)accessperms;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionEql(int64_t one, int64_t other) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_eql");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(one, other);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotation(int64_t iface, void* name, void* value, void* value_size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, value, value_size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)value;
    (void)value_size;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationatindex(int64_t iface, uint64_t arg_1_index, void* name, void* name_size, void* value, void* value_size) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotationatindex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(iface, arg_1_index, name, name_size, value, value_size);
        return;
    }
    errno = ENOSYS;
#else
    (void)iface;
    (void)arg_1_index;
    (void)name;
    (void)name_size;
    (void)value;
    (void)value_size;
    errno = ENOSYS;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationscount(int64_t iface) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getannotationscount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iface;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetargdescriptionforlanguage(int64_t iface, void* member, void* arg, void* description, uint64_t maxlanguagelength, void* languagetag) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getargdescriptionforlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, member, arg, description, maxlanguagelength, languagetag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iface;
    (void)member;
    (void)arg;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionforlanguage(int64_t iface, void* description, uint64_t maxlanguagelength, void* languagetag) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptionforlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, description, maxlanguagelength, languagetag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iface;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages(int64_t iface, void* languages, uint64_t size) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptionlanguages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, languages, size);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iface;
    (void)languages;
    (void)size;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages2(int64_t iface, void* languages, uint64_t languagessize) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptionlanguages2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, languages, languagessize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iface;
    (void)languages;
    (void)languagessize;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptiontranslationcallback(int64_t iface) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getdescriptiontranslationcallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)iface;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmember(int64_t iface, void* name, void* member) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmember");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, member);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)member;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberannotation(int64_t iface, void* member, void* name, void* value, void* value_size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberannotation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, member, name, value, value_size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)member;
    (void)name;
    (void)value;
    (void)value_size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberargannotation(int64_t iface, void* member, void* argname, void* name, void* value, void* value_size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberargannotation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, member, argname, name, value, value_size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)name;
    (void)value;
    (void)value_size;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberdescriptionforlanguage(int64_t iface, void* member, void* description, uint64_t maxlanguagelength, void* languagetag) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmemberdescriptionforlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, member, description, maxlanguagelength, languagetag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iface;
    (void)member;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmembers(int64_t iface, void* members, uint64_t nummembers) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmembers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, members, nummembers);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iface;
    (void)members;
    (void)nummembers;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmethod(int64_t iface, void* name, void* member) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getmethod");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, member);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)member;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetname(int64_t iface) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)iface;
    errno = ENOSYS;
    return NULL;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperties(int64_t iface, void* props, uint64_t numprops) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getproperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, props, numprops);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iface;
    (void)props;
    (void)numprops;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperty(int64_t iface, void* name, void* property) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getproperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, property);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)property;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertyannotation(int64_t iface, void* property, void* name, void* value, void* str_size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getpropertyannotation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, property, name, value, str_size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)property;
    (void)name;
    (void)value;
    (void)str_size;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertydescriptionforlanguage(int64_t iface, void* property, void* description, uint64_t maxlanguagelength, void* languagetag) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getpropertydescriptionforlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, property, description, maxlanguagelength, languagetag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iface;
    (void)property;
    (void)description;
    (void)maxlanguagelength;
    (void)languagetag;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsecuritypolicy(int64_t iface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getsecuritypolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsignal(int64_t iface, void* name, void* member) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_getsignal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, member);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)member;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasdescription(int64_t iface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasdescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasmember(int64_t iface, void* name, void* insig, void* outsig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasmember");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, insig, outsig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)insig;
    (void)outsig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperties(int64_t iface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasproperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperty(int64_t iface, void* name) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_hasproperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIntrospect(int64_t iface, void* str, uint64_t buf, uint64_t indent) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_introspect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, str, buf, indent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iface;
    (void)str;
    (void)buf;
    (void)indent;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIssecure(int64_t iface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_issecure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescription(int64_t iface, void* member, void* argname, void* description) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setargdescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, member, argname, description);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)description;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescriptionforlanguage(int64_t iface, void* member, void* arg, void* description, void* languagetag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setargdescriptionforlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, member, arg, description, languagetag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)member;
    (void)arg;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescription(int64_t iface, void* description) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescription");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(iface, description);
        return;
    }
    errno = ENOSYS;
#else
    (void)iface;
    (void)description;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionforlanguage(int64_t iface, void* description, void* languagetag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescriptionforlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, description, languagetag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionlanguage(int64_t iface, void* language) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescriptionlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(iface, language);
        return;
    }
    errno = ENOSYS;
#else
    (void)iface;
    (void)language;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptiontranslationcallback(int64_t iface, void* translationcallback) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setdescriptiontranslationcallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(iface, translationcallback);
        return;
    }
    errno = ENOSYS;
#else
    (void)iface;
    (void)translationcallback;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescription(int64_t iface, void* member, void* description) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setmemberdescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, member, description);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)member;
    (void)description;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescriptionforlanguage(int64_t iface, void* member, void* description, void* languagetag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setmemberdescriptionforlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, member, description, languagetag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)member;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescription(int64_t iface, void* name, void* description) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setpropertydescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, description);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)description;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescriptionforlanguage(int64_t iface, void* name, void* description, void* languagetag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_interfacedescription_setpropertydescriptionforlanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iface, name, description, languagetag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)description;
    (void)languagetag;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerCreate(void* callbacks, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_keystorelistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_keystorelistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerGetkeys(int64_t listener, int64_t keystore, void* sink, void* sink_sz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_keystorelistener_getkeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, keystore, sink, sink_sz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)keystore;
    (void)sink;
    (void)sink_sz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerPutkeys(int64_t listener, int64_t keystore, void* source, void* password) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_keystorelistener_putkeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, keystore, source, password);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)keystore;
    (void)source;
    (void)password;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerWithSynchronizationCreate(void* callbacks, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_keystorelistener_with_synchronization_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynMessageCreate(int64_t bus) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynMessageDescription(int64_t msg, void* str, uint64_t buf) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_description");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg, str, buf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)msg;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynMessageDestroy(int64_t msg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(msg);
        return;
    }
    errno = ENOSYS;
#else
    (void)msg;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageEql(int64_t one, int64_t other) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_eql");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(one, other);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynMessageGetarg(int64_t msg, uint64_t argn) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getarg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg, argn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    (void)argn;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynMessageGetargs(int64_t msg, void* numargs, void* args) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getargs");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(msg, numargs, args);
        return;
    }
    errno = ENOSYS;
#else
    (void)msg;
    (void)numargs;
    (void)args;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynMessageGetauthmechanism(int64_t msg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getauthmechanism");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)msg;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcallserial(int64_t msg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getcallserial");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)msg;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcompressiontoken(int64_t msg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getcompressiontoken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)msg;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynMessageGetdestination(int64_t msg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getdestination");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)msg;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynMessageGeterrorname(int64_t msg, void* errormessage, void* errormessage_size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_geterrorname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg, errormessage, errormessage_size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)msg;
    (void)errormessage;
    (void)errormessage_size;
    errno = ENOSYS;
    return NULL;
#endif
}

uint8_t windowssys_windows_win32_devices_alljoyn_alljoynMessageGetflags(int64_t msg) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getflags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)msg;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynMessageGetinterface(int64_t msg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getinterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)msg;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynMessageGetmembername(int64_t msg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getmembername");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)msg;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynMessageGetobjectpath(int64_t msg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getobjectpath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)msg;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreceiveendpointname(int64_t msg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getreceiveendpointname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)msg;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreplyserial(int64_t msg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getreplyserial");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)msg;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsender(int64_t msg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getsender");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)msg;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsessionid(int64_t msg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getsessionid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)msg;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsignature(int64_t msg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_getsignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)msg;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageGettimestamp(int64_t msg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_gettimestamp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)msg;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageGettype(int64_t msg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_gettype");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageIsbroadcastsignal(int64_t msg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_isbroadcastsignal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageIsencrypted(int64_t msg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_isencrypted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageIsexpired(int64_t msg, void* tillexpirems) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_isexpired");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg, tillexpirems);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    (void)tillexpirems;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageIsglobalbroadcast(int64_t msg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_isglobalbroadcast");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageIssessionless(int64_t msg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_issessionless");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageIsunreliable(int64_t msg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_isunreliable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMessageParseargs(int64_t msg, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_parseargs");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(msg, signature);
            case 1: return km_fn_ptr(msg, signature, (intptr_t)km_va0);
            case 2: return km_fn_ptr(msg, signature, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(msg, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(msg, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)msg;
    (void)signature;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynMessageSetendianess(int8_t endian) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_setendianess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(endian);
        return;
    }
    errno = ENOSYS;
#else
    (void)endian;
    errno = ENOSYS;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynMessageTostring(int64_t msg, void* str, uint64_t buf) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_message_tostring");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(msg, str, buf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)msg;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayCreate(uint64_t size) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayElement(int64_t arg, uint64_t arg_1_index) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_element");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, arg_1_index);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)arg_1_index;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayGet(int64_t args, uint64_t numargs, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, uint64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_get");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(args, numargs, signature);
            case 1: return km_fn_ptr(args, numargs, signature, (intptr_t)km_va0);
            case 2: return km_fn_ptr(args, numargs, signature, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(args, numargs, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(args, numargs, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)args;
    (void)numargs;
    (void)signature;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySet(int64_t args, void* numargs, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_set");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(args, numargs, signature);
            case 1: return km_fn_ptr(args, numargs, signature, (intptr_t)km_va0);
            case 2: return km_fn_ptr(args, numargs, signature, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(args, numargs, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(args, numargs, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)args;
    (void)numargs;
    (void)signature;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySetOffset(int64_t args, uint64_t argoffset, void* numargs, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, uint64_t, void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_set_offset");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(args, argoffset, numargs, signature);
            case 1: return km_fn_ptr(args, argoffset, numargs, signature, (intptr_t)km_va0);
            case 2: return km_fn_ptr(args, argoffset, numargs, signature, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(args, argoffset, numargs, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(args, argoffset, numargs, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)args;
    (void)argoffset;
    (void)numargs;
    (void)signature;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySignature(int64_t values, uint64_t numvalues, void* str, uint64_t buf) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_signature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(values, numvalues, str, buf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)values;
    (void)numvalues;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayTostring(int64_t args, uint64_t numargs, void* str, uint64_t buf, uint64_t indent) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_array_tostring");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(args, numargs, str, buf, indent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)args;
    (void)numargs;
    (void)str;
    (void)buf;
    (void)indent;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynMsgargClear(int64_t arg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_clear");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(arg);
        return;
    }
    errno = ENOSYS;
#else
    (void)arg;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynMsgargClone(int64_t destination, int64_t source) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(destination, source);
        return;
    }
    errno = ENOSYS;
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargCopy(int64_t source) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_copy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreate(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_create");
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

int64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreateAndSet(void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int64_t (*km_fn_t)(void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_create_and_set");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(signature);
            case 1: return km_fn_ptr(signature, (intptr_t)km_va0);
            case 2: return km_fn_ptr(signature, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)signature;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynMsgargDestroy(int64_t arg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(arg);
        return;
    }
    errno = ENOSYS;
#else
    (void)arg;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargEqual(int64_t lhv, int64_t rhv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_equal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lhv, rhv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lhv;
    (void)rhv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGet(int64_t arg, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(arg, signature);
            case 1: return km_fn_ptr(arg, signature, (intptr_t)km_va0);
            case 2: return km_fn_ptr(arg, signature, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(arg, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(arg, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)signature;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElement(int64_t arg, uint64_t arg_1_index, void* element) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_element");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(arg, arg_1_index, element);
        return;
    }
    errno = ENOSYS;
#else
    (void)arg;
    (void)arg_1_index;
    (void)element;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElementsignature(int64_t arg, uint64_t arg_1_index) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_elementsignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, arg_1_index);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)arg;
    (void)arg_1_index;
    errno = ENOSYS;
    return NULL;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayNumberofelements(int64_t arg) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_array_numberofelements");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)arg;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBool(int64_t arg, void* b) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_bool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, b);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)b;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBoolArray(int64_t arg, void* length, void* ab) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_bool_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ab);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ab;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDouble(int64_t arg, void* d) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_double");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, d);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)d;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDoubleArray(int64_t arg, void* length, void* ad) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_double_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ad);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ad;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16(int64_t arg, void* n) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int16");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, n);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)n;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16Array(int64_t arg, void* length, void* an) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int16_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, an);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)an;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32(int64_t arg, void* i) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, i);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)i;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32Array(int64_t arg, void* length, void* ai) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int32_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ai);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ai;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64(int64_t arg, void* x) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, x);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)x;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64Array(int64_t arg, void* length, void* ax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_int64_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetObjectpath(int64_t arg, void* o) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_objectpath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, o);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)o;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetSignature(int64_t arg, void* g) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_signature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, g);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)g;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetString(int64_t arg, void* s) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_string");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, s);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)s;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16(int64_t arg, void* q) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint16");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, q);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)q;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16Array(int64_t arg, void* length, void* aq) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint16_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, aq);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)aq;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32(int64_t arg, void* u) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, u);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)u;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32Array(int64_t arg, void* length, void* au) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint32_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, au);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)au;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64(int64_t arg, void* t) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, t);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)t;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64Array(int64_t arg, void* length, void* at) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint64_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, at);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)at;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8(int64_t arg, void* y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8Array(int64_t arg, void* length, void* ay) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_uint8_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ay);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ay;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariant(int64_t arg, int64_t v) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_variant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, v);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)v;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariantArray(int64_t arg, void* signature, void* length, void* av) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_get_variant_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, signature, length, av);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)signature;
    (void)length;
    (void)av;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetdictelement(int64_t arg, void* elemsig, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_getdictelement");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(arg, elemsig);
            case 1: return km_fn_ptr(arg, elemsig, (intptr_t)km_va0);
            case 2: return km_fn_ptr(arg, elemsig, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(arg, elemsig, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(arg, elemsig, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)elemsig;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetkey(int64_t arg) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_getkey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetmember(int64_t arg, uint64_t arg_1_index) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_getmember");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, arg_1_index);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)arg_1_index;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetnummembers(int64_t arg) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_getnummembers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)arg;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGettype(int64_t arg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_gettype");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetvalue(int64_t arg) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_getvalue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargHassignature(int64_t arg, void* signature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_hassignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, signature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)signature;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSet(int64_t arg, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(arg, signature);
            case 1: return km_fn_ptr(arg, signature, (intptr_t)km_va0);
            case 2: return km_fn_ptr(arg, signature, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(arg, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(arg, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)signature;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetAndStabilize(int64_t arg, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int64_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_and_stabilize");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(arg, signature);
            case 1: return km_fn_ptr(arg, signature, (intptr_t)km_va0);
            case 2: return km_fn_ptr(arg, signature, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(arg, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(arg, signature, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)signature;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBool(int64_t arg, int32_t b) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_bool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, b);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)b;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBoolArray(int64_t arg, uint64_t length, void* ab) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_bool_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ab);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ab;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDouble(int64_t arg, double d) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_double");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, d);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)d;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDoubleArray(int64_t arg, uint64_t length, void* ad) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_double_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ad);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ad;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16(int64_t arg, int16_t n) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int16");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, n);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)n;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16Array(int64_t arg, uint64_t length, void* an) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int16_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, an);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)an;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32(int64_t arg, int32_t i) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, i);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)i;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32Array(int64_t arg, uint64_t length, void* ai) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int32_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ai);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ai;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64(int64_t arg, int64_t x) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, x);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)x;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64Array(int64_t arg, uint64_t length, void* ax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_int64_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpath(int64_t arg, void* o) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_objectpath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, o);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)o;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpathArray(int64_t arg, uint64_t length, void* ao) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_objectpath_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ao);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ao;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignature(int64_t arg, void* g) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_signature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, g);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)g;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignatureArray(int64_t arg, uint64_t length, void* ag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_signature_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetString(int64_t arg, void* s) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_string");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, s);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)s;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetStringArray(int64_t arg, uint64_t length, void* as) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_string_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, as);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)as;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16(int64_t arg, uint16_t q) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint16");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, q);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)q;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16Array(int64_t arg, uint64_t length, void* aq) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint16_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, aq);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)aq;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32(int64_t arg, uint32_t u) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, u);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)u;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32Array(int64_t arg, uint64_t length, void* au) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint32_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, au);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)au;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64(int64_t arg, uint64_t t) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, t);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)t;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64Array(int64_t arg, uint64_t length, void* at) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint64_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, at);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)at;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8(int64_t arg, uint8_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8Array(int64_t arg, uint64_t length, void* ay) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_set_uint8_array");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, length, ay);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)length;
    (void)ay;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetdictentry(int64_t arg, int64_t key, int64_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_setdictentry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, key, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)key;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetstruct(int64_t arg, int64_t struct_members, uint64_t num_members) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_setstruct");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, struct_members, num_members);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)struct_members;
    (void)num_members;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargSignature(int64_t arg, void* str, uint64_t buf) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_signature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, str, buf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)arg;
    (void)str;
    (void)buf;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynMsgargStabilize(int64_t arg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_stabilize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(arg);
        return;
    }
    errno = ENOSYS;
#else
    (void)arg;
    errno = ENOSYS;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynMsgargTostring(int64_t arg, void* str, uint64_t buf, uint64_t indent) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_msgarg_tostring");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg, str, buf, indent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)arg;
    (void)str;
    (void)buf;
    (void)indent;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynObserverCreate(int64_t bus, void* mandatoryinterfaces, uint64_t nummandatoryinterfaces) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, mandatoryinterfaces, nummandatoryinterfaces);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)mandatoryinterfaces;
    (void)nummandatoryinterfaces;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynObserverDestroy(int64_t observer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(observer);
        return;
    }
    errno = ENOSYS;
#else
    (void)observer;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynObserverGet(int64_t observer, void* uniquebusname, void* objectpath) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_get");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(observer, uniquebusname, objectpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)observer;
    (void)uniquebusname;
    (void)objectpath;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynObserverGetfirst(int64_t observer) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_getfirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(observer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)observer;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynObserverGetnext(int64_t observer, int64_t proxyref) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_getnext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(observer, proxyref);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)observer;
    (void)proxyref;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynObserverRegisterlistener(int64_t observer, int64_t listener, int32_t triggeronexisting) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_registerlistener");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(observer, listener, triggeronexisting);
        return;
    }
    errno = ENOSYS;
#else
    (void)observer;
    (void)listener;
    (void)triggeronexisting;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisteralllisteners(int64_t observer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_unregisteralllisteners");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(observer);
        return;
    }
    errno = ENOSYS;
#else
    (void)observer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisterlistener(int64_t observer, int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observer_unregisterlistener");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(observer, listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)observer;
    (void)listener;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerCreate(void* callback, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observerlistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_observerlistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPasswordmanagerSetcredentials(void* authmechanism, void* password) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_passwordmanager_setcredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authmechanism, password);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authmechanism;
    (void)password;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerCreate(void* callbacks, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurationlistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurationlistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificatechainDestroy(void* certificatechain) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificatechain_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(certificatechain);
        return;
    }
    errno = ENOSYS;
#else
    (void)certificatechain;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidCleanup(void* certificateid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificateid_cleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(certificateid);
        return;
    }
    errno = ENOSYS;
#else
    (void)certificateid;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidarrayCleanup(void* certificateidarray) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_certificateidarray_cleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(certificateidarray);
        return;
    }
    errno = ENOSYS;
#else
    (void)certificateidarray;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorClaim(int64_t configurator, void* cakey, void* identitycertificatechain, void* groupid, uint64_t groupsize, void* groupauthority, void* manifestsxmls, uint64_t manifestscount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_claim");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, cakey, identitycertificatechain, groupid, groupsize, groupauthority, manifestsxmls, manifestscount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)cakey;
    (void)identitycertificatechain;
    (void)groupid;
    (void)groupsize;
    (void)groupauthority;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorEndmanagement(int64_t configurator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_endmanagement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetapplicationstate(int64_t configurator, void* state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getapplicationstate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilities(int64_t configurator, void* claimcapabilities) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getclaimcapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, claimcapabilities);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)claimcapabilities;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(int64_t configurator, void* additionalinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, additionalinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)additionalinfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultclaimcapabilities(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getdefaultclaimcapabilities");
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

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultpolicy(int64_t configurator, void* policyxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getdefaultpolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, policyxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)policyxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentity(int64_t configurator, void* identitycertificatechain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getidentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, identitycertificatechain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)identitycertificatechain;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentitycertificateid(int64_t configurator, void* certificateid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getidentitycertificateid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, certificateid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)certificateid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifests(int64_t configurator, void* manifestarray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getmanifests");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, manifestarray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)manifestarray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifesttemplate(int64_t configurator, void* manifesttemplatexml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getmanifesttemplate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, manifesttemplatexml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)manifesttemplatexml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmembershipsummaries(int64_t configurator, void* certificateids) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getmembershipsummaries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, certificateids);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)certificateids;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpolicy(int64_t configurator, void* policyxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getpolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, policyxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)policyxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpublickey(int64_t configurator, void* publickey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_getpublickey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, publickey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)publickey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmanifests(int64_t configurator, void* manifestsxmls, uint64_t manifestscount, int32_t append) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_installmanifests");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, manifestsxmls, manifestscount, append);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)manifestsxmls;
    (void)manifestscount;
    (void)append;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmembership(int64_t configurator, void* membershipcertificatechain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_installmembership");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, membershipcertificatechain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)membershipcertificatechain;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifestarrayCleanup(void* manifestarray) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_manifestarray_cleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(manifestarray);
        return;
    }
    errno = ENOSYS;
#else
    (void)manifestarray;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifesttemplateDestroy(void* manifesttemplatexml) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_manifesttemplate_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(manifesttemplatexml);
        return;
    }
    errno = ENOSYS;
#else
    (void)manifesttemplatexml;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPolicyDestroy(void* policyxml) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_policy_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(policyxml);
        return;
    }
    errno = ENOSYS;
#else
    (void)policyxml;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPublickeyDestroy(void* publickey) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_publickey_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(publickey);
        return;
    }
    errno = ENOSYS;
#else
    (void)publickey;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorRemovemembership(int64_t configurator, void* serial, uint64_t seriallen, void* issuerpublickey, void* issueraki, uint64_t issuerakilen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_removemembership");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, serial, seriallen, issuerpublickey, issueraki, issuerakilen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)serial;
    (void)seriallen;
    (void)issuerpublickey;
    (void)issueraki;
    (void)issuerakilen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorReset(int64_t configurator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_reset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorResetpolicy(int64_t configurator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_resetpolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetapplicationstate(int64_t configurator, int32_t state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setapplicationstate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilities(int64_t configurator, uint16_t claimcapabilities) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setclaimcapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, claimcapabilities);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)claimcapabilities;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(int64_t configurator, uint16_t additionalinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, additionalinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)additionalinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetmanifesttemplatefromxml(int64_t configurator, void* manifesttemplatexml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_setmanifesttemplatefromxml");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, manifesttemplatexml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)manifesttemplatexml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorStartmanagement(int64_t configurator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_startmanagement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdateidentity(int64_t configurator, void* identitycertificatechain, void* manifestsxmls, uint64_t manifestscount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_updateidentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, identitycertificatechain, manifestsxmls, manifestscount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)identitycertificatechain;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdatepolicy(int64_t configurator, void* policyxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_permissionconfigurator_updatepolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurator, policyxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configurator;
    (void)policyxml;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerCreate(void* callback, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_pinglistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_pinglistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddchild(int64_t proxyobj, int64_t child) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_addchild");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, child);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)child;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterface(int64_t proxyobj, int64_t iface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_addinterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterfaceByName(int64_t proxyobj, void* name) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_addinterface_by_name");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, name);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)name;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCopy(int64_t source) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_copy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreate(int64_t bus, void* service, void* path, uint32_t sessionid) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, service, path, sessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)service;
    (void)path;
    (void)sessionid;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreateSecure(int64_t bus, void* service, void* path, uint32_t sessionid) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_create_secure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, service, path, sessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)service;
    (void)path;
    (void)sessionid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectDestroy(int64_t proxyobj) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(proxyobj);
        return;
    }
    errno = ENOSYS;
#else
    (void)proxyobj;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectEnablepropertycaching(int64_t proxyobj) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_enablepropertycaching");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(proxyobj);
        return;
    }
    errno = ENOSYS;
#else
    (void)proxyobj;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallproperties(int64_t proxyobj, void* iface, int64_t values) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getallproperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface, values);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)values;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallpropertiesasync(int64_t proxyobj, void* iface, void* callback, uint32_t timeout, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getallpropertiesasync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface, callback, timeout, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)callback;
    (void)timeout;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchild(int64_t proxyobj, void* path) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getchild");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchildren(int64_t proxyobj, void* children, uint64_t numchildren) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getchildren");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, children, numchildren);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)proxyobj;
    (void)children;
    (void)numchildren;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterface(int64_t proxyobj, void* iface) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getinterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterfaces(int64_t proxyobj, void* ifaces, uint64_t numifaces) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getinterfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, ifaces, numifaces);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)proxyobj;
    (void)ifaces;
    (void)numifaces;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpath(int64_t proxyobj) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getpath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)proxyobj;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetproperty(int64_t proxyobj, void* iface, void* property, int64_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getproperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface, property, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpropertyasync(int64_t proxyobj, void* iface, void* property, void* callback, uint32_t timeout, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getpropertyasync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface, property, callback, timeout, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)callback;
    (void)timeout;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetservicename(int64_t proxyobj) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getservicename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)proxyobj;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetsessionid(int64_t proxyobj) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getsessionid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)proxyobj;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetuniquename(int64_t proxyobj) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_getuniquename");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)proxyobj;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectImplementsinterface(int64_t proxyobj, void* iface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_implementsinterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobject(int64_t proxyobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_introspectremoteobject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobjectasync(int64_t proxyobj, void* callback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_introspectremoteobjectasync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIssecure(int64_t proxyobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_issecure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIsvalid(int64_t proxyobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_isvalid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcall(int64_t proxyobj, void* ifacename, void* methodname, int64_t args, uint64_t numargs, int64_t replymsg, uint32_t timeout, uint8_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, uint64_t, int64_t, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_methodcall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, ifacename, methodname, args, numargs, replymsg, timeout, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)args;
    (void)numargs;
    (void)replymsg;
    (void)timeout;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallNoreply(int64_t proxyobj, void* ifacename, void* methodname, int64_t args, uint64_t numargs, uint8_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, uint64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_methodcall_noreply");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, ifacename, methodname, args, numargs, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)args;
    (void)numargs;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallasync(int64_t proxyobj, void* ifacename, void* methodname, void* replyfunc, int64_t args, uint64_t numargs, void* context, uint32_t timeout, uint8_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, int64_t, uint64_t, void*, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_methodcallasync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, ifacename, methodname, replyfunc, args, numargs, context, timeout, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)ifacename;
    (void)methodname;
    (void)replyfunc;
    (void)args;
    (void)numargs;
    (void)context;
    (void)timeout;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectParsexml(int64_t proxyobj, void* xml, void* identifier) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_parsexml");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, xml, identifier);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)xml;
    (void)identifier;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefCreate(int64_t proxy) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefDecref(int64_t ref) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_decref");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ref);
        return;
    }
    errno = ENOSYS;
#else
    (void)ref;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefGet(int64_t ref) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_get");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ref);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ref;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefIncref(int64_t ref) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_ref_incref");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ref);
        return;
    }
    errno = ENOSYS;
#else
    (void)ref;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRegisterpropertieschangedlistener(int64_t proxyobj, void* iface, void* properties, uint64_t numproperties, void* callback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_registerpropertieschangedlistener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface, properties, numproperties, callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)properties;
    (void)numproperties;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRemovechild(int64_t proxyobj, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_removechild");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnection(int64_t proxyobj, int32_t forceauth) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_secureconnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, forceauth);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)forceauth;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnectionasync(int64_t proxyobj, int32_t forceauth) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_secureconnectionasync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, forceauth);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)forceauth;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetproperty(int64_t proxyobj, void* iface, void* property, int64_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_setproperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface, property, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetpropertyasync(int64_t proxyobj, void* iface, void* property, int64_t value, void* callback, uint32_t timeout, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_setpropertyasync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface, property, value, callback, timeout, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)property;
    (void)value;
    (void)callback;
    (void)timeout;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectUnregisterpropertieschangedlistener(int64_t proxyobj, void* iface, void* callback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_proxybusobject_unregisterpropertieschangedlistener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxyobj, iface, callback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxyobj;
    (void)iface;
    (void)callback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynRouterinit(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_routerinit");
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

int32_t windowssys_windows_win32_devices_alljoyn_alljoynRouterinitwithconfig(void* configxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_routerinitwithconfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)configxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynRoutershutdown(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_routershutdown");
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

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyClaim(int64_t proxy, void* cakey, void* identitycertificatechain, void* groupid, uint64_t groupsize, void* groupauthority, void* manifestsxmls, uint64_t manifestscount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_claim");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, cakey, identitycertificatechain, groupid, groupsize, groupauthority, manifestsxmls, manifestscount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)cakey;
    (void)identitycertificatechain;
    (void)groupid;
    (void)groupsize;
    (void)groupauthority;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyComputemanifestdigest(void* unsignedmanifestxml, void* identitycertificatepem, void* digest, void* digestsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_computemanifestdigest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unsignedmanifestxml, identitycertificatepem, digest, digestsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)digest;
    (void)digestsize;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyCreate(int64_t bus, void* appbusname, uint32_t sessionid) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bus, appbusname, sessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bus;
    (void)appbusname;
    (void)sessionid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDestroy(int64_t proxy) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(proxy);
        return;
    }
    errno = ENOSYS;
#else
    (void)proxy;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDigestDestroy(void* digest) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_digest_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(digest);
        return;
    }
    errno = ENOSYS;
#else
    (void)digest;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEccpublickeyDestroy(void* eccpublickey) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_eccpublickey_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(eccpublickey);
        return;
    }
    errno = ENOSYS;
#else
    (void)eccpublickey;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEndmanagement(int64_t proxy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_endmanagement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetapplicationstate(int64_t proxy, void* applicationstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getapplicationstate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, applicationstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)applicationstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilities(int64_t proxy, void* capabilities) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getclaimcapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, capabilities);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)capabilities;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(int64_t proxy, void* additionalinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, additionalinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)additionalinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetdefaultpolicy(int64_t proxy, void* policyxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getdefaultpolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, policyxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)policyxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGeteccpublickey(int64_t proxy, void* eccpublickey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_geteccpublickey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, eccpublickey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)eccpublickey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetmanifesttemplate(int64_t proxy, void* manifesttemplatexml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getmanifesttemplate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, manifesttemplatexml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)manifesttemplatexml;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getpermissionmanagementsessionport");
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

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpolicy(int64_t proxy, void* policyxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_getpolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, policyxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)policyxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyInstallmembership(int64_t proxy, void* membershipcertificatechain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_installmembership");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, membershipcertificatechain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)membershipcertificatechain;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifestDestroy(void* signedmanifestxml) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_manifest_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(signedmanifestxml);
        return;
    }
    errno = ENOSYS;
#else
    (void)signedmanifestxml;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifesttemplateDestroy(void* manifesttemplatexml) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_manifesttemplate_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(manifesttemplatexml);
        return;
    }
    errno = ENOSYS;
#else
    (void)manifesttemplatexml;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyPolicyDestroy(void* policyxml) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_policy_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(policyxml);
        return;
    }
    errno = ENOSYS;
#else
    (void)policyxml;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyReset(int64_t proxy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_reset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyResetpolicy(int64_t proxy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_resetpolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySetmanifestsignature(void* unsignedmanifestxml, void* identitycertificatepem, void* signature, uint64_t signaturesize, void* signedmanifestxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_setmanifestsignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unsignedmanifestxml, identitycertificatepem, signature, signaturesize, signedmanifestxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)signature;
    (void)signaturesize;
    (void)signedmanifestxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySignmanifest(void* unsignedmanifestxml, void* identitycertificatepem, void* signingprivatekeypem, void* signedmanifestxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_signmanifest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unsignedmanifestxml, identitycertificatepem, signingprivatekeypem, signedmanifestxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unsignedmanifestxml;
    (void)identitycertificatepem;
    (void)signingprivatekeypem;
    (void)signedmanifestxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyStartmanagement(int64_t proxy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_startmanagement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdateidentity(int64_t proxy, void* identitycertificatechain, void* manifestsxmls, uint64_t manifestscount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_updateidentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, identitycertificatechain, manifestsxmls, manifestscount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)identitycertificatechain;
    (void)manifestsxmls;
    (void)manifestscount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdatepolicy(int64_t proxy, void* policyxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_securityapplicationproxy_updatepolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxy, policyxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proxy;
    (void)policyxml;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerCreate(void* callbacks, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionlistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionlistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCmp(int64_t one, int64_t other) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_cmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(one, other);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCreate(uint8_t traffic, int32_t ismultipoint, uint8_t proximity, uint16_t transports) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint8_t, int32_t, uint8_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(traffic, ismultipoint, proximity, transports);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)traffic;
    (void)ismultipoint;
    (void)proximity;
    (void)transports;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsDestroy(int64_t opts) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(opts);
        return;
    }
    errno = ENOSYS;
#else
    (void)opts;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetMultipoint(int64_t opts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_multipoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(opts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)opts;
    errno = ENOSYS;
    return -1;
#endif
}

uint8_t windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetProximity(int64_t opts) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_proximity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(opts);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)opts;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTraffic(int64_t opts) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_traffic");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(opts);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)opts;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTransports(int64_t opts) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_get_transports");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(opts);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)opts;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsIscompatible(int64_t one, int64_t other) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_iscompatible");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(one, other);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)one;
    (void)other;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetMultipoint(int64_t opts, int32_t ismultipoint) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_multipoint");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(opts, ismultipoint);
        return;
    }
    errno = ENOSYS;
#else
    (void)opts;
    (void)ismultipoint;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetProximity(int64_t opts, uint8_t proximity) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_proximity");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(opts, proximity);
        return;
    }
    errno = ENOSYS;
#else
    (void)opts;
    (void)proximity;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTraffic(int64_t opts, uint8_t traffic) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_traffic");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(opts, traffic);
        return;
    }
    errno = ENOSYS;
#else
    (void)opts;
    (void)traffic;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTransports(int64_t opts, uint16_t transports) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionopts_set_transports");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(opts, transports);
        return;
    }
    errno = ENOSYS;
#else
    (void)opts;
    (void)transports;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerCreate(void* callbacks, void* context) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionportlistener_create");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerDestroy(int64_t listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_sessionportlistener_destroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_alljoyn_alljoynShutdown(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_shutdown");
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

int32_t windowssys_windows_win32_devices_alljoyn_alljoynUnityDeferredCallbacksProcess(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_unity_deferred_callbacks_process");
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

void windowssys_windows_win32_devices_alljoyn_alljoynUnitySetDeferredCallbackMainthreadOnly(int32_t mainthread_only) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msajapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "alljoyn_unity_set_deferred_callback_mainthread_only");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mainthread_only);
        return;
    }
    errno = ENOSYS;
#else
    (void)mainthread_only;
    errno = ENOSYS;
#endif
}

