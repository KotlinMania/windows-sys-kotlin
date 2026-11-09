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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1CallNtPowerInformation(JNIEnv* km_env, jclass km_clazz, jint informationlevel, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNtPowerInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)informationlevel, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength) : -1;
#else
    (void)informationlevel;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1CanUserWritePwrScheme(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CanUserWritePwrScheme");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1DeletePwrScheme(JNIEnv* km_env, jclass km_clazz, jint uiid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePwrScheme");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uiid) : false;
#else
    (void)uiid;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1DevicePowerClose(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerClose");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1DevicePowerEnumDevices(JNIEnv* km_env, jclass km_clazz, jint queryindex, jint queryinterpretationflags, jint queryflags, jlong preturnbuffer, jlong pbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerEnumDevices");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)queryindex, (uint32_t)queryinterpretationflags, (uint32_t)queryflags, (void*)(uintptr_t)preturnbuffer, (void*)(uintptr_t)pbuffersize) : false;
#else
    (void)queryindex;
    (void)queryinterpretationflags;
    (void)queryflags;
    (void)preturnbuffer;
    (void)pbuffersize;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1DevicePowerOpen(JNIEnv* km_env, jclass km_clazz, jint debugmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerOpen");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)debugmask) : false;
#else
    (void)debugmask;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1DevicePowerSetDeviceState(JNIEnv* km_env, jclass km_clazz, jlong devicedescription, jint setflags, jlong setdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerSetDeviceState");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)devicedescription, (uint32_t)setflags, (void*)(uintptr_t)setdata) : 0;
#else
    (void)devicedescription;
    (void)setflags;
    (void)setdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1EnumPwrSchemes(JNIEnv* km_env, jclass km_clazz, jlong lpfn, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPwrSchemes");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfn, (int64_t)lparam) : false;
#else
    (void)lpfn;
    (void)lparam;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1GetActivePwrScheme(JNIEnv* km_env, jclass km_clazz, jlong puiid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActivePwrScheme");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puiid) : false;
#else
    (void)puiid;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1GetCurrentPowerPolicies(JNIEnv* km_env, jclass km_clazz, jlong pglobalpowerpolicy, jlong ppowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPowerPolicies");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pglobalpowerpolicy, (void*)(uintptr_t)ppowerpolicy) : false;
#else
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1GetDevicePowerState(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jlong pfon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDevicePowerState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (void*)(uintptr_t)pfon) : -1;
#else
    (void)hdevice;
    (void)pfon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1GetPwrCapabilities(JNIEnv* km_env, jclass km_clazz, jlong lpspc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPwrCapabilities");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpspc) : false;
#else
    (void)lpspc;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1GetPwrDiskSpindownRange(JNIEnv* km_env, jclass km_clazz, jlong puimax, jlong puimin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPwrDiskSpindownRange");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puimax, (void*)(uintptr_t)puimin) : false;
#else
    (void)puimax;
    (void)puimin;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1GetSystemPowerStatus(JNIEnv* km_env, jclass km_clazz, jlong lpsystempowerstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemPowerStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystempowerstatus) : -1;
#else
    (void)lpsystempowerstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1IsAdminOverrideActive(JNIEnv* km_env, jclass km_clazz, jlong papp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsAdminOverrideActive");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)papp) : false;
#else
    (void)papp;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1IsPwrHibernateAllowed(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsPwrHibernateAllowed");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1IsPwrShutdownAllowed(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsPwrShutdownAllowed");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1IsPwrSuspendAllowed(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsPwrSuspendAllowed");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1IsSystemResumeAutomatic(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsSystemResumeAutomatic");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerCanRestoreIndividualDefaultPowerScheme(JNIEnv* km_env, jclass km_clazz, jlong schemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCanRestoreIndividualDefaultPowerScheme");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)schemeguid) : 0;
#else
    (void)schemeguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerClearRequest(JNIEnv* km_env, jclass km_clazz, jlong powerrequest, jint requesttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerClearRequest");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)powerrequest, (int32_t)requesttype) : -1;
#else
    (void)powerrequest;
    (void)requesttype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerCreatePossibleSetting(JNIEnv* km_env, jclass km_clazz, jlong rootsystempowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint possiblesettingindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCreatePossibleSetting");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootsystempowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)possiblesettingindex) : 0;
#else
    (void)rootsystempowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerCreateRequest(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCreateRequest");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context) : NULL;
#else
    (void)context;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerCreateSetting(JNIEnv* km_env, jclass km_clazz, jlong rootsystempowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCreateSetting");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootsystempowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid) : 0;
#else
    (void)rootsystempowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerDeleteScheme(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDeleteScheme");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerDeterminePlatformRole(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDeterminePlatformRole");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerDeterminePlatformRoleEx(JNIEnv* km_env, jclass km_clazz, jint version) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDeterminePlatformRoleEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)version) : -1;
#else
    (void)version;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerDuplicateScheme(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong sourceschemeguid, jlong destinationschemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDuplicateScheme");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)sourceschemeguid, (void*)(uintptr_t)destinationschemeguid) : 0;
#else
    (void)rootpowerkey;
    (void)sourceschemeguid;
    (void)destinationschemeguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerEnumerate(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jint accessflags, jint arg_4_index, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerEnumerate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (int32_t)accessflags, (uint32_t)arg_4_index, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)accessflags;
    (void)arg_4_index;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerGetActiveScheme(JNIEnv* km_env, jclass km_clazz, jlong userrootpowerkey, jlong activepolicyguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerGetActiveScheme");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)userrootpowerkey, (void*)(uintptr_t)activepolicyguid) : 0;
#else
    (void)userrootpowerkey;
    (void)activepolicyguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerImportPowerScheme(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong importfilenamepath, jlong destinationschemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerImportPowerScheme");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)importfilenamepath, (void*)(uintptr_t)destinationschemeguid) : 0;
#else
    (void)rootpowerkey;
    (void)importfilenamepath;
    (void)destinationschemeguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerIsSettingRangeDefined(JNIEnv* km_env, jclass km_clazz, jlong subkeyguid, jlong settingguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerIsSettingRangeDefined");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subkeyguid, (void*)(uintptr_t)settingguid) : false;
#else
    (void)subkeyguid;
    (void)settingguid;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerOpenSystemPowerKey(JNIEnv* km_env, jclass km_clazz, jlong phsystempowerkey, jint access, jint openexisting) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerOpenSystemPowerKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phsystempowerkey, (uint32_t)access, (int32_t)openexisting) : 0;
#else
    (void)phsystempowerkey;
    (void)access;
    (void)openexisting;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerOpenUserPowerKey(JNIEnv* km_env, jclass km_clazz, jlong phuserpowerkey, jint access, jint openexisting) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerOpenUserPowerKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phuserpowerkey, (uint32_t)access, (int32_t)openexisting) : 0;
#else
    (void)phuserpowerkey;
    (void)access;
    (void)openexisting;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadACDefaultIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemepersonalityguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong acdefaultindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadACDefaultIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemepersonalityguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)acdefaultindex) : 0;
#else
    (void)rootpowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acdefaultindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadACValue(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong type, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadACValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)type, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadACValueIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong acvalueindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadACValueIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)acvalueindex) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acvalueindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadDCDefaultIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemepersonalityguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong dcdefaultindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDCDefaultIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemepersonalityguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)dcdefaultindex) : 0;
#else
    (void)rootpowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcdefaultindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadDCValue(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong type, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDCValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)type, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadDCValueIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong dcvalueindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDCValueIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)dcvalueindex) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcvalueindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadDescription(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDescription");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadFriendlyName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadIconResourceSpecifier(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadIconResourceSpecifier");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadPossibleDescription(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint possiblesettingindex, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadPossibleDescription");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadPossibleFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint possiblesettingindex, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadPossibleFriendlyName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadPossibleValue(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong type, jint possiblesettingindex, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadPossibleValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)type, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadSettingAttributes(JNIEnv* km_env, jclass km_clazz, jlong subgroupguid, jlong powersettingguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadSettingAttributes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subgroupguid, (void*)(uintptr_t)powersettingguid) : 0;
#else
    (void)subgroupguid;
    (void)powersettingguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadValueIncrement(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong valueincrement) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueIncrement");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)valueincrement) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueincrement;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadValueMax(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong valuemaximum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueMax");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)valuemaximum) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valuemaximum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadValueMin(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong valueminimum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueMin");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)valueminimum) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueminimum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReadValueUnitsSpecifier(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueUnitsSpecifier");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerRegisterForEffectivePowerModeNotifications(JNIEnv* km_env, jclass km_clazz, jint version, jlong callback, jlong context, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRegisterForEffectivePowerModeNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)version, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)registrationhandle) : -1;
#else
    (void)version;
    (void)callback;
    (void)context;
    (void)registrationhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerRegisterSuspendResumeNotification(JNIEnv* km_env, jclass km_clazz, jint flags, jlong recipient, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRegisterSuspendResumeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)recipient, (void*)(uintptr_t)registrationhandle) : 0;
#else
    (void)flags;
    (void)recipient;
    (void)registrationhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerRemovePowerSetting(JNIEnv* km_env, jclass km_clazz, jlong powersettingsubkeyguid, jlong powersettingguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRemovePowerSetting");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)powersettingsubkeyguid, (void*)(uintptr_t)powersettingguid) : 0;
#else
    (void)powersettingsubkeyguid;
    (void)powersettingguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReplaceDefaultPowerSchemes(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReplaceDefaultPowerSchemes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerReportThermalEvent(JNIEnv* km_env, jclass km_clazz, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReportThermalEvent");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)event) : 0;
#else
    (void)event;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerRestoreDefaultPowerSchemes(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRestoreDefaultPowerSchemes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerRestoreIndividualDefaultPowerScheme(JNIEnv* km_env, jclass km_clazz, jlong schemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRestoreIndividualDefaultPowerScheme");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)schemeguid) : 0;
#else
    (void)schemeguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerSetActiveScheme(JNIEnv* km_env, jclass km_clazz, jlong userrootpowerkey, jlong schemeguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSetActiveScheme");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)userrootpowerkey, (void*)(uintptr_t)schemeguid) : 0;
#else
    (void)userrootpowerkey;
    (void)schemeguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerSetRequest(JNIEnv* km_env, jclass km_clazz, jlong powerrequest, jint requesttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSetRequest");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)powerrequest, (int32_t)requesttype) : -1;
#else
    (void)powerrequest;
    (void)requesttype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerSettingAccessCheck(JNIEnv* km_env, jclass km_clazz, jint accessflags, jlong powerguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingAccessCheck");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)accessflags, (void*)(uintptr_t)powerguid) : 0;
#else
    (void)accessflags;
    (void)powerguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerSettingAccessCheckEx(JNIEnv* km_env, jclass km_clazz, jint accessflags, jlong powerguid, jint accesstype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingAccessCheckEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)accessflags, (void*)(uintptr_t)powerguid, (uint32_t)accesstype) : 0;
#else
    (void)accessflags;
    (void)powerguid;
    (void)accesstype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerSettingRegisterNotification(JNIEnv* km_env, jclass km_clazz, jlong settingguid, jint flags, jlong recipient, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingRegisterNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)settingguid, (uint32_t)flags, (void*)(uintptr_t)recipient, (void*)(uintptr_t)registrationhandle) : 0;
#else
    (void)settingguid;
    (void)flags;
    (void)recipient;
    (void)registrationhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerSettingUnregisterNotification(JNIEnv* km_env, jclass km_clazz, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingUnregisterNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)registrationhandle) : 0;
#else
    (void)registrationhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerUnregisterFromEffectivePowerModeNotifications(JNIEnv* km_env, jclass km_clazz, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerUnregisterFromEffectivePowerModeNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)registrationhandle) : -1;
#else
    (void)registrationhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerUnregisterSuspendResumeNotification(JNIEnv* km_env, jclass km_clazz, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerUnregisterSuspendResumeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)registrationhandle) : 0;
#else
    (void)registrationhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteACDefaultIndex(JNIEnv* km_env, jclass km_clazz, jlong rootsystempowerkey, jlong schemepersonalityguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint defaultacindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteACDefaultIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootsystempowerkey, (void*)(uintptr_t)schemepersonalityguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)defaultacindex) : 0;
#else
    (void)rootsystempowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)defaultacindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteACValueIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint acvalueindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteACValueIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)acvalueindex) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acvalueindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteDCDefaultIndex(JNIEnv* km_env, jclass km_clazz, jlong rootsystempowerkey, jlong schemepersonalityguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint defaultdcindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteDCDefaultIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootsystempowerkey, (void*)(uintptr_t)schemepersonalityguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)defaultdcindex) : 0;
#else
    (void)rootsystempowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)defaultdcindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteDCValueIndex(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint dcvalueindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteDCValueIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)dcvalueindex) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcvalueindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteDescription(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteDescription");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (uint32_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteFriendlyName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (uint32_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteIconResourceSpecifier(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong schemeguid, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteIconResourceSpecifier");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)schemeguid, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (uint32_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWritePossibleDescription(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint possiblesettingindex, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWritePossibleDescription");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (uint32_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWritePossibleFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint possiblesettingindex, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWritePossibleFriendlyName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (uint32_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWritePossibleValue(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint type, jint possiblesettingindex, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWritePossibleValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)type, (uint32_t)possiblesettingindex, (void*)(uintptr_t)buffer, (uint32_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteSettingAttributes(JNIEnv* km_env, jclass km_clazz, jlong subgroupguid, jlong powersettingguid, jint attributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteSettingAttributes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subgroupguid, (void*)(uintptr_t)powersettingguid, (uint32_t)attributes) : 0;
#else
    (void)subgroupguid;
    (void)powersettingguid;
    (void)attributes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteValueIncrement(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint valueincrement) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueIncrement");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)valueincrement) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueincrement;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteValueMax(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint valuemaximum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueMax");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)valuemaximum) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valuemaximum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteValueMin(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jint valueminimum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueMin");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (uint32_t)valueminimum) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueminimum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1PowerWriteValueUnitsSpecifier(JNIEnv* km_env, jclass km_clazz, jlong rootpowerkey, jlong subgroupofpowersettingsguid, jlong powersettingguid, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueUnitsSpecifier");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpowerkey, (void*)(uintptr_t)subgroupofpowersettingsguid, (void*)(uintptr_t)powersettingguid, (void*)(uintptr_t)buffer, (uint32_t)buffersize) : 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1ReadGlobalPwrPolicy(JNIEnv* km_env, jclass km_clazz, jlong pglobalpowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGlobalPwrPolicy");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pglobalpowerpolicy) : false;
#else
    (void)pglobalpowerpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1ReadProcessorPwrScheme(JNIEnv* km_env, jclass km_clazz, jint uiid, jlong pmachineprocessorpowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadProcessorPwrScheme");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uiid, (void*)(uintptr_t)pmachineprocessorpowerpolicy) : false;
#else
    (void)uiid;
    (void)pmachineprocessorpowerpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1ReadPwrScheme(JNIEnv* km_env, jclass km_clazz, jint uiid, jlong ppowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadPwrScheme");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uiid, (void*)(uintptr_t)ppowerpolicy) : false;
#else
    (void)uiid;
    (void)ppowerpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1RegisterPowerSettingNotification(JNIEnv* km_env, jclass km_clazz, jlong hrecipient, jlong powersettingguid, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterPowerSettingNotification");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrecipient, (void*)(uintptr_t)powersettingguid, (uint32_t)flags) : -1;
#else
    (void)hrecipient;
    (void)powersettingguid;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1RegisterSuspendResumeNotification(JNIEnv* km_env, jclass km_clazz, jlong hrecipient, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterSuspendResumeNotification");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrecipient, (uint32_t)flags) : -1;
#else
    (void)hrecipient;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1RequestWakeupLatency(JNIEnv* km_env, jclass km_clazz, jint latency) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RequestWakeupLatency");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)latency) : -1;
#else
    (void)latency;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1SetActivePwrScheme(JNIEnv* km_env, jclass km_clazz, jint uiid, jlong pglobalpowerpolicy, jlong ppowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetActivePwrScheme");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uiid, (void*)(uintptr_t)pglobalpowerpolicy, (void*)(uintptr_t)ppowerpolicy) : false;
#else
    (void)uiid;
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1SetSuspendState(JNIEnv* km_env, jclass km_clazz, jboolean bhibernate, jboolean bforce, jboolean bwakeupeventsdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSuspendState");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((bool)bhibernate, (bool)bforce, (bool)bwakeupeventsdisabled) : false;
#else
    (void)bhibernate;
    (void)bforce;
    (void)bwakeupeventsdisabled;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1SetSystemPowerState(JNIEnv* km_env, jclass km_clazz, jint fsuspend, jint fforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemPowerState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fsuspend, (int32_t)fforce) : -1;
#else
    (void)fsuspend;
    (void)fforce;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1SetThreadExecutionState(JNIEnv* km_env, jclass km_clazz, jint esflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadExecutionState");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)esflags) : 0;
#else
    (void)esflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1UnregisterPowerSettingNotification(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterPowerSettingNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1UnregisterSuspendResumeNotification(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterSuspendResumeNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1ValidatePowerPolicies(JNIEnv* km_env, jclass km_clazz, jlong pglobalpowerpolicy, jlong ppowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidatePowerPolicies");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pglobalpowerpolicy, (void*)(uintptr_t)ppowerpolicy) : false;
#else
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1WriteGlobalPwrPolicy(JNIEnv* km_env, jclass km_clazz, jlong pglobalpowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteGlobalPwrPolicy");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pglobalpowerpolicy) : false;
#else
    (void)pglobalpowerpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1WriteProcessorPwrScheme(JNIEnv* km_env, jclass km_clazz, jint uiid, jlong pmachineprocessorpowerpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProcessorPwrScheme");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uiid, (void*)(uintptr_t)pmachineprocessorpowerpolicy) : false;
#else
    (void)uiid;
    (void)pmachineprocessorpowerpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_power_WindowsWin32SystemPowerJniBridge_windowssys_1windows_1win32_1system_1power_1WritePwrScheme(JNIEnv* km_env, jclass km_clazz, jlong puiid, jlong lpszschemename, jlong lpszdescription, jlong lpscheme) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePwrScheme");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puiid, (void*)(uintptr_t)lpszschemename, (void*)(uintptr_t)lpszdescription, (void*)(uintptr_t)lpscheme) : false;
#else
    (void)puiid;
    (void)lpszschemename;
    (void)lpszdescription;
    (void)lpscheme;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

