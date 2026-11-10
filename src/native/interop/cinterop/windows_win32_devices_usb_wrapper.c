#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_usb_wrapper.h"
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

int32_t windowssys_windows_win32_devices_usb_winUsbAbortPipe(void* interfacehandle, uint8_t pipeid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_AbortPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, pipeid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbFlushPipe(void* interfacehandle, uint8_t pipeid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_FlushPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, pipeid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbFree(void* interfacehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_Free");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbGetAdjustedFrameNumber(void* currentframenumber, int64_t timestamp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetAdjustedFrameNumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currentframenumber, timestamp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)currentframenumber;
    (void)timestamp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbGetAssociatedInterface(void* interfacehandle, uint8_t associatedinterfaceindex, void* associatedinterfacehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetAssociatedInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, associatedinterfaceindex, associatedinterfacehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)associatedinterfaceindex;
    (void)associatedinterfacehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbGetCurrentAlternateSetting(void* interfacehandle, void* settingnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetCurrentAlternateSetting");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, settingnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)settingnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumber(void* interfacehandle, void* currentframenumber, void* timestamp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetCurrentFrameNumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, currentframenumber, timestamp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)currentframenumber;
    (void)timestamp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumberAndQpc(void* interfacehandle, void* frameqpcinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetCurrentFrameNumberAndQpc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, frameqpcinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)frameqpcinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbGetDescriptor(void* interfacehandle, uint8_t descriptortype, uint8_t arg_2_index, uint16_t languageid, void* buffer, uint32_t bufferlength, void* lengthtransferred) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, uint16_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, descriptortype, arg_2_index, languageid, buffer, bufferlength, lengthtransferred);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)descriptortype;
    (void)arg_2_index;
    (void)languageid;
    (void)buffer;
    (void)bufferlength;
    (void)lengthtransferred;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbGetOverlappedResult(void* interfacehandle, void* lpoverlapped, void* lpnumberofbytestransferred, int32_t bwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetOverlappedResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, lpoverlapped, lpnumberofbytestransferred, bwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)bwait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbGetPipePolicy(void* interfacehandle, uint8_t pipeid, uint32_t policytype, void* valuelength, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetPipePolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, pipeid, policytype, valuelength, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)policytype;
    (void)valuelength;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbGetPowerPolicy(void* interfacehandle, uint32_t policytype, void* valuelength, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetPowerPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, policytype, valuelength, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)policytype;
    (void)valuelength;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbInitialize(void* devicehandle, void* interfacehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_Initialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicehandle, interfacehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)devicehandle;
    (void)interfacehandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_usb_winUsbParseConfigurationDescriptor(void* configurationdescriptor, void* startposition, int32_t interfacenumber, int32_t alternatesetting, int32_t interfaceclass, int32_t interfacesubclass, int32_t interfaceprotocol) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ParseConfigurationDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(configurationdescriptor, startposition, interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)configurationdescriptor;
    (void)startposition;
    (void)interfacenumber;
    (void)alternatesetting;
    (void)interfaceclass;
    (void)interfacesubclass;
    (void)interfaceprotocol;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_usb_winUsbParseDescriptors(void* descriptorbuffer, uint32_t totallength, void* startposition, int32_t descriptortype) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ParseDescriptors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptorbuffer, totallength, startposition, descriptortype);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)descriptorbuffer;
    (void)totallength;
    (void)startposition;
    (void)descriptortype;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbQueryDeviceInformation(void* interfacehandle, uint32_t informationtype, void* bufferlength, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_QueryDeviceInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, informationtype, bufferlength, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)informationtype;
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbQueryInterfaceSettings(void* interfacehandle, uint8_t alternateinterfacenumber, void* usbaltinterfacedescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_QueryInterfaceSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, alternateinterfacenumber, usbaltinterfacedescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)alternateinterfacenumber;
    (void)usbaltinterfacedescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbQueryPipe(void* interfacehandle, uint8_t alternateinterfacenumber, uint8_t pipeindex, void* pipeinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_QueryPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, alternateinterfacenumber, pipeindex, pipeinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)alternateinterfacenumber;
    (void)pipeindex;
    (void)pipeinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbQueryPipeEx(void* interfacehandle, uint8_t alternatesettingnumber, uint8_t pipeindex, void* pipeinformationex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_QueryPipeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, alternatesettingnumber, pipeindex, pipeinformationex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)alternatesettingnumber;
    (void)pipeindex;
    (void)pipeinformationex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbReadIsochPipe(void* bufferhandle, uint32_t offset, uint32_t length, void* framenumber, uint32_t numberofpackets, void* isopacketdescriptors, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ReadIsochPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bufferhandle, offset, length, framenumber, numberofpackets, isopacketdescriptors, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)framenumber;
    (void)numberofpackets;
    (void)isopacketdescriptors;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbReadIsochPipeAsap(void* bufferhandle, uint32_t offset, uint32_t length, int32_t continuestream, uint32_t numberofpackets, void* isopacketdescriptors, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ReadIsochPipeAsap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bufferhandle, offset, length, continuestream, numberofpackets, isopacketdescriptors, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)continuestream;
    (void)numberofpackets;
    (void)isopacketdescriptors;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbReadPipe(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* lengthtransferred, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ReadPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, pipeid, buffer, bufferlength, lengthtransferred, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)buffer;
    (void)bufferlength;
    (void)lengthtransferred;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbRegisterIsochBuffer(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* isochbufferhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_RegisterIsochBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, pipeid, buffer, bufferlength, isochbufferhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)buffer;
    (void)bufferlength;
    (void)isochbufferhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbResetPipe(void* interfacehandle, uint8_t pipeid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ResetPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, pipeid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbSetCurrentAlternateSetting(void* interfacehandle, uint8_t settingnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_SetCurrentAlternateSetting");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, settingnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)settingnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbSetPipePolicy(void* interfacehandle, uint8_t pipeid, uint32_t policytype, uint32_t valuelength, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_SetPipePolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, pipeid, policytype, valuelength, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)policytype;
    (void)valuelength;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbSetPowerPolicy(void* interfacehandle, uint32_t policytype, uint32_t valuelength, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_SetPowerPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, policytype, valuelength, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)policytype;
    (void)valuelength;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbStartTrackingForTimeSync(void* interfacehandle, void* starttrackinginfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_StartTrackingForTimeSync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, starttrackinginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)starttrackinginfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbStopTrackingForTimeSync(void* interfacehandle, void* stoptrackinginfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_StopTrackingForTimeSync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, stoptrackinginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)stoptrackinginfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbUnregisterIsochBuffer(void* isochbufferhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_UnregisterIsochBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(isochbufferhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)isochbufferhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbWriteIsochPipe(void* bufferhandle, uint32_t offset, uint32_t length, void* framenumber, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_WriteIsochPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bufferhandle, offset, length, framenumber, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)framenumber;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbWriteIsochPipeAsap(void* bufferhandle, uint32_t offset, uint32_t length, int32_t continuestream, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_WriteIsochPipeAsap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bufferhandle, offset, length, continuestream, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)continuestream;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_usb_winUsbWritePipe(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* lengthtransferred, void* overlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_WritePipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfacehandle, pipeid, buffer, bufferlength, lengthtransferred, overlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)buffer;
    (void)bufferlength;
    (void)lengthtransferred;
    (void)overlapped;
    errno = ENOSYS;
    return -1;
#endif
}

