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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1BackupPerfRegistryToFileW(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jlong szcommentstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupPerfRegistryToFileW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename, (void*)(uintptr_t)szcommentstring) : 0;
#else
    (void)szfilename;
    (void)szcommentstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1InstallPerfDllA(JNIEnv* km_env, jclass km_clazz, jlong szcomputername, jlong lpinifile, jlong dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallPerfDllA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomputername, (void*)(uintptr_t)lpinifile, (uint64_t)dwflags) : 0;
#else
    (void)szcomputername;
    (void)lpinifile;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1InstallPerfDllW(JNIEnv* km_env, jclass km_clazz, jlong szcomputername, jlong lpinifile, jlong dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallPerfDllW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomputername, (void*)(uintptr_t)lpinifile, (uint64_t)dwflags) : 0;
#else
    (void)szcomputername;
    (void)lpinifile;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1LoadPerfCounterTextStringsA(JNIEnv* km_env, jclass km_clazz, jlong lpcommandline, jint bquietmodearg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadPerfCounterTextStringsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcommandline, (int32_t)bquietmodearg) : 0;
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1LoadPerfCounterTextStringsW(JNIEnv* km_env, jclass km_clazz, jlong lpcommandline, jint bquietmodearg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadPerfCounterTextStringsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcommandline, (int32_t)bquietmodearg) : 0;
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhAddCounterA(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong szfullcounterpath, jlong dwuserdata, jlong phcounter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddCounterA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)szfullcounterpath, (uint64_t)dwuserdata, (void*)(uintptr_t)phcounter) : 0;
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhAddCounterW(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong szfullcounterpath, jlong dwuserdata, jlong phcounter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddCounterW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)szfullcounterpath, (uint64_t)dwuserdata, (void*)(uintptr_t)phcounter) : 0;
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhAddEnglishCounterA(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong szfullcounterpath, jlong dwuserdata, jlong phcounter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddEnglishCounterA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)szfullcounterpath, (uint64_t)dwuserdata, (void*)(uintptr_t)phcounter) : 0;
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhAddEnglishCounterW(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong szfullcounterpath, jlong dwuserdata, jlong phcounter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhAddEnglishCounterW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)szfullcounterpath, (uint64_t)dwuserdata, (void*)(uintptr_t)phcounter) : 0;
#else
    (void)hquery;
    (void)szfullcounterpath;
    (void)dwuserdata;
    (void)phcounter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhBindInputDataSourceA(JNIEnv* km_env, jclass km_clazz, jlong phdatasource, jlong logfilenamelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBindInputDataSourceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phdatasource, (void*)(uintptr_t)logfilenamelist) : 0;
#else
    (void)phdatasource;
    (void)logfilenamelist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhBindInputDataSourceW(JNIEnv* km_env, jclass km_clazz, jlong phdatasource, jlong logfilenamelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBindInputDataSourceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phdatasource, (void*)(uintptr_t)logfilenamelist) : 0;
#else
    (void)phdatasource;
    (void)logfilenamelist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhBrowseCountersA(JNIEnv* km_env, jclass km_clazz, jlong pbrowsedlgdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbrowsedlgdata) : 0;
#else
    (void)pbrowsedlgdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhBrowseCountersHA(JNIEnv* km_env, jclass km_clazz, jlong pbrowsedlgdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersHA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbrowsedlgdata) : 0;
#else
    (void)pbrowsedlgdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhBrowseCountersHW(JNIEnv* km_env, jclass km_clazz, jlong pbrowsedlgdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersHW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbrowsedlgdata) : 0;
#else
    (void)pbrowsedlgdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhBrowseCountersW(JNIEnv* km_env, jclass km_clazz, jlong pbrowsedlgdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhBrowseCountersW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbrowsedlgdata) : 0;
#else
    (void)pbrowsedlgdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhCalculateCounterFromRawValue(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint dwformat, jlong rawvalue1, jlong rawvalue2, jlong fmtvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCalculateCounterFromRawValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (uint32_t)dwformat, (void*)(uintptr_t)rawvalue1, (void*)(uintptr_t)rawvalue2, (void*)(uintptr_t)fmtvalue) : 0;
#else
    (void)hcounter;
    (void)dwformat;
    (void)rawvalue1;
    (void)rawvalue2;
    (void)fmtvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhCloseLog(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCloseLog");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (uint32_t)dwflags) : 0;
#else
    (void)hlog;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhCloseQuery(JNIEnv* km_env, jclass km_clazz, jlong hquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCloseQuery");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery) : 0;
#else
    (void)hquery;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhCollectQueryData(JNIEnv* km_env, jclass km_clazz, jlong hquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCollectQueryData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery) : 0;
#else
    (void)hquery;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhCollectQueryDataEx(JNIEnv* km_env, jclass km_clazz, jlong hquery, jint dwintervaltime, jlong hnewdataevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCollectQueryDataEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (uint32_t)dwintervaltime, (void*)(uintptr_t)hnewdataevent) : 0;
#else
    (void)hquery;
    (void)dwintervaltime;
    (void)hnewdataevent;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhCollectQueryDataWithTime(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong plltimestamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCollectQueryDataWithTime");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)plltimestamp) : 0;
#else
    (void)hquery;
    (void)plltimestamp;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhComputeCounterStatistics(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint dwformat, jint dwfirstentry, jint dwnumentries, jlong lprawvaluearray, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhComputeCounterStatistics");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (uint32_t)dwformat, (uint32_t)dwfirstentry, (uint32_t)dwnumentries, (void*)(uintptr_t)lprawvaluearray, (void*)(uintptr_t)data) : 0;
#else
    (void)hcounter;
    (void)dwformat;
    (void)dwfirstentry;
    (void)dwnumentries;
    (void)lprawvaluearray;
    (void)data;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhConnectMachineA(JNIEnv* km_env, jclass km_clazz, jlong szmachinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhConnectMachineA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szmachinename) : 0;
#else
    (void)szmachinename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhConnectMachineW(JNIEnv* km_env, jclass km_clazz, jlong szmachinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhConnectMachineW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szmachinename) : 0;
#else
    (void)szmachinename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhCreateSQLTablesA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCreateSQLTablesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource) : 0;
#else
    (void)szdatasource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhCreateSQLTablesW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhCreateSQLTablesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource) : 0;
#else
    (void)szdatasource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumLogSetNamesA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong mszdatasetnamelist, jlong pcchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumLogSetNamesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)mszdatasetnamelist, (void*)(uintptr_t)pcchbufferlength) : 0;
#else
    (void)szdatasource;
    (void)mszdatasetnamelist;
    (void)pcchbufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumLogSetNamesW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong mszdatasetnamelist, jlong pcchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumLogSetNamesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)mszdatasetnamelist, (void*)(uintptr_t)pcchbufferlength) : 0;
#else
    (void)szdatasource;
    (void)mszdatasetnamelist;
    (void)pcchbufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumMachinesA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong mszmachinelist, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)mszmachinelist, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)szdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumMachinesHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong mszmachinelist, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesHA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)mszmachinelist, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)hdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumMachinesHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong mszmachinelist, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesHW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)mszmachinelist, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)hdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumMachinesW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong mszmachinelist, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumMachinesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)mszmachinelist, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)szdatasource;
    (void)mszmachinelist;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumObjectItemsA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szobjectname, jlong mszcounterlist, jlong pcchcounterlistlength, jlong mszinstancelist, jlong pcchinstancelistlength, jint dwdetaillevel, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)mszcounterlist, (void*)(uintptr_t)pcchcounterlistlength, (void*)(uintptr_t)mszinstancelist, (void*)(uintptr_t)pcchinstancelistlength, (uint32_t)dwdetaillevel, (uint32_t)dwflags) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumObjectItemsHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szobjectname, jlong mszcounterlist, jlong pcchcounterlistlength, jlong mszinstancelist, jlong pcchinstancelistlength, jint dwdetaillevel, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsHA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)mszcounterlist, (void*)(uintptr_t)pcchcounterlistlength, (void*)(uintptr_t)mszinstancelist, (void*)(uintptr_t)pcchinstancelistlength, (uint32_t)dwdetaillevel, (uint32_t)dwflags) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumObjectItemsHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szobjectname, jlong mszcounterlist, jlong pcchcounterlistlength, jlong mszinstancelist, jlong pcchinstancelistlength, jint dwdetaillevel, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsHW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)mszcounterlist, (void*)(uintptr_t)pcchcounterlistlength, (void*)(uintptr_t)mszinstancelist, (void*)(uintptr_t)pcchinstancelistlength, (uint32_t)dwdetaillevel, (uint32_t)dwflags) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumObjectItemsW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szobjectname, jlong mszcounterlist, jlong pcchcounterlistlength, jlong mszinstancelist, jlong pcchinstancelistlength, jint dwdetaillevel, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectItemsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)mszcounterlist, (void*)(uintptr_t)pcchcounterlistlength, (void*)(uintptr_t)mszinstancelist, (void*)(uintptr_t)pcchinstancelistlength, (uint32_t)dwdetaillevel, (uint32_t)dwflags) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumObjectsA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong mszobjectlist, jlong pcchbuffersize, jint dwdetaillevel, jint brefresh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)mszobjectlist, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwdetaillevel, (int32_t)brefresh) : 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumObjectsHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong mszobjectlist, jlong pcchbuffersize, jint dwdetaillevel, jint brefresh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsHA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)mszobjectlist, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwdetaillevel, (int32_t)brefresh) : 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumObjectsHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong mszobjectlist, jlong pcchbuffersize, jint dwdetaillevel, jint brefresh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsHW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)mszobjectlist, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwdetaillevel, (int32_t)brefresh) : 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhEnumObjectsW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong mszobjectlist, jlong pcchbuffersize, jint dwdetaillevel, jint brefresh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhEnumObjectsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)mszobjectlist, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwdetaillevel, (int32_t)brefresh) : 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)mszobjectlist;
    (void)pcchbuffersize;
    (void)dwdetaillevel;
    (void)brefresh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhExpandCounterPathA(JNIEnv* km_env, jclass km_clazz, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandCounterPathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength) : 0;
#else
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhExpandCounterPathW(JNIEnv* km_env, jclass km_clazz, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandCounterPathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength) : 0;
#else
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhExpandWildCardPathA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength, (uint32_t)dwflags) : 0;
#else
    (void)szdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhExpandWildCardPathHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathHA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength, (uint32_t)dwflags) : 0;
#else
    (void)hdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhExpandWildCardPathHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathHW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength, (uint32_t)dwflags) : 0;
#else
    (void)hdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhExpandWildCardPathW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szwildcardpath, jlong mszexpandedpathlist, jlong pcchpathlistlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhExpandWildCardPathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szwildcardpath, (void*)(uintptr_t)mszexpandedpathlist, (void*)(uintptr_t)pcchpathlistlength, (uint32_t)dwflags) : 0;
#else
    (void)szdatasource;
    (void)szwildcardpath;
    (void)mszexpandedpathlist;
    (void)pcchpathlistlength;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhFormatFromRawValue(JNIEnv* km_env, jclass km_clazz, jint dwcountertype, jint dwformat, jlong ptimebase, jlong prawvalue1, jlong prawvalue2, jlong pfmtvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhFormatFromRawValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwcountertype, (uint32_t)dwformat, (void*)(uintptr_t)ptimebase, (void*)(uintptr_t)prawvalue1, (void*)(uintptr_t)prawvalue2, (void*)(uintptr_t)pfmtvalue) : 0;
#else
    (void)dwcountertype;
    (void)dwformat;
    (void)ptimebase;
    (void)prawvalue1;
    (void)prawvalue2;
    (void)pfmtvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetCounterInfoA(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jboolean bretrieveexplaintext, jlong pdwbuffersize, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetCounterInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (bool)bretrieveexplaintext, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)hcounter;
    (void)bretrieveexplaintext;
    (void)pdwbuffersize;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetCounterInfoW(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jboolean bretrieveexplaintext, jlong pdwbuffersize, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetCounterInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (bool)bretrieveexplaintext, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)hcounter;
    (void)bretrieveexplaintext;
    (void)pdwbuffersize;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetCounterTimeBase(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jlong ptimebase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetCounterTimeBase");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (void*)(uintptr_t)ptimebase) : 0;
#else
    (void)hcounter;
    (void)ptimebase;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDataSourceTimeRangeA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong pdwnumentries, jlong pinfo, jlong pdwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDataSourceTimeRangeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)pdwnumentries, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)pdwbuffersize) : 0;
#else
    (void)szdatasource;
    (void)pdwnumentries;
    (void)pinfo;
    (void)pdwbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDataSourceTimeRangeH(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong pdwnumentries, jlong pinfo, jlong pdwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDataSourceTimeRangeH");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)pdwnumentries, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)pdwbuffersize) : 0;
#else
    (void)hdatasource;
    (void)pdwnumentries;
    (void)pinfo;
    (void)pdwbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDataSourceTimeRangeW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong pdwnumentries, jlong pinfo, jlong pdwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDataSourceTimeRangeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)pdwnumentries, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)pdwbuffersize) : 0;
#else
    (void)szdatasource;
    (void)pdwnumentries;
    (void)pinfo;
    (void)pdwbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDefaultPerfCounterA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szobjectname, jlong szdefaultcountername, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szdefaultcountername, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDefaultPerfCounterHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szobjectname, jlong szdefaultcountername, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterHA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szdefaultcountername, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDefaultPerfCounterHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szobjectname, jlong szdefaultcountername, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterHW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szdefaultcountername, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDefaultPerfCounterW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szobjectname, jlong szdefaultcountername, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfCounterW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szdefaultcountername, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szobjectname;
    (void)szdefaultcountername;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDefaultPerfObjectA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szdefaultobjectname, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szdefaultobjectname, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDefaultPerfObjectHA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szdefaultobjectname, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectHA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szdefaultobjectname, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDefaultPerfObjectHW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szmachinename, jlong szdefaultobjectname, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectHW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szdefaultobjectname, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)hdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDefaultPerfObjectW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong szmachinename, jlong szdefaultobjectname, jlong pcchbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDefaultPerfObjectW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (void*)(uintptr_t)szmachinename, (void*)(uintptr_t)szdefaultobjectname, (void*)(uintptr_t)pcchbuffersize) : 0;
#else
    (void)szdatasource;
    (void)szmachinename;
    (void)szdefaultobjectname;
    (void)pcchbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetDllVersion(JNIEnv* km_env, jclass km_clazz, jlong lpdwversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetDllVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwversion) : 0;
#else
    (void)lpdwversion;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetFormattedCounterArrayA(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint dwformat, jlong lpdwbuffersize, jlong lpdwitemcount, jlong itembuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetFormattedCounterArrayA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (uint32_t)dwformat, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpdwitemcount, (void*)(uintptr_t)itembuffer) : 0;
#else
    (void)hcounter;
    (void)dwformat;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetFormattedCounterArrayW(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint dwformat, jlong lpdwbuffersize, jlong lpdwitemcount, jlong itembuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetFormattedCounterArrayW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (uint32_t)dwformat, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpdwitemcount, (void*)(uintptr_t)itembuffer) : 0;
#else
    (void)hcounter;
    (void)dwformat;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetFormattedCounterValue(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint dwformat, jlong lpdwtype, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetFormattedCounterValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (uint32_t)dwformat, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)pvalue) : 0;
#else
    (void)hcounter;
    (void)dwformat;
    (void)lpdwtype;
    (void)pvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetLogFileSize(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong llsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetLogFileSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)llsize) : 0;
#else
    (void)hlog;
    (void)llsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetLogSetGUID(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pguid, jlong prunid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetLogSetGUID");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pguid, (void*)(uintptr_t)prunid) : 0;
#else
    (void)hlog;
    (void)pguid;
    (void)prunid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetRawCounterArrayA(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jlong lpdwbuffersize, jlong lpdwitemcount, jlong itembuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetRawCounterArrayA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpdwitemcount, (void*)(uintptr_t)itembuffer) : 0;
#else
    (void)hcounter;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetRawCounterArrayW(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jlong lpdwbuffersize, jlong lpdwitemcount, jlong itembuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetRawCounterArrayW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpdwitemcount, (void*)(uintptr_t)itembuffer) : 0;
#else
    (void)hcounter;
    (void)lpdwbuffersize;
    (void)lpdwitemcount;
    (void)itembuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhGetRawCounterValue(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jlong lpdwtype, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhGetRawCounterValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)pvalue) : 0;
#else
    (void)hcounter;
    (void)lpdwtype;
    (void)pvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhIsRealTimeQuery(JNIEnv* km_env, jclass km_clazz, jlong hquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhIsRealTimeQuery");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery) : -1;
#else
    (void)hquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhLookupPerfIndexByNameA(JNIEnv* km_env, jclass km_clazz, jlong szmachinename, jlong sznamebuffer, jlong pdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfIndexByNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szmachinename, (void*)(uintptr_t)sznamebuffer, (void*)(uintptr_t)pdwindex) : 0;
#else
    (void)szmachinename;
    (void)sznamebuffer;
    (void)pdwindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhLookupPerfIndexByNameW(JNIEnv* km_env, jclass km_clazz, jlong szmachinename, jlong sznamebuffer, jlong pdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfIndexByNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szmachinename, (void*)(uintptr_t)sznamebuffer, (void*)(uintptr_t)pdwindex) : 0;
#else
    (void)szmachinename;
    (void)sznamebuffer;
    (void)pdwindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhLookupPerfNameByIndexA(JNIEnv* km_env, jclass km_clazz, jlong szmachinename, jint dwnameindex, jlong sznamebuffer, jlong pcchnamebuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfNameByIndexA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szmachinename, (uint32_t)dwnameindex, (void*)(uintptr_t)sznamebuffer, (void*)(uintptr_t)pcchnamebuffersize) : 0;
#else
    (void)szmachinename;
    (void)dwnameindex;
    (void)sznamebuffer;
    (void)pcchnamebuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhLookupPerfNameByIndexW(JNIEnv* km_env, jclass km_clazz, jlong szmachinename, jint dwnameindex, jlong sznamebuffer, jlong pcchnamebuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhLookupPerfNameByIndexW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szmachinename, (uint32_t)dwnameindex, (void*)(uintptr_t)sznamebuffer, (void*)(uintptr_t)pcchnamebuffersize) : 0;
#else
    (void)szmachinename;
    (void)dwnameindex;
    (void)sznamebuffer;
    (void)pcchnamebuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhMakeCounterPathA(JNIEnv* km_env, jclass km_clazz, jlong pcounterpathelements, jlong szfullpathbuffer, jlong pcchbuffersize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhMakeCounterPathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcounterpathelements, (void*)(uintptr_t)szfullpathbuffer, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwflags) : 0;
#else
    (void)pcounterpathelements;
    (void)szfullpathbuffer;
    (void)pcchbuffersize;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhMakeCounterPathW(JNIEnv* km_env, jclass km_clazz, jlong pcounterpathelements, jlong szfullpathbuffer, jlong pcchbuffersize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhMakeCounterPathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcounterpathelements, (void*)(uintptr_t)szfullpathbuffer, (void*)(uintptr_t)pcchbuffersize, (uint32_t)dwflags) : 0;
#else
    (void)pcounterpathelements;
    (void)szfullpathbuffer;
    (void)pcchbuffersize;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhOpenLogA(JNIEnv* km_env, jclass km_clazz, jlong szlogfilename, jint dwaccessflags, jlong lpdwlogtype, jlong hquery, jint dwmaxsize, jlong szusercaption, jlong phlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenLogA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szlogfilename, (uint32_t)dwaccessflags, (void*)(uintptr_t)lpdwlogtype, (void*)(uintptr_t)hquery, (uint32_t)dwmaxsize, (void*)(uintptr_t)szusercaption, (void*)(uintptr_t)phlog) : 0;
#else
    (void)szlogfilename;
    (void)dwaccessflags;
    (void)lpdwlogtype;
    (void)hquery;
    (void)dwmaxsize;
    (void)szusercaption;
    (void)phlog;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhOpenLogW(JNIEnv* km_env, jclass km_clazz, jlong szlogfilename, jint dwaccessflags, jlong lpdwlogtype, jlong hquery, jint dwmaxsize, jlong szusercaption, jlong phlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenLogW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szlogfilename, (uint32_t)dwaccessflags, (void*)(uintptr_t)lpdwlogtype, (void*)(uintptr_t)hquery, (uint32_t)dwmaxsize, (void*)(uintptr_t)szusercaption, (void*)(uintptr_t)phlog) : 0;
#else
    (void)szlogfilename;
    (void)dwaccessflags;
    (void)lpdwlogtype;
    (void)hquery;
    (void)dwmaxsize;
    (void)szusercaption;
    (void)phlog;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhOpenQueryA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong dwuserdata, jlong phquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenQueryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (uint64_t)dwuserdata, (void*)(uintptr_t)phquery) : 0;
#else
    (void)szdatasource;
    (void)dwuserdata;
    (void)phquery;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhOpenQueryH(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong dwuserdata, jlong phquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenQueryH");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (uint64_t)dwuserdata, (void*)(uintptr_t)phquery) : 0;
#else
    (void)hdatasource;
    (void)dwuserdata;
    (void)phquery;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhOpenQueryW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource, jlong dwuserdata, jlong phquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhOpenQueryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource, (uint64_t)dwuserdata, (void*)(uintptr_t)phquery) : 0;
#else
    (void)szdatasource;
    (void)dwuserdata;
    (void)phquery;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhParseCounterPathA(JNIEnv* km_env, jclass km_clazz, jlong szfullpathbuffer, jlong pcounterpathelements, jlong pdwbuffersize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseCounterPathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfullpathbuffer, (void*)(uintptr_t)pcounterpathelements, (void*)(uintptr_t)pdwbuffersize, (uint32_t)dwflags) : 0;
#else
    (void)szfullpathbuffer;
    (void)pcounterpathelements;
    (void)pdwbuffersize;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhParseCounterPathW(JNIEnv* km_env, jclass km_clazz, jlong szfullpathbuffer, jlong pcounterpathelements, jlong pdwbuffersize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseCounterPathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfullpathbuffer, (void*)(uintptr_t)pcounterpathelements, (void*)(uintptr_t)pdwbuffersize, (uint32_t)dwflags) : 0;
#else
    (void)szfullpathbuffer;
    (void)pcounterpathelements;
    (void)pdwbuffersize;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhParseInstanceNameA(JNIEnv* km_env, jclass km_clazz, jlong szinstancestring, jlong szinstancename, jlong pcchinstancenamelength, jlong szparentname, jlong pcchparentnamelength, jlong lpindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseInstanceNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szinstancestring, (void*)(uintptr_t)szinstancename, (void*)(uintptr_t)pcchinstancenamelength, (void*)(uintptr_t)szparentname, (void*)(uintptr_t)pcchparentnamelength, (void*)(uintptr_t)lpindex) : 0;
#else
    (void)szinstancestring;
    (void)szinstancename;
    (void)pcchinstancenamelength;
    (void)szparentname;
    (void)pcchparentnamelength;
    (void)lpindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhParseInstanceNameW(JNIEnv* km_env, jclass km_clazz, jlong szinstancestring, jlong szinstancename, jlong pcchinstancenamelength, jlong szparentname, jlong pcchparentnamelength, jlong lpindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhParseInstanceNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szinstancestring, (void*)(uintptr_t)szinstancename, (void*)(uintptr_t)pcchinstancenamelength, (void*)(uintptr_t)szparentname, (void*)(uintptr_t)pcchparentnamelength, (void*)(uintptr_t)lpindex) : 0;
#else
    (void)szinstancestring;
    (void)szinstancename;
    (void)pcchinstancenamelength;
    (void)szparentname;
    (void)pcchparentnamelength;
    (void)lpindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhRemoveCounter(JNIEnv* km_env, jclass km_clazz, jlong hcounter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhRemoveCounter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter) : 0;
#else
    (void)hcounter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhSelectDataSourceA(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jint dwflags, jlong szdatasource, jlong pcchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSelectDataSourceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (uint32_t)dwflags, (void*)(uintptr_t)szdatasource, (void*)(uintptr_t)pcchbufferlength) : 0;
#else
    (void)hwndowner;
    (void)dwflags;
    (void)szdatasource;
    (void)pcchbufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhSelectDataSourceW(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jint dwflags, jlong szdatasource, jlong pcchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSelectDataSourceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (uint32_t)dwflags, (void*)(uintptr_t)szdatasource, (void*)(uintptr_t)pcchbufferlength) : 0;
#else
    (void)hwndowner;
    (void)dwflags;
    (void)szdatasource;
    (void)pcchbufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhSetCounterScaleFactor(JNIEnv* km_env, jclass km_clazz, jlong hcounter, jint lfactor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetCounterScaleFactor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcounter, (int32_t)lfactor) : 0;
#else
    (void)hcounter;
    (void)lfactor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhSetDefaultRealTimeDataSource(JNIEnv* km_env, jclass km_clazz, jint dwdatasourceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetDefaultRealTimeDataSource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdatasourceid) : 0;
#else
    (void)dwdatasourceid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhSetLogSetRunID(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint runid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetLogSetRunID");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (int32_t)runid) : 0;
#else
    (void)hlog;
    (void)runid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhSetQueryTimeRange(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhSetQueryTimeRange");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)pinfo) : 0;
#else
    (void)hquery;
    (void)pinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhUpdateLogA(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong szuserstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhUpdateLogA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)szuserstring) : 0;
#else
    (void)hlog;
    (void)szuserstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhUpdateLogFileCatalog(JNIEnv* km_env, jclass km_clazz, jlong hlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhUpdateLogFileCatalog");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog) : 0;
#else
    (void)hlog;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhUpdateLogW(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong szuserstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhUpdateLogW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)szuserstring) : 0;
#else
    (void)hlog;
    (void)szuserstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhValidatePathA(JNIEnv* km_env, jclass km_clazz, jlong szfullpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfullpathbuffer) : 0;
#else
    (void)szfullpathbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhValidatePathExA(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szfullpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szfullpathbuffer) : 0;
#else
    (void)hdatasource;
    (void)szfullpathbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhValidatePathExW(JNIEnv* km_env, jclass km_clazz, jlong hdatasource, jlong szfullpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdatasource, (void*)(uintptr_t)szfullpathbuffer) : 0;
#else
    (void)hdatasource;
    (void)szfullpathbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhValidatePathW(JNIEnv* km_env, jclass km_clazz, jlong szfullpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhValidatePathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfullpathbuffer) : 0;
#else
    (void)szfullpathbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhVerifySQLDBA(JNIEnv* km_env, jclass km_clazz, jlong szdatasource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhVerifySQLDBA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource) : 0;
#else
    (void)szdatasource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PdhVerifySQLDBW(JNIEnv* km_env, jclass km_clazz, jlong szdatasource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("pdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PdhVerifySQLDBW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatasource) : 0;
#else
    (void)szdatasource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfAddCounters(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong pcounters, jint cbcounters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfAddCounters");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)pcounters, (uint32_t)cbcounters) : 0;
#else
    (void)hquery;
    (void)pcounters;
    (void)cbcounters;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfCloseQueryHandle(JNIEnv* km_env, jclass km_clazz, jlong hquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfCloseQueryHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery) : 0;
#else
    (void)hquery;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfCreateInstance(JNIEnv* km_env, jclass km_clazz, jlong providerhandle, jlong countersetguid, jlong name, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfCreateInstance");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerhandle, (void*)(uintptr_t)countersetguid, (void*)(uintptr_t)name, (uint32_t)id) : NULL;
#else
    (void)providerhandle;
    (void)countersetguid;
    (void)name;
    (void)id;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfDecrementULongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDecrementULongCounterValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint32_t)value) : 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfDecrementULongLongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDecrementULongLongCounterValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint64_t)value) : 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfDeleteCounters(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong pcounters, jint cbcounters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDeleteCounters");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)pcounters, (uint32_t)cbcounters) : 0;
#else
    (void)hquery;
    (void)pcounters;
    (void)cbcounters;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfDeleteInstance(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instanceblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfDeleteInstance");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instanceblock) : 0;
#else
    (void)provider;
    (void)instanceblock;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfEnumerateCounterSet(JNIEnv* km_env, jclass km_clazz, jlong szmachine, jlong pcountersetids, jint ccountersetids, jlong pccountersetidsactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfEnumerateCounterSet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szmachine, (void*)(uintptr_t)pcountersetids, (uint32_t)ccountersetids, (void*)(uintptr_t)pccountersetidsactual) : 0;
#else
    (void)szmachine;
    (void)pcountersetids;
    (void)ccountersetids;
    (void)pccountersetidsactual;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfEnumerateCounterSetInstances(JNIEnv* km_env, jclass km_clazz, jlong szmachine, jlong pcountersetid, jlong pinstances, jint cbinstances, jlong pcbinstancesactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfEnumerateCounterSetInstances");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szmachine, (void*)(uintptr_t)pcountersetid, (void*)(uintptr_t)pinstances, (uint32_t)cbinstances, (void*)(uintptr_t)pcbinstancesactual) : 0;
#else
    (void)szmachine;
    (void)pcountersetid;
    (void)pinstances;
    (void)cbinstances;
    (void)pcbinstancesactual;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfIncrementULongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfIncrementULongCounterValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint32_t)value) : 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfIncrementULongLongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfIncrementULongLongCounterValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint64_t)value) : 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfOpenQueryHandle(JNIEnv* km_env, jclass km_clazz, jlong szmachine, jlong phquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfOpenQueryHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szmachine, (void*)(uintptr_t)phquery) : 0;
#else
    (void)szmachine;
    (void)phquery;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfQueryCounterData(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong pcounterblock, jint cbcounterblock, jlong pcbcounterblockactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryCounterData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)pcounterblock, (uint32_t)cbcounterblock, (void*)(uintptr_t)pcbcounterblockactual) : 0;
#else
    (void)hquery;
    (void)pcounterblock;
    (void)cbcounterblock;
    (void)pcbcounterblockactual;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfQueryCounterInfo(JNIEnv* km_env, jclass km_clazz, jlong hquery, jlong pcounters, jint cbcounters, jlong pcbcountersactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryCounterInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hquery, (void*)(uintptr_t)pcounters, (uint32_t)cbcounters, (void*)(uintptr_t)pcbcountersactual) : 0;
#else
    (void)hquery;
    (void)pcounters;
    (void)cbcounters;
    (void)pcbcountersactual;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfQueryCounterSetRegistrationInfo(JNIEnv* km_env, jclass km_clazz, jlong szmachine, jlong pcountersetid, jint requestcode, jint requestlangid, jlong pbreginfo, jint cbreginfo, jlong pcbreginfoactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryCounterSetRegistrationInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szmachine, (void*)(uintptr_t)pcountersetid, (int32_t)requestcode, (uint32_t)requestlangid, (void*)(uintptr_t)pbreginfo, (uint32_t)cbreginfo, (void*)(uintptr_t)pcbreginfoactual) : 0;
#else
    (void)szmachine;
    (void)pcountersetid;
    (void)requestcode;
    (void)requestlangid;
    (void)pbreginfo;
    (void)cbreginfo;
    (void)pcbreginfoactual;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfQueryInstance(JNIEnv* km_env, jclass km_clazz, jlong providerhandle, jlong countersetguid, jlong name, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfQueryInstance");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerhandle, (void*)(uintptr_t)countersetguid, (void*)(uintptr_t)name, (uint32_t)id) : NULL;
#else
    (void)providerhandle;
    (void)countersetguid;
    (void)name;
    (void)id;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfSetCounterRefValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetCounterRefValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (void*)(uintptr_t)address) : 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)address;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfSetCounterSetInfo(JNIEnv* km_env, jclass km_clazz, jlong providerhandle, jlong arg_1_template, jint templatesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetCounterSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerhandle, (void*)(uintptr_t)arg_1_template, (uint32_t)templatesize) : 0;
#else
    (void)providerhandle;
    (void)arg_1_template;
    (void)templatesize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfSetULongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetULongCounterValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint32_t)value) : 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfSetULongLongCounterValue(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong instance, jint counterid, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfSetULongLongCounterValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)instance, (uint32_t)counterid, (uint64_t)value) : 0;
#else
    (void)provider;
    (void)instance;
    (void)counterid;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfStartProvider(JNIEnv* km_env, jclass km_clazz, jlong providerguid, jlong controlcallback, jlong phprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfStartProvider");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerguid, (void*)(uintptr_t)controlcallback, (void*)(uintptr_t)phprovider) : 0;
#else
    (void)providerguid;
    (void)controlcallback;
    (void)phprovider;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfStartProviderEx(JNIEnv* km_env, jclass km_clazz, jlong providerguid, jlong providercontext, jlong provider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfStartProviderEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerguid, (void*)(uintptr_t)providercontext, (void*)(uintptr_t)provider) : 0;
#else
    (void)providerguid;
    (void)providercontext;
    (void)provider;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1PerfStopProvider(JNIEnv* km_env, jclass km_clazz, jlong providerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerfStopProvider");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerhandle) : 0;
#else
    (void)providerhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1QueryPerformanceCounter(JNIEnv* km_env, jclass km_clazz, jlong lpperformancecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryPerformanceCounter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpperformancecount) : -1;
#else
    (void)lpperformancecount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1QueryPerformanceFrequency(JNIEnv* km_env, jclass km_clazz, jlong lpfrequency) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryPerformanceFrequency");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfrequency) : -1;
#else
    (void)lpfrequency;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1RestorePerfRegistryFromFileW(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jlong szlangid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestorePerfRegistryFromFileW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename, (void*)(uintptr_t)szlangid) : 0;
#else
    (void)szfilename;
    (void)szlangid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1SetServiceAsTrustedA(JNIEnv* km_env, jclass km_clazz, jlong szreserved, jlong szservicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceAsTrustedA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szreserved, (void*)(uintptr_t)szservicename) : 0;
#else
    (void)szreserved;
    (void)szservicename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1SetServiceAsTrustedW(JNIEnv* km_env, jclass km_clazz, jlong szreserved, jlong szservicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceAsTrustedW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szreserved, (void*)(uintptr_t)szservicename) : 0;
#else
    (void)szreserved;
    (void)szservicename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1UnloadPerfCounterTextStringsA(JNIEnv* km_env, jclass km_clazz, jlong lpcommandline, jint bquietmodearg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnloadPerfCounterTextStringsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcommandline, (int32_t)bquietmodearg) : 0;
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1UnloadPerfCounterTextStringsW(JNIEnv* km_env, jclass km_clazz, jlong lpcommandline, jint bquietmodearg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnloadPerfCounterTextStringsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcommandline, (int32_t)bquietmodearg) : 0;
#else
    (void)lpcommandline;
    (void)bquietmodearg;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1UpdatePerfNameFilesA(JNIEnv* km_env, jclass km_clazz, jlong sznewctrfilepath, jlong sznewhlpfilepath, jlong szlanguageid, jlong dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdatePerfNameFilesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sznewctrfilepath, (void*)(uintptr_t)sznewhlpfilepath, (void*)(uintptr_t)szlanguageid, (uint64_t)dwflags) : 0;
#else
    (void)sznewctrfilepath;
    (void)sznewhlpfilepath;
    (void)szlanguageid;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_WindowsWin32SystemPerformanceJniBridge_windowssys_1windows_1win32_1system_1performance_1UpdatePerfNameFilesW(JNIEnv* km_env, jclass km_clazz, jlong sznewctrfilepath, jlong sznewhlpfilepath, jlong szlanguageid, jlong dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("loadperf.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdatePerfNameFilesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sznewctrfilepath, (void*)(uintptr_t)sznewhlpfilepath, (void*)(uintptr_t)szlanguageid, (uint64_t)dwflags) : 0;
#else
    (void)sznewctrfilepath;
    (void)sznewhlpfilepath;
    (void)szlanguageid;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

