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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddMonitorA(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pmonitors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddMonitorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pmonitors) : -1;
#else
    (void)pname;
    (void)level;
    (void)pmonitors;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddMonitorW(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pmonitors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddMonitorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pmonitors) : -1;
#else
    (void)pname;
    (void)level;
    (void)pmonitors;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPortA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong hwnd, jlong pmonitorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPortA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pmonitorname) : -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pmonitorname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPortW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong hwnd, jlong pmonitorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPortW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pmonitorname) : -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pmonitorname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrintProcessorA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong ppathname, jlong pprintprocessorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrintProcessorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)ppathname, (void*)(uintptr_t)pprintprocessorname) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)ppathname;
    (void)pprintprocessorname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrintProcessorW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong ppathname, jlong pprintprocessorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrintProcessorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)ppathname, (void*)(uintptr_t)pprintprocessorname) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)ppathname;
    (void)pprintprocessorname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrintProvidorA(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pprovidorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrintProvidorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pprovidorinfo) : -1;
#else
    (void)pname;
    (void)level;
    (void)pprovidorinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrintProvidorW(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pprovidorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrintProvidorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pprovidorinfo) : -1;
#else
    (void)pname;
    (void)level;
    (void)pprovidorinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrinterA(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pprinter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pprinter) : NULL;
#else
    (void)pname;
    (void)level;
    (void)pprinter;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrinterConnection2A(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszname, jint dwlevel, jlong pconnectioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterConnection2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszname, (uint32_t)dwlevel, (void*)(uintptr_t)pconnectioninfo) : -1;
#else
    (void)hwnd;
    (void)pszname;
    (void)dwlevel;
    (void)pconnectioninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrinterConnection2W(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszname, jint dwlevel, jlong pconnectioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterConnection2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszname, (uint32_t)dwlevel, (void*)(uintptr_t)pconnectioninfo) : -1;
#else
    (void)hwnd;
    (void)pszname;
    (void)dwlevel;
    (void)pconnectioninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrinterConnectionA(JNIEnv* km_env, jclass km_clazz, jlong pname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterConnectionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname) : -1;
#else
    (void)pname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrinterConnectionW(JNIEnv* km_env, jclass km_clazz, jlong pname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterConnectionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname) : -1;
#else
    (void)pname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrinterDriverA(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pdriverinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterDriverA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pdriverinfo) : -1;
#else
    (void)pname;
    (void)level;
    (void)pdriverinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrinterDriverExA(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong lpbdriverinfo, jint dwfilecopyflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterDriverExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)lpbdriverinfo, (uint32_t)dwfilecopyflags) : -1;
#else
    (void)pname;
    (void)level;
    (void)lpbdriverinfo;
    (void)dwfilecopyflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrinterDriverExW(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong lpbdriverinfo, jint dwfilecopyflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterDriverExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)lpbdriverinfo, (uint32_t)dwfilecopyflags) : -1;
#else
    (void)pname;
    (void)level;
    (void)lpbdriverinfo;
    (void)dwfilecopyflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrinterDriverW(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pdriverinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterDriverW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pdriverinfo) : -1;
#else
    (void)pname;
    (void)level;
    (void)pdriverinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AddPrinterW(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pprinter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pprinter) : NULL;
#else
    (void)pname;
    (void)level;
    (void)pprinter;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1AppendPrinterNotifyInfoData(JNIEnv* km_env, jclass km_clazz, jlong pinfodest, jlong pdatasrc, jint fdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppendPrinterNotifyInfoData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinfodest, (void*)(uintptr_t)pdatasrc, (uint32_t)fdwflags) : -1;
#else
    (void)pinfodest;
    (void)pdatasrc;
    (void)fdwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1CallRouterFindFirstPrinterChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hprinterrpc, jint fdwfilterflags, jint fdwoptions, jlong hnotify, jlong pprinternotifyoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallRouterFindFirstPrinterChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprinterrpc, (uint32_t)fdwfilterflags, (uint32_t)fdwoptions, (void*)(uintptr_t)hnotify, (void*)(uintptr_t)pprinternotifyoptions) : 0;
#else
    (void)hprinterrpc;
    (void)fdwfilterflags;
    (void)fdwoptions;
    (void)hnotify;
    (void)pprinternotifyoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1CommonPropertySheetUIA(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong pfnpropsheetui, jlong lparam, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("compstui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommonPropertySheetUIA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)pfnpropsheetui, (int64_t)lparam, (void*)(uintptr_t)presult) : -1;
#else
    (void)hwndowner;
    (void)pfnpropsheetui;
    (void)lparam;
    (void)presult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1CommonPropertySheetUIW(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong pfnpropsheetui, jlong lparam, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("compstui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommonPropertySheetUIW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)pfnpropsheetui, (int64_t)lparam, (void*)(uintptr_t)presult) : -1;
#else
    (void)hwndowner;
    (void)pfnpropsheetui;
    (void)lparam;
    (void)presult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1ConfigurePortA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong hwnd, jlong pportname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConfigurePortA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pportname) : -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pportname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1ConfigurePortW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong hwnd, jlong pportname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConfigurePortW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pportname) : -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pportname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1ConnectToPrinterDlg(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConnectToPrinterDlg");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)flags) : NULL;
#else
    (void)hwnd;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1CreatePrintAsyncNotifyChannel(JNIEnv* km_env, jclass km_clazz, jlong pszname, jlong pnotificationtype, jint euserfilter, jint econversationstyle, jlong pcallback, jlong ppiasynchnotification) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrintAsyncNotifyChannel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname, (void*)(uintptr_t)pnotificationtype, (int32_t)euserfilter, (int32_t)econversationstyle, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)ppiasynchnotification) : -1;
#else
    (void)pszname;
    (void)pnotificationtype;
    (void)euserfilter;
    (void)econversationstyle;
    (void)pcallback;
    (void)ppiasynchnotification;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeleteMonitorA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong pmonitorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteMonitorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)pmonitorname) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pmonitorname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeleteMonitorW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong pmonitorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteMonitorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)pmonitorname) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pmonitorname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePortA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong hwnd, jlong pportname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePortA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pportname) : -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pportname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePortW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong hwnd, jlong pportname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePortW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pportname) : -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pportname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrintProcessorA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong pprintprocessorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrintProcessorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)pprintprocessorname) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pprintprocessorname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrintProcessorW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong pprintprocessorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrintProcessorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)pprintprocessorname) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pprintprocessorname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrintProvidorA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong pprintprovidorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrintProvidorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)pprintprovidorname) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pprintprovidorname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrintProvidorW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong pprintprovidorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrintProvidorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)pprintprovidorname) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pprintprovidorname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrinterConnectionA(JNIEnv* km_env, jclass km_clazz, jlong pname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterConnectionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname) : -1;
#else
    (void)pname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrinterConnectionW(JNIEnv* km_env, jclass km_clazz, jlong pname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterConnectionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname) : -1;
#else
    (void)pname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrinterDriverA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong pdrivername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)pdrivername) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pdrivername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrinterDriverExA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong pdrivername, jint dwdeleteflag, jint dwversionflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)pdrivername, (uint32_t)dwdeleteflag, (uint32_t)dwversionflag) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pdrivername;
    (void)dwdeleteflag;
    (void)dwversionflag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrinterDriverExW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong pdrivername, jint dwdeleteflag, jint dwversionflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)pdrivername, (uint32_t)dwdeleteflag, (uint32_t)dwversionflag) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pdrivername;
    (void)dwdeleteflag;
    (void)dwversionflag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrinterDriverPackageA(JNIEnv* km_env, jclass km_clazz, jlong pszserver, jlong pszinfpath, jlong pszenvironment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverPackageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszserver, (void*)(uintptr_t)pszinfpath, (void*)(uintptr_t)pszenvironment) : -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszenvironment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrinterDriverPackageW(JNIEnv* km_env, jclass km_clazz, jlong pszserver, jlong pszinfpath, jlong pszenvironment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverPackageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszserver, (void*)(uintptr_t)pszinfpath, (void*)(uintptr_t)pszenvironment) : -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszenvironment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrinterDriverW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jlong pdrivername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (void*)(uintptr_t)pdrivername) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pdrivername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DeletePrinterIC(JNIEnv* km_env, jclass km_clazz, jlong hprinteric) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterIC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprinteric) : -1;
#else
    (void)hprinteric;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1DevQueryPrintEx(JNIEnv* km_env, jclass km_clazz, jlong pdqpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevQueryPrintEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdqpinfo) : -1;
#else
    (void)pdqpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumMonitorsA(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pmonitor, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumMonitorsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pmonitor, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)pname;
    (void)level;
    (void)pmonitor;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumMonitorsW(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pmonitor, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumMonitorsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pmonitor, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)pname;
    (void)level;
    (void)pmonitor;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumPortsA(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pport, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPortsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pport, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)pname;
    (void)level;
    (void)pport;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumPortsW(JNIEnv* km_env, jclass km_clazz, jlong pname, jint level, jlong pport, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPortsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (uint32_t)level, (void*)(uintptr_t)pport, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)pname;
    (void)level;
    (void)pport;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumPrintProcessorDatatypesA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pprintprocessorname, jint level, jlong pdatatypes, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintProcessorDatatypesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pprintprocessorname, (uint32_t)level, (void*)(uintptr_t)pdatatypes, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)pname;
    (void)pprintprocessorname;
    (void)level;
    (void)pdatatypes;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumPrintProcessorDatatypesW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pprintprocessorname, jint level, jlong pdatatypes, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintProcessorDatatypesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pprintprocessorname, (uint32_t)level, (void*)(uintptr_t)pdatatypes, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)pname;
    (void)pprintprocessorname;
    (void)level;
    (void)pdatatypes;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumPrintProcessorsA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jint level, jlong pprintprocessorinfo, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintProcessorsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (uint32_t)level, (void*)(uintptr_t)pprintprocessorinfo, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pprintprocessorinfo;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumPrintProcessorsW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jint level, jlong pprintprocessorinfo, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintProcessorsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (uint32_t)level, (void*)(uintptr_t)pprintprocessorinfo, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pprintprocessorinfo;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumPrinterDriversA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jint level, jlong pdriverinfo, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrinterDriversA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (uint32_t)level, (void*)(uintptr_t)pdriverinfo, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pdriverinfo;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumPrinterDriversW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jint level, jlong pdriverinfo, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrinterDriversW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (uint32_t)level, (void*)(uintptr_t)pdriverinfo, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pdriverinfo;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumPrintersA(JNIEnv* km_env, jclass km_clazz, jint flags, jlong name, jint level, jlong pprinterenum, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintersA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)name, (uint32_t)level, (void*)(uintptr_t)pprinterenum, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)flags;
    (void)name;
    (void)level;
    (void)pprinterenum;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1EnumPrintersW(JNIEnv* km_env, jclass km_clazz, jint flags, jlong name, jint level, jlong pprinterenum, jint cbbuf, jlong pcbneeded, jlong pcreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintersW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)name, (uint32_t)level, (void*)(uintptr_t)pprinterenum, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded, (void*)(uintptr_t)pcreturned) : -1;
#else
    (void)flags;
    (void)name;
    (void)level;
    (void)pprinterenum;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1ExtDeviceMode(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinst, jlong pdevmodeoutput, jlong pdevicename, jlong pport, jlong pdevmodeinput, jlong pprofile, jint fmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtDeviceMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinst, (void*)(uintptr_t)pdevmodeoutput, (void*)(uintptr_t)pdevicename, (void*)(uintptr_t)pport, (void*)(uintptr_t)pdevmodeinput, (void*)(uintptr_t)pprofile, (uint32_t)fmode) : -1;
#else
    (void)hwnd;
    (void)hinst;
    (void)pdevmodeoutput;
    (void)pdevicename;
    (void)pport;
    (void)pdevmodeinput;
    (void)pprofile;
    (void)fmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1FindClosePrinterChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hchange) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindClosePrinterChangeNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hchange) : -1;
#else
    (void)hchange;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1FindNextPrinterChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hchange, jlong pdwchange, jlong pvreserved, jlong ppprinternotifyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextPrinterChangeNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hchange, (void*)(uintptr_t)pdwchange, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)ppprinternotifyinfo) : -1;
#else
    (void)hchange;
    (void)pdwchange;
    (void)pvreserved;
    (void)ppprinternotifyinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1FreePrintNamedPropertyArray(JNIEnv* km_env, jclass km_clazz, jint cproperties, jlong ppproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePrintNamedPropertyArray");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)cproperties, (void*)(uintptr_t)ppproperties);
#else
    (void)cproperties;
    (void)ppproperties;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1FreePrintPropertyValue(JNIEnv* km_env, jclass km_clazz, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePrintPropertyValue");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pvalue);
#else
    (void)pvalue;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1FreePrinterNotifyInfo(JNIEnv* km_env, jclass km_clazz, jlong pprinternotifyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePrinterNotifyInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprinternotifyinfo) : -1;
#else
    (void)pprinternotifyinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiDeleteSpoolFileHandle(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiDeleteSpoolFileHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle) : -1;
#else
    (void)spoolfilehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiEndDocEMF(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiEndDocEMF");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle) : -1;
#else
    (void)spoolfilehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiEndPageEMF(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle, jint dwoptimization) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiEndPageEMF");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle, (uint32_t)dwoptimization) : -1;
#else
    (void)spoolfilehandle;
    (void)dwoptimization;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiGetDC(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetDC");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle) : NULL;
#else
    (void)spoolfilehandle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiGetDevmodeForPage(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle, jint dwpagenumber, jlong pcurrdm, jlong plastdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetDevmodeForPage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle, (uint32_t)dwpagenumber, (void*)(uintptr_t)pcurrdm, (void*)(uintptr_t)plastdm) : -1;
#else
    (void)spoolfilehandle;
    (void)dwpagenumber;
    (void)pcurrdm;
    (void)plastdm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiGetPageCount(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetPageCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle) : 0;
#else
    (void)spoolfilehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiGetPageHandle(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle, jint page, jlong pdwpagetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetPageHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle, (uint32_t)page, (void*)(uintptr_t)pdwpagetype) : NULL;
#else
    (void)spoolfilehandle;
    (void)page;
    (void)pdwpagetype;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiGetSpoolFileHandle(JNIEnv* km_env, jclass km_clazz, jlong pwszprintername, jlong pdevmode, jlong pwszdocname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetSpoolFileHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszprintername, (void*)(uintptr_t)pdevmode, (void*)(uintptr_t)pwszdocname) : NULL;
#else
    (void)pwszprintername;
    (void)pdevmode;
    (void)pwszdocname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiPlayPageEMF(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle, jlong hemf, jlong prectdocument, jlong prectborder, jlong prectclip) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiPlayPageEMF");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle, (void*)(uintptr_t)hemf, (void*)(uintptr_t)prectdocument, (void*)(uintptr_t)prectborder, (void*)(uintptr_t)prectclip) : -1;
#else
    (void)spoolfilehandle;
    (void)hemf;
    (void)prectdocument;
    (void)prectborder;
    (void)prectclip;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiResetDCEMF(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle, jlong pcurrdm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiResetDCEMF");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle, (void*)(uintptr_t)pcurrdm) : -1;
#else
    (void)spoolfilehandle;
    (void)pcurrdm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiStartDocEMF(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle, jlong pdocinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiStartDocEMF");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle, (void*)(uintptr_t)pdocinfo) : -1;
#else
    (void)spoolfilehandle;
    (void)pdocinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GdiStartPageEMF(JNIEnv* km_env, jclass km_clazz, jlong spoolfilehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiStartPageEMF");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spoolfilehandle) : -1;
#else
    (void)spoolfilehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GenerateCopyFilePaths(JNIEnv* km_env, jclass km_clazz, jlong pszprintername, jlong pszdirectory, jlong psplclientinfo, jint dwlevel, jlong pszsourcedir, jlong pcchsourcedirsize, jlong psztargetdir, jlong pcchtargetdirsize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GenerateCopyFilePaths");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprintername, (void*)(uintptr_t)pszdirectory, (void*)(uintptr_t)psplclientinfo, (uint32_t)dwlevel, (void*)(uintptr_t)pszsourcedir, (void*)(uintptr_t)pcchsourcedirsize, (void*)(uintptr_t)psztargetdir, (void*)(uintptr_t)pcchtargetdirsize, (uint32_t)dwflags) : 0;
#else
    (void)pszprintername;
    (void)pszdirectory;
    (void)psplclientinfo;
    (void)dwlevel;
    (void)pszsourcedir;
    (void)pcchsourcedirsize;
    (void)psztargetdir;
    (void)pcchtargetdirsize;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetCPSUIUserData(JNIEnv* km_env, jclass km_clazz, jlong hdlg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("compstui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCPSUIUserData");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg) : 0;
#else
    (void)hdlg;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetCorePrinterDriversA(JNIEnv* km_env, jclass km_clazz, jlong pszserver, jlong pszenvironment, jlong pszzcoredriverdependencies, jint ccoreprinterdrivers, jlong pcoreprinterdrivers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCorePrinterDriversA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszserver, (void*)(uintptr_t)pszenvironment, (void*)(uintptr_t)pszzcoredriverdependencies, (uint32_t)ccoreprinterdrivers, (void*)(uintptr_t)pcoreprinterdrivers) : -1;
#else
    (void)pszserver;
    (void)pszenvironment;
    (void)pszzcoredriverdependencies;
    (void)ccoreprinterdrivers;
    (void)pcoreprinterdrivers;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetCorePrinterDriversW(JNIEnv* km_env, jclass km_clazz, jlong pszserver, jlong pszenvironment, jlong pszzcoredriverdependencies, jint ccoreprinterdrivers, jlong pcoreprinterdrivers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCorePrinterDriversW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszserver, (void*)(uintptr_t)pszenvironment, (void*)(uintptr_t)pszzcoredriverdependencies, (uint32_t)ccoreprinterdrivers, (void*)(uintptr_t)pcoreprinterdrivers) : -1;
#else
    (void)pszserver;
    (void)pszenvironment;
    (void)pszzcoredriverdependencies;
    (void)ccoreprinterdrivers;
    (void)pcoreprinterdrivers;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetDefaultPrinterA(JNIEnv* km_env, jclass km_clazz, jlong pszbuffer, jlong pcchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultPrinterA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszbuffer, (void*)(uintptr_t)pcchbuffer) : -1;
#else
    (void)pszbuffer;
    (void)pcchbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetDefaultPrinterW(JNIEnv* km_env, jclass km_clazz, jlong pszbuffer, jlong pcchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultPrinterW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszbuffer, (void*)(uintptr_t)pcchbuffer) : -1;
#else
    (void)pszbuffer;
    (void)pcchbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetJobAttributes(JNIEnv* km_env, jclass km_clazz, jlong pprintername, jlong pdevmode, jlong pattributeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetJobAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprintername, (void*)(uintptr_t)pdevmode, (void*)(uintptr_t)pattributeinfo) : -1;
#else
    (void)pprintername;
    (void)pdevmode;
    (void)pattributeinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetJobAttributesEx(JNIEnv* km_env, jclass km_clazz, jlong pprintername, jlong pdevmode, jint dwlevel, jlong pattributeinfo, jint nsize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetJobAttributesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprintername, (void*)(uintptr_t)pdevmode, (uint32_t)dwlevel, (void*)(uintptr_t)pattributeinfo, (uint32_t)nsize, (uint32_t)dwflags) : -1;
#else
    (void)pprintername;
    (void)pdevmode;
    (void)dwlevel;
    (void)pattributeinfo;
    (void)nsize;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetPrintExecutionData(JNIEnv* km_env, jclass km_clazz, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrintExecutionData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdata) : -1;
#else
    (void)pdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetPrintOutputInfo(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszprinter, jlong phfile, jlong ppszoutputfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrintOutputInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszprinter, (void*)(uintptr_t)phfile, (void*)(uintptr_t)ppszoutputfile) : -1;
#else
    (void)hwnd;
    (void)pszprinter;
    (void)phfile;
    (void)ppszoutputfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetPrintProcessorDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jint level, jlong pprintprocessorinfo, jint cbbuf, jlong pcbneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrintProcessorDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (uint32_t)level, (void*)(uintptr_t)pprintprocessorinfo, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pprintprocessorinfo;
    (void)cbbuf;
    (void)pcbneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetPrintProcessorDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jint level, jlong pprintprocessorinfo, jint cbbuf, jlong pcbneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrintProcessorDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (uint32_t)level, (void*)(uintptr_t)pprintprocessorinfo, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pprintprocessorinfo;
    (void)cbbuf;
    (void)pcbneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetPrinterDriverDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jint level, jlong pdriverdirectory, jint cbbuf, jlong pcbneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrinterDriverDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (uint32_t)level, (void*)(uintptr_t)pdriverdirectory, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pdriverdirectory;
    (void)cbbuf;
    (void)pcbneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetPrinterDriverDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong penvironment, jint level, jlong pdriverdirectory, jint cbbuf, jlong pcbneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrinterDriverDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)penvironment, (uint32_t)level, (void*)(uintptr_t)pdriverdirectory, (uint32_t)cbbuf, (void*)(uintptr_t)pcbneeded) : -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pdriverdirectory;
    (void)cbbuf;
    (void)pcbneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetPrinterDriverPackagePathA(JNIEnv* km_env, jclass km_clazz, jlong pszserver, jlong pszenvironment, jlong pszlanguage, jlong pszpackageid, jlong pszdriverpackagecab, jint cchdriverpackagecab, jlong pcchrequiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrinterDriverPackagePathA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszserver, (void*)(uintptr_t)pszenvironment, (void*)(uintptr_t)pszlanguage, (void*)(uintptr_t)pszpackageid, (void*)(uintptr_t)pszdriverpackagecab, (uint32_t)cchdriverpackagecab, (void*)(uintptr_t)pcchrequiredsize) : -1;
#else
    (void)pszserver;
    (void)pszenvironment;
    (void)pszlanguage;
    (void)pszpackageid;
    (void)pszdriverpackagecab;
    (void)cchdriverpackagecab;
    (void)pcchrequiredsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1GetPrinterDriverPackagePathW(JNIEnv* km_env, jclass km_clazz, jlong pszserver, jlong pszenvironment, jlong pszlanguage, jlong pszpackageid, jlong pszdriverpackagecab, jint cchdriverpackagecab, jlong pcchrequiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrinterDriverPackagePathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszserver, (void*)(uintptr_t)pszenvironment, (void*)(uintptr_t)pszlanguage, (void*)(uintptr_t)pszpackageid, (void*)(uintptr_t)pszdriverpackagecab, (uint32_t)cchdriverpackagecab, (void*)(uintptr_t)pcchrequiredsize) : -1;
#else
    (void)pszserver;
    (void)pszenvironment;
    (void)pszlanguage;
    (void)pszpackageid;
    (void)pszdriverpackagecab;
    (void)cchdriverpackagecab;
    (void)pcchrequiredsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1ImpersonatePrinterClient(JNIEnv* km_env, jclass km_clazz, jlong htoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonatePrinterClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken) : -1;
#else
    (void)htoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1InstallPrinterDriverFromPackageA(JNIEnv* km_env, jclass km_clazz, jlong pszserver, jlong pszinfpath, jlong pszdrivername, jlong pszenvironment, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallPrinterDriverFromPackageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszserver, (void*)(uintptr_t)pszinfpath, (void*)(uintptr_t)pszdrivername, (void*)(uintptr_t)pszenvironment, (uint32_t)dwflags) : -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszdrivername;
    (void)pszenvironment;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1InstallPrinterDriverFromPackageW(JNIEnv* km_env, jclass km_clazz, jlong pszserver, jlong pszinfpath, jlong pszdrivername, jlong pszenvironment, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallPrinterDriverFromPackageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszserver, (void*)(uintptr_t)pszinfpath, (void*)(uintptr_t)pszdrivername, (void*)(uintptr_t)pszenvironment, (uint32_t)dwflags) : -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszdrivername;
    (void)pszenvironment;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1IsValidDevmodeA(JNIEnv* km_env, jclass km_clazz, jlong pdevmode, jlong devmodesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidDevmodeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdevmode, (uint64_t)devmodesize) : -1;
#else
    (void)pdevmode;
    (void)devmodesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1IsValidDevmodeW(JNIEnv* km_env, jclass km_clazz, jlong pdevmode, jlong devmodesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidDevmodeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdevmode, (uint64_t)devmodesize) : -1;
#else
    (void)pdevmode;
    (void)devmodesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1OpenPrinter2A(JNIEnv* km_env, jclass km_clazz, jlong pprintername, jlong phprinter, jlong pdefault, jlong poptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrinter2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprintername, (void*)(uintptr_t)phprinter, (void*)(uintptr_t)pdefault, (void*)(uintptr_t)poptions) : -1;
#else
    (void)pprintername;
    (void)phprinter;
    (void)pdefault;
    (void)poptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1OpenPrinter2W(JNIEnv* km_env, jclass km_clazz, jlong pprintername, jlong phprinter, jlong pdefault, jlong poptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrinter2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprintername, (void*)(uintptr_t)phprinter, (void*)(uintptr_t)pdefault, (void*)(uintptr_t)poptions) : -1;
#else
    (void)pprintername;
    (void)phprinter;
    (void)pdefault;
    (void)poptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1OpenPrinterA(JNIEnv* km_env, jclass km_clazz, jlong pprintername, jlong phprinter, jlong pdefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrinterA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprintername, (void*)(uintptr_t)phprinter, (void*)(uintptr_t)pdefault) : -1;
#else
    (void)pprintername;
    (void)phprinter;
    (void)pdefault;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1OpenPrinterW(JNIEnv* km_env, jclass km_clazz, jlong pprintername, jlong phprinter, jlong pdefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrinterW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprintername, (void*)(uintptr_t)phprinter, (void*)(uintptr_t)pdefault) : -1;
#else
    (void)pprintername;
    (void)phprinter;
    (void)pdefault;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1PlayGdiScriptOnPrinterIC(JNIEnv* km_env, jclass km_clazz, jlong hprinteric, jlong pin, jint cin, jlong pout, jint cout, jint ul) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayGdiScriptOnPrinterIC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprinteric, (void*)(uintptr_t)pin, (uint32_t)cin, (void*)(uintptr_t)pout, (uint32_t)cout, (uint32_t)ul) : -1;
#else
    (void)hprinteric;
    (void)pin;
    (void)cin;
    (void)pout;
    (void)cout;
    (void)ul;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1RegisterForPrintAsyncNotifications(JNIEnv* km_env, jclass km_clazz, jlong pszname, jlong pnotificationtype, jint euserfilter, jint econversationstyle, jlong pcallback, jlong phnotify) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterForPrintAsyncNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname, (void*)(uintptr_t)pnotificationtype, (int32_t)euserfilter, (int32_t)econversationstyle, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)phnotify) : -1;
#else
    (void)pszname;
    (void)pnotificationtype;
    (void)euserfilter;
    (void)econversationstyle;
    (void)pcallback;
    (void)phnotify;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1RemovePrintDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong hdeviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePrintDeviceObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdeviceobject) : -1;
#else
    (void)hdeviceobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1ReplyPrinterChangeNotificationEx(JNIEnv* km_env, jclass km_clazz, jlong hnotify, jint dwcolor, jint fdwflags, jlong pdwresult, jlong pprinternotifyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplyPrinterChangeNotificationEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnotify, (uint32_t)dwcolor, (uint32_t)fdwflags, (void*)(uintptr_t)pdwresult, (void*)(uintptr_t)pprinternotifyinfo) : -1;
#else
    (void)hnotify;
    (void)dwcolor;
    (void)fdwflags;
    (void)pdwresult;
    (void)pprinternotifyinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1ReportJobProcessingProgress(JNIEnv* km_env, jclass km_clazz, jlong printerhandle, jint jobid, jint joboperation, jint jobprogress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportJobProcessingProgress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)printerhandle, (uint32_t)jobid, (int32_t)joboperation, (int32_t)jobprogress) : -1;
#else
    (void)printerhandle;
    (void)jobid;
    (void)joboperation;
    (void)jobprogress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1RevertToPrinterSelf(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevertToPrinterSelf");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1RouterAllocBidiMem(JNIEnv* km_env, jclass km_clazz, jlong numbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterAllocBidiMem");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)numbytes) : NULL;
#else
    (void)numbytes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1RouterAllocBidiResponseContainer(JNIEnv* km_env, jclass km_clazz, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterAllocBidiResponseContainer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)count) : NULL;
#else
    (void)count;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1RouterAllocPrinterNotifyInfo(JNIEnv* km_env, jclass km_clazz, jint cprinternotifyinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterAllocPrinterNotifyInfo");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cprinternotifyinfodata) : NULL;
#else
    (void)cprinternotifyinfodata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1RouterFreeBidiMem(JNIEnv* km_env, jclass km_clazz, jlong pmempointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterFreeBidiMem");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pmempointer);
#else
    (void)pmempointer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1RouterFreeBidiResponseContainer(JNIEnv* km_env, jclass km_clazz, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterFreeBidiResponseContainer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdata) : 0;
#else
    (void)pdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1RouterFreePrinterNotifyInfo(JNIEnv* km_env, jclass km_clazz, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterFreePrinterNotifyInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinfo) : -1;
#else
    (void)pinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1SetCPSUIUserData(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong cpsuiuserdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("compstui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCPSUIUserData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (uint64_t)cpsuiuserdata) : -1;
#else
    (void)hdlg;
    (void)cpsuiuserdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1SetDefaultPrinterA(JNIEnv* km_env, jclass km_clazz, jlong pszprinter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDefaultPrinterA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprinter) : -1;
#else
    (void)pszprinter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1SetDefaultPrinterW(JNIEnv* km_env, jclass km_clazz, jlong pszprinter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDefaultPrinterW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprinter) : -1;
#else
    (void)pszprinter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1SetPortA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pportname, jint dwlevel, jlong pportinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPortA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pportname, (uint32_t)dwlevel, (void*)(uintptr_t)pportinfo) : -1;
#else
    (void)pname;
    (void)pportname;
    (void)dwlevel;
    (void)pportinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1SetPortW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pportname, jint dwlevel, jlong pportinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPortW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pportname, (uint32_t)dwlevel, (void*)(uintptr_t)pportinfo) : -1;
#else
    (void)pname;
    (void)pportname;
    (void)dwlevel;
    (void)pportinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1SpoolerCopyFileEvent(JNIEnv* km_env, jclass km_clazz, jlong pszprintername, jlong pszkey, jint dwcopyfileevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SpoolerCopyFileEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprintername, (void*)(uintptr_t)pszkey, (uint32_t)dwcopyfileevent) : -1;
#else
    (void)pszprintername;
    (void)pszkey;
    (void)dwcopyfileevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1SpoolerFreePrinterNotifyInfo(JNIEnv* km_env, jclass km_clazz, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SpoolerFreePrinterNotifyInfo");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pinfo);
#else
    (void)pinfo;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1UnRegisterForPrintAsyncNotifications(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnRegisterForPrintAsyncNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1UploadPrinterDriverPackageA(JNIEnv* km_env, jclass km_clazz, jlong pszserver, jlong pszinfpath, jlong pszenvironment, jint dwflags, jlong hwnd, jlong pszdestinfpath, jlong pcchdestinfpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UploadPrinterDriverPackageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszserver, (void*)(uintptr_t)pszinfpath, (void*)(uintptr_t)pszenvironment, (uint32_t)dwflags, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszdestinfpath, (void*)(uintptr_t)pcchdestinfpath) : -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszenvironment;
    (void)dwflags;
    (void)hwnd;
    (void)pszdestinfpath;
    (void)pcchdestinfpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1UploadPrinterDriverPackageW(JNIEnv* km_env, jclass km_clazz, jlong pszserver, jlong pszinfpath, jlong pszenvironment, jint dwflags, jlong hwnd, jlong pszdestinfpath, jlong pcchdestinfpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UploadPrinterDriverPackageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszserver, (void*)(uintptr_t)pszinfpath, (void*)(uintptr_t)pszenvironment, (uint32_t)dwflags, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszdestinfpath, (void*)(uintptr_t)pcchdestinfpath) : -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszenvironment;
    (void)dwflags;
    (void)hwnd;
    (void)pszdestinfpath;
    (void)pcchdestinfpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_WindowsWin32GraphicsPrintingJniBridge_windowssys_1windows_1win32_1graphics_1printing_1XcvDataW(JNIEnv* km_env, jclass km_clazz, jlong hxcv, jlong pszdataname, jlong pinputdata, jint cbinputdata, jlong poutputdata, jint cboutputdata, jlong pcboutputneeded, jlong pdwstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XcvDataW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hxcv, (void*)(uintptr_t)pszdataname, (void*)(uintptr_t)pinputdata, (uint32_t)cbinputdata, (void*)(uintptr_t)poutputdata, (uint32_t)cboutputdata, (void*)(uintptr_t)pcboutputneeded, (void*)(uintptr_t)pdwstatus) : -1;
#else
    (void)hxcv;
    (void)pszdataname;
    (void)pinputdata;
    (void)cbinputdata;
    (void)poutputdata;
    (void)cboutputdata;
    (void)pcboutputneeded;
    (void)pdwstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

