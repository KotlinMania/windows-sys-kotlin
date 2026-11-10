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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1backupPerfRegistryToFileW(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jlong szcommentstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupPerfRegistryToFileW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfilename, (void*)(uintptr_t)szcommentstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szfilename;
    (void)szcommentstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1installPerfDllA(JNIEnv* km_env, jclass km_clazz, jlong szcomputername, jlong lpinifile, jlong dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallPerfDllA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szcomputername, (void*)(uintptr_t)lpinifile, (uint64_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szcomputername;
    (void)lpinifile;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1installPerfDllW(JNIEnv* km_env, jclass km_clazz, jlong szcomputername, jlong lpinifile, jlong dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallPerfDllW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szcomputername, (void*)(uintptr_t)lpinifile, (uint64_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szcomputername;
    (void)lpinifile;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1loadPerfCounterTextStringsA(JNIEnv* km_env, jclass km_clazz, jlong lpcommandline, jint bquietmodearg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadPerfCounterTextStringsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcommandline, (int32_t)bquietmodearg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1loadPerfCounterTextStringsW(JNIEnv* km_env, jclass km_clazz, jlong lpcommandline, jint bquietmodearg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadPerfCounterTextStringsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcommandline, (int32_t)bquietmodearg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhAddCounterA(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong szfullcounterpath, jlong dwuserdata, jlong phcounter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddCounterA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)szfullcounterpath, (uint64_t)dwuserdata, (void*)(uintptr_t)phcounter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhAddCounterW(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong szfullcounterpath, jlong dwuserdata, jlong phcounter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddCounterW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)szfullcounterpath, (uint64_t)dwuserdata, (void*)(uintptr_t)phcounter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhAddEnglishCounterA(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong szfullcounterpath, jlong dwuserdata, jlong phcounter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddEnglishCounterA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)szfullcounterpath, (uint64_t)dwuserdata, (void*)(uintptr_t)phcounter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhAddEnglishCounterW(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong szfullcounterpath, jlong dwuserdata, jlong phcounter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddEnglishCounterW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)szfullcounterpath, (uint64_t)dwuserdata, (void*)(uintptr_t)phcounter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhBindInputDataSourceA(JNIEnv* km_env, jclass km_clazz, jlong phdatasource, jlong logfilenamelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBindInputDataSourceA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phdatasource, (void*)(uintptr_t)logfilenamelist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phdatasource;
    (void)logfilenamelist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhBindInputDataSourceW(JNIEnv* km_env, jclass km_clazz, jlong phdatasource, jlong logfilenamelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBindInputDataSourceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phdatasource, (void*)(uintptr_t)logfilenamelist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phdatasource;
    (void)logfilenamelist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhBrowseCountersA(JNIEnv* km_env, jclass km_clazz, jlong pbrowsedlgdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbrowsedlgdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbrowsedlgdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhBrowseCountersHA(JNIEnv* km_env, jclass km_clazz, jlong pbrowsedlgdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersHA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbrowsedlgdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbrowsedlgdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhBrowseCountersHW(JNIEnv* km_env, jclass km_clazz, jlong pbrowsedlgdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersHW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbrowsedlgdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbrowsedlgdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhBrowseCountersW(JNIEnv* km_env, jclass km_clazz, jlong pbrowsedlgdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbrowsedlgdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbrowsedlgdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhCalculateCounterFromRawValue(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint dwformat, jlong rawvalue1, jlong rawvalue2, jlong fmtvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCalculateCounterFromRawValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (uint32_t)dwformat, (void*)(uintptr_t)rawvalue1, (void*)(uintptr_t)rawvalue2, (void*)(uintptr_t)fmtvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)dwformat;
    (void)rawvalue1;
    (void)rawvalue2;
    (void)fmtvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhCloseLog(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCloseLog");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlog, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hlog;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhCloseQuery(JNIEnv* km_env, jclass km_clazz, jlong hquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCloseQuery");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhCollectQueryData(JNIEnv* km_env, jclass km_clazz, jlong hquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCollectQueryData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhCollectQueryDataEx(JNIEnv* km_env, jclass km_clazz, jlong hquery, jint dwintervaltime, jlong hnewdataevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCollectQueryDataEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (uint32_t)dwintervaltime, (void*)(uintptr_t)hnewdataevent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)dwintervaltime;
    (void)hnewdataevent;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhCollectQueryDataWithTime(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong plltimestamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCollectQueryDataWithTime");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)plltimestamp);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)plltimestamp;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhComputeCounterStatistics(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint dwformat, jint dwfirstentry, jint dwnumentries, jlong lprawvaluearray, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhComputeCounterStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (uint32_t)dwformat, (uint32_t)dwfirstentry, (uint32_t)dwnumentries, (void*)(uintptr_t)lprawvaluearray, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)dwformat;
    (void)dwfirstentry;
    (void)dwnumentries;
    (void)lprawvaluearray;
    (void)data;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhConnectMachineA(JNIEnv* km_env, jclass km_clazz, jlong szmachinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhConnectMachineA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szmachinename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szmachinename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhConnectMachineW(JNIEnv* km_env, jclass km_clazz, jlong szmachinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhConnectMachineW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szmachinename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szmachinename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhCreateSQLTablesA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCreateSQLTablesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhCreateSQLTablesW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCreateSQLTablesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumLogSetNamesA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong mszdatasetnamelist, jlong pcchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumLogSetNamesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)mszdatasetnamelist, (void*)(uintptr_t)pcchbufferlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)mszdatasetnamelist;
    (void)pcchbufferlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumLogSetNamesW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong mszdatasetnamelist, jlong pcchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumLogSetNamesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)mszdatasetnamelist, (void*)(uintptr_t)pcchbufferlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)mszdatasetnamelist;
    (void)pcchbufferlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumMachinesA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong mszmachinelist, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)mszmachinelist, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumMachinesHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong mszmachinelist, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesHA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)mszmachinelist, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumMachinesHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong mszmachinelist, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesHW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)mszmachinelist, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumMachinesW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong mszmachinelist, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)mszmachinelist, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumObjectItemsA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szobjectname, jlong mszcounterlist, jlong pcchcounterlistlength, jlong mszinstancelist, jlong pcchinstancelistlength, jint dwdetaillevel, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)mszcounterlist, (void*)(uintptr_t)pcchcounterlistlength, (void*)(uintptr_t)mszinstancelist, (void*)(uintptr_t)pcchinstancelistlength, (uint32_t)dwdetaillevel, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)mszcounterlist;
    (void)pcchcounterlistlength;
    (void)mszinstancelist;
    (void)pcchinstancelistlength;
    (void)dwdetaillevel;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumObjectItemsHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szobjectname, jlong mszcounterlist, jlong pcchcounterlistlength, jlong mszinstancelist, jlong pcchinstancelistlength, jint dwdetaillevel, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsHA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)mszcounterlist, (void*)(uintptr_t)pcchcounterlistlength, (void*)(uintptr_t)mszinstancelist, (void*)(uintptr_t)pcchinstancelistlength, (uint32_t)dwdetaillevel, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)mszcounterlist;
    (void)pcchcounterlistlength;
    (void)mszinstancelist;
    (void)pcchinstancelistlength;
    (void)dwdetaillevel;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumObjectItemsHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szobjectname, jlong mszcounterlist, jlong pcchcounterlistlength, jlong mszinstancelist, jlong pcchinstancelistlength, jint dwdetaillevel, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsHW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)mszcounterlist, (void*)(uintptr_t)pcchcounterlistlength, (void*)(uintptr_t)mszinstancelist, (void*)(uintptr_t)pcchinstancelistlength, (uint32_t)dwdetaillevel, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)mszcounterlist;
    (void)pcchcounterlistlength;
    (void)mszinstancelist;
    (void)pcchinstancelistlength;
    (void)dwdetaillevel;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumObjectItemsW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szobjectname, jlong mszcounterlist, jlong pcchcounterlistlength, jlong mszinstancelist, jlong pcchinstancelistlength, jint dwdetaillevel, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)mszcounterlist, (void*)(uintptr_t)pcchcounterlistlength, (void*)(uintptr_t)mszinstancelist, (void*)(uintptr_t)pcchinstancelistlength, (uint32_t)dwdetaillevel, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)mszcounterlist;
    (void)pcchcounterlistlength;
    (void)mszinstancelist;
    (void)pcchinstancelistlength;
    (void)dwdetaillevel;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumObjectsA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong mszobjectlist, jlong pcchbuffersize, jint dwdetaillevel, jint brefresh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)mszobjectlist, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwdetaillevel, (int32_t)brefresh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumObjectsHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong mszobjectlist, jlong pcchbuffersize, jint dwdetaillevel, jint brefresh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsHA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)mszobjectlist, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwdetaillevel, (int32_t)brefresh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumObjectsHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong mszobjectlist, jlong pcchbuffersize, jint dwdetaillevel, jint brefresh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsHW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)mszobjectlist, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwdetaillevel, (int32_t)brefresh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhEnumObjectsW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong mszobjectlist, jlong pcchbuffersize, jint dwdetaillevel, jint brefresh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)mszobjectlist, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwdetaillevel, (int32_t)brefresh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhExpandCounterPathA(JNIEnv* km_env, jclass km_clazz, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandCounterPathA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhExpandCounterPathW(JNIEnv* km_env, jclass km_clazz, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandCounterPathW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhExpandWildCardPathA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhExpandWildCardPathHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathHA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhExpandWildCardPathHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathHW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhExpandWildCardPathW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhFormatFromRawValue(JNIEnv* km_env, jclass km_clazz, jint dwcountertype, jint dwformat, jlong ptimebase, jlong prawvalue1, jlong prawvalue2, jlong pfmtvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhFormatFromRawValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcountertype, (uint32_t)dwformat, (void*)(uintptr_t)ptimebase, (void*)(uintptr_t)prawvalue1, (void*)(uintptr_t)prawvalue2, (void*)(uintptr_t)pfmtvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwcountertype;
    (void)dwformat;
    (void)ptimebase;
    (void)prawvalue1;
    (void)prawvalue2;
    (void)pfmtvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetCounterInfoA(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jboolean bretrieveexplaintext, jlong pdwbuffersize, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetCounterInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (bool)bretrieveexplaintext, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)bretrieveexplaintext;
    (void)pdwbuffersize;
    (void)lpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetCounterInfoW(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jboolean bretrieveexplaintext, jlong pdwbuffersize, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetCounterInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (bool)bretrieveexplaintext, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)bretrieveexplaintext;
    (void)pdwbuffersize;
    (void)lpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetCounterTimeBase(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jlong ptimebase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetCounterTimeBase");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (void*)(uintptr_t)ptimebase);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)ptimebase;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDataSourceTimeRangeA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong pdwnumentries, jlong pinfo, jlong pdwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDataSourceTimeRangeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)pdwnumentries, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)pdwbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)pdwnumentries;
    (void)pinfo;
    (void)pdwbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDataSourceTimeRangeH(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong pdwnumentries, jlong pinfo, jlong pdwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDataSourceTimeRangeH");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)pdwnumentries, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)pdwbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)pdwnumentries;
    (void)pinfo;
    (void)pdwbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDataSourceTimeRangeW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong pdwnumentries, jlong pinfo, jlong pdwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDataSourceTimeRangeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)pdwnumentries, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)pdwbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)pdwnumentries;
    (void)pinfo;
    (void)pdwbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDefaultPerfCounterA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szobjectname, jlong szdefaultcountername, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szdefaultcountername, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDefaultPerfCounterHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szobjectname, jlong szdefaultcountername, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterHA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szdefaultcountername, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDefaultPerfCounterHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szobjectname, jlong szdefaultcountername, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterHW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szdefaultcountername, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDefaultPerfCounterW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szobjectname, jlong szdefaultcountername, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szdefaultcountername, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDefaultPerfObjectA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szdefaultobjectname, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szdefaultobjectname, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDefaultPerfObjectHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szdefaultobjectname, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectHA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szdefaultobjectname, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDefaultPerfObjectHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szdefaultobjectname, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectHW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szdefaultobjectname, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDefaultPerfObjectW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szdefaultobjectname, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szdefaultobjectname, (void*)(uintptr_t)pcchbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetDllVersion(JNIEnv* km_env, jclass km_clazz, jlong lpdwversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDllVersion");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwversion);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpdwversion;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetFormattedCounterArrayA(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint dwformat, jlong lpdwbuffersize, jlong lpdwitemcount, jlong itembuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetFormattedCounterArrayA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (uint32_t)dwformat, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpdwitemcount, (void*)(uintptr_t)itembuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)dwformat;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetFormattedCounterArrayW(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint dwformat, jlong lpdwbuffersize, jlong lpdwitemcount, jlong itembuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetFormattedCounterArrayW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (uint32_t)dwformat, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpdwitemcount, (void*)(uintptr_t)itembuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)dwformat;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetFormattedCounterValue(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint dwformat, jlong lpdwtype, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetFormattedCounterValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (uint32_t)dwformat, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)pvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)dwformat;
    (void)lpdwtype;
    (void)pvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetLogFileSize(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong llsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetLogFileSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)llsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hlog;
    (void)llsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetLogSetGUID(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pguid, jlong prunid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetLogSetGUID");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pguid, (void*)(uintptr_t)prunid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hlog;
    (void)pguid;
    (void)prunid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetRawCounterArrayA(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jlong lpdwbuffersize, jlong lpdwitemcount, jlong itembuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetRawCounterArrayA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpdwitemcount, (void*)(uintptr_t)itembuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetRawCounterArrayW(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jlong lpdwbuffersize, jlong lpdwitemcount, jlong itembuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetRawCounterArrayW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpdwitemcount, (void*)(uintptr_t)itembuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhGetRawCounterValue(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jlong lpdwtype, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetRawCounterValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)pvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)lpdwtype;
    (void)pvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhIsRealTimeQuery(JNIEnv* km_env, jclass km_clazz, jlong hquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhIsRealTimeQuery");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hquery;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhLookupPerfIndexByNameA(JNIEnv* km_env, jclass km_clazz, jlong szmachinename, jlong sznamebuffer, jlong pdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfIndexByNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szmachinename, (void*)(uintptr_t)sznamebuffer, (void*)(uintptr_t)pdwindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szmachinename;
    (void)sznamebuffer;
    (void)pdwindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhLookupPerfIndexByNameW(JNIEnv* km_env, jclass km_clazz, jlong szmachinename, jlong sznamebuffer, jlong pdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfIndexByNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szmachinename, (void*)(uintptr_t)sznamebuffer, (void*)(uintptr_t)pdwindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szmachinename;
    (void)sznamebuffer;
    (void)pdwindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhLookupPerfNameByIndexA(JNIEnv* km_env, jclass km_clazz, jlong szmachinename, jint dwnameindex, jlong sznamebuffer, jlong pcchnamebuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfNameByIndexA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szmachinename, (uint32_t)dwnameindex, (void*)(uintptr_t)sznamebuffer, (void*)(uintptr_t)pcchnamebuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szmachinename;
    (void)dwnameindex;
    (void)sznamebuffer;
    (void)pcchnamebuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhLookupPerfNameByIndexW(JNIEnv* km_env, jclass km_clazz, jlong szmachinename, jint dwnameindex, jlong sznamebuffer, jlong pcchnamebuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfNameByIndexW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szmachinename, (uint32_t)dwnameindex, (void*)(uintptr_t)sznamebuffer, (void*)(uintptr_t)pcchnamebuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szmachinename;
    (void)dwnameindex;
    (void)sznamebuffer;
    (void)pcchnamebuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhMakeCounterPathA(JNIEnv* km_env, jclass km_clazz, jlong pcounterpathelements, jlong szfullpathbuffer, jlong pcchbuffersize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhMakeCounterPathA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcounterpathelements, (void*)(uintptr_t)szfullpathbuffer, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcounterpathelements;
    (void)szfullpathbuffer;
    (void)pcchbuffersize;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhMakeCounterPathW(JNIEnv* km_env, jclass km_clazz, jlong pcounterpathelements, jlong szfullpathbuffer, jlong pcchbuffersize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhMakeCounterPathW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcounterpathelements, (void*)(uintptr_t)szfullpathbuffer, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcounterpathelements;
    (void)szfullpathbuffer;
    (void)pcchbuffersize;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhOpenLogA(JNIEnv* km_env, jclass km_clazz, jlong szlogfilename, jint dwaccessflags, jlong lpdwlogtype, jlong hquery, jint dwmaxsize, jlong szusercaption, jlong phlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenLogA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szlogfilename, (uint32_t)dwaccessflags, (void*)(uintptr_t)lpdwlogtype, (void*)(uintptr_t)hquery, (uint32_t)dwmaxsize, (void*)(uintptr_t)szusercaption, (void*)(uintptr_t)phlog);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szlogfilename;
    (void)dwaccessflags;
    (void)lpdwlogtype;
    (void)hquery;
    (void)dwmaxsize;
    (void)szusercaption;
    (void)phlog;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhOpenLogW(JNIEnv* km_env, jclass km_clazz, jlong szlogfilename, jint dwaccessflags, jlong lpdwlogtype, jlong hquery, jint dwmaxsize, jlong szusercaption, jlong phlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenLogW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szlogfilename, (uint32_t)dwaccessflags, (void*)(uintptr_t)lpdwlogtype, (void*)(uintptr_t)hquery, (uint32_t)dwmaxsize, (void*)(uintptr_t)szusercaption, (void*)(uintptr_t)phlog);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szlogfilename;
    (void)dwaccessflags;
    (void)lpdwlogtype;
    (void)hquery;
    (void)dwmaxsize;
    (void)szusercaption;
    (void)phlog;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhOpenQueryA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong dwuserdata, jlong phquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenQueryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (uint64_t)dwuserdata, (void*)(uintptr_t)phquery);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)dwuserdata;
    (void)phquery;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhOpenQueryH(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong dwuserdata, jlong phquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenQueryH");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (uint64_t)dwuserdata, (void*)(uintptr_t)phquery);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)dwuserdata;
    (void)phquery;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhOpenQueryW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong dwuserdata, jlong phquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenQueryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource, (uint64_t)dwuserdata, (void*)(uintptr_t)phquery);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    (void)dwuserdata;
    (void)phquery;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhParseCounterPathA(JNIEnv* km_env, jclass km_clazz, jlong szfullpathbuffer, jlong pcounterpathelements, jlong pdwbuffersize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseCounterPathA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfullpathbuffer, (void*)(uintptr_t)pcounterpathelements, (void*)(uintptr_t)pdwbuffersize, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szfullpathbuffer;
    (void)pcounterpathelements;
    (void)pdwbuffersize;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhParseCounterPathW(JNIEnv* km_env, jclass km_clazz, jlong szfullpathbuffer, jlong pcounterpathelements, jlong pdwbuffersize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseCounterPathW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfullpathbuffer, (void*)(uintptr_t)pcounterpathelements, (void*)(uintptr_t)pdwbuffersize, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szfullpathbuffer;
    (void)pcounterpathelements;
    (void)pdwbuffersize;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhParseInstanceNameA(JNIEnv* km_env, jclass km_clazz, jlong szinstancestring, jlong szinstancename, jlong pcchinstancenamelength, jlong szparentname, jlong pcchparentnamelength, jlong lpindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseInstanceNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szinstancestring, (void*)(uintptr_t)szinstancename, (void*)(uintptr_t)pcchinstancenamelength, (void*)(uintptr_t)szparentname, (void*)(uintptr_t)pcchparentnamelength, (void*)(uintptr_t)lpindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szinstancestring;
    (void)szinstancename;
    (void)pcchinstancenamelength;
    (void)szparentname;
    (void)pcchparentnamelength;
    (void)lpindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhParseInstanceNameW(JNIEnv* km_env, jclass km_clazz, jlong szinstancestring, jlong szinstancename, jlong pcchinstancenamelength, jlong szparentname, jlong pcchparentnamelength, jlong lpindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseInstanceNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szinstancestring, (void*)(uintptr_t)szinstancename, (void*)(uintptr_t)pcchinstancenamelength, (void*)(uintptr_t)szparentname, (void*)(uintptr_t)pcchparentnamelength, (void*)(uintptr_t)lpindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szinstancestring;
    (void)szinstancename;
    (void)pcchinstancenamelength;
    (void)szparentname;
    (void)pcchparentnamelength;
    (void)lpindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhRemoveCounter(JNIEnv* km_env, jclass km_clazz, jlong hcounter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhRemoveCounter");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhSelectDataSourceA(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jint dwflags, jlong szdatasource, jlong pcchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSelectDataSourceA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndowner, (uint32_t)dwflags, (void*)(uintptr_t)szdatasource, (void*)(uintptr_t)pcchbufferlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndowner;
    (void)dwflags;
    (void)szdatasource;
    (void)pcchbufferlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhSelectDataSourceW(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jint dwflags, jlong szdatasource, jlong pcchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSelectDataSourceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndowner, (uint32_t)dwflags, (void*)(uintptr_t)szdatasource, (void*)(uintptr_t)pcchbufferlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndowner;
    (void)dwflags;
    (void)szdatasource;
    (void)pcchbufferlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhSetCounterScaleFactor(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint lfactor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetCounterScaleFactor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcounter, (int32_t)lfactor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcounter;
    (void)lfactor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhSetDefaultRealTimeDataSource(JNIEnv* km_env, jclass km_clazz, jint dwdatasourceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetDefaultRealTimeDataSource");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdatasourceid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwdatasourceid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhSetLogSetRunID(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint runid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetLogSetRunID");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlog, (int32_t)runid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hlog;
    (void)runid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhSetQueryTimeRange(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetQueryTimeRange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)pinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)pinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhUpdateLogA(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong szuserstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhUpdateLogA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)szuserstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hlog;
    (void)szuserstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhUpdateLogFileCatalog(JNIEnv* km_env, jclass km_clazz, jlong hlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhUpdateLogFileCatalog");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlog);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hlog;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhUpdateLogW(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong szuserstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhUpdateLogW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)szuserstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hlog;
    (void)szuserstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhValidatePathA(JNIEnv* km_env, jclass km_clazz, jlong szfullpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfullpathbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szfullpathbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhValidatePathExA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szfullpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szfullpathbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szfullpathbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhValidatePathExW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szfullpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szfullpathbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdatasource;
    (void)szfullpathbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhValidatePathW(JNIEnv* km_env, jclass km_clazz, jlong szfullpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfullpathbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szfullpathbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhVerifySQLDBA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhVerifySQLDBA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1pdhVerifySQLDBW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhVerifySQLDBW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatasource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szdatasource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfAddCounters(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong pcounters, jint cbcounters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfAddCounters");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)pcounters, (uint32_t)cbcounters);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)pcounters;
    (void)cbcounters;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfCloseQueryHandle(JNIEnv* km_env, jclass km_clazz, jlong hquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfCloseQueryHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfCreateInstance(JNIEnv* km_env, jclass km_clazz, jlong providerhandle, jlong countersetguid, jlong name, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfCreateInstance");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)providerhandle, (void*)(uintptr_t)countersetguid, (void*)(uintptr_t)name, (uint32_t)id);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)providerhandle;
    (void)countersetguid;
    (void)name;
    (void)id;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfDecrementULongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDecrementULongCounterValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint32_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfDecrementULongLongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDecrementULongLongCounterValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint64_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfDeleteCounters(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong pcounters, jint cbcounters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDeleteCounters");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)pcounters, (uint32_t)cbcounters);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)pcounters;
    (void)cbcounters;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfDeleteInstance(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instanceblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDeleteInstance");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instanceblock);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)provider;
    (void)instanceblock;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfEnumerateCounterSet(JNIEnv* km_env, jclass km_clazz, jlong szmachine, jlong pcountersetids, jint ccountersetids, jlong pccountersetidsactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfEnumerateCounterSet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szmachine, (void*)(uintptr_t)pcountersetids, (uint32_t)ccountersetids, (void*)(uintptr_t)pccountersetidsactual);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szmachine;
    (void)pcountersetids;
    (void)ccountersetids;
    (void)pccountersetidsactual;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfEnumerateCounterSetInstances(JNIEnv* km_env, jclass km_clazz, jlong szmachine, jlong pcountersetid, jlong pinstances, jint cbinstances, jlong pcbinstancesactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfEnumerateCounterSetInstances");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szmachine, (void*)(uintptr_t)pcountersetid, (void*)(uintptr_t)pinstances, (uint32_t)cbinstances, (void*)(uintptr_t)pcbinstancesactual);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szmachine;
    (void)pcountersetid;
    (void)pinstances;
    (void)cbinstances;
    (void)pcbinstancesactual;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfIncrementULongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfIncrementULongCounterValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint32_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfIncrementULongLongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfIncrementULongLongCounterValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint64_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfOpenQueryHandle(JNIEnv* km_env, jclass km_clazz, jlong szmachine, jlong phquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfOpenQueryHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szmachine, (void*)(uintptr_t)phquery);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szmachine;
    (void)phquery;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfQueryCounterData(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong pcounterblock, jint cbcounterblock, jlong pcbcounterblockactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryCounterData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)pcounterblock, (uint32_t)cbcounterblock, (void*)(uintptr_t)pcbcounterblockactual);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)pcounterblock;
    (void)cbcounterblock;
    (void)pcbcounterblockactual;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfQueryCounterInfo(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong pcounters, jint cbcounters, jlong pcbcountersactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryCounterInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)pcounters, (uint32_t)cbcounters, (void*)(uintptr_t)pcbcountersactual);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hquery;
    (void)pcounters;
    (void)cbcounters;
    (void)pcbcountersactual;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfQueryCounterSetRegistrationInfo(JNIEnv* km_env, jclass km_clazz, jlong szmachine, jlong pcountersetid, jint requestcode, jint requestlangid, jlong pbreginfo, jint cbreginfo, jlong pcbreginfoactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryCounterSetRegistrationInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szmachine, (void*)(uintptr_t)pcountersetid, (int32_t)requestcode, (uint32_t)requestlangid, (void*)(uintptr_t)pbreginfo, (uint32_t)cbreginfo, (void*)(uintptr_t)pcbreginfoactual);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szmachine;
    (void)pcountersetid;
    (void)requestcode;
    (void)requestlangid;
    (void)pbreginfo;
    (void)cbreginfo;
    (void)pcbreginfoactual;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfQueryInstance(JNIEnv* km_env, jclass km_clazz, jlong providerhandle, jlong countersetguid, jlong name, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryInstance");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)providerhandle, (void*)(uintptr_t)countersetguid, (void*)(uintptr_t)name, (uint32_t)id);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)providerhandle;
    (void)countersetguid;
    (void)name;
    (void)id;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfSetCounterRefValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetCounterRefValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)address;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfSetCounterSetInfo(JNIEnv* km_env, jclass km_clazz, jlong providerhandle, jlong arg_1_template, jint templatesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetCounterSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)providerhandle, (void*)(uintptr_t)arg_1_template, (uint32_t)templatesize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)providerhandle;
    (void)arg_1_template;
    (void)templatesize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfSetULongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetULongCounterValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint32_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfSetULongLongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetULongLongCounterValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint64_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfStartProvider(JNIEnv* km_env, jclass km_clazz, jlong providerguid, jlong controlcallback, jlong phprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfStartProvider");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)providerguid, (void*)(uintptr_t)controlcallback, (void*)(uintptr_t)phprovider);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)providerguid;
    (void)controlcallback;
    (void)phprovider;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfStartProviderEx(JNIEnv* km_env, jclass km_clazz, jlong providerguid, jlong providercontext, jlong provider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfStartProviderEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)providerguid, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)provider);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)providerguid;
    (void)providercontext;
    (void)provider;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1perfStopProvider(JNIEnv* km_env, jclass km_clazz, jlong providerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfStopProvider");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)providerhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)providerhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1queryPerformanceCounter(JNIEnv* km_env, jclass km_clazz, jlong lpperformancecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryPerformanceCounter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpperformancecount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpperformancecount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1queryPerformanceFrequency(JNIEnv* km_env, jclass km_clazz, jlong lpfrequency) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryPerformanceFrequency");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfrequency);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfrequency;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1restorePerfRegistryFromFileW(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jlong szlangid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestorePerfRegistryFromFileW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfilename, (void*)(uintptr_t)szlangid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szfilename;
    (void)szlangid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1setServiceAsTrustedA(JNIEnv* km_env, jclass km_clazz, jlong szreserved, jlong szservicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceAsTrustedA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szreserved, (void*)(uintptr_t)szservicename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szreserved;
    (void)szservicename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1setServiceAsTrustedW(JNIEnv* km_env, jclass km_clazz, jlong szreserved, jlong szservicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceAsTrustedW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szreserved, (void*)(uintptr_t)szservicename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)szreserved;
    (void)szservicename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1unloadPerfCounterTextStringsA(JNIEnv* km_env, jclass km_clazz, jlong lpcommandline, jint bquietmodearg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnloadPerfCounterTextStringsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcommandline, (int32_t)bquietmodearg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1unloadPerfCounterTextStringsW(JNIEnv* km_env, jclass km_clazz, jlong lpcommandline, jint bquietmodearg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnloadPerfCounterTextStringsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcommandline, (int32_t)bquietmodearg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1updatePerfNameFilesA(JNIEnv* km_env, jclass km_clazz, jlong sznewctrfilepath, jlong sznewhlpfilepath, jlong szlanguageid, jlong dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdatePerfNameFilesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sznewctrfilepath, (void*)(uintptr_t)sznewhlpfilepath, (void*)(uintptr_t)szlanguageid, (uint64_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sznewctrfilepath;
    (void)sznewhlpfilepath;
    (void)szlanguageid;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1updatePerfNameFilesW(JNIEnv* km_env, jclass km_clazz, jlong sznewctrfilepath, jlong sznewhlpfilepath, jlong szlanguageid, jlong dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdatePerfNameFilesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sznewctrfilepath, (void*)(uintptr_t)sznewhlpfilepath, (void*)(uintptr_t)szlanguageid, (uint64_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sznewctrfilepath;
    (void)sznewhlpfilepath;
    (void)szlanguageid;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

