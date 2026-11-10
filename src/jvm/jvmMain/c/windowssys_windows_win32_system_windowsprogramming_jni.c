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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1addDelBackupEntryA(JNIEnv* km_env, jclass km_clazz, jlong lpcszfilelist, jlong lpcszbackupdir, jlong lpcszbasename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddDelBackupEntryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcszfilelist, (void*)(uintptr_t)lpcszbackupdir, (void*)(uintptr_t)lpcszbasename, (uint32_t)dwflags) : -1;
#else
    (void)lpcszfilelist;
    (void)lpcszbackupdir;
    (void)lpcszbasename;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1addDelBackupEntryW(JNIEnv* km_env, jclass km_clazz, jlong lpcszfilelist, jlong lpcszbackupdir, jlong lpcszbasename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddDelBackupEntryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcszfilelist, (void*)(uintptr_t)lpcszbackupdir, (void*)(uintptr_t)lpcszbasename, (uint32_t)dwflags) : -1;
#else
    (void)lpcszfilelist;
    (void)lpcszbackupdir;
    (void)lpcszbasename;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1advInstallFileA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpszsourcedir, jlong lpszsourcefile, jlong lpszdestdir, jlong lpszdestfile, jint dwflags, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdvInstallFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpszsourcedir, (void*)(uintptr_t)lpszsourcefile, (void*)(uintptr_t)lpszdestdir, (void*)(uintptr_t)lpszdestfile, (uint32_t)dwflags, (uint32_t)dwreserved) : -1;
#else
    (void)hwnd;
    (void)lpszsourcedir;
    (void)lpszsourcefile;
    (void)lpszdestdir;
    (void)lpszdestfile;
    (void)dwflags;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1advInstallFileW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpszsourcedir, jlong lpszsourcefile, jlong lpszdestdir, jlong lpszdestfile, jint dwflags, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdvInstallFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpszsourcedir, (void*)(uintptr_t)lpszsourcefile, (void*)(uintptr_t)lpszdestdir, (void*)(uintptr_t)lpszdestfile, (uint32_t)dwflags, (uint32_t)dwreserved) : -1;
#else
    (void)hwnd;
    (void)lpszsourcedir;
    (void)lpszsourcefile;
    (void)lpszdestdir;
    (void)lpszdestfile;
    (void)dwflags;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1apphelpCheckShellObject(JNIEnv* km_env, jclass km_clazz, jlong objectclsid, jint bshimifnecessary, jlong pullflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("apphelp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApphelpCheckShellObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objectclsid, (int32_t)bshimifnecessary, (void*)(uintptr_t)pullflags) : -1;
#else
    (void)objectclsid;
    (void)bshimifnecessary;
    (void)pullflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1cancelDeviceWakeupRequest(JNIEnv* km_env, jclass km_clazz, jlong hdevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelDeviceWakeupRequest");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice) : -1;
#else
    (void)hdevice;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1closeINFEngine(JNIEnv* km_env, jclass km_clazz, jlong hinf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseINFEngine");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinf) : -1;
#else
    (void)hinf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1convertAuxiliaryCounterToPerformanceCounter(JNIEnv* km_env, jclass km_clazz, jlong ullauxiliarycountervalue, jlong lpperformancecountervalue, jlong lpconversionerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertAuxiliaryCounterToPerformanceCounter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)ullauxiliarycountervalue, (void*)(uintptr_t)lpperformancecountervalue, (void*)(uintptr_t)lpconversionerror) : -1;
#else
    (void)ullauxiliarycountervalue;
    (void)lpperformancecountervalue;
    (void)lpconversionerror;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1convertPerformanceCounterToAuxiliaryCounter(JNIEnv* km_env, jclass km_clazz, jlong ullperformancecountervalue, jlong lpauxiliarycountervalue, jlong lpconversionerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertPerformanceCounterToAuxiliaryCounter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)ullperformancecountervalue, (void*)(uintptr_t)lpauxiliarycountervalue, (void*)(uintptr_t)lpconversionerror) : -1;
#else
    (void)ullperformancecountervalue;
    (void)lpauxiliarycountervalue;
    (void)lpconversionerror;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCIBeginAccess(JNIEnv* km_env, jclass km_clazz, jlong pdci, jint x, jint y, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIBeginAccess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdci, (int32_t)x, (int32_t)y, (int32_t)dx, (int32_t)dy) : -1;
#else
    (void)pdci;
    (void)x;
    (void)y;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCICloseProvider(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCICloseProvider");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hdc);
#else
    (void)hdc;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCICreateOffscreen(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint dwcompression, jint dwredmask, jint dwgreenmask, jint dwbluemask, jint dwwidth, jint dwheight, jint dwdcicaps, jint dwbitcount, jlong lplpsurface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCICreateOffscreen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)dwcompression, (uint32_t)dwredmask, (uint32_t)dwgreenmask, (uint32_t)dwbluemask, (uint32_t)dwwidth, (uint32_t)dwheight, (uint32_t)dwdcicaps, (uint32_t)dwbitcount, (void*)(uintptr_t)lplpsurface) : -1;
#else
    (void)hdc;
    (void)dwcompression;
    (void)dwredmask;
    (void)dwgreenmask;
    (void)dwbluemask;
    (void)dwwidth;
    (void)dwheight;
    (void)dwdcicaps;
    (void)dwbitcount;
    (void)lplpsurface;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCICreateOverlay(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpoffscreensurf, jlong lplpsurface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCICreateOverlay");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpoffscreensurf, (void*)(uintptr_t)lplpsurface) : -1;
#else
    (void)hdc;
    (void)lpoffscreensurf;
    (void)lplpsurface;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCICreatePrimary(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lplpsurface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCICreatePrimary");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lplpsurface) : -1;
#else
    (void)hdc;
    (void)lplpsurface;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCIDestroy(JNIEnv* km_env, jclass km_clazz, jlong pdci) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIDestroy");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pdci);
#else
    (void)pdci;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCIDraw(JNIEnv* km_env, jclass km_clazz, jlong pdci) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIDraw");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdci) : -1;
#else
    (void)pdci;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCIEndAccess(JNIEnv* km_env, jclass km_clazz, jlong pdci) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIEndAccess");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pdci);
#else
    (void)pdci;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCIEnum(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprdst, jlong lprsrc, jlong lpfncallback, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIEnum");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprdst, (void*)(uintptr_t)lprsrc, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpcontext) : -1;
#else
    (void)hdc;
    (void)lprdst;
    (void)lprsrc;
    (void)lpfncallback;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCIOpenProvider(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIOpenProvider");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCISetClipList(JNIEnv* km_env, jclass km_clazz, jlong pdci, jlong prd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCISetClipList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdci, (void*)(uintptr_t)prd) : -1;
#else
    (void)pdci;
    (void)prd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCISetDestination(JNIEnv* km_env, jclass km_clazz, jlong pdci, jlong dst, jlong src) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCISetDestination");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdci, (void*)(uintptr_t)dst, (void*)(uintptr_t)src) : -1;
#else
    (void)pdci;
    (void)dst;
    (void)src;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dCISetSrcDestClip(JNIEnv* km_env, jclass km_clazz, jlong pdci, jlong srcrc, jlong destrc, jlong prd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCISetSrcDestClip");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdci, (void*)(uintptr_t)srcrc, (void*)(uintptr_t)destrc, (void*)(uintptr_t)prd) : -1;
#else
    (void)pdci;
    (void)srcrc;
    (void)destrc;
    (void)prd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1delNodeA(JNIEnv* km_env, jclass km_clazz, jlong pszfileordirname, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DelNodeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfileordirname, (uint32_t)dwflags) : -1;
#else
    (void)pszfileordirname;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1delNodeRunDLL32W(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinstance, jlong pszparms, jint nshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DelNodeRunDLL32W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)pszparms, (int32_t)nshow) : -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1delNodeW(JNIEnv* km_env, jclass km_clazz, jlong pszfileordirname, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DelNodeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfileordirname, (uint32_t)dwflags) : -1;
#else
    (void)pszfileordirname;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dnsHostnameToComputerNameA(JNIEnv* km_env, jclass km_clazz, jlong hostname, jlong computername, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsHostnameToComputerNameA");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dnsHostnameToComputerNameW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jlong computername, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsHostnameToComputerNameW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1dosDateTimeToFileTime(JNIEnv* km_env, jclass km_clazz, jshort wfatdate, jshort wfattime, jlong lpfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DosDateTimeToFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)wfatdate, (uint16_t)wfattime, (void*)(uintptr_t)lpfiletime) : -1;
#else
    (void)wfatdate;
    (void)wfattime;
    (void)lpfiletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1enableProcessOptionalXStateFeatures(JNIEnv* km_env, jclass km_clazz, jlong features) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableProcessOptionalXStateFeatures");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)features) : -1;
#else
    (void)features;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1executeCabA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pcab, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExecuteCabA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pcab, (void*)(uintptr_t)preserved) : -1;
#else
    (void)hwnd;
    (void)pcab;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1executeCabW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pcab, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExecuteCabW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pcab, (void*)(uintptr_t)preserved) : -1;
#else
    (void)hwnd;
    (void)pcab;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1extractFilesA(JNIEnv* km_env, jclass km_clazz, jlong pszcabname, jlong pszexpanddir, jint dwflags, jlong pszfilelist, jlong lpreserved, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractFilesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszcabname, (void*)(uintptr_t)pszexpanddir, (uint32_t)dwflags, (void*)(uintptr_t)pszfilelist, (void*)(uintptr_t)lpreserved, (uint32_t)dwreserved) : -1;
#else
    (void)pszcabname;
    (void)pszexpanddir;
    (void)dwflags;
    (void)pszfilelist;
    (void)lpreserved;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1extractFilesW(JNIEnv* km_env, jclass km_clazz, jlong pszcabname, jlong pszexpanddir, jint dwflags, jlong pszfilelist, jlong lpreserved, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractFilesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszcabname, (void*)(uintptr_t)pszexpanddir, (uint32_t)dwflags, (void*)(uintptr_t)pszfilelist, (void*)(uintptr_t)lpreserved, (uint32_t)dwreserved) : -1;
#else
    (void)pszcabname;
    (void)pszexpanddir;
    (void)dwflags;
    (void)pszfilelist;
    (void)lpreserved;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1fileSaveMarkNotExistA(JNIEnv* km_env, jclass km_clazz, jlong lpfilelist, jlong lpdir, jlong lpbasename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileSaveMarkNotExistA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilelist, (void*)(uintptr_t)lpdir, (void*)(uintptr_t)lpbasename) : -1;
#else
    (void)lpfilelist;
    (void)lpdir;
    (void)lpbasename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1fileSaveMarkNotExistW(JNIEnv* km_env, jclass km_clazz, jlong lpfilelist, jlong lpdir, jlong lpbasename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileSaveMarkNotExistW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilelist, (void*)(uintptr_t)lpdir, (void*)(uintptr_t)lpbasename) : -1;
#else
    (void)lpfilelist;
    (void)lpdir;
    (void)lpbasename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1fileSaveRestoreOnINFA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psztitle, jlong pszinf, jlong pszsection, jlong pszbackupdir, jlong pszbasebackupfile, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileSaveRestoreOnINFA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psztitle, (void*)(uintptr_t)pszinf, (void*)(uintptr_t)pszsection, (void*)(uintptr_t)pszbackupdir, (void*)(uintptr_t)pszbasebackupfile, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)psztitle;
    (void)pszinf;
    (void)pszsection;
    (void)pszbackupdir;
    (void)pszbasebackupfile;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1fileSaveRestoreOnINFW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psztitle, jlong pszinf, jlong pszsection, jlong pszbackupdir, jlong pszbasebackupfile, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileSaveRestoreOnINFW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psztitle, (void*)(uintptr_t)pszinf, (void*)(uintptr_t)pszsection, (void*)(uintptr_t)pszbackupdir, (void*)(uintptr_t)pszbasebackupfile, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)psztitle;
    (void)pszinf;
    (void)pszsection;
    (void)pszbackupdir;
    (void)pszbasebackupfile;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1fileSaveRestoreW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong lpfilelist, jlong lpdir, jlong lpbasename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileSaveRestoreW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)lpfilelist, (void*)(uintptr_t)lpdir, (void*)(uintptr_t)lpbasename, (uint32_t)dwflags) : -1;
#else
    (void)hdlg;
    (void)lpfilelist;
    (void)lpdir;
    (void)lpbasename;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1fileTimeToDosDateTime(JNIEnv* km_env, jclass km_clazz, jlong lpfiletime, jlong lpfatdate, jlong lpfattime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileTimeToDosDateTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiletime, (void*)(uintptr_t)lpfatdate, (void*)(uintptr_t)lpfattime) : -1;
#else
    (void)lpfiletime;
    (void)lpfatdate;
    (void)lpfattime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1gdiEntry13(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-dx-d3dkmt-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiEntry13");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getComputerNameA(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)nsize) : -1;
#else
    (void)lpbuffer;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getComputerNameW(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)nsize) : -1;
#else
    (void)lpbuffer;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getCurrentHwProfileA(JNIEnv* km_env, jclass km_clazz, jlong lphwprofileinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentHwProfileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphwprofileinfo) : -1;
#else
    (void)lphwprofileinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getCurrentHwProfileW(JNIEnv* km_env, jclass km_clazz, jlong lphwprofileinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentHwProfileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphwprofileinfo) : -1;
#else
    (void)lphwprofileinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getDCRegionData(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint size, jlong prd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCRegionData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (uint32_t)size, (void*)(uintptr_t)prd) : 0;
#else
    (void)hdc;
    (void)size;
    (void)prd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getFeatureEnabledState(JNIEnv* km_env, jclass km_clazz, jint featureid, jint changetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFeatureEnabledState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)featureid, (int32_t)changetime) : -1;
#else
    (void)featureid;
    (void)changetime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getFeatureVariant(JNIEnv* km_env, jclass km_clazz, jint featureid, jint changetime, jlong payloadid, jlong hasnotification) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFeatureVariant");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)featureid, (int32_t)changetime, (void*)(uintptr_t)payloadid, (void*)(uintptr_t)hasnotification) : 0;
#else
    (void)featureid;
    (void)changetime;
    (void)payloadid;
    (void)hasnotification;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getFirmwareEnvironmentVariableA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpguid, jlong pbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareEnvironmentVariableA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)pbuffer, (uint32_t)nsize) : 0;
#else
    (void)lpname;
    (void)lpguid;
    (void)pbuffer;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getFirmwareEnvironmentVariableExA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpguid, jlong pbuffer, jint nsize, jlong pdwattribubutes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareEnvironmentVariableExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)pbuffer, (uint32_t)nsize, (void*)(uintptr_t)pdwattribubutes) : 0;
#else
    (void)lpname;
    (void)lpguid;
    (void)pbuffer;
    (void)nsize;
    (void)pdwattribubutes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getFirmwareEnvironmentVariableExW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpguid, jlong pbuffer, jint nsize, jlong pdwattribubutes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareEnvironmentVariableExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)pbuffer, (uint32_t)nsize, (void*)(uintptr_t)pdwattribubutes) : 0;
#else
    (void)lpname;
    (void)lpguid;
    (void)pbuffer;
    (void)nsize;
    (void)pdwattribubutes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getFirmwareEnvironmentVariableW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpguid, jlong pbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareEnvironmentVariableW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)pbuffer, (uint32_t)nsize) : 0;
#else
    (void)lpname;
    (void)lpguid;
    (void)pbuffer;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getPrivateProfileIntA(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jint ndefault, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileIntA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (int32_t)ndefault, (void*)(uintptr_t)lpfilename) : 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)ndefault;
    (void)lpfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getPrivateProfileIntW(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jint ndefault, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileIntW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (int32_t)ndefault, (void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)ndefault;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getPrivateProfileSectionA(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpreturnedstring, jint nsize, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileSectionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpreturnedstring, (uint32_t)nsize, (void*)(uintptr_t)lpfilename) : 0;
#else
    (void)lpappname;
    (void)lpreturnedstring;
    (void)nsize;
    (void)lpfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getPrivateProfileSectionNamesA(JNIEnv* km_env, jclass km_clazz, jlong lpszreturnbuffer, jint nsize, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileSectionNamesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszreturnbuffer, (uint32_t)nsize, (void*)(uintptr_t)lpfilename) : 0;
#else
    (void)lpszreturnbuffer;
    (void)nsize;
    (void)lpfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getPrivateProfileSectionNamesW(JNIEnv* km_env, jclass km_clazz, jlong lpszreturnbuffer, jint nsize, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileSectionNamesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszreturnbuffer, (uint32_t)nsize, (void*)(uintptr_t)lpfilename) : 0;
#else
    (void)lpszreturnbuffer;
    (void)nsize;
    (void)lpfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getPrivateProfileSectionW(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpreturnedstring, jint nsize, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileSectionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpreturnedstring, (uint32_t)nsize, (void*)(uintptr_t)lpfilename) : 0;
#else
    (void)lpappname;
    (void)lpreturnedstring;
    (void)nsize;
    (void)lpfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getPrivateProfileStringA(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jlong lpdefault, jlong lpreturnedstring, jint nsize, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileStringA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (void*)(uintptr_t)lpdefault, (void*)(uintptr_t)lpreturnedstring, (uint32_t)nsize, (void*)(uintptr_t)lpfilename) : 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpdefault;
    (void)lpreturnedstring;
    (void)nsize;
    (void)lpfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getPrivateProfileStringW(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jlong lpdefault, jlong lpreturnedstring, jint nsize, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileStringW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (void*)(uintptr_t)lpdefault, (void*)(uintptr_t)lpreturnedstring, (uint32_t)nsize, (void*)(uintptr_t)lpfilename) : 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpdefault;
    (void)lpreturnedstring;
    (void)nsize;
    (void)lpfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getPrivateProfileStructA(JNIEnv* km_env, jclass km_clazz, jlong lpszsection, jlong lpszkey, jlong lpstruct, jint usizestruct, jlong szfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileStructA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsection, (void*)(uintptr_t)lpszkey, (void*)(uintptr_t)lpstruct, (uint32_t)usizestruct, (void*)(uintptr_t)szfile) : -1;
#else
    (void)lpszsection;
    (void)lpszkey;
    (void)lpstruct;
    (void)usizestruct;
    (void)szfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getPrivateProfileStructW(JNIEnv* km_env, jclass km_clazz, jlong lpszsection, jlong lpszkey, jlong lpstruct, jint usizestruct, jlong szfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileStructW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsection, (void*)(uintptr_t)lpszkey, (void*)(uintptr_t)lpstruct, (uint32_t)usizestruct, (void*)(uintptr_t)szfile) : -1;
#else
    (void)lpszsection;
    (void)lpszkey;
    (void)lpstruct;
    (void)usizestruct;
    (void)szfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getProfileIntA(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jint ndefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileIntA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (int32_t)ndefault) : 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)ndefault;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getProfileIntW(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jint ndefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileIntW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (int32_t)ndefault) : 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)ndefault;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getProfileSectionA(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpreturnedstring, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileSectionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpreturnedstring, (uint32_t)nsize) : 0;
#else
    (void)lpappname;
    (void)lpreturnedstring;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getProfileSectionW(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpreturnedstring, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileSectionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpreturnedstring, (uint32_t)nsize) : 0;
#else
    (void)lpappname;
    (void)lpreturnedstring;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getProfileStringA(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jlong lpdefault, jlong lpreturnedstring, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileStringA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (void*)(uintptr_t)lpdefault, (void*)(uintptr_t)lpreturnedstring, (uint32_t)nsize) : 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpdefault;
    (void)lpreturnedstring;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getProfileStringW(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jlong lpdefault, jlong lpreturnedstring, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileStringW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (void*)(uintptr_t)lpdefault, (void*)(uintptr_t)lpreturnedstring, (uint32_t)nsize) : 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpdefault;
    (void)lpreturnedstring;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getSystemRegistryQuota(JNIEnv* km_env, jclass km_clazz, jlong pdwquotaallowed, jlong pdwquotaused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemRegistryQuota");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwquotaallowed, (void*)(uintptr_t)pdwquotaused) : -1;
#else
    (void)pdwquotaallowed;
    (void)pdwquotaused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getThreadEnabledXStateFeatures(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadEnabledXStateFeatures");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getUserNameA(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jlong pcbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)pcbbuffer) : -1;
#else
    (void)lpbuffer;
    (void)pcbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getUserNameW(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer, jlong pcbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)pcbbuffer) : -1;
#else
    (void)lpbuffer;
    (void)pcbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getVersionFromFileA(JNIEnv* km_env, jclass km_clazz, jlong lpszfilename, jlong pdwmsver, jlong pdwlsver, jint bversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionFromFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)pdwmsver, (void*)(uintptr_t)pdwlsver, (int32_t)bversion) : -1;
#else
    (void)lpszfilename;
    (void)pdwmsver;
    (void)pdwlsver;
    (void)bversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getVersionFromFileExA(JNIEnv* km_env, jclass km_clazz, jlong lpszfilename, jlong pdwmsver, jlong pdwlsver, jint bversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionFromFileExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)pdwmsver, (void*)(uintptr_t)pdwlsver, (int32_t)bversion) : -1;
#else
    (void)lpszfilename;
    (void)pdwmsver;
    (void)pdwlsver;
    (void)bversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getVersionFromFileExW(JNIEnv* km_env, jclass km_clazz, jlong lpszfilename, jlong pdwmsver, jlong pdwlsver, jint bversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionFromFileExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)pdwmsver, (void*)(uintptr_t)pdwlsver, (int32_t)bversion) : -1;
#else
    (void)lpszfilename;
    (void)pdwmsver;
    (void)pdwlsver;
    (void)bversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getVersionFromFileW(JNIEnv* km_env, jclass km_clazz, jlong lpszfilename, jlong pdwmsver, jlong pdwlsver, jint bversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionFromFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)pdwmsver, (void*)(uintptr_t)pdwlsver, (int32_t)bversion) : -1;
#else
    (void)lpszfilename;
    (void)pdwmsver;
    (void)pdwlsver;
    (void)bversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1getWindowRegionData(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint size, jlong prd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowRegionData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)size, (void*)(uintptr_t)prd) : 0;
#else
    (void)hwnd;
    (void)size;
    (void)prd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1globalCompact(JNIEnv* km_env, jclass km_clazz, jint dwminfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalCompact");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwminfree) : 0;
#else
    (void)dwminfree;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1globalFix(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFix");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hmem);
#else
    (void)hmem;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1globalUnWire(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalUnWire");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : -1;
#else
    (void)hmem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1globalUnfix(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalUnfix");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hmem);
#else
    (void)hmem;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1globalWire(JNIEnv* km_env, jclass km_clazz, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalWire");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem) : NULL;
#else
    (void)hmem;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1iMPGetIMEA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPGetIMEA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1iMPGetIMEW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPGetIMEW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1iMPQueryIMEA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPQueryIMEA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1iMPQueryIMEW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPQueryIMEW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1iMPSetIMEA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPSetIMEA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1iMPSetIMEW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPSetIMEW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1isApiSetImplemented(JNIEnv* km_env, jclass km_clazz, jlong contract) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-apiquery-l2-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsApiSetImplemented");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)contract) : -1;
#else
    (void)contract;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1isBadHugeReadPtr(JNIEnv* km_env, jclass km_clazz, jlong lp, jlong ucb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadHugeReadPtr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lp, (uint64_t)ucb) : -1;
#else
    (void)lp;
    (void)ucb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1isBadHugeWritePtr(JNIEnv* km_env, jclass km_clazz, jlong lp, jlong ucb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadHugeWritePtr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lp, (uint64_t)ucb) : -1;
#else
    (void)lp;
    (void)ucb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1isNTAdmin(JNIEnv* km_env, jclass km_clazz, jint dwreserved, jlong lpdwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNTAdmin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwreserved, (void*)(uintptr_t)lpdwreserved) : -1;
#else
    (void)dwreserved;
    (void)lpdwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1isNativeVhdBoot(JNIEnv* km_env, jclass km_clazz, jlong nativevhdboot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNativeVhdBoot");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)nativevhdboot) : -1;
#else
    (void)nativevhdboot;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1isTokenUntrusted(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsTokenUntrusted");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle) : -1;
#else
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1launchINFSectionExW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinstance, jlong pszparms, jint nshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LaunchINFSectionExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)pszparms, (int32_t)nshow) : -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1launchINFSectionW(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong hinstance, jlong pszparams, jint nshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LaunchINFSectionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)pszparams, (int32_t)nshow) : -1;
#else
    (void)hwndowner;
    (void)hinstance;
    (void)pszparams;
    (void)nshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1localCompact(JNIEnv* km_env, jclass km_clazz, jint uminfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalCompact");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uminfree) : 0;
#else
    (void)uminfree;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1localShrink(JNIEnv* km_env, jclass km_clazz, jlong hmem, jint cbnewsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalShrink");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmem, (uint32_t)cbnewsize) : 0;
#else
    (void)hmem;
    (void)cbnewsize;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1mulDiv(JNIEnv* km_env, jclass km_clazz, jint nnumber, jint nnumerator, jint ndenominator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MulDiv");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nnumber, (int32_t)nnumerator, (int32_t)ndenominator) : -1;
#else
    (void)nnumber;
    (void)nnumerator;
    (void)ndenominator;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1needReboot(JNIEnv* km_env, jclass km_clazz, jint dwrebootcheck) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NeedReboot");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwrebootcheck) : -1;
#else
    (void)dwrebootcheck;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1needRebootInit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NeedRebootInit");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1openINFEngineA(JNIEnv* km_env, jclass km_clazz, jlong pszinffilename, jlong pszinstallsection, jint dwflags, jlong phinf, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenINFEngineA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszinffilename, (void*)(uintptr_t)pszinstallsection, (uint32_t)dwflags, (void*)(uintptr_t)phinf, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)pszinffilename;
    (void)pszinstallsection;
    (void)dwflags;
    (void)phinf;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1openINFEngineW(JNIEnv* km_env, jclass km_clazz, jlong pszinffilename, jlong pszinstallsection, jint dwflags, jlong phinf, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenINFEngineW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszinffilename, (void*)(uintptr_t)pszinstallsection, (uint32_t)dwflags, (void*)(uintptr_t)phinf, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)pszinffilename;
    (void)pszinstallsection;
    (void)dwflags;
    (void)phinf;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1openMutexA(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenMutexA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lpname) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1openSemaphoreA(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenSemaphoreA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lpname) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1queryAuxiliaryCounterFrequency(JNIEnv* km_env, jclass km_clazz, jlong lpauxiliarycounterfrequency) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryAuxiliaryCounterFrequency");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpauxiliarycounterfrequency) : -1;
#else
    (void)lpauxiliarycounterfrequency;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1queryIdleProcessorCycleTime(JNIEnv* km_env, jclass km_clazz, jlong bufferlength, jlong processoridlecycletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryIdleProcessorCycleTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bufferlength, (void*)(uintptr_t)processoridlecycletime) : -1;
#else
    (void)bufferlength;
    (void)processoridlecycletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1queryIdleProcessorCycleTimeEx(JNIEnv* km_env, jclass km_clazz, jshort group, jlong bufferlength, jlong processoridlecycletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryIdleProcessorCycleTimeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)group, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)processoridlecycletime) : -1;
#else
    (void)group;
    (void)bufferlength;
    (void)processoridlecycletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1queryInterruptTime(JNIEnv* km_env, jclass km_clazz, jlong lpinterrupttime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryInterruptTime");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpinterrupttime);
#else
    (void)lpinterrupttime;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1queryInterruptTimePrecise(JNIEnv* km_env, jclass km_clazz, jlong lpinterrupttimeprecise) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryInterruptTimePrecise");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpinterrupttimeprecise);
#else
    (void)lpinterrupttimeprecise;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1queryProcessCycleTime(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong cycletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryProcessCycleTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)cycletime) : -1;
#else
    (void)processhandle;
    (void)cycletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1queryThreadCycleTime(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jlong cycletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryThreadCycleTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (void*)(uintptr_t)cycletime) : -1;
#else
    (void)threadhandle;
    (void)cycletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1queryUnbiasedInterruptTime(JNIEnv* km_env, jclass km_clazz, jlong unbiasedtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryUnbiasedInterruptTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)unbiasedtime) : -1;
#else
    (void)unbiasedtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1queryUnbiasedInterruptTimePrecise(JNIEnv* km_env, jclass km_clazz, jlong lpunbiasedinterrupttimeprecise) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryUnbiasedInterruptTimePrecise");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpunbiasedinterrupttimeprecise);
#else
    (void)lpunbiasedinterrupttimeprecise;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1raiseCustomSystemEventTrigger(JNIEnv* km_env, jclass km_clazz, jlong customsystemeventtriggerconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-backgroundtask-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RaiseCustomSystemEventTrigger");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customsystemeventtriggerconfig) : 0;
#else
    (void)customsystemeventtriggerconfig;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rebootCheckOnInstallA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszinf, jlong pszsec, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RebootCheckOnInstallA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszinf, (void*)(uintptr_t)pszsec, (uint32_t)dwreserved) : -1;
#else
    (void)hwnd;
    (void)pszinf;
    (void)pszsec;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rebootCheckOnInstallW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszinf, jlong pszsec, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RebootCheckOnInstallW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszinf, (void*)(uintptr_t)pszsec, (uint32_t)dwreserved) : -1;
#else
    (void)hwnd;
    (void)pszinf;
    (void)pszsec;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1recordFeatureError(JNIEnv* km_env, jclass km_clazz, jint featureid, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecordFeatureError");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)featureid, (void*)(uintptr_t)error);
#else
    (void)featureid;
    (void)error;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1recordFeatureUsage(JNIEnv* km_env, jclass km_clazz, jint featureid, jint kind, jint addend, jlong originname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecordFeatureUsage");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)featureid, (uint32_t)kind, (uint32_t)addend, (void*)(uintptr_t)originname);
#else
    (void)featureid;
    (void)kind;
    (void)addend;
    (void)originname;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1regInstallA(JNIEnv* km_env, jclass km_clazz, jlong hmod, jlong pszsection, jlong psttable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegInstallA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmod, (void*)(uintptr_t)pszsection, (void*)(uintptr_t)psttable) : -1;
#else
    (void)hmod;
    (void)pszsection;
    (void)psttable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1regInstallW(JNIEnv* km_env, jclass km_clazz, jlong hmod, jlong pszsection, jlong psttable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegInstallW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmod, (void*)(uintptr_t)pszsection, (void*)(uintptr_t)psttable) : -1;
#else
    (void)hmod;
    (void)pszsection;
    (void)psttable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1regRestoreAllA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psztitlestring, jlong hkbckupkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRestoreAllA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psztitlestring, (void*)(uintptr_t)hkbckupkey) : -1;
#else
    (void)hwnd;
    (void)psztitlestring;
    (void)hkbckupkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1regRestoreAllW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psztitlestring, jlong hkbckupkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRestoreAllW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psztitlestring, (void*)(uintptr_t)hkbckupkey) : -1;
#else
    (void)hwnd;
    (void)psztitlestring;
    (void)hkbckupkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1regSaveRestoreA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psztitlestring, jlong hkbckupkey, jlong pcszrootkey, jlong pcszsubkey, jlong pcszvaluename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveRestoreA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psztitlestring, (void*)(uintptr_t)hkbckupkey, (void*)(uintptr_t)pcszrootkey, (void*)(uintptr_t)pcszsubkey, (void*)(uintptr_t)pcszvaluename, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)psztitlestring;
    (void)hkbckupkey;
    (void)pcszrootkey;
    (void)pcszsubkey;
    (void)pcszvaluename;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1regSaveRestoreOnINFA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psztitle, jlong pszinf, jlong pszsection, jlong hhklmbackkey, jlong hhkcubackkey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveRestoreOnINFA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psztitle, (void*)(uintptr_t)pszinf, (void*)(uintptr_t)pszsection, (void*)(uintptr_t)hhklmbackkey, (void*)(uintptr_t)hhkcubackkey, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)psztitle;
    (void)pszinf;
    (void)pszsection;
    (void)hhklmbackkey;
    (void)hhkcubackkey;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1regSaveRestoreOnINFW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psztitle, jlong pszinf, jlong pszsection, jlong hhklmbackkey, jlong hhkcubackkey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveRestoreOnINFW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psztitle, (void*)(uintptr_t)pszinf, (void*)(uintptr_t)pszsection, (void*)(uintptr_t)hhklmbackkey, (void*)(uintptr_t)hhkcubackkey, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)psztitle;
    (void)pszinf;
    (void)pszsection;
    (void)hhklmbackkey;
    (void)hhkcubackkey;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1regSaveRestoreW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psztitlestring, jlong hkbckupkey, jlong pcszrootkey, jlong pcszsubkey, jlong pcszvaluename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveRestoreW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psztitlestring, (void*)(uintptr_t)hkbckupkey, (void*)(uintptr_t)pcszrootkey, (void*)(uintptr_t)pcszsubkey, (void*)(uintptr_t)pcszvaluename, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)psztitlestring;
    (void)hkbckupkey;
    (void)pcszrootkey;
    (void)pcszsubkey;
    (void)pcszvaluename;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1replacePartitionUnit(JNIEnv* km_env, jclass km_clazz, jlong targetpartition, jlong sparepartition, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplacePartitionUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetpartition, (void*)(uintptr_t)sparepartition, (uint32_t)flags) : -1;
#else
    (void)targetpartition;
    (void)sparepartition;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1requestDeviceWakeup(JNIEnv* km_env, jclass km_clazz, jlong hdevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RequestDeviceWakeup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice) : -1;
#else
    (void)hdevice;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlAnsiStringToUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAnsiStringToUnicodeString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlCharToInteger(JNIEnv* km_env, jclass km_clazz, jlong string, jint base, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCharToInteger");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string, (uint32_t)base, (void*)(uintptr_t)value) : -1;
#else
    (void)string;
    (void)base;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlFreeAnsiString(JNIEnv* km_env, jclass km_clazz, jlong ansistring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeAnsiString");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ansistring);
#else
    (void)ansistring;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlFreeOemString(JNIEnv* km_env, jclass km_clazz, jlong oemstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeOemString");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)oemstring);
#else
    (void)oemstring;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlFreeUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong unicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeUnicodeString");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)unicodestring);
#else
    (void)unicodestring;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlGetReturnAddressHijackTarget(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetReturnAddressHijackTarget");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlInitAnsiString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitAnsiString");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring);
#else
    (void)destinationstring;
    (void)sourcestring;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlInitAnsiStringEx(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitAnsiStringEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlInitString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitString");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring);
#else
    (void)destinationstring;
    (void)sourcestring;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlInitStringEx(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitStringEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlInitUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitUnicodeString");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring);
#else
    (void)destinationstring;
    (void)sourcestring;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlIsNameLegalDOS8Dot3(JNIEnv* km_env, jclass km_clazz, jlong name, jlong oemname, jlong namecontainsspaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsNameLegalDOS8Dot3");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)oemname, (void*)(uintptr_t)namecontainsspaces) : false;
#else
    (void)name;
    (void)oemname;
    (void)namecontainsspaces;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlLocalTimeToSystemTime(JNIEnv* km_env, jclass km_clazz, jlong localtime, jlong systemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLocalTimeToSystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)localtime, (void*)(uintptr_t)systemtime) : -1;
#else
    (void)localtime;
    (void)systemtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlRaiseCustomSystemEventTrigger(JNIEnv* km_env, jclass km_clazz, jlong triggerconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRaiseCustomSystemEventTrigger");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)triggerconfig) : 0;
#else
    (void)triggerconfig;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlTimeToSecondsSince1970(JNIEnv* km_env, jclass km_clazz, jlong arg_0_time, jlong elapsedseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlTimeToSecondsSince1970");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_time, (void*)(uintptr_t)elapsedseconds) : false;
#else
    (void)arg_0_time;
    (void)elapsedseconds;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlUnicodeStringToAnsiString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeStringToAnsiString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlUnicodeStringToOemString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeStringToOemString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlUnicodeToMultiByteSize(JNIEnv* km_env, jclass km_clazz, jlong bytesinmultibytestring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToMultiByteSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bytesinmultibytestring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring) : -1;
#else
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1rtlUniform(JNIEnv* km_env, jclass km_clazz, jlong seed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUniform");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)seed) : 0;
#else
    (void)seed;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1runSetupCommandA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong szcmdname, jlong szinfsection, jlong szdir, jlong lpsztitle, jlong phexe, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RunSetupCommandA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)szcmdname, (void*)(uintptr_t)szinfsection, (void*)(uintptr_t)szdir, (void*)(uintptr_t)lpsztitle, (void*)(uintptr_t)phexe, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)hwnd;
    (void)szcmdname;
    (void)szinfsection;
    (void)szdir;
    (void)lpsztitle;
    (void)phexe;
    (void)dwflags;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1runSetupCommandW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong szcmdname, jlong szinfsection, jlong szdir, jlong lpsztitle, jlong phexe, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RunSetupCommandW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)szcmdname, (void*)(uintptr_t)szinfsection, (void*)(uintptr_t)szdir, (void*)(uintptr_t)lpsztitle, (void*)(uintptr_t)phexe, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)hwnd;
    (void)szcmdname;
    (void)szinfsection;
    (void)szdir;
    (void)lpsztitle;
    (void)phexe;
    (void)dwflags;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1sendIMEMessageExA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendIMEMessageExA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int64_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1sendIMEMessageExW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendIMEMessageExW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int64_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1setEnvironmentStringsA(JNIEnv* km_env, jclass km_clazz, jlong newenvironment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnvironmentStringsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)newenvironment) : -1;
#else
    (void)newenvironment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1setFirmwareEnvironmentVariableA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpguid, jlong pvalue, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFirmwareEnvironmentVariableA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)pvalue, (uint32_t)nsize) : -1;
#else
    (void)lpname;
    (void)lpguid;
    (void)pvalue;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1setFirmwareEnvironmentVariableExA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpguid, jlong pvalue, jint nsize, jint dwattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFirmwareEnvironmentVariableExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)pvalue, (uint32_t)nsize, (uint32_t)dwattributes) : -1;
#else
    (void)lpname;
    (void)lpguid;
    (void)pvalue;
    (void)nsize;
    (void)dwattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1setFirmwareEnvironmentVariableExW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpguid, jlong pvalue, jint nsize, jint dwattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFirmwareEnvironmentVariableExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)pvalue, (uint32_t)nsize, (uint32_t)dwattributes) : -1;
#else
    (void)lpname;
    (void)lpguid;
    (void)pvalue;
    (void)nsize;
    (void)dwattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1setFirmwareEnvironmentVariableW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpguid, jlong pvalue, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFirmwareEnvironmentVariableW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)pvalue, (uint32_t)nsize) : -1;
#else
    (void)lpname;
    (void)lpguid;
    (void)pvalue;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1setHandleCount(JNIEnv* km_env, jclass km_clazz, jint unumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetHandleCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)unumber) : 0;
#else
    (void)unumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1setMessageWaitingIndicator(JNIEnv* km_env, jclass km_clazz, jlong hmsgindicator, jint ulmsgcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMessageWaitingIndicator");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmsgindicator, (uint32_t)ulmsgcount) : -1;
#else
    (void)hmsgindicator;
    (void)ulmsgcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1setPerUserSecValuesA(JNIEnv* km_env, jclass km_clazz, jlong pperuser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPerUserSecValuesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pperuser) : -1;
#else
    (void)pperuser;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1setPerUserSecValuesW(JNIEnv* km_env, jclass km_clazz, jlong pperuser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPerUserSecValuesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pperuser) : -1;
#else
    (void)pperuser;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1subscribeFeatureStateChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong subscription, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubscribeFeatureStateChangeNotification");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)subscription, (void*)(uintptr_t)callback, (void*)(uintptr_t)context);
#else
    (void)subscription;
    (void)callback;
    (void)context;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1translateInfStringA(JNIEnv* km_env, jclass km_clazz, jlong pszinffilename, jlong pszinstallsection, jlong psztranslatesection, jlong psztranslatekey, jlong pszbuffer, jint cchbuffer, jlong pdwrequiredsize, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateInfStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszinffilename, (void*)(uintptr_t)pszinstallsection, (void*)(uintptr_t)psztranslatesection, (void*)(uintptr_t)psztranslatekey, (void*)(uintptr_t)pszbuffer, (uint32_t)cchbuffer, (void*)(uintptr_t)pdwrequiredsize, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)pszinffilename;
    (void)pszinstallsection;
    (void)psztranslatesection;
    (void)psztranslatekey;
    (void)pszbuffer;
    (void)cchbuffer;
    (void)pdwrequiredsize;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1translateInfStringExA(JNIEnv* km_env, jclass km_clazz, jlong hinf, jlong pszinffilename, jlong psztranslatesection, jlong psztranslatekey, jlong pszbuffer, jint dwbuffersize, jlong pdwrequiredsize, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateInfStringExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinf, (void*)(uintptr_t)pszinffilename, (void*)(uintptr_t)psztranslatesection, (void*)(uintptr_t)psztranslatekey, (void*)(uintptr_t)pszbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)pdwrequiredsize, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)hinf;
    (void)pszinffilename;
    (void)psztranslatesection;
    (void)psztranslatekey;
    (void)pszbuffer;
    (void)dwbuffersize;
    (void)pdwrequiredsize;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1translateInfStringExW(JNIEnv* km_env, jclass km_clazz, jlong hinf, jlong pszinffilename, jlong psztranslatesection, jlong psztranslatekey, jlong pszbuffer, jint dwbuffersize, jlong pdwrequiredsize, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateInfStringExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinf, (void*)(uintptr_t)pszinffilename, (void*)(uintptr_t)psztranslatesection, (void*)(uintptr_t)psztranslatekey, (void*)(uintptr_t)pszbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)pdwrequiredsize, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)hinf;
    (void)pszinffilename;
    (void)psztranslatesection;
    (void)psztranslatekey;
    (void)pszbuffer;
    (void)dwbuffersize;
    (void)pdwrequiredsize;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1translateInfStringW(JNIEnv* km_env, jclass km_clazz, jlong pszinffilename, jlong pszinstallsection, jlong psztranslatesection, jlong psztranslatekey, jlong pszbuffer, jint cchbuffer, jlong pdwrequiredsize, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateInfStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszinffilename, (void*)(uintptr_t)pszinstallsection, (void*)(uintptr_t)psztranslatesection, (void*)(uintptr_t)psztranslatekey, (void*)(uintptr_t)pszbuffer, (uint32_t)cchbuffer, (void*)(uintptr_t)pdwrequiredsize, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)pszinffilename;
    (void)pszinstallsection;
    (void)psztranslatesection;
    (void)psztranslatekey;
    (void)pszbuffer;
    (void)cchbuffer;
    (void)pdwrequiredsize;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1unsubscribeFeatureStateChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong subscription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnsubscribeFeatureStateChangeNotification");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)subscription);
#else
    (void)subscription;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1userInstStubWrapperA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinstance, jlong pszparms, jint nshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UserInstStubWrapperA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)pszparms, (int32_t)nshow) : -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1userInstStubWrapperW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinstance, jlong pszparms, jint nshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UserInstStubWrapperW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)pszparms, (int32_t)nshow) : -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1userUnInstStubWrapperA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinstance, jlong pszparms, jint nshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UserUnInstStubWrapperA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)pszparms, (int32_t)nshow) : -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1userUnInstStubWrapperW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinstance, jlong pszparms, jint nshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UserUnInstStubWrapperW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)pszparms, (int32_t)nshow) : -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wINNLSEnableIME(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WINNLSEnableIME");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wINNLSGetEnableStatus(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WINNLSGetEnableStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wINNLSGetIMEHotkey(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WINNLSGetIMEHotkey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1winWatchClose(JNIEnv* km_env, jclass km_clazz, jlong hww) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinWatchClose");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hww);
#else
    (void)hww;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1winWatchDidStatusChange(JNIEnv* km_env, jclass km_clazz, jlong hww) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinWatchDidStatusChange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hww) : -1;
#else
    (void)hww;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1winWatchGetClipList(JNIEnv* km_env, jclass km_clazz, jlong hww, jlong prc, jint size, jlong prd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinWatchGetClipList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hww, (void*)(uintptr_t)prc, (uint32_t)size, (void*)(uintptr_t)prd) : 0;
#else
    (void)hww;
    (void)prc;
    (void)size;
    (void)prd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1winWatchNotify(JNIEnv* km_env, jclass km_clazz, jlong hww, jlong notifycallback, jlong notifyparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinWatchNotify");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hww, (void*)(uintptr_t)notifycallback, (int64_t)notifyparam) : -1;
#else
    (void)hww;
    (void)notifycallback;
    (void)notifyparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1winWatchOpen(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinWatchOpen");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : NULL;
#else
    (void)hwnd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wldpCanExecuteBuffer(JNIEnv* km_env, jclass km_clazz, jlong host, jint options, jlong buffer, jint buffersize, jlong auditinfo, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpCanExecuteBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)host, (int32_t)options, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)auditinfo, (void*)(uintptr_t)result) : -1;
#else
    (void)host;
    (void)options;
    (void)buffer;
    (void)buffersize;
    (void)auditinfo;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wldpCanExecuteFile(JNIEnv* km_env, jclass km_clazz, jlong host, jint options, jlong filehandle, jlong auditinfo, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpCanExecuteFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)host, (int32_t)options, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)auditinfo, (void*)(uintptr_t)result) : -1;
#else
    (void)host;
    (void)options;
    (void)filehandle;
    (void)auditinfo;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wldpCanExecuteStream(JNIEnv* km_env, jclass km_clazz, jlong host, jint options, jlong stream, jlong auditinfo, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpCanExecuteStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)host, (int32_t)options, (void*)(uintptr_t)stream, (void*)(uintptr_t)auditinfo, (void*)(uintptr_t)result) : -1;
#else
    (void)host;
    (void)options;
    (void)stream;
    (void)auditinfo;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wldpGetLockdownPolicy(JNIEnv* km_env, jclass km_clazz, jlong hostinformation, jlong lockdownstate, jint lockdownflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpGetLockdownPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostinformation, (void*)(uintptr_t)lockdownstate, (uint32_t)lockdownflags) : -1;
#else
    (void)hostinformation;
    (void)lockdownstate;
    (void)lockdownflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wldpIsClassInApprovedList(JNIEnv* km_env, jclass km_clazz, jlong classid, jlong hostinformation, jlong isapproved, jint optionalflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpIsClassInApprovedList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)classid, (void*)(uintptr_t)hostinformation, (void*)(uintptr_t)isapproved, (uint32_t)optionalflags) : -1;
#else
    (void)classid;
    (void)hostinformation;
    (void)isapproved;
    (void)optionalflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wldpIsDynamicCodePolicyEnabled(JNIEnv* km_env, jclass km_clazz, jlong isenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpIsDynamicCodePolicyEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)isenabled) : -1;
#else
    (void)isenabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wldpQueryDeviceSecurityInformation(JNIEnv* km_env, jclass km_clazz, jlong information, jint informationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpQueryDeviceSecurityInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)information, (uint32_t)informationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)information;
    (void)informationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wldpQueryDynamicCodeTrust(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong baseimage, jint imagesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpQueryDynamicCodeTrust");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)baseimage, (uint32_t)imagesize) : -1;
#else
    (void)filehandle;
    (void)baseimage;
    (void)imagesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1wldpSetDynamicCodeTrust(JNIEnv* km_env, jclass km_clazz, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpSetDynamicCodeTrust");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle) : -1;
#else
    (void)filehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1writePrivateProfileSectionA(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpstring, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileSectionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpstring, (void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpappname;
    (void)lpstring;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1writePrivateProfileSectionW(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpstring, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileSectionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpstring, (void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpappname;
    (void)lpstring;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1writePrivateProfileStringA(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jlong lpstring, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (void*)(uintptr_t)lpstring, (void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpstring;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1writePrivateProfileStringW(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jlong lpstring, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (void*)(uintptr_t)lpstring, (void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpstring;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1writePrivateProfileStructA(JNIEnv* km_env, jclass km_clazz, jlong lpszsection, jlong lpszkey, jlong lpstruct, jint usizestruct, jlong szfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileStructA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsection, (void*)(uintptr_t)lpszkey, (void*)(uintptr_t)lpstruct, (uint32_t)usizestruct, (void*)(uintptr_t)szfile) : -1;
#else
    (void)lpszsection;
    (void)lpszkey;
    (void)lpstruct;
    (void)usizestruct;
    (void)szfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1writePrivateProfileStructW(JNIEnv* km_env, jclass km_clazz, jlong lpszsection, jlong lpszkey, jlong lpstruct, jint usizestruct, jlong szfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileStructW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsection, (void*)(uintptr_t)lpszkey, (void*)(uintptr_t)lpstruct, (uint32_t)usizestruct, (void*)(uintptr_t)szfile) : -1;
#else
    (void)lpszsection;
    (void)lpszkey;
    (void)lpstruct;
    (void)usizestruct;
    (void)szfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1writeProfileSectionA(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProfileSectionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpstring) : -1;
#else
    (void)lpappname;
    (void)lpstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1writeProfileSectionW(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProfileSectionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpstring) : -1;
#else
    (void)lpappname;
    (void)lpstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1writeProfileStringA(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProfileStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (void*)(uintptr_t)lpstring) : -1;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1writeProfileStringW(JNIEnv* km_env, jclass km_clazz, jlong lpappname, jlong lpkeyname, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProfileStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpappname, (void*)(uintptr_t)lpkeyname, (void*)(uintptr_t)lpstring) : -1;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1hread(JNIEnv* km_env, jclass km_clazz, jint hfile, jlong lpbuffer, jint lbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_hread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfile, (void*)(uintptr_t)lpbuffer, (int32_t)lbytes) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)lbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1hwrite(JNIEnv* km_env, jclass km_clazz, jint hfile, jlong lpbuffer, jint lbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_hwrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfile, (void*)(uintptr_t)lpbuffer, (int32_t)lbytes) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)lbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1lclose(JNIEnv* km_env, jclass km_clazz, jint hfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_lclose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfile) : -1;
#else
    (void)hfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1lcreat(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jint iattribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_lcreat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (int32_t)iattribute) : -1;
#else
    (void)lppathname;
    (void)iattribute;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1llseek(JNIEnv* km_env, jclass km_clazz, jint hfile, jint loffset, jint iorigin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_llseek");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfile, (int32_t)loffset, (int32_t)iorigin) : -1;
#else
    (void)hfile;
    (void)loffset;
    (void)iorigin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1lopen(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jint ireadwrite) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_lopen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (int32_t)ireadwrite) : -1;
#else
    (void)lppathname;
    (void)ireadwrite;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1lread(JNIEnv* km_env, jclass km_clazz, jint hfile, jlong lpbuffer, jint ubytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_lread");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)ubytes) : 0;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)ubytes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1lwrite(JNIEnv* km_env, jclass km_clazz, jint hfile, jlong lpbuffer, jint ubytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_lwrite");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)ubytes) : 0;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)ubytes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1uawLstrcmpW(JNIEnv* km_env, jclass km_clazz, jlong string1, jlong string2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_lstrcmpW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string1, (void*)(uintptr_t)string2) : -1;
#else
    (void)string1;
    (void)string2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1uawLstrcmpiW(JNIEnv* km_env, jclass km_clazz, jlong string1, jlong string2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_lstrcmpiW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string1, (void*)(uintptr_t)string2) : -1;
#else
    (void)string1;
    (void)string2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1uawLstrlenW(JNIEnv* km_env, jclass km_clazz, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_lstrlenW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string) : -1;
#else
    (void)string;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1uawWcschr(JNIEnv* km_env, jclass km_clazz, jlong string, jshort character) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_wcschr");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string, (uint16_t)character) : NULL;
#else
    (void)string;
    (void)character;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1uawWcscpy(JNIEnv* km_env, jclass km_clazz, jlong destination, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_wcscpy");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destination, (void*)(uintptr_t)source) : NULL;
#else
    (void)destination;
    (void)source;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1uawWcsicmp(JNIEnv* km_env, jclass km_clazz, jlong string1, jlong string2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_wcsicmp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string1, (void*)(uintptr_t)string2) : -1;
#else
    (void)string1;
    (void)string2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1uawWcslen(JNIEnv* km_env, jclass km_clazz, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_wcslen");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string) : 0;
#else
    (void)string;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_windowsprogramming_WindowsWin32SystemWindowsprogrammingJniBridge_windowssys_1windows_1win32_1system_1windowsprogramming_1uawWcsrchr(JNIEnv* km_env, jclass km_clazz, jlong string, jshort character) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_wcsrchr");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string, (uint16_t)character) : NULL;
#else
    (void)string;
    (void)character;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

