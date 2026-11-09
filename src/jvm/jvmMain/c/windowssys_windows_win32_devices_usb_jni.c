#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1AbortPipe(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte pipeid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_AbortPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)pipeid) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1FlushPipe(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte pipeid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_FlushPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)pipeid) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1Free(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_Free");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle) : -1;
#else
    (void)interfacehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1GetAdjustedFrameNumber(JNIEnv* km_env, jclass km_clazz, jlong currentframenumber, jlong timestamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetAdjustedFrameNumber");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)currentframenumber, (int64_t)timestamp) : -1;
#else
    (void)currentframenumber;
    (void)timestamp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1GetAssociatedInterface(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte associatedinterfaceindex, jlong associatedinterfacehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetAssociatedInterface");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)associatedinterfaceindex, (void*)(uintptr_t)associatedinterfacehandle) : -1;
#else
    (void)interfacehandle;
    (void)associatedinterfaceindex;
    (void)associatedinterfacehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1GetCurrentAlternateSetting(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jlong settingnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetCurrentAlternateSetting");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (void*)(uintptr_t)settingnumber) : -1;
#else
    (void)interfacehandle;
    (void)settingnumber;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1GetCurrentFrameNumber(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jlong currentframenumber, jlong timestamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetCurrentFrameNumber");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (void*)(uintptr_t)currentframenumber, (void*)(uintptr_t)timestamp) : -1;
#else
    (void)interfacehandle;
    (void)currentframenumber;
    (void)timestamp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1GetCurrentFrameNumberAndQpc(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jlong frameqpcinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetCurrentFrameNumberAndQpc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (void*)(uintptr_t)frameqpcinfo) : -1;
#else
    (void)interfacehandle;
    (void)frameqpcinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1GetDescriptor(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte descriptortype, jbyte arg_2_index, jshort languageid, jlong buffer, jint bufferlength, jlong lengthtransferred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, uint16_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)descriptortype, (uint8_t)arg_2_index, (uint16_t)languageid, (void*)(uintptr_t)buffer, (uint32_t)bufferlength, (void*)(uintptr_t)lengthtransferred) : -1;
#else
    (void)interfacehandle;
    (void)descriptortype;
    (void)arg_2_index;
    (void)languageid;
    (void)buffer;
    (void)bufferlength;
    (void)lengthtransferred;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1GetOverlappedResult(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jlong lpoverlapped, jlong lpnumberofbytestransferred, jint bwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetOverlappedResult");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpnumberofbytestransferred, (int32_t)bwait) : -1;
#else
    (void)interfacehandle;
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)bwait;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1GetPipePolicy(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte pipeid, jint policytype, jlong valuelength, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetPipePolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)pipeid, (uint32_t)policytype, (void*)(uintptr_t)valuelength, (void*)(uintptr_t)value) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)policytype;
    (void)valuelength;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1GetPowerPolicy(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jint policytype, jlong valuelength, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_GetPowerPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint32_t)policytype, (void*)(uintptr_t)valuelength, (void*)(uintptr_t)value) : -1;
#else
    (void)interfacehandle;
    (void)policytype;
    (void)valuelength;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1Initialize(JNIEnv* km_env, jclass km_clazz, jlong devicehandle, jlong interfacehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_Initialize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)devicehandle, (void*)(uintptr_t)interfacehandle) : -1;
#else
    (void)devicehandle;
    (void)interfacehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1ParseConfigurationDescriptor(JNIEnv* km_env, jclass km_clazz, jlong configurationdescriptor, jlong startposition, jint interfacenumber, jint alternatesetting, jint interfaceclass, jint interfacesubclass, jint interfaceprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ParseConfigurationDescriptor");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)configurationdescriptor, (void*)(uintptr_t)startposition, (int32_t)interfacenumber, (int32_t)alternatesetting, (int32_t)interfaceclass, (int32_t)interfacesubclass, (int32_t)interfaceprotocol) : NULL;
#else
    (void)configurationdescriptor;
    (void)startposition;
    (void)interfacenumber;
    (void)alternatesetting;
    (void)interfaceclass;
    (void)interfacesubclass;
    (void)interfaceprotocol;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1ParseDescriptors(JNIEnv* km_env, jclass km_clazz, jlong descriptorbuffer, jint totallength, jlong startposition, jint descriptortype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ParseDescriptors");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)descriptorbuffer, (uint32_t)totallength, (void*)(uintptr_t)startposition, (int32_t)descriptortype) : NULL;
#else
    (void)descriptorbuffer;
    (void)totallength;
    (void)startposition;
    (void)descriptortype;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1QueryDeviceInformation(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jint informationtype, jlong bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_QueryDeviceInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint32_t)informationtype, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)buffer) : -1;
#else
    (void)interfacehandle;
    (void)informationtype;
    (void)bufferlength;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1QueryInterfaceSettings(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte alternateinterfacenumber, jlong usbaltinterfacedescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_QueryInterfaceSettings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)alternateinterfacenumber, (void*)(uintptr_t)usbaltinterfacedescriptor) : -1;
#else
    (void)interfacehandle;
    (void)alternateinterfacenumber;
    (void)usbaltinterfacedescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1QueryPipe(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte alternateinterfacenumber, jbyte pipeindex, jlong pipeinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_QueryPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)alternateinterfacenumber, (uint8_t)pipeindex, (void*)(uintptr_t)pipeinformation) : -1;
#else
    (void)interfacehandle;
    (void)alternateinterfacenumber;
    (void)pipeindex;
    (void)pipeinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1QueryPipeEx(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte alternatesettingnumber, jbyte pipeindex, jlong pipeinformationex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_QueryPipeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)alternatesettingnumber, (uint8_t)pipeindex, (void*)(uintptr_t)pipeinformationex) : -1;
#else
    (void)interfacehandle;
    (void)alternatesettingnumber;
    (void)pipeindex;
    (void)pipeinformationex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1ReadIsochPipe(JNIEnv* km_env, jclass km_clazz, jlong bufferhandle, jint offset, jint length, jlong framenumber, jint numberofpackets, jlong isopacketdescriptors, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ReadIsochPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bufferhandle, (uint32_t)offset, (uint32_t)length, (void*)(uintptr_t)framenumber, (uint32_t)numberofpackets, (void*)(uintptr_t)isopacketdescriptors, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)framenumber;
    (void)numberofpackets;
    (void)isopacketdescriptors;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1ReadIsochPipeAsap(JNIEnv* km_env, jclass km_clazz, jlong bufferhandle, jint offset, jint length, jint continuestream, jint numberofpackets, jlong isopacketdescriptors, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ReadIsochPipeAsap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bufferhandle, (uint32_t)offset, (uint32_t)length, (int32_t)continuestream, (uint32_t)numberofpackets, (void*)(uintptr_t)isopacketdescriptors, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)continuestream;
    (void)numberofpackets;
    (void)isopacketdescriptors;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1ReadPipe(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte pipeid, jlong buffer, jint bufferlength, jlong lengthtransferred, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ReadPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)pipeid, (void*)(uintptr_t)buffer, (uint32_t)bufferlength, (void*)(uintptr_t)lengthtransferred, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)buffer;
    (void)bufferlength;
    (void)lengthtransferred;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1RegisterIsochBuffer(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte pipeid, jlong buffer, jint bufferlength, jlong isochbufferhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_RegisterIsochBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)pipeid, (void*)(uintptr_t)buffer, (uint32_t)bufferlength, (void*)(uintptr_t)isochbufferhandle) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)buffer;
    (void)bufferlength;
    (void)isochbufferhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1ResetPipe(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte pipeid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_ResetPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)pipeid) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1SetCurrentAlternateSetting(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte settingnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_SetCurrentAlternateSetting");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)settingnumber) : -1;
#else
    (void)interfacehandle;
    (void)settingnumber;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1SetPipePolicy(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte pipeid, jint policytype, jint valuelength, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_SetPipePolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)pipeid, (uint32_t)policytype, (uint32_t)valuelength, (void*)(uintptr_t)value) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)policytype;
    (void)valuelength;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1SetPowerPolicy(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jint policytype, jint valuelength, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_SetPowerPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint32_t)policytype, (uint32_t)valuelength, (void*)(uintptr_t)value) : -1;
#else
    (void)interfacehandle;
    (void)policytype;
    (void)valuelength;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1StartTrackingForTimeSync(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jlong starttrackinginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_StartTrackingForTimeSync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (void*)(uintptr_t)starttrackinginfo) : -1;
#else
    (void)interfacehandle;
    (void)starttrackinginfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1StopTrackingForTimeSync(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jlong stoptrackinginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_StopTrackingForTimeSync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (void*)(uintptr_t)stoptrackinginfo) : -1;
#else
    (void)interfacehandle;
    (void)stoptrackinginfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1UnregisterIsochBuffer(JNIEnv* km_env, jclass km_clazz, jlong isochbufferhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_UnregisterIsochBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)isochbufferhandle) : -1;
#else
    (void)isochbufferhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1WriteIsochPipe(JNIEnv* km_env, jclass km_clazz, jlong bufferhandle, jint offset, jint length, jlong framenumber, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_WriteIsochPipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bufferhandle, (uint32_t)offset, (uint32_t)length, (void*)(uintptr_t)framenumber, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)framenumber;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1WriteIsochPipeAsap(JNIEnv* km_env, jclass km_clazz, jlong bufferhandle, jint offset, jint length, jint continuestream, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_WriteIsochPipeAsap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bufferhandle, (uint32_t)offset, (uint32_t)length, (int32_t)continuestream, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)continuestream;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_usb_WindowsWin32DevicesUsbJniBridge_windowssys_1windows_1win32_1devices_1usb_1WinUsb_1WritePipe(JNIEnv* km_env, jclass km_clazz, jlong interfacehandle, jbyte pipeid, jlong buffer, jint bufferlength, jlong lengthtransferred, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinUsb_WritePipe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfacehandle, (uint8_t)pipeid, (void*)(uintptr_t)buffer, (uint32_t)bufferlength, (void*)(uintptr_t)lengthtransferred, (void*)(uintptr_t)overlapped) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)buffer;
    (void)bufferlength;
    (void)lengthtransferred;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

