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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothAuthenticateDevice(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong hradio, jlong pbtbi, jlong pszpasskey, jint ulpasskeylength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothAuthenticateDevice");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hradio, (void*)(uintptr_t)pbtbi, (void*)(uintptr_t)pszpasskey, (uint32_t)ulpasskeylength) : 0;
#else
    (void)hwndparent;
    (void)hradio;
    (void)pbtbi;
    (void)pszpasskey;
    (void)ulpasskeylength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothAuthenticateDeviceEx(JNIEnv* km_env, jclass km_clazz, jlong hwndparentin, jlong hradioin, jlong pbtdiinout, jlong pbtoobdata, jint authenticationrequirement) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothAuthenticateDeviceEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparentin, (void*)(uintptr_t)hradioin, (void*)(uintptr_t)pbtdiinout, (void*)(uintptr_t)pbtoobdata, (int32_t)authenticationrequirement) : 0;
#else
    (void)hwndparentin;
    (void)hradioin;
    (void)pbtdiinout;
    (void)pbtoobdata;
    (void)authenticationrequirement;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothAuthenticateMultipleDevices(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong hradio, jint cdevices, jlong rgbtdi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothAuthenticateMultipleDevices");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hradio, (uint32_t)cdevices, (void*)(uintptr_t)rgbtdi) : 0;
#else
    (void)hwndparent;
    (void)hradio;
    (void)cdevices;
    (void)rgbtdi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothDisplayDeviceProperties(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong pbtdi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothDisplayDeviceProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)pbtdi) : -1;
#else
    (void)hwndparent;
    (void)pbtdi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothEnableDiscovery(JNIEnv* km_env, jclass km_clazz, jlong hradio, jint fenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothEnableDiscovery");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradio, (int32_t)fenabled) : -1;
#else
    (void)hradio;
    (void)fenabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothEnableIncomingConnections(JNIEnv* km_env, jclass km_clazz, jlong hradio, jint fenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothEnableIncomingConnections");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradio, (int32_t)fenabled) : -1;
#else
    (void)hradio;
    (void)fenabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothEnumerateInstalledServices(JNIEnv* km_env, jclass km_clazz, jlong hradio, jlong pbtdi, jlong pcserviceinout, jlong pguidservices) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothEnumerateInstalledServices");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradio, (void*)(uintptr_t)pbtdi, (void*)(uintptr_t)pcserviceinout, (void*)(uintptr_t)pguidservices) : 0;
#else
    (void)hradio;
    (void)pbtdi;
    (void)pcserviceinout;
    (void)pguidservices;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothFindDeviceClose(JNIEnv* km_env, jclass km_clazz, jlong hfind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindDeviceClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfind) : -1;
#else
    (void)hfind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothFindFirstDevice(JNIEnv* km_env, jclass km_clazz, jlong pbtsp, jlong pbtdi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindFirstDevice");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbtsp, (void*)(uintptr_t)pbtdi) : NULL;
#else
    (void)pbtsp;
    (void)pbtdi;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothFindFirstRadio(JNIEnv* km_env, jclass km_clazz, jlong pbtfrp, jlong phradio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindFirstRadio");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbtfrp, (void*)(uintptr_t)phradio) : NULL;
#else
    (void)pbtfrp;
    (void)phradio;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothFindNextDevice(JNIEnv* km_env, jclass km_clazz, jlong hfind, jlong pbtdi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindNextDevice");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfind, (void*)(uintptr_t)pbtdi) : -1;
#else
    (void)hfind;
    (void)pbtdi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothFindNextRadio(JNIEnv* km_env, jclass km_clazz, jlong hfind, jlong phradio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindNextRadio");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfind, (void*)(uintptr_t)phradio) : -1;
#else
    (void)hfind;
    (void)phradio;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothFindRadioClose(JNIEnv* km_env, jclass km_clazz, jlong hfind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothFindRadioClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfind) : -1;
#else
    (void)hfind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTAbortReliableWrite(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong reliablewritecontext, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTAbortReliableWrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint64_t)reliablewritecontext, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)reliablewritecontext;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTBeginReliableWrite(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong reliablewritecontext, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTBeginReliableWrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (void*)(uintptr_t)reliablewritecontext, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)reliablewritecontext;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTEndReliableWrite(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong reliablewritecontext, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTEndReliableWrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint64_t)reliablewritecontext, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)reliablewritecontext;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTGetCharacteristicValue(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong characteristic, jint characteristicvaluedatasize, jlong characteristicvalue, jlong characteristicvaluesizerequired, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetCharacteristicValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (void*)(uintptr_t)characteristic, (uint32_t)characteristicvaluedatasize, (void*)(uintptr_t)characteristicvalue, (void*)(uintptr_t)characteristicvaluesizerequired, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)characteristic;
    (void)characteristicvaluedatasize;
    (void)characteristicvalue;
    (void)characteristicvaluesizerequired;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTGetCharacteristics(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong service, jshort characteristicsbuffercount, jlong characteristicsbuffer, jlong characteristicsbufferactual, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetCharacteristics");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (void*)(uintptr_t)service, (uint16_t)characteristicsbuffercount, (void*)(uintptr_t)characteristicsbuffer, (void*)(uintptr_t)characteristicsbufferactual, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)service;
    (void)characteristicsbuffercount;
    (void)characteristicsbuffer;
    (void)characteristicsbufferactual;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTGetDescriptorValue(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong descriptor, jint descriptorvaluedatasize, jlong descriptorvalue, jlong descriptorvaluesizerequired, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetDescriptorValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (void*)(uintptr_t)descriptor, (uint32_t)descriptorvaluedatasize, (void*)(uintptr_t)descriptorvalue, (void*)(uintptr_t)descriptorvaluesizerequired, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)descriptor;
    (void)descriptorvaluedatasize;
    (void)descriptorvalue;
    (void)descriptorvaluesizerequired;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTGetDescriptors(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong characteristic, jshort descriptorsbuffercount, jlong descriptorsbuffer, jlong descriptorsbufferactual, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetDescriptors");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (void*)(uintptr_t)characteristic, (uint16_t)descriptorsbuffercount, (void*)(uintptr_t)descriptorsbuffer, (void*)(uintptr_t)descriptorsbufferactual, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)characteristic;
    (void)descriptorsbuffercount;
    (void)descriptorsbuffer;
    (void)descriptorsbufferactual;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTGetIncludedServices(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong parentservice, jshort includedservicesbuffercount, jlong includedservicesbuffer, jlong includedservicesbufferactual, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetIncludedServices");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (void*)(uintptr_t)parentservice, (uint16_t)includedservicesbuffercount, (void*)(uintptr_t)includedservicesbuffer, (void*)(uintptr_t)includedservicesbufferactual, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)parentservice;
    (void)includedservicesbuffercount;
    (void)includedservicesbuffer;
    (void)includedservicesbufferactual;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTGetServices(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jshort servicesbuffercount, jlong servicesbuffer, jlong servicesbufferactual, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTGetServices");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint16_t)servicesbuffercount, (void*)(uintptr_t)servicesbuffer, (void*)(uintptr_t)servicesbufferactual, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)servicesbuffercount;
    (void)servicesbuffer;
    (void)servicesbufferactual;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTRegisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint eventtype, jlong eventparameterin, jlong callback, jlong callbackcontext, jlong peventhandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTRegisterEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (int32_t)eventtype, (void*)(uintptr_t)eventparameterin, (void*)(uintptr_t)callback, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)peventhandle, (uint32_t)flags) : -1;
#else
    (void)hservice;
    (void)eventtype;
    (void)eventparameterin;
    (void)callback;
    (void)callbackcontext;
    (void)peventhandle;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTSetCharacteristicValue(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong characteristic, jlong characteristicvalue, jlong reliablewritecontext, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTSetCharacteristicValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (void*)(uintptr_t)characteristic, (void*)(uintptr_t)characteristicvalue, (uint64_t)reliablewritecontext, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)characteristic;
    (void)characteristicvalue;
    (void)reliablewritecontext;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTSetDescriptorValue(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong descriptor, jlong descriptorvalue, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTSetDescriptorValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (void*)(uintptr_t)descriptor, (void*)(uintptr_t)descriptorvalue, (uint32_t)flags) : -1;
#else
    (void)hdevice;
    (void)descriptor;
    (void)descriptorvalue;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGATTUnregisterEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGATTUnregisterEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)eventhandle, (uint32_t)flags) : -1;
#else
    (void)eventhandle;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGetDeviceInfo(JNIEnv* km_env, jclass km_clazz, jlong hradio, jlong pbtdi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGetDeviceInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradio, (void*)(uintptr_t)pbtdi) : 0;
#else
    (void)hradio;
    (void)pbtdi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothGetRadioInfo(JNIEnv* km_env, jclass km_clazz, jlong hradio, jlong pradioinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothGetRadioInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradio, (void*)(uintptr_t)pradioinfo) : 0;
#else
    (void)hradio;
    (void)pradioinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothIsConnectable(JNIEnv* km_env, jclass km_clazz, jlong hradio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothIsConnectable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradio) : -1;
#else
    (void)hradio;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothIsDiscoverable(JNIEnv* km_env, jclass km_clazz, jlong hradio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothIsDiscoverable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradio) : -1;
#else
    (void)hradio;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothIsVersionAvailable(JNIEnv* km_env, jclass km_clazz, jbyte majorversion, jbyte minorversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothIsVersionAvailable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint8_t)majorversion, (uint8_t)minorversion) : -1;
#else
    (void)majorversion;
    (void)minorversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothRegisterForAuthentication(JNIEnv* km_env, jclass km_clazz, jlong pbtdi, jlong phreghandle, jlong pfncallback, jlong pvparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothRegisterForAuthentication");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbtdi, (void*)(uintptr_t)phreghandle, (void*)(uintptr_t)pfncallback, (void*)(uintptr_t)pvparam) : 0;
#else
    (void)pbtdi;
    (void)phreghandle;
    (void)pfncallback;
    (void)pvparam;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothRegisterForAuthenticationEx(JNIEnv* km_env, jclass km_clazz, jlong pbtdiin, jlong phreghandleout, jlong pfncallbackin, jlong pvparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothRegisterForAuthenticationEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbtdiin, (void*)(uintptr_t)phreghandleout, (void*)(uintptr_t)pfncallbackin, (void*)(uintptr_t)pvparam) : 0;
#else
    (void)pbtdiin;
    (void)phreghandleout;
    (void)pfncallbackin;
    (void)pvparam;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothRemoveDevice(JNIEnv* km_env, jclass km_clazz, jlong paddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothRemoveDevice");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)paddress) : 0;
#else
    (void)paddress;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSdpEnumAttributes(JNIEnv* km_env, jclass km_clazz, jlong psdpstream, jint cbstreamsize, jlong pfncallback, jlong pvparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSdpEnumAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psdpstream, (uint32_t)cbstreamsize, (void*)(uintptr_t)pfncallback, (void*)(uintptr_t)pvparam) : -1;
#else
    (void)psdpstream;
    (void)cbstreamsize;
    (void)pfncallback;
    (void)pvparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSdpGetAttributeValue(JNIEnv* km_env, jclass km_clazz, jlong precordstream, jint cbrecordlength, jshort usattributeid, jlong pattributedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSdpGetAttributeValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)precordstream, (uint32_t)cbrecordlength, (uint16_t)usattributeid, (void*)(uintptr_t)pattributedata) : 0;
#else
    (void)precordstream;
    (void)cbrecordlength;
    (void)usattributeid;
    (void)pattributedata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSdpGetContainerElementData(JNIEnv* km_env, jclass km_clazz, jlong pcontainerstream, jint cbcontainerlength, jlong pelement, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSdpGetContainerElementData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcontainerstream, (uint32_t)cbcontainerlength, (void*)(uintptr_t)pelement, (void*)(uintptr_t)pdata) : 0;
#else
    (void)pcontainerstream;
    (void)cbcontainerlength;
    (void)pelement;
    (void)pdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSdpGetElementData(JNIEnv* km_env, jclass km_clazz, jlong psdpstream, jint cbsdpstreamlength, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSdpGetElementData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psdpstream, (uint32_t)cbsdpstreamlength, (void*)(uintptr_t)pdata) : 0;
#else
    (void)psdpstream;
    (void)cbsdpstreamlength;
    (void)pdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSdpGetString(JNIEnv* km_env, jclass km_clazz, jlong precordstream, jint cbrecordlength, jlong pstringdata, jshort usstringoffset, jlong pszstring, jlong pcchstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSdpGetString");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)precordstream, (uint32_t)cbrecordlength, (void*)(uintptr_t)pstringdata, (uint16_t)usstringoffset, (void*)(uintptr_t)pszstring, (void*)(uintptr_t)pcchstringlength) : 0;
#else
    (void)precordstream;
    (void)cbrecordlength;
    (void)pstringdata;
    (void)usstringoffset;
    (void)pszstring;
    (void)pcchstringlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSelectDevices(JNIEnv* km_env, jclass km_clazz, jlong pbtsdp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSelectDevices");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbtsdp) : -1;
#else
    (void)pbtsdp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSelectDevicesFree(JNIEnv* km_env, jclass km_clazz, jlong pbtsdp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bthprops.cpl");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSelectDevicesFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbtsdp) : -1;
#else
    (void)pbtsdp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSendAuthenticationResponse(JNIEnv* km_env, jclass km_clazz, jlong hradio, jlong pbtdi, jlong pszpasskey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSendAuthenticationResponse");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradio, (void*)(uintptr_t)pbtdi, (void*)(uintptr_t)pszpasskey) : 0;
#else
    (void)hradio;
    (void)pbtdi;
    (void)pszpasskey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSendAuthenticationResponseEx(JNIEnv* km_env, jclass km_clazz, jlong hradioin, jlong pauthresponse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSendAuthenticationResponseEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradioin, (void*)(uintptr_t)pauthresponse) : 0;
#else
    (void)hradioin;
    (void)pauthresponse;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSetLocalServiceInfo(JNIEnv* km_env, jclass km_clazz, jlong hradioin, jlong pclassguid, jint ulinstance, jlong pserviceinfoin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSetLocalServiceInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradioin, (void*)(uintptr_t)pclassguid, (uint32_t)ulinstance, (void*)(uintptr_t)pserviceinfoin) : 0;
#else
    (void)hradioin;
    (void)pclassguid;
    (void)ulinstance;
    (void)pserviceinfoin;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothSetServiceState(JNIEnv* km_env, jclass km_clazz, jlong hradio, jlong pbtdi, jlong pguidservice, jint dwserviceflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothSetServiceState");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hradio, (void*)(uintptr_t)pbtdi, (void*)(uintptr_t)pguidservice, (uint32_t)dwserviceflags) : 0;
#else
    (void)hradio;
    (void)pbtdi;
    (void)pguidservice;
    (void)dwserviceflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothUnregisterAuthentication(JNIEnv* km_env, jclass km_clazz, jlong hreghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothUnregisterAuthentication");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hreghandle) : -1;
#else
    (void)hreghandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_bluetooth_WindowsWin32DevicesBluetoothJniBridge_windowssys_1windows_1win32_1devices_1bluetooth_1bluetoothUpdateDeviceRecord(JNIEnv* km_env, jclass km_clazz, jlong pbtdi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bluetoothapis.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BluetoothUpdateDeviceRecord");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbtdi) : 0;
#else
    (void)pbtdi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

