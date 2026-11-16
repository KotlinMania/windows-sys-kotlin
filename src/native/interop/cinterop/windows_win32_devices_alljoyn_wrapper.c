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

uint32_t windowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection(void* serverbushandle, void* abortevent) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle(void* bushandle) {
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

void* windowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus(void* connectionspec) {
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

void* windowssysWindowsWin32DevicesAlljoynAllJoynCreateBus(uint32_t outbuffersize, uint32_t inbuffersize, void* lpsecurityattributes) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents(void* connectedbushandle, void* eventtoreset, void* eventtypes) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAllJoynEventSelect(void* connectedbushandle, void* eventhandle, uint32_t eventtypes) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus(void* connectedbushandle, void* buffer, uint32_t bytestoread, void* bytestransferred, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAllJoynSendToBus(void* connectedbushandle, void* buffer, uint32_t bytestowrite, void* bytestransferred, void* reserved) {
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

void* windowssysWindowsWin32DevicesAlljoynQccStatusText(int32_t status) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate(void* defaultlanguage) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty(void) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull(int64_t arg, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg(int64_t data, int64_t arg, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml(int64_t data, void* aboutdataxml) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy(int64_t data) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata(int64_t data, int64_t msgarg, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion(int64_t data, void* ajsoftwareversion) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata(int64_t data, int64_t msgarg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid(int64_t data, void* appid, void* num) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname(int64_t data, void* appname, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture(int64_t data, void* dateofmanufacture) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage(int64_t data, void* defaultlanguage) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription(int64_t data, void* description, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid(int64_t data, void* deviceid) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename(int64_t data, void* devicename, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield(int64_t data, void* name, void* value, void* language) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields(int64_t data, void* fields, uint64_t numFields) {
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
        return km_fn_ptr(data, fields, numFields);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)data;
    (void)fields;
    (void)numFields;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature(int64_t data, void* fieldname) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion(int64_t data, void* hardwareversion) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer(int64_t data, void* manufacturer, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber(int64_t data, void* modelnumber) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion(int64_t data, void* softwareversion) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages(int64_t data, void* languagetags, uint64_t num) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl(int64_t data, void* supporturl) {
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

uint8_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced(int64_t data, void* fieldname) {
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

uint8_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized(int64_t data, void* fieldname) {
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

uint8_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired(int64_t data, void* fieldname) {
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

uint8_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid(int64_t data, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid(int64_t data, void* appid, uint64_t num) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring(int64_t data, void* appid) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname(int64_t data, void* appname, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture(int64_t data, void* dateofmanufacture) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage(int64_t data, void* defaultlanguage) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription(int64_t data, void* description, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid(int64_t data, void* deviceid) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename(int64_t data, void* devicename, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield(int64_t data, void* name, int64_t value, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion(int64_t data, void* hardwareversion) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer(int64_t data, void* manufacturer, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber(int64_t data, void* modelnumber) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion(int64_t data, void* softwareversion) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage(int64_t data, void* language) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl(int64_t data, void* supporturl) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate(void* callbacks, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy(int64_t listener) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear(int64_t icon) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate(void) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy(int64_t icon) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent(int64_t icon, void* data, void* size) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl(int64_t icon, void* type, void* url) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent(int64_t icon, void* type, void* data, uint64_t csize, uint8_t ownsdata) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg(int64_t icon, int64_t arg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl(int64_t icon, void* type, void* url) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate(int64_t bus, int64_t icon) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy(int64_t icon) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate(int64_t bus, void* busname, uint32_t sessionid) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy(int64_t proxy) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon(int64_t proxy, int64_t icon) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion(int64_t proxy, void* version) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate(void* callback, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy(int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce(int64_t obj, uint16_t sessionport, int64_t aboutdata) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener(int64_t obj, uint16_t sessionport, int64_t aboutlistener) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate(int64_t bus, int32_t isannounced) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy(int64_t obj) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce(int64_t obj) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear(int64_t description) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate(void) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull(int64_t arg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg(int64_t description, int64_t arg) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy(int64_t description) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths(int64_t description, void* interfacename, void* paths, uint64_t numpaths) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces(int64_t description, void* path, void* interfaces, uint64_t numinterfaces) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg(int64_t description, int64_t msgarg) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths(int64_t description, void* paths, uint64_t numpaths) {
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

uint8_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface(int64_t description, void* interfacename) {
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

uint8_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath(int64_t description, void* path, void* interfacename) {
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

uint8_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath(int64_t description, void* path) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate(int64_t bus, void* busname, uint32_t sessionid) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy(int64_t proxy) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata(int64_t proxy, void* language, int64_t data) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription(int64_t proxy, int64_t objectdesc) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion(int64_t proxy, void* version) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate(void* callbacks, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy(int64_t listener) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate(void* callbacks, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy(int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse(int64_t listener, void* authcontext, int32_t arg2Accept, int64_t credentials) {
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
        return km_fn_ptr(listener, authcontext, arg2Accept, credentials);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)authcontext;
    (void)arg2Accept;
    (void)credentials;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret(int64_t listener, void* sharedsecret, uint64_t sharedsecretsize) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse(int64_t listener, void* authcontext, int32_t arg2Accept) {
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
        return km_fn_ptr(listener, authcontext, arg2Accept);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)authcontext;
    (void)arg2Accept;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate(void* callbacks, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy(int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination(int64_t autopinger, void* group, void* destination) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup(int64_t autopinger, void* group, int64_t listener, uint32_t pinginterval) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate(int64_t bus) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy(int64_t autopinger) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause(int64_t autopinger) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination(int64_t autopinger, void* group, void* destination, int32_t removeall) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup(int64_t autopinger, void* group) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume(int64_t autopinger) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval(int64_t autopinger, void* group, uint32_t pinginterval) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry(int64_t bus, void* authmechanism, void* username, void* password) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch(int64_t bus, void* rule) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename(int64_t bus, void* name, uint16_t transports) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport(int64_t bus, void* sessionport, int64_t opts, int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename(int64_t bus, void* name, uint16_t transports) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname(int64_t bus, void* nameprefix) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport(int64_t bus, void* nameprefix, uint16_t transports) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface(int64_t bus, void* implementsinterface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces(int64_t bus, void* implementsinterfaces, uint64_t numberinterfaces) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys(int64_t bus, void* guid) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect(int64_t bus, void* connectspec) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate(void* applicationname, int32_t allowremotemessages) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency(void* applicationname, int32_t allowremotemessages, uint32_t concurrency) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface(int64_t bus, void* name, void* iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure(int64_t bus, void* name, void* iface, int32_t secpolicy) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml(int64_t bus, void* xml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore(void* applicationname) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface(int64_t bus, int64_t iface) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect(int64_t bus, void* unused) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity(int64_t bus, void* authmechanisms, int64_t listener, void* keystorefilename, int32_t isshared) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(int64_t bus, void* authmechanisms, int64_t authlistener, void* keystorefilename, int32_t isshared, int64_t permissionconfigurationlistener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname(int64_t bus, void* nameprefix) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport(int64_t bus, void* nameprefix, uint16_t transports) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj(int64_t bus) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj(int64_t bus) {
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

uint32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency(int64_t bus) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec(int64_t bus) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj(int64_t bus) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring(int64_t bus) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface(int64_t bus, void* name) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces(int64_t bus, void* ifaces, uint64_t numifaces) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration(int64_t bus, void* guid, void* timeout) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid(int64_t bus, void* name, void* guid, void* guidsz) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator(int64_t bus) {
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

uint32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp(void) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession(int64_t bus, void* sessionhost, uint16_t sessionport, int64_t listener, void* sessionid, int64_t opts) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync(int64_t bus, void* sessionhost, uint16_t sessionport, int64_t listener, int64_t opts, void* callback, void* context) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession(int64_t bus, uint32_t sessionid) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner(int64_t bus, void* name, void* hasowner) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing(int64_t bus, void* name, uint32_t timeout) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener(int64_t bus, int64_t aboutlistener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener(int64_t bus, int64_t listener) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener(int64_t bus, int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject(int64_t bus, int64_t obj) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure(int64_t bus, int64_t obj) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener(int64_t bus, int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename(int64_t bus, void* name) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch(int64_t bus, void* rule) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember(int64_t bus, uint32_t sessionid, void* membername) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname(int64_t bus, void* requestedname, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection(int64_t bus, void* name, int32_t forceauth) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync(int64_t bus, void* name, int32_t forceauth) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug(int64_t bus, void* module, uint32_t level) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration(int64_t bus, void* guid, uint32_t timeout) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout(int64_t bus, uint32_t sessionid, void* linktimeout) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync(int64_t bus, uint32_t sessionid, uint32_t linktimeout, void* callback, void* context) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener(int64_t bus, uint32_t sessionid, int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport(int64_t bus, uint16_t sessionport) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener(int64_t bus, int64_t aboutlistener) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener(int64_t bus, int64_t listener) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener(int64_t bus, int64_t listener) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject(int64_t bus, int64_t object) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface(int64_t bus, void* implementsinterface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces(int64_t bus, void* implementsinterfaces, uint64_t numberinterfaces) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate(void* callbacks, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy(int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface(int64_t bus, int64_t iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced(int64_t bus, int64_t iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers(int64_t bus, void* entries, uint64_t numentries) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage(int64_t bus, int64_t msg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial(int64_t bus, uint32_t serialnumber) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate(void* path, int32_t isplaceholder, void* callbacksIn, void* contextIn) {
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
        return km_fn_ptr(path, isplaceholder, callbacksIn, contextIn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)isplaceholder;
    (void)callbacksIn;
    (void)contextIn;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy(int64_t bus) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged(int64_t bus, void* ifcname, void* propnames, uint64_t numprops, uint32_t id) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged(int64_t bus, void* ifcname, void* propname, int64_t val, uint32_t id) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames(int64_t bus, void* interfaces, uint64_t numinterfaces) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment(int64_t bus) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname(int64_t bus, void* buffer, uint64_t buffersz) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure(int64_t bus) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs(int64_t bus, int64_t msg, int64_t args, uint64_t numargs) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr(int64_t bus, int64_t msg, void* error, void* errormessage) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus(int64_t bus, int64_t msg, int32_t status) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag(int64_t bus, int64_t iface, int32_t isannounced) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear(int64_t cred) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate(void) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy(int64_t cred) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain(int64_t cred) {
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

uint32_t windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration(int64_t cred) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry(int64_t cred) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword(int64_t cred) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey(int64_t cred) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername(int64_t cred) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset(int64_t cred, uint16_t creds) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain(int64_t cred, void* certchain) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration(int64_t cred, uint32_t expiration) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry(int64_t cred, void* logonentry) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword(int64_t cred, void* pwd) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey(int64_t cred, void* pk) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername(int64_t cred, void* username) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo(void) {
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

uint32_t windowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion(void) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynGetversion(void) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInit(void) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate(int64_t iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation(int64_t iface, void* name, void* value) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation(int64_t iface, void* member, void* argname, void* name, void* value) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember(int64_t iface, int32_t type, void* name, void* inputsig, void* outsig, void* argnames, uint8_t annotation) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation(int64_t iface, void* member, void* name, void* value) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod(int64_t iface, void* name, void* inputsig, void* outsig, void* argnames, uint8_t annotation, void* accessperms) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty(int64_t iface, void* name, void* signature, uint8_t access) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation(int64_t iface, void* property, void* name, void* value) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal(int64_t iface, void* name, void* sig, void* argnames, uint8_t annotation, void* accessperms) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql(int64_t one, int64_t other) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation(int64_t iface, void* name, void* value, void* valueSize) {
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
        return km_fn_ptr(iface, name, value, valueSize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)name;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex(int64_t iface, uint64_t arg1Index, void* name, void* nameSize, void* value, void* valueSize) {
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
        km_fn_ptr(iface, arg1Index, name, nameSize, value, valueSize);
        return;
    }
    errno = ENOSYS;
#else
    (void)iface;
    (void)arg1Index;
    (void)name;
    (void)nameSize;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
#endif
}

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount(int64_t iface) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage(int64_t iface, void* member, void* arg, void* description, uint64_t maxlanguagelength, void* languagetag) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage(int64_t iface, void* description, uint64_t maxlanguagelength, void* languagetag) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages(int64_t iface, void* languages, uint64_t size) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2(int64_t iface, void* languages, uint64_t languagessize) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptiontranslationcallback(int64_t iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember(int64_t iface, void* name, void* member) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation(int64_t iface, void* member, void* name, void* value, void* valueSize) {
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
        return km_fn_ptr(iface, member, name, value, valueSize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)member;
    (void)name;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation(int64_t iface, void* member, void* argname, void* name, void* value, void* valueSize) {
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
        return km_fn_ptr(iface, member, argname, name, value, valueSize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)member;
    (void)argname;
    (void)name;
    (void)value;
    (void)valueSize;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage(int64_t iface, void* member, void* description, uint64_t maxlanguagelength, void* languagetag) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers(int64_t iface, void* members, uint64_t nummembers) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod(int64_t iface, void* name, void* member) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname(int64_t iface) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties(int64_t iface, void* props, uint64_t numprops) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty(int64_t iface, void* name, void* property) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation(int64_t iface, void* property, void* name, void* value, void* strSize) {
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
        return km_fn_ptr(iface, property, name, value, strSize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iface;
    (void)property;
    (void)name;
    (void)value;
    (void)strSize;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage(int64_t iface, void* property, void* description, uint64_t maxlanguagelength, void* languagetag) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy(int64_t iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal(int64_t iface, void* name, void* member) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription(int64_t iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember(int64_t iface, void* name, void* insig, void* outsig) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties(int64_t iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty(int64_t iface, void* name) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect(int64_t iface, void* str, uint64_t buf, uint64_t indent) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure(int64_t iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription(int64_t iface, void* member, void* argname, void* description) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage(int64_t iface, void* member, void* arg, void* description, void* languagetag) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription(int64_t iface, void* description) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage(int64_t iface, void* description, void* languagetag) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage(int64_t iface, void* language) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback(int64_t iface, void* translationcallback) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription(int64_t iface, void* member, void* description) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage(int64_t iface, void* member, void* description, void* languagetag) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription(int64_t iface, void* name, void* description) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage(int64_t iface, void* name, void* description, void* languagetag) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate(void* callbacks, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy(int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys(int64_t listener, int64_t keystore, void* sink, void* sinkSz) {
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
        return km_fn_ptr(listener, keystore, sink, sinkSz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)keystore;
    (void)sink;
    (void)sinkSz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys(int64_t listener, int64_t keystore, void* source, void* password) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate(void* callbacks, void* context) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate(int64_t bus) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription(int64_t msg, void* str, uint64_t buf) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy(int64_t msg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageEql(int64_t one, int64_t other) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg(int64_t msg, uint64_t argn) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs(int64_t msg, void* numargs, void* args) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism(int64_t msg) {
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

uint32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial(int64_t msg) {
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

uint32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken(int64_t msg) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination(int64_t msg) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname(int64_t msg, void* errormessage, void* errormessageSize) {
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
        return km_fn_ptr(msg, errormessage, errormessageSize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)msg;
    (void)errormessage;
    (void)errormessageSize;
    errno = ENOSYS;
    return NULL;
#endif
}

uint8_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags(int64_t msg) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface(int64_t msg) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername(int64_t msg) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath(int64_t msg) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname(int64_t msg) {
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

uint32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial(int64_t msg) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender(int64_t msg) {
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

uint32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid(int64_t msg) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature(int64_t msg) {
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

uint32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp(int64_t msg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype(int64_t msg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal(int64_t msg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted(int64_t msg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired(int64_t msg, void* tillexpirems) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast(int64_t msg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless(int64_t msg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable(int64_t msg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs(int64_t msg, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess(int8_t endian) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring(int64_t msg, void* str, uint64_t buf) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate(uint64_t size) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement(int64_t arg, uint64_t arg1Index) {
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
        return km_fn_ptr(arg, arg1Index);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)arg1Index;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet(int64_t args, uint64_t numargs, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet(int64_t args, void* numargs, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset(int64_t args, uint64_t argoffset, void* numargs, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature(int64_t values, uint64_t numvalues, void* str, uint64_t buf) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring(int64_t args, uint64_t numargs, void* str, uint64_t buf, uint64_t indent) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear(int64_t arg) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone(int64_t destination, int64_t source) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy(int64_t source) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate(void) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet(void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy(int64_t arg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual(int64_t lhv, int64_t rhv) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet(int64_t arg, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement(int64_t arg, uint64_t arg1Index, void* element) {
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
        km_fn_ptr(arg, arg1Index, element);
        return;
    }
    errno = ENOSYS;
#else
    (void)arg;
    (void)arg1Index;
    (void)element;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature(int64_t arg, uint64_t arg1Index) {
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
        return km_fn_ptr(arg, arg1Index);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)arg;
    (void)arg1Index;
    errno = ENOSYS;
    return NULL;
#endif
}

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements(int64_t arg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool(int64_t arg, void* b) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray(int64_t arg, void* length, void* ab) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble(int64_t arg, void* d) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray(int64_t arg, void* length, void* ad) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16(int64_t arg, void* n) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array(int64_t arg, void* length, void* an) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32(int64_t arg, void* i) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array(int64_t arg, void* length, void* ai) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64(int64_t arg, void* x) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array(int64_t arg, void* length, void* ax) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath(int64_t arg, void* o) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature(int64_t arg, void* g) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString(int64_t arg, void* s) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16(int64_t arg, void* q) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array(int64_t arg, void* length, void* aq) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32(int64_t arg, void* u) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array(int64_t arg, void* length, void* au) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64(int64_t arg, void* t) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array(int64_t arg, void* length, void* at) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8(int64_t arg, void* y) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array(int64_t arg, void* length, void* ay) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant(int64_t arg, int64_t v) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray(int64_t arg, void* signature, void* length, void* av) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement(int64_t arg, void* elemsig, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey(int64_t arg) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember(int64_t arg, uint64_t arg1Index) {
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
        return km_fn_ptr(arg, arg1Index);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)arg1Index;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers(int64_t arg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype(int64_t arg) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue(int64_t arg) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature(int64_t arg, void* signature) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet(int64_t arg, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize(int64_t arg, void* signature, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool(int64_t arg, int32_t b) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray(int64_t arg, uint64_t length, void* ab) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble(int64_t arg, double d) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray(int64_t arg, uint64_t length, void* ad) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16(int64_t arg, int16_t n) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array(int64_t arg, uint64_t length, void* an) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32(int64_t arg, int32_t i) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array(int64_t arg, uint64_t length, void* ai) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64(int64_t arg, int64_t x) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array(int64_t arg, uint64_t length, void* ax) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath(int64_t arg, void* o) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray(int64_t arg, uint64_t length, void* ao) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature(int64_t arg, void* g) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray(int64_t arg, uint64_t length, void* ag) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString(int64_t arg, void* s) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray(int64_t arg, uint64_t length, void* as) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16(int64_t arg, uint16_t q) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array(int64_t arg, uint64_t length, void* aq) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32(int64_t arg, uint32_t u) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array(int64_t arg, uint64_t length, void* au) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64(int64_t arg, uint64_t t) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array(int64_t arg, uint64_t length, void* at) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8(int64_t arg, uint8_t y) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array(int64_t arg, uint64_t length, void* ay) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry(int64_t arg, int64_t key, int64_t value) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct(int64_t arg, int64_t structMembers, uint64_t numMembers) {
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
        return km_fn_ptr(arg, structMembers, numMembers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg;
    (void)structMembers;
    (void)numMembers;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature(int64_t arg, void* str, uint64_t buf) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize(int64_t arg) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring(int64_t arg, void* str, uint64_t buf, uint64_t indent) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate(int64_t bus, void* mandatoryinterfaces, uint64_t nummandatoryinterfaces) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy(int64_t observer) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynObserverGet(int64_t observer, void* uniquebusname, void* objectpath) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst(int64_t observer) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext(int64_t observer, int64_t proxyref) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener(int64_t observer, int64_t listener, int32_t triggeronexisting) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners(int64_t observer) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener(int64_t observer, int64_t listener) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate(void* callback, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy(int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials(void* authmechanism, void* password) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate(void* callbacks, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy(int64_t listener) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy(void* certificatechain) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup(void* certificateid) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup(void* certificateidarray) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim(int64_t configurator, void* cakey, void* identitycertificatechain, void* groupid, uint64_t groupsize, void* groupauthority, void* manifestsxmls, uint64_t manifestscount) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement(int64_t configurator) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate(int64_t configurator, void* state) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities(int64_t configurator, void* claimcapabilities) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(int64_t configurator, void* additionalinfo) {
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

uint16_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities(void) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy(int64_t configurator, void* policyxml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity(int64_t configurator, void* identitycertificatechain) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid(int64_t configurator, void* certificateid) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests(int64_t configurator, void* manifestarray) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate(int64_t configurator, void* manifesttemplatexml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries(int64_t configurator, void* certificateids) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy(int64_t configurator, void* policyxml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey(int64_t configurator, void* publickey) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests(int64_t configurator, void* manifestsxmls, uint64_t manifestscount, int32_t append) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership(int64_t configurator, void* membershipcertificatechain) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup(void* manifestarray) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy(void* manifesttemplatexml) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy(void* policyxml) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy(void* publickey) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership(int64_t configurator, void* serial, uint64_t seriallen, void* issuerpublickey, void* issueraki, uint64_t issuerakilen) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset(int64_t configurator) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy(int64_t configurator) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate(int64_t configurator, int32_t state) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities(int64_t configurator, uint16_t claimcapabilities) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(int64_t configurator, uint16_t additionalinfo) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml(int64_t configurator, void* manifesttemplatexml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement(int64_t configurator) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity(int64_t configurator, void* identitycertificatechain, void* manifestsxmls, uint64_t manifestscount) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy(int64_t configurator, void* policyxml) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate(void* callback, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy(int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild(int64_t proxyobj, int64_t child) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface(int64_t proxyobj, int64_t iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName(int64_t proxyobj, void* name) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy(int64_t source) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate(int64_t bus, void* service, void* path, uint32_t sessionid) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure(int64_t bus, void* service, void* path, uint32_t sessionid) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy(int64_t proxyobj) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching(int64_t proxyobj) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties(int64_t proxyobj, void* iface, int64_t values) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync(int64_t proxyobj, void* iface, void* callback, uint32_t timeout, void* context) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild(int64_t proxyobj, void* path) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren(int64_t proxyobj, void* children, uint64_t numchildren) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface(int64_t proxyobj, void* iface) {
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

uint64_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces(int64_t proxyobj, void* ifaces, uint64_t numifaces) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath(int64_t proxyobj) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty(int64_t proxyobj, void* iface, void* property, int64_t value) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync(int64_t proxyobj, void* iface, void* property, void* callback, uint32_t timeout, void* context) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename(int64_t proxyobj) {
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

uint32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid(int64_t proxyobj) {
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

void* windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename(int64_t proxyobj) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface(int64_t proxyobj, void* iface) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject(int64_t proxyobj) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync(int64_t proxyobj, void* callback, void* context) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure(int64_t proxyobj) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid(int64_t proxyobj) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall(int64_t proxyobj, void* ifacename, void* methodname, int64_t args, uint64_t numargs, int64_t replymsg, uint32_t timeout, uint8_t flags) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply(int64_t proxyobj, void* ifacename, void* methodname, int64_t args, uint64_t numargs, uint8_t flags) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync(int64_t proxyobj, void* ifacename, void* methodname, void* replyfunc, int64_t args, uint64_t numargs, void* context, uint32_t timeout, uint8_t flags) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml(int64_t proxyobj, void* xml, void* identifier) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate(int64_t proxy) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref(int64_t ref) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet(int64_t ref) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref(int64_t ref) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener(int64_t proxyobj, void* iface, void* properties, uint64_t numproperties, void* callback, void* context) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild(int64_t proxyobj, void* path) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection(int64_t proxyobj, int32_t forceauth) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync(int64_t proxyobj, int32_t forceauth) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty(int64_t proxyobj, void* iface, void* property, int64_t value) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync(int64_t proxyobj, void* iface, void* property, int64_t value, void* callback, uint32_t timeout, void* context) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener(int64_t proxyobj, void* iface, void* callback) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynRouterinit(void) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig(void* configxml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown(void) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim(int64_t proxy, void* cakey, void* identitycertificatechain, void* groupid, uint64_t groupsize, void* groupauthority, void* manifestsxmls, uint64_t manifestscount) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest(void* unsignedmanifestxml, void* identitycertificatepem, void* digest, void* digestsize) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate(int64_t bus, void* appbusname, uint32_t sessionid) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy(int64_t proxy) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy(void* digest) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy(void* eccpublickey) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement(int64_t proxy) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate(int64_t proxy, void* applicationstate) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities(int64_t proxy, void* capabilities) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(int64_t proxy, void* additionalinfo) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy(int64_t proxy, void* policyxml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey(int64_t proxy, void* eccpublickey) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate(int64_t proxy, void* manifesttemplatexml) {
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

uint16_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport(void) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy(int64_t proxy, void* policyxml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership(int64_t proxy, void* membershipcertificatechain) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy(void* signedmanifestxml) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy(void* manifesttemplatexml) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy(void* policyxml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset(int64_t proxy) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy(int64_t proxy) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature(void* unsignedmanifestxml, void* identitycertificatepem, void* signature, uint64_t signaturesize, void* signedmanifestxml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest(void* unsignedmanifestxml, void* identitycertificatepem, void* signingprivatekeypem, void* signedmanifestxml) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement(int64_t proxy) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity(int64_t proxy, void* identitycertificatechain, void* manifestsxmls, uint64_t manifestscount) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy(int64_t proxy, void* policyxml) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate(void* callbacks, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy(int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp(int64_t one, int64_t other) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate(uint8_t traffic, int32_t ismultipoint, uint8_t proximity, uint16_t transports) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy(int64_t opts) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint(int64_t opts) {
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

uint8_t windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity(int64_t opts) {
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

uint8_t windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic(int64_t opts) {
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

uint16_t windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports(int64_t opts) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible(int64_t one, int64_t other) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint(int64_t opts, int32_t ismultipoint) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity(int64_t opts, uint8_t proximity) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic(int64_t opts, uint8_t traffic) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports(int64_t opts, uint16_t transports) {
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

int64_t windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate(void* callbacks, void* context) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy(int64_t listener) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynShutdown(void) {
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

int32_t windowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess(void) {
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

void windowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly(int32_t mainthreadOnly) {
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
        km_fn_ptr(mainthreadOnly);
        return;
    }
    errno = ENOSYS;
#else
    (void)mainthreadOnly;
    errno = ENOSYS;
#endif
}

