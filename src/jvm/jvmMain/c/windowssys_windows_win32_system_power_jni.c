#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerCallNtPowerInformation(JNIEnv* km_env, jclass km_clazz, jint informationlevel, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNtPowerInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)informationlevel, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)informationlevel;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerCanUserWritePwrScheme(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CanUserWritePwrScheme");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerDeletePwrScheme(JNIEnv* km_env, jclass km_clazz, jint uiid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePwrScheme");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uiid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)uiid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerDevicePowerClose(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerClose");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerDevicePowerEnumDevices(JNIEnv* km_env, jclass km_clazz, jint queryindex, jint queryinterpretationflags, jint queryflags, jlong preturnbuffer, jlong pbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerEnumDevices");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)queryindex, (uint32_t)queryinterpretationflags, (uint32_t)queryflags, (void*)(uintptr_t)preturnbuffer, (void*)(uintptr_t)pbuffersize);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)queryindex;
    (void)queryinterpretationflags;
    (void)queryflags;
    (void)preturnbuffer;
    (void)pbuffersize;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerDevicePowerOpen(JNIEnv* km_env, jclass km_clazz, jint debugmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerOpen");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)debugmask);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)debugmask;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerDevicePowerSetDeviceState(JNIEnv* km_env, jclass km_clazz, jlong devicedescription, jint setflags, jlong setdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerSetDeviceState");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)devicedescription, (uint32_t)setflags, (void*)(uintptr_t)setdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)devicedescription;
    (void)setflags;
    (void)setdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerEnumPwrSchemes(JNIEnv* km_env, jclass km_clazz, jlong lpfn, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPwrSchemes");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfn, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)lpfn;
    (void)lparam;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerGetActivePwrScheme(JNIEnv* km_env, jclass km_clazz, jlong puiid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActivePwrScheme");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puiid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)puiid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerGetCurrentPowerPolicies(JNIEnv* km_env, jclass km_clazz, jlong pglobalpowerpolicy, jlong ppowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPowerPolicies");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pglobalpowerpolicy, (void*)(uintptr_t)ppowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerGetDevicePowerState(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong pfon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDevicePowerState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdevice, (void*)(uintptr_t)pfon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdevice;
    (void)pfon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerGetPwrCapabilities(JNIEnv* km_env, jclass km_clazz, jlong lpspc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPwrCapabilities");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpspc);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)lpspc;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange(JNIEnv* km_env, jclass km_clazz, jlong puimax, jlong puimin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPwrDiskSpindownRange");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puimax, (void*)(uintptr_t)puimin);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)puimax;
    (void)puimin;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerGetSystemPowerStatus(JNIEnv* km_env, jclass km_clazz, jlong lpsystempowerstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemPowerStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystempowerstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystempowerstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerIsAdminOverrideActive(JNIEnv* km_env, jclass km_clazz, jlong papp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsAdminOverrideActive");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)papp);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)papp;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerIsPwrHibernateAllowed(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsPwrHibernateAllowed");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerIsPwrShutdownAllowed(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsPwrShutdownAllowed");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerIsPwrSuspendAllowed(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsPwrSuspendAllowed");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerIsSystemResumeAutomatic(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsSystemResumeAutomatic");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme(JNIEnv* km_env, jclass km_clazz, jlong schemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCanRestoreIndividualDefaultPowerScheme");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)schemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)schemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerClearRequest(JNIEnv* km_env, jclass km_clazz, jlong powerrequest, jint requesttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerClearRequest");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)powerrequest, (int32_t)requesttype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)powerrequest;
    (void)requesttype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerCreatePossibleSetting(JNIEnv* km_env, jclass km_clazz, jlong rootsystempowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint possiblesettingindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCreatePossibleSetting");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootsystempowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)possiblesettingindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootsystempowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerCreateRequest(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCreateRequest");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)context;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerCreateSetting(JNIEnv* km_env, jclass km_clazz, jlong rootsystempowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCreateSetting");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootsystempowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootsystempowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerDeleteScheme(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDeleteScheme");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerDeterminePlatformRole(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDeterminePlatformRole");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(JNIEnv* km_env, jclass km_clazz, jint version) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDeterminePlatformRoleEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)version);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)version;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerDuplicateScheme(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong sourceschemeguid, jlong destinationschemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDuplicateScheme");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)sourceschemeguid, (void*)(uintptr_t)destinationschemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)sourceschemeguid;
    (void)destinationschemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerEnumerate(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jint accessflags, jint arg4Index, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerEnumerate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (int32_t)accessflags, (uint32_t)arg4Index, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)accessflags;
    (void)arg4Index;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerGetActiveScheme(JNIEnv* km_env, jclass km_clazz, jlong userrootpowerkey, jlong activepolicyguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerGetActiveScheme");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)userrootpowerkey, (void*)(uintptr_t)activepolicyguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)userrootpowerkey;
    (void)activepolicyguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerImportPowerScheme(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong importfilenamepath, jlong destinationschemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerImportPowerScheme");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)importfilenamepath, (void*)(uintptr_t)destinationschemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)importfilenamepath;
    (void)destinationschemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined(JNIEnv* km_env, jclass km_clazz, jlong subkeyguid, jlong settingguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerIsSettingRangeDefined");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subkeyguid, (void*)(uintptr_t)settingguid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)subkeyguid;
    (void)settingguid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey(JNIEnv* km_env, jclass km_clazz, jlong phsystempowerkey, jint access, jint openexisting) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerOpenSystemPowerKey");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phsystempowerkey, (uint32_t)access, (int32_t)openexisting);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phsystempowerkey;
    (void)access;
    (void)openexisting;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerOpenUserPowerKey(JNIEnv* km_env, jclass km_clazz, jlong phuserpowerkey, jint access, jint openexisting) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerOpenUserPowerKey");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phuserpowerkey, (uint32_t)access, (int32_t)openexisting);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phuserpowerkey;
    (void)access;
    (void)openexisting;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadACDefaultIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemepersonalityguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong acdefaultindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadACDefaultIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemepersonalityguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)acdefaultindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acdefaultindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadACValue(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong type, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadACValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)type, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadACValueIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong acvalueindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadACValueIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)acvalueindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acvalueindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemepersonalityguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong dcdefaultindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDCDefaultIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemepersonalityguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)dcdefaultindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcdefaultindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadDCValue(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong type, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDCValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)type, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadDCValueIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong dcvalueindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDCValueIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)dcvalueindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcvalueindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadDescription(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDescription");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadFriendlyName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadIconResourceSpecifier");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadPossibleDescription(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint possiblesettingindex, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadPossibleDescription");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint possiblesettingindex, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadPossibleFriendlyName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadPossibleValue(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong type, jint possiblesettingindex, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadPossibleValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)type, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadSettingAttributes(JNIEnv* km_env, jclass km_clazz, jlong subgroupguid, jlong powersettingguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadSettingAttributes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subgroupguid, (void*)(uintptr_t)powersettingguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)subgroupguid;
    (void)powersettingguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadValueIncrement(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong valueincrement) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueIncrement");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)valueincrement);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueincrement;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadValueMax(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong valuemaximum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueMax");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)valuemaximum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valuemaximum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadValueMin(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong valueminimum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueMin");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)valueminimum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueminimum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueUnitsSpecifier");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications(JNIEnv* km_env, jclass km_clazz, jint version, jlong callback, jlong context, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRegisterForEffectivePowerModeNotifications");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)version, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)version;
    (void)callback;
    (void)context;
    (void)registrationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification(JNIEnv* km_env, jclass km_clazz, jint flags, jlong recipient, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRegisterSuspendResumeNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)recipient, (void*)(uintptr_t)registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)recipient;
    (void)registrationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerRemovePowerSetting(JNIEnv* km_env, jclass km_clazz, jlong powersettingsubkeyguid, jlong powersettingguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRemovePowerSetting");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)powersettingsubkeyguid, (void*)(uintptr_t)powersettingguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)powersettingsubkeyguid;
    (void)powersettingguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReplaceDefaultPowerSchemes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerReportThermalEvent(JNIEnv* km_env, jclass km_clazz, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReportThermalEvent");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)event);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)event;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRestoreDefaultPowerSchemes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme(JNIEnv* km_env, jclass km_clazz, jlong schemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRestoreIndividualDefaultPowerScheme");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)schemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)schemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerSetActiveScheme(JNIEnv* km_env, jclass km_clazz, jlong userrootpowerkey, jlong schemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSetActiveScheme");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)userrootpowerkey, (void*)(uintptr_t)schemeguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)userrootpowerkey;
    (void)schemeguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerSetRequest(JNIEnv* km_env, jclass km_clazz, jlong powerrequest, jint requesttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSetRequest");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)powerrequest, (int32_t)requesttype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)powerrequest;
    (void)requesttype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerSettingAccessCheck(JNIEnv* km_env, jclass km_clazz, jint accessflags, jlong powerguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingAccessCheck");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)accessflags, (void*)(uintptr_t)powerguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)accessflags;
    (void)powerguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx(JNIEnv* km_env, jclass km_clazz, jint accessflags, jlong powerguid, jint accesstype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingAccessCheckEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)accessflags, (void*)(uintptr_t)powerguid, (uint32_t)accesstype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)accessflags;
    (void)powerguid;
    (void)accesstype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerSettingRegisterNotification(JNIEnv* km_env, jclass km_clazz, jlong settingguid, jint flags, jlong recipient, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingRegisterNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)settingguid, (uint32_t)flags, (void*)(uintptr_t)recipient, (void*)(uintptr_t)registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)settingguid;
    (void)flags;
    (void)recipient;
    (void)registrationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(JNIEnv* km_env, jclass km_clazz, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingUnregisterNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)registrationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications(JNIEnv* km_env, jclass km_clazz, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerUnregisterFromEffectivePowerModeNotifications");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)registrationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(JNIEnv* km_env, jclass km_clazz, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerUnregisterSuspendResumeNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)registrationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)registrationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex(JNIEnv* km_env, jclass km_clazz, jlong rootsystempowerkey, jlong schemepersonalityguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint defaultacindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteACDefaultIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootsystempowerkey, (void*)(uintptr_t)schemepersonalityguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)defaultacindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootsystempowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)defaultacindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteACValueIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint acvalueindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteACValueIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)acvalueindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acvalueindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex(JNIEnv* km_env, jclass km_clazz, jlong rootsystempowerkey, jlong schemepersonalityguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint defaultdcindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteDCDefaultIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootsystempowerkey, (void*)(uintptr_t)schemepersonalityguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)defaultdcindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootsystempowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)defaultdcindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteDCValueIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint dcvalueindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteDCValueIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)dcvalueindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcvalueindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteDescription(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteDescription");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteFriendlyName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteIconResourceSpecifier");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWritePossibleDescription(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint possiblesettingindex, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWritePossibleDescription");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint possiblesettingindex, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWritePossibleFriendlyName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWritePossibleValue(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint type, jint possiblesettingindex, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWritePossibleValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)type, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteSettingAttributes(JNIEnv* km_env, jclass km_clazz, jlong subgroupguid, jlong powersettingguid, jint attributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteSettingAttributes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subgroupguid, (void*)(uintptr_t)powersettingguid, (uint32_t)attributes);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)subgroupguid;
    (void)powersettingguid;
    (void)attributes;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteValueIncrement(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint valueincrement) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueIncrement");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)valueincrement);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueincrement;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteValueMax(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint valuemaximum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueMax");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)valuemaximum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valuemaximum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteValueMin(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint valueminimum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueMin");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)valueminimum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueminimum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueUnitsSpecifier");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerReadGlobalPwrPolicy(JNIEnv* km_env, jclass km_clazz, jlong pglobalpowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGlobalPwrPolicy");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pglobalpowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pglobalpowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerReadProcessorPwrScheme(JNIEnv* km_env, jclass km_clazz, jint uiid, jlong pmachineprocessorpowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadProcessorPwrScheme");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uiid, (void*)(uintptr_t)pmachineprocessorpowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)uiid;
    (void)pmachineprocessorpowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerReadPwrScheme(JNIEnv* km_env, jclass km_clazz, jint uiid, jlong ppowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadPwrScheme");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uiid, (void*)(uintptr_t)ppowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)uiid;
    (void)ppowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerRegisterPowerSettingNotification(JNIEnv* km_env, jclass km_clazz, jlong hrecipient, jlong powersettingguid, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterPowerSettingNotification");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrecipient, (void*)(uintptr_t)powersettingguid, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrecipient;
    (void)powersettingguid;
    (void)flags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification(JNIEnv* km_env, jclass km_clazz, jlong hrecipient, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterSuspendResumeNotification");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrecipient, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrecipient;
    (void)flags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerRequestWakeupLatency(JNIEnv* km_env, jclass km_clazz, jint latency) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RequestWakeupLatency");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)latency);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)latency;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerSetActivePwrScheme(JNIEnv* km_env, jclass km_clazz, jint uiid, jlong pglobalpowerpolicy, jlong ppowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetActivePwrScheme");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uiid, (void*)(uintptr_t)pglobalpowerpolicy, (void*)(uintptr_t)ppowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)uiid;
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerSetSuspendState(JNIEnv* km_env, jclass km_clazz, jboolean bhibernate, jboolean bforce, jboolean bwakeupeventsdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSuspendState");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((bool)bhibernate, (bool)bforce, (bool)bwakeupeventsdisabled);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)bhibernate;
    (void)bforce;
    (void)bwakeupeventsdisabled;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerSetSystemPowerState(JNIEnv* km_env, jclass km_clazz, jint fsuspend, jint fforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemPowerState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fsuspend, (int32_t)fforce);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fsuspend;
    (void)fforce;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerSetThreadExecutionState(JNIEnv* km_env, jclass km_clazz, jint esflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadExecutionState");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)esflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)esflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterPowerSettingNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterSuspendResumeNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerValidatePowerPolicies(JNIEnv* km_env, jclass km_clazz, jlong pglobalpowerpolicy, jlong ppowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidatePowerPolicies");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pglobalpowerpolicy, (void*)(uintptr_t)ppowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy(JNIEnv* km_env, jclass km_clazz, jlong pglobalpowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteGlobalPwrPolicy");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pglobalpowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pglobalpowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerWriteProcessorPwrScheme(JNIEnv* km_env, jclass km_clazz, jint uiid, jlong pmachineprocessorpowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProcessorPwrScheme");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uiid, (void*)(uintptr_t)pmachineprocessorpowerpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)uiid;
    (void)pmachineprocessorpowerpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssysWindowsWin32SystemPowerWritePwrScheme(JNIEnv* km_env, jclass km_clazz, jlong puiid, jlong lpszschemename, jlong lpszdescription, jlong lpscheme) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePwrScheme");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puiid, (void*)(uintptr_t)lpszschemename, (void*)(uintptr_t)lpszdescription, (void*)(uintptr_t)lpscheme);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)puiid;
    (void)lpszschemename;
    (void)lpszdescription;
    (void)lpscheme;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

