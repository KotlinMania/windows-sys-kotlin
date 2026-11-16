#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_bluetooth_wrapper.h"
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

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice(void* hwndparent, void* hradio, void* pbtbi, void* pszpasskey, uint32_t ulpasskeylength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothAuthenticateDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, hradio, pbtbi, pszpasskey, ulpasskeylength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)hradio;
    (void)pbtbi;
    (void)pszpasskey;
    (void)ulpasskeylength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx(void* hwndparentin, void* hradioin, void* pbtdiinout, void* pbtoobdata, int32_t authenticationrequirement) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothAuthenticateDeviceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparentin, hradioin, pbtdiinout, pbtoobdata, authenticationrequirement);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparentin;
    (void)hradioin;
    (void)pbtdiinout;
    (void)pbtoobdata;
    (void)authenticationrequirement;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices(void* hwndparent, void* hradio, uint32_t cdevices, void* rgbtdi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothAuthenticateMultipleDevices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, hradio, cdevices, rgbtdi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)hradio;
    (void)cdevices;
    (void)rgbtdi;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties(void* hwndparent, void* pbtdi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothDisplayDeviceProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, pbtdi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)pbtdi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery(void* hradio, int32_t fenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothEnableDiscovery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradio, fenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hradio;
    (void)fenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections(void* hradio, int32_t fenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothEnableIncomingConnections");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradio, fenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hradio;
    (void)fenabled;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices(void* hradio, void* pbtdi, void* pcserviceinout, void* pguidservices) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothEnumerateInstalledServices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradio, pbtdi, pcserviceinout, pguidservices);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hradio;
    (void)pbtdi;
    (void)pcserviceinout;
    (void)pguidservices;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose(void* hfind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindDeviceClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfind;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice(void* pbtsp, void* pbtdi) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindFirstDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbtsp, pbtdi);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pbtsp;
    (void)pbtdi;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio(void* pbtfrp, void* phradio) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindFirstRadio");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbtfrp, phradio);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pbtfrp;
    (void)phradio;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice(void* hfind, void* pbtdi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindNextDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfind, pbtdi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfind;
    (void)pbtdi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio(void* hfind, void* phradio) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindNextRadio");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfind, phradio);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfind;
    (void)phradio;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose(void* hfind) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindRadioClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfind);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfind;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite(void* hdevice, uint64_t reliablewritecontext, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTAbortReliableWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, reliablewritecontext, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)reliablewritecontext;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite(void* hdevice, void* reliablewritecontext, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTBeginReliableWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, reliablewritecontext, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)reliablewritecontext;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite(void* hdevice, uint64_t reliablewritecontext, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTEndReliableWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, reliablewritecontext, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)reliablewritecontext;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue(void* hdevice, void* characteristic, uint32_t characteristicvaluedatasize, void* characteristicvalue, void* characteristicvaluesizerequired, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetCharacteristicValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, characteristic, characteristicvaluedatasize, characteristicvalue, characteristicvaluesizerequired, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)characteristic;
    (void)characteristicvaluedatasize;
    (void)characteristicvalue;
    (void)characteristicvaluesizerequired;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics(void* hdevice, void* service, uint16_t characteristicsbuffercount, void* characteristicsbuffer, void* characteristicsbufferactual, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetCharacteristics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, service, characteristicsbuffercount, characteristicsbuffer, characteristicsbufferactual, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)service;
    (void)characteristicsbuffercount;
    (void)characteristicsbuffer;
    (void)characteristicsbufferactual;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue(void* hdevice, void* descriptor, uint32_t descriptorvaluedatasize, void* descriptorvalue, void* descriptorvaluesizerequired, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetDescriptorValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, descriptor, descriptorvaluedatasize, descriptorvalue, descriptorvaluesizerequired, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)descriptor;
    (void)descriptorvaluedatasize;
    (void)descriptorvalue;
    (void)descriptorvaluesizerequired;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors(void* hdevice, void* characteristic, uint16_t descriptorsbuffercount, void* descriptorsbuffer, void* descriptorsbufferactual, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetDescriptors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, characteristic, descriptorsbuffercount, descriptorsbuffer, descriptorsbufferactual, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)characteristic;
    (void)descriptorsbuffercount;
    (void)descriptorsbuffer;
    (void)descriptorsbufferactual;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices(void* hdevice, void* parentservice, uint16_t includedservicesbuffercount, void* includedservicesbuffer, void* includedservicesbufferactual, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetIncludedServices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, parentservice, includedservicesbuffercount, includedservicesbuffer, includedservicesbufferactual, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)parentservice;
    (void)includedservicesbuffercount;
    (void)includedservicesbuffer;
    (void)includedservicesbufferactual;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices(void* hdevice, uint16_t servicesbuffercount, void* servicesbuffer, void* servicesbufferactual, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetServices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, servicesbuffercount, servicesbuffer, servicesbufferactual, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)servicesbuffercount;
    (void)servicesbuffer;
    (void)servicesbufferactual;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent(void* hservice, int32_t eventtype, void* eventparameterin, void* callback, void* callbackcontext, void* peventhandle, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTRegisterEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservice, eventtype, eventparameterin, callback, callbackcontext, peventhandle, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hservice;
    (void)eventtype;
    (void)eventparameterin;
    (void)callback;
    (void)callbackcontext;
    (void)peventhandle;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue(void* hdevice, void* characteristic, void* characteristicvalue, uint64_t reliablewritecontext, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTSetCharacteristicValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, characteristic, characteristicvalue, reliablewritecontext, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)characteristic;
    (void)characteristicvalue;
    (void)reliablewritecontext;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue(void* hdevice, void* descriptor, void* descriptorvalue, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTSetDescriptorValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, descriptor, descriptorvalue, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)descriptor;
    (void)descriptorvalue;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(int64_t eventhandle, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTUnregisterEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventhandle, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventhandle;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo(void* hradio, void* pbtdi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGetDeviceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradio, pbtdi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hradio;
    (void)pbtdi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo(void* hradio, void* pradioinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGetRadioInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradio, pradioinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hradio;
    (void)pradioinfo;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable(void* hradio) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothIsConnectable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradio);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hradio;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable(void* hradio) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothIsDiscoverable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradio);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hradio;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(uint8_t majorversion, uint8_t minorversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothIsVersionAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(majorversion, minorversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)majorversion;
    (void)minorversion;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication(void* pbtdi, void* phreghandle, void* pfncallback, void* pvparam) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothRegisterForAuthentication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbtdi, phreghandle, pfncallback, pvparam);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbtdi;
    (void)phreghandle;
    (void)pfncallback;
    (void)pvparam;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx(void* pbtdiin, void* phreghandleout, void* pfncallbackin, void* pvparam) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothRegisterForAuthenticationEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbtdiin, phreghandleout, pfncallbackin, pvparam);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbtdiin;
    (void)phreghandleout;
    (void)pfncallbackin;
    (void)pvparam;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice(void* paddress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothRemoveDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(paddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)paddress;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes(void* psdpstream, uint32_t cbstreamsize, void* pfncallback, void* pvparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSdpEnumAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psdpstream, cbstreamsize, pfncallback, pvparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psdpstream;
    (void)cbstreamsize;
    (void)pfncallback;
    (void)pvparam;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue(void* precordstream, uint32_t cbrecordlength, uint16_t usattributeid, void* pattributedata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSdpGetAttributeValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(precordstream, cbrecordlength, usattributeid, pattributedata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)precordstream;
    (void)cbrecordlength;
    (void)usattributeid;
    (void)pattributedata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData(void* pcontainerstream, uint32_t cbcontainerlength, void* pelement, void* pdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSdpGetContainerElementData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcontainerstream, cbcontainerlength, pelement, pdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcontainerstream;
    (void)cbcontainerlength;
    (void)pelement;
    (void)pdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData(void* psdpstream, uint32_t cbsdpstreamlength, void* pdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSdpGetElementData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psdpstream, cbsdpstreamlength, pdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psdpstream;
    (void)cbsdpstreamlength;
    (void)pdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString(void* precordstream, uint32_t cbrecordlength, void* pstringdata, uint16_t usstringoffset, void* pszstring, void* pcchstringlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSdpGetString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(precordstream, cbrecordlength, pstringdata, usstringoffset, pszstring, pcchstringlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)precordstream;
    (void)cbrecordlength;
    (void)pstringdata;
    (void)usstringoffset;
    (void)pszstring;
    (void)pcchstringlength;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices(void* pbtsdp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSelectDevices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbtsdp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbtsdp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree(void* pbtsdp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSelectDevicesFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbtsdp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbtsdp;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse(void* hradio, void* pbtdi, void* pszpasskey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSendAuthenticationResponse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradio, pbtdi, pszpasskey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hradio;
    (void)pbtdi;
    (void)pszpasskey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx(void* hradioin, void* pauthresponse) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSendAuthenticationResponseEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradioin, pauthresponse);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hradioin;
    (void)pauthresponse;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo(void* hradioin, void* pclassguid, uint32_t ulinstance, void* pserviceinfoin) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSetLocalServiceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradioin, pclassguid, ulinstance, pserviceinfoin);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hradioin;
    (void)pclassguid;
    (void)ulinstance;
    (void)pserviceinfoin;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState(void* hradio, void* pbtdi, void* pguidservice, uint32_t dwserviceflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSetServiceState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hradio, pbtdi, pguidservice, dwserviceflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hradio;
    (void)pbtdi;
    (void)pguidservice;
    (void)dwserviceflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(int64_t hreghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothUnregisterAuthentication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreghandle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord(void* pbtdi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothUpdateDeviceRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbtdi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbtdi;
    errno = ENOSYS;
    return 0;
#endif
}

