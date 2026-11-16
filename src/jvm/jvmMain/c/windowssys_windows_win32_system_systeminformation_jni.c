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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationDnsHostnameToComputerNameExW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jlong computername, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsHostnameToComputerNameExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (void*)(uintptr_t)computername, (void*)(uintptr_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hostname;
    (void)computername;
    (void)nsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationEnumSystemFirmwareTables(JNIEnv* km_env, jclass km_clazz, jint firmwaretableprovidersignature, jlong pfirmwaretableenumbuffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemFirmwareTables");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)firmwaretableprovidersignature, (void*)(uintptr_t)pfirmwaretableenumbuffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)firmwaretableprovidersignature;
    (void)pfirmwaretableenumbuffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetComputerNameExA(JNIEnv* km_env, jclass km_clazz, jint nametype, jlong lpbuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerNameExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nametype, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nametype;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetComputerNameExW(JNIEnv* km_env, jclass km_clazz, jint nametype, jlong lpbuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerNameExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nametype, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nametype;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeveloperDriveEnablementState");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetFirmwareType(JNIEnv* km_env, jclass km_clazz, jlong firmwaretype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)firmwaretype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)firmwaretype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetIntegratedDisplaySize(JNIEnv* km_env, jclass km_clazz, jlong sizeininches) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIntegratedDisplaySize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sizeininches);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sizeininches;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetLocalTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLocalTime");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpsystemtime);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpsystemtime;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformation(JNIEnv* km_env, jclass km_clazz, jlong buffer, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalProcessorInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffer, (void*)(uintptr_t)returnedlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)buffer;
    (void)returnedlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformationEx(JNIEnv* km_env, jclass km_clazz, jint relationshiptype, jlong buffer, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalProcessorInformationEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)relationshiptype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)returnedlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)relationshiptype;
    (void)buffer;
    (void)returnedlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetNativeSystemInfo(JNIEnv* km_env, jclass km_clazz, jlong lpsysteminfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNativeSystemInfo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpsysteminfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpsysteminfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetOsManufacturingMode(JNIEnv* km_env, jclass km_clazz, jlong pbenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOsManufacturingMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbenabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbenabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetOsSafeBootMode(JNIEnv* km_env, jclass km_clazz, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOsSafeBootMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetPhysicallyInstalledSystemMemory(JNIEnv* km_env, jclass km_clazz, jlong totalmemoryinkilobytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPhysicallyInstalledSystemMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)totalmemoryinkilobytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)totalmemoryinkilobytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetProcessorSystemCycleTime(JNIEnv* km_env, jclass km_clazz, jshort group, jlong buffer, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessorSystemCycleTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)group, (void*)(uintptr_t)buffer, (void*)(uintptr_t)returnedlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)group;
    (void)buffer;
    (void)returnedlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetProductInfo(JNIEnv* km_env, jclass km_clazz, jint dwosmajorversion, jint dwosminorversion, jint dwspmajorversion, jint dwspminorversion, jlong pdwreturnedproducttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProductInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwosmajorversion, (uint32_t)dwosminorversion, (uint32_t)dwspmajorversion, (uint32_t)dwspminorversion, (void*)(uintptr_t)pdwreturnedproducttype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwosmajorversion;
    (void)dwosminorversion;
    (void)dwspmajorversion;
    (void)dwspminorversion;
    (void)pdwreturnedproducttype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemCpuSetInformation(JNIEnv* km_env, jclass km_clazz, jlong information, jint bufferlength, jlong returnedlength, jlong process, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemCpuSetInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)information, (uint32_t)bufferlength, (void*)(uintptr_t)returnedlength, (void*)(uintptr_t)process, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)information;
    (void)bufferlength;
    (void)returnedlength;
    (void)process;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDEPPolicy");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDirectoryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDirectoryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemFirmwareTable(JNIEnv* km_env, jclass km_clazz, jint firmwaretableprovidersignature, jint firmwaretableid, jlong pfirmwaretablebuffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemFirmwareTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)firmwaretableprovidersignature, (uint32_t)firmwaretableid, (void*)(uintptr_t)pfirmwaretablebuffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)firmwaretableprovidersignature;
    (void)firmwaretableid;
    (void)pfirmwaretablebuffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemInfo(JNIEnv* km_env, jclass km_clazz, jlong lpsysteminfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemInfo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpsysteminfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpsysteminfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemLeapSecondInformation(JNIEnv* km_env, jclass km_clazz, jlong enabled, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemLeapSecondInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enabled, (void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enabled;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTime");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpsystemtime);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpsystemtime;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustment(JNIEnv* km_env, jclass km_clazz, jlong lptimeadjustment, jlong lptimeincrement, jlong lptimeadjustmentdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimeAdjustment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lptimeadjustment, (void*)(uintptr_t)lptimeincrement, (void*)(uintptr_t)lptimeadjustmentdisabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lptimeadjustment;
    (void)lptimeincrement;
    (void)lptimeadjustmentdisabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustmentPrecise(JNIEnv* km_env, jclass km_clazz, jlong lptimeadjustment, jlong lptimeincrement, jlong lptimeadjustmentdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimeAdjustmentPrecise");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lptimeadjustment, (void*)(uintptr_t)lptimeincrement, (void*)(uintptr_t)lptimeadjustmentdisabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lptimeadjustment;
    (void)lptimeincrement;
    (void)lptimeadjustmentdisabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemTimeAsFileTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtimeasfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimeAsFileTime");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpsystemtimeasfiletime);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpsystemtimeasfiletime;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemTimePreciseAsFileTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtimeasfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimePreciseAsFileTime");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpsystemtimeasfiletime);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpsystemtimeasfiletime;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWindowsDirectoryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWindowsDirectoryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2A(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize, jshort imagefilemachinetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64Directory2A");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize, (uint16_t)imagefilemachinetype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    (void)usize;
    (void)imagefilemachinetype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2W(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize, jshort imagefilemachinetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64Directory2W");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize, (uint16_t)imagefilemachinetype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    (void)usize;
    (void)imagefilemachinetype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64DirectoryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64DirectoryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetTickCount(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTickCount");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetTickCount64(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTickCount64");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersion");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetVersionExA(JNIEnv* km_env, jclass km_clazz, jlong lpversioninformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpversioninformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpversioninformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetVersionExW(JNIEnv* km_env, jclass km_clazz, jlong lpversioninformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpversioninformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpversioninformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowsDirectoryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowsDirectoryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatus(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalMemoryStatus");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpbuffer;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatusEx(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalMemoryStatusEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment(JNIEnv* km_env, jclass km_clazz, jint usercetenvironment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUserCetAvailableInEnvironment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)usercetenvironment);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)usercetenvironment;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationIsWow64GuestMachineSupported(JNIEnv* km_env, jclass km_clazz, jshort wowguestmachine, jlong machineissupported) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWow64GuestMachineSupported");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)wowguestmachine, (void*)(uintptr_t)machineissupported);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wowguestmachine;
    (void)machineissupported;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationRtlConvertDeviceFamilyInfoToString(JNIEnv* km_env, jclass km_clazz, jlong puldevicefamilybuffersize, jlong puldeviceformbuffersize, jlong devicefamily, jlong deviceform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlConvertDeviceFamilyInfoToString");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puldevicefamilybuffersize, (void*)(uintptr_t)puldeviceformbuffersize, (void*)(uintptr_t)devicefamily, (void*)(uintptr_t)deviceform);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)puldevicefamilybuffersize;
    (void)puldeviceformbuffersize;
    (void)devicefamily;
    (void)deviceform;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationRtlGetDeviceFamilyInfoEnum(JNIEnv* km_env, jclass km_clazz, jlong pulluapinfo, jlong puldevicefamily, jlong puldeviceform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetDeviceFamilyInfoEnum");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pulluapinfo, (void*)(uintptr_t)puldevicefamily, (void*)(uintptr_t)puldeviceform);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pulluapinfo;
    (void)puldevicefamily;
    (void)puldeviceform;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationRtlGetProductInfo(JNIEnv* km_env, jclass km_clazz, jint osmajorversion, jint osminorversion, jint spmajorversion, jint spminorversion, jlong returnedproducttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetProductInfo");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)osmajorversion, (uint32_t)osminorversion, (uint32_t)spmajorversion, (uint32_t)spminorversion, (void*)(uintptr_t)returnedproducttype);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)osmajorversion;
    (void)osminorversion;
    (void)spmajorversion;
    (void)spminorversion;
    (void)returnedproducttype;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationRtlGetSystemGlobalData(JNIEnv* km_env, jclass km_clazz, jint dataid, jlong buffer, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdllk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetSystemGlobalData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)dataid, (void*)(uintptr_t)buffer, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dataid;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState(JNIEnv* km_env, jclass km_clazz, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOsDeploymentState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationRtlSwitchedVVI(JNIEnv* km_env, jclass km_clazz, jlong versioninfo, jint typemask, jlong conditionmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSwitchedVVI");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)versioninfo, (uint32_t)typemask, (uint64_t)conditionmask);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)versioninfo;
    (void)typemask;
    (void)conditionmask;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationSetComputerNameA(JNIEnv* km_env, jclass km_clazz, jlong lpcomputername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcomputername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcomputername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationSetComputerNameEx2W(JNIEnv* km_env, jclass km_clazz, jint nametype, jint flags, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameEx2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nametype, (uint32_t)flags, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nametype;
    (void)flags;
    (void)lpbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationSetComputerNameExA(JNIEnv* km_env, jclass km_clazz, jint nametype, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nametype, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nametype;
    (void)lpbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationSetComputerNameExW(JNIEnv* km_env, jclass km_clazz, jint nametype, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nametype, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nametype;
    (void)lpbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationSetComputerNameW(JNIEnv* km_env, jclass km_clazz, jlong lpcomputername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcomputername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcomputername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationSetLocalTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLocalTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationSetSystemTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment(JNIEnv* km_env, jclass km_clazz, jint dwtimeadjustment, jint btimeadjustmentdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemTimeAdjustment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtimeadjustment, (int32_t)btimeadjustmentdisabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtimeadjustment;
    (void)btimeadjustmentdisabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise(JNIEnv* km_env, jclass km_clazz, jlong dwtimeadjustment, jint btimeadjustmentdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemTimeAdjustmentPrecise");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)dwtimeadjustment, (int32_t)btimeadjustmentdisabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtimeadjustment;
    (void)btimeadjustmentdisabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationVerSetConditionMask(JNIEnv* km_env, jclass km_clazz, jlong conditionmask, jint typemask, jbyte condition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerSetConditionMask");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)conditionmask, (uint32_t)typemask, (uint8_t)condition);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)conditionmask;
    (void)typemask;
    (void)condition;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpversioninformation, jint dwtypemask, jlong dwlconditionmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyVersionInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpversioninformation, (uint32_t)dwtypemask, (uint64_t)dwlconditionmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpversioninformation;
    (void)dwtypemask;
    (void)dwlconditionmask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpversioninformation, jint dwtypemask, jlong dwlconditionmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyVersionInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpversioninformation, (uint32_t)dwtypemask, (uint64_t)dwlconditionmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpversioninformation;
    (void)dwtypemask;
    (void)dwlconditionmask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

