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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1DnsHostnameToComputerNameExW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jlong computername, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsHostnameToComputerNameExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (void*)(uintptr_t)computername, (void*)(uintptr_t)nsize) : -1;
#else
    (void)hostname;
    (void)computername;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1EnumSystemFirmwareTables(JNIEnv* km_env, jclass km_clazz, jint firmwaretableprovidersignature, jlong pfirmwaretableenumbuffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemFirmwareTables");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)firmwaretableprovidersignature, (void*)(uintptr_t)pfirmwaretableenumbuffer, (uint32_t)buffersize) : 0;
#else
    (void)firmwaretableprovidersignature;
    (void)pfirmwaretableenumbuffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetComputerNameExA(JNIEnv* km_env, jclass km_clazz, jint nametype, jlong lpbuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerNameExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nametype, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)nsize) : -1;
#else
    (void)nametype;
    (void)lpbuffer;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetComputerNameExW(JNIEnv* km_env, jclass km_clazz, jint nametype, jlong lpbuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerNameExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nametype, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)nsize) : -1;
#else
    (void)nametype;
    (void)lpbuffer;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetDeveloperDriveEnablementState(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeveloperDriveEnablementState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetFirmwareType(JNIEnv* km_env, jclass km_clazz, jlong firmwaretype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)firmwaretype) : -1;
#else
    (void)firmwaretype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetIntegratedDisplaySize(JNIEnv* km_env, jclass km_clazz, jlong sizeininches) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIntegratedDisplaySize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sizeininches) : -1;
#else
    (void)sizeininches;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetLocalTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLocalTime");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpsystemtime);
#else
    (void)lpsystemtime;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetLogicalProcessorInformation(JNIEnv* km_env, jclass km_clazz, jlong buffer, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalProcessorInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer, (void*)(uintptr_t)returnedlength) : -1;
#else
    (void)buffer;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetLogicalProcessorInformationEx(JNIEnv* km_env, jclass km_clazz, jint relationshiptype, jlong buffer, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalProcessorInformationEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)relationshiptype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)returnedlength) : -1;
#else
    (void)relationshiptype;
    (void)buffer;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetNativeSystemInfo(JNIEnv* km_env, jclass km_clazz, jlong lpsysteminfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNativeSystemInfo");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpsysteminfo);
#else
    (void)lpsysteminfo;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetOsManufacturingMode(JNIEnv* km_env, jclass km_clazz, jlong pbenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOsManufacturingMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbenabled) : -1;
#else
    (void)pbenabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetOsSafeBootMode(JNIEnv* km_env, jclass km_clazz, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOsSafeBootMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)flags) : -1;
#else
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetPhysicallyInstalledSystemMemory(JNIEnv* km_env, jclass km_clazz, jlong totalmemoryinkilobytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPhysicallyInstalledSystemMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)totalmemoryinkilobytes) : -1;
#else
    (void)totalmemoryinkilobytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetProcessorSystemCycleTime(JNIEnv* km_env, jclass km_clazz, jshort group, jlong buffer, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessorSystemCycleTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)group, (void*)(uintptr_t)buffer, (void*)(uintptr_t)returnedlength) : -1;
#else
    (void)group;
    (void)buffer;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetProductInfo(JNIEnv* km_env, jclass km_clazz, jint dwosmajorversion, jint dwosminorversion, jint dwspmajorversion, jint dwspminorversion, jlong pdwreturnedproducttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProductInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwosmajorversion, (uint32_t)dwosminorversion, (uint32_t)dwspmajorversion, (uint32_t)dwspminorversion, (void*)(uintptr_t)pdwreturnedproducttype) : -1;
#else
    (void)dwosmajorversion;
    (void)dwosminorversion;
    (void)dwspmajorversion;
    (void)dwspminorversion;
    (void)pdwreturnedproducttype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemCpuSetInformation(JNIEnv* km_env, jclass km_clazz, jlong information, jint bufferlength, jlong returnedlength, jlong process, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemCpuSetInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)information, (uint32_t)bufferlength, (void*)(uintptr_t)returnedlength, (void*)(uintptr_t)process, (uint32_t)flags) : -1;
#else
    (void)information;
    (void)bufferlength;
    (void)returnedlength;
    (void)process;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemDEPPolicy(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDEPPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDirectoryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDirectoryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemFirmwareTable(JNIEnv* km_env, jclass km_clazz, jint firmwaretableprovidersignature, jint firmwaretableid, jlong pfirmwaretablebuffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemFirmwareTable");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)firmwaretableprovidersignature, (uint32_t)firmwaretableid, (void*)(uintptr_t)pfirmwaretablebuffer, (uint32_t)buffersize) : 0;
#else
    (void)firmwaretableprovidersignature;
    (void)firmwaretableid;
    (void)pfirmwaretablebuffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemInfo(JNIEnv* km_env, jclass km_clazz, jlong lpsysteminfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemInfo");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpsysteminfo);
#else
    (void)lpsysteminfo;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemLeapSecondInformation(JNIEnv* km_env, jclass km_clazz, jlong enabled, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemLeapSecondInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enabled, (void*)(uintptr_t)flags) : -1;
#else
    (void)enabled;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTime");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpsystemtime);
#else
    (void)lpsystemtime;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemTimeAdjustment(JNIEnv* km_env, jclass km_clazz, jlong lptimeadjustment, jlong lptimeincrement, jlong lptimeadjustmentdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimeAdjustment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptimeadjustment, (void*)(uintptr_t)lptimeincrement, (void*)(uintptr_t)lptimeadjustmentdisabled) : -1;
#else
    (void)lptimeadjustment;
    (void)lptimeincrement;
    (void)lptimeadjustmentdisabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemTimeAdjustmentPrecise(JNIEnv* km_env, jclass km_clazz, jlong lptimeadjustment, jlong lptimeincrement, jlong lptimeadjustmentdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimeAdjustmentPrecise");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptimeadjustment, (void*)(uintptr_t)lptimeincrement, (void*)(uintptr_t)lptimeadjustmentdisabled) : -1;
#else
    (void)lptimeadjustment;
    (void)lptimeincrement;
    (void)lptimeadjustmentdisabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemTimeAsFileTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtimeasfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimeAsFileTime");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpsystemtimeasfiletime);
#else
    (void)lpsystemtimeasfiletime;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemTimePreciseAsFileTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtimeasfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimePreciseAsFileTime");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpsystemtimeasfiletime);
#else
    (void)lpsystemtimeasfiletime;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemWindowsDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWindowsDirectoryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemWindowsDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWindowsDirectoryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemWow64Directory2A(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize, jshort imagefilemachinetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64Directory2A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize, (uint16_t)imagefilemachinetype) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    (void)imagefilemachinetype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemWow64Directory2W(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize, jshort imagefilemachinetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64Directory2W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize, (uint16_t)imagefilemachinetype) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    (void)imagefilemachinetype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemWow64DirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64DirectoryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetSystemWow64DirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64DirectoryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetTickCount(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTickCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetTickCount64(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTickCount64");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetVersionExA(JNIEnv* km_env, jclass km_clazz, jlong lpversioninformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpversioninformation) : -1;
#else
    (void)lpversioninformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetVersionExW(JNIEnv* km_env, jclass km_clazz, jlong lpversioninformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpversioninformation) : -1;
#else
    (void)lpversioninformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetWindowsDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowsDirectoryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GetWindowsDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowsDirectoryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (uint32_t)usize) : 0;
#else
    (void)lpbuffer;
    (void)usize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GlobalMemoryStatus(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalMemoryStatus");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpbuffer);
#else
    (void)lpbuffer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1GlobalMemoryStatusEx(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalMemoryStatusEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer) : -1;
#else
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1IsUserCetAvailableInEnvironment(JNIEnv* km_env, jclass km_clazz, jint usercetenvironment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUserCetAvailableInEnvironment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)usercetenvironment) : -1;
#else
    (void)usercetenvironment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1IsWow64GuestMachineSupported(JNIEnv* km_env, jclass km_clazz, jshort wowguestmachine, jlong machineissupported) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWow64GuestMachineSupported");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)wowguestmachine, (void*)(uintptr_t)machineissupported) : -1;
#else
    (void)wowguestmachine;
    (void)machineissupported;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1RtlConvertDeviceFamilyInfoToString(JNIEnv* km_env, jclass km_clazz, jlong puldevicefamilybuffersize, jlong puldeviceformbuffersize, jlong devicefamily, jlong deviceform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlConvertDeviceFamilyInfoToString");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puldevicefamilybuffersize, (void*)(uintptr_t)puldeviceformbuffersize, (void*)(uintptr_t)devicefamily, (void*)(uintptr_t)deviceform) : 0;
#else
    (void)puldevicefamilybuffersize;
    (void)puldeviceformbuffersize;
    (void)devicefamily;
    (void)deviceform;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1RtlGetDeviceFamilyInfoEnum(JNIEnv* km_env, jclass km_clazz, jlong pulluapinfo, jlong puldevicefamily, jlong puldeviceform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetDeviceFamilyInfoEnum");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pulluapinfo, (void*)(uintptr_t)puldevicefamily, (void*)(uintptr_t)puldeviceform);
#else
    (void)pulluapinfo;
    (void)puldevicefamily;
    (void)puldeviceform;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1RtlGetProductInfo(JNIEnv* km_env, jclass km_clazz, jint osmajorversion, jint osminorversion, jint spmajorversion, jint spminorversion, jlong returnedproducttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetProductInfo");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)osmajorversion, (uint32_t)osminorversion, (uint32_t)spmajorversion, (uint32_t)spminorversion, (void*)(uintptr_t)returnedproducttype) : false;
#else
    (void)osmajorversion;
    (void)osminorversion;
    (void)spmajorversion;
    (void)spminorversion;
    (void)returnedproducttype;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1RtlGetSystemGlobalData(JNIEnv* km_env, jclass km_clazz, jint dataid, jlong buffer, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdllk.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetSystemGlobalData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)dataid, (void*)(uintptr_t)buffer, (uint32_t)size) : 0;
#else
    (void)dataid;
    (void)buffer;
    (void)size;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1RtlOsDeploymentState(JNIEnv* km_env, jclass km_clazz, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOsDeploymentState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags) : -1;
#else
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1RtlSwitchedVVI(JNIEnv* km_env, jclass km_clazz, jlong versioninfo, jint typemask, jlong conditionmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSwitchedVVI");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)versioninfo, (uint32_t)typemask, (uint64_t)conditionmask) : 0;
#else
    (void)versioninfo;
    (void)typemask;
    (void)conditionmask;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1SetComputerNameA(JNIEnv* km_env, jclass km_clazz, jlong lpcomputername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcomputername) : -1;
#else
    (void)lpcomputername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1SetComputerNameEx2W(JNIEnv* km_env, jclass km_clazz, jint nametype, jint flags, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameEx2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nametype, (uint32_t)flags, (void*)(uintptr_t)lpbuffer) : -1;
#else
    (void)nametype;
    (void)flags;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1SetComputerNameExA(JNIEnv* km_env, jclass km_clazz, jint nametype, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nametype, (void*)(uintptr_t)lpbuffer) : -1;
#else
    (void)nametype;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1SetComputerNameExW(JNIEnv* km_env, jclass km_clazz, jint nametype, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nametype, (void*)(uintptr_t)lpbuffer) : -1;
#else
    (void)nametype;
    (void)lpbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1SetComputerNameW(JNIEnv* km_env, jclass km_clazz, jlong lpcomputername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcomputername) : -1;
#else
    (void)lpcomputername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1SetLocalTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLocalTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemtime) : -1;
#else
    (void)lpsystemtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1SetSystemTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemtime) : -1;
#else
    (void)lpsystemtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1SetSystemTimeAdjustment(JNIEnv* km_env, jclass km_clazz, jint dwtimeadjustment, jint btimeadjustmentdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemTimeAdjustment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtimeadjustment, (int32_t)btimeadjustmentdisabled) : -1;
#else
    (void)dwtimeadjustment;
    (void)btimeadjustmentdisabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1SetSystemTimeAdjustmentPrecise(JNIEnv* km_env, jclass km_clazz, jlong dwtimeadjustment, jint btimeadjustmentdisabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemTimeAdjustmentPrecise");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)dwtimeadjustment, (int32_t)btimeadjustmentdisabled) : -1;
#else
    (void)dwtimeadjustment;
    (void)btimeadjustmentdisabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1VerSetConditionMask(JNIEnv* km_env, jclass km_clazz, jlong conditionmask, jint typemask, jbyte condition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerSetConditionMask");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)conditionmask, (uint32_t)typemask, (uint8_t)condition) : 0;
#else
    (void)conditionmask;
    (void)typemask;
    (void)condition;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1VerifyVersionInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpversioninformation, jint dwtypemask, jlong dwlconditionmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyVersionInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpversioninformation, (uint32_t)dwtypemask, (uint64_t)dwlconditionmask) : -1;
#else
    (void)lpversioninformation;
    (void)dwtypemask;
    (void)dwlconditionmask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_systeminformation_WindowsWin32SystemSysteminformationJniBridge_windowssys_1windows_1win32_1system_1systeminformation_1VerifyVersionInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpversioninformation, jint dwtypemask, jlong dwlconditionmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyVersionInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpversioninformation, (uint32_t)dwtypemask, (uint64_t)dwlconditionmask) : -1;
#else
    (void)lpversioninformation;
    (void)dwtypemask;
    (void)dwlconditionmask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

