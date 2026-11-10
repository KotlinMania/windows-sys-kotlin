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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1cLRCreateInstance(JNIEnv* km_env, jclass km_clazz, jlong clsid, jlong riid, jlong ppinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLRCreateInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsid, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppinterface);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsid;
    (void)riid;
    (void)ppinterface;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1callFunctionShim(JNIEnv* km_env, jclass km_clazz, jlong szdllname, jlong szfunctionname, jlong lpvargument1, jlong lpvargument2, jlong szversion, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallFunctionShim");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdllname, (void*)(uintptr_t)szfunctionname, (void*)(uintptr_t)lpvargument1, (void*)(uintptr_t)lpvargument2, (void*)(uintptr_t)szversion, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szdllname;
    (void)szfunctionname;
    (void)lpvargument1;
    (void)lpvargument2;
    (void)szversion;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1clrCreateManagedInstance(JNIEnv* km_env, jclass km_clazz, jlong ptypename, jlong riid, jlong ppobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClrCreateManagedInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptypename, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptypename;
    (void)riid;
    (void)ppobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1corBindToCurrentRuntime(JNIEnv* km_env, jclass km_clazz, jlong pwszfilename, jlong rclsid, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorBindToCurrentRuntime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszfilename, (void*)(uintptr_t)rclsid, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszfilename;
    (void)rclsid;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1corBindToRuntime(JNIEnv* km_env, jclass km_clazz, jlong pwszversion, jlong pwszbuildflavor, jlong rclsid, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorBindToRuntime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszversion, (void*)(uintptr_t)pwszbuildflavor, (void*)(uintptr_t)rclsid, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszversion;
    (void)pwszbuildflavor;
    (void)rclsid;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1corBindToRuntimeByCfg(JNIEnv* km_env, jclass km_clazz, jlong pcfgstream, jint reserved, jint startupflags, jlong rclsid, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorBindToRuntimeByCfg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcfgstream, (uint32_t)reserved, (uint32_t)startupflags, (void*)(uintptr_t)rclsid, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcfgstream;
    (void)reserved;
    (void)startupflags;
    (void)rclsid;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1corBindToRuntimeEx(JNIEnv* km_env, jclass km_clazz, jlong pwszversion, jlong pwszbuildflavor, jint startupflags, jlong rclsid, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorBindToRuntimeEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszversion, (void*)(uintptr_t)pwszbuildflavor, (uint32_t)startupflags, (void*)(uintptr_t)rclsid, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszversion;
    (void)pwszbuildflavor;
    (void)startupflags;
    (void)rclsid;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1corBindToRuntimeHost(JNIEnv* km_env, jclass km_clazz, jlong pwszversion, jlong pwszbuildflavor, jlong pwszhostconfigfile, jlong preserved, jint startupflags, jlong rclsid, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorBindToRuntimeHost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszversion, (void*)(uintptr_t)pwszbuildflavor, (void*)(uintptr_t)pwszhostconfigfile, (void*)(uintptr_t)preserved, (uint32_t)startupflags, (void*)(uintptr_t)rclsid, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszversion;
    (void)pwszbuildflavor;
    (void)pwszhostconfigfile;
    (void)preserved;
    (void)startupflags;
    (void)rclsid;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1corExitProcess(JNIEnv* km_env, jclass km_clazz, jint exitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorExitProcess");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)exitcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)exitcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1corLaunchApplication(JNIEnv* km_env, jclass km_clazz, jint dwclickoncehost, jlong pwzappfullname, jint dwmanifestpaths, jlong ppwzmanifestpaths, jint dwactivationdata, jlong ppwzactivationdata, jlong lpprocessinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorLaunchApplication");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)dwclickoncehost, (void*)(uintptr_t)pwzappfullname, (uint32_t)dwmanifestpaths, (void*)(uintptr_t)ppwzmanifestpaths, (uint32_t)dwactivationdata, (void*)(uintptr_t)ppwzactivationdata, (void*)(uintptr_t)lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwclickoncehost;
    (void)pwzappfullname;
    (void)dwmanifestpaths;
    (void)ppwzmanifestpaths;
    (void)dwactivationdata;
    (void)ppwzactivationdata;
    (void)lpprocessinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1corMarkThreadInThreadPool(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorMarkThreadInThreadPool");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1createDebuggingInterfaceFromVersion(JNIEnv* km_env, jclass km_clazz, jint idebuggerversion, jlong szdebuggeeversion, jlong ppcordb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDebuggingInterfaceFromVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)idebuggerversion, (void*)(uintptr_t)szdebuggeeversion, (void*)(uintptr_t)ppcordb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idebuggerversion;
    (void)szdebuggeeversion;
    (void)ppcordb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1getCLRIdentityManager(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong ppmanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCLRIdentityManager");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)ppmanager);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)riid;
    (void)ppmanager;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1getCORRequiredVersion(JNIEnv* km_env, jclass km_clazz, jlong pbuffer, jint cchbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCORRequiredVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbuffer, (uint32_t)cchbuffer, (void*)(uintptr_t)dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbuffer;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1getCORSystemDirectory(JNIEnv* km_env, jclass km_clazz, jlong pbuffer, jint cchbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCORSystemDirectory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbuffer, (uint32_t)cchbuffer, (void*)(uintptr_t)dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbuffer;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1getCORVersion(JNIEnv* km_env, jclass km_clazz, jlong pbbuffer, jint cchbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCORVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbbuffer, (uint32_t)cchbuffer, (void*)(uintptr_t)dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbbuffer;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1getFileVersion(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jlong szbuffer, jint cchbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfilename, (void*)(uintptr_t)szbuffer, (uint32_t)cchbuffer, (void*)(uintptr_t)dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfilename;
    (void)szbuffer;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1getRealProcAddress(JNIEnv* km_env, jclass km_clazz, jlong pwszprocname, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRealProcAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszprocname, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszprocname;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1getRequestedRuntimeInfo(JNIEnv* km_env, jclass km_clazz, jlong pexe, jlong pwszversion, jlong pconfigurationfile, jint startupflags, jint runtimeinfoflags, jlong pdirectory, jint dwdirectory, jlong dwdirectorylength, jlong pversion, jint cchbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRequestedRuntimeInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pexe, (void*)(uintptr_t)pwszversion, (void*)(uintptr_t)pconfigurationfile, (uint32_t)startupflags, (uint32_t)runtimeinfoflags, (void*)(uintptr_t)pdirectory, (uint32_t)dwdirectory, (void*)(uintptr_t)dwdirectorylength, (void*)(uintptr_t)pversion, (uint32_t)cchbuffer, (void*)(uintptr_t)dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pexe;
    (void)pwszversion;
    (void)pconfigurationfile;
    (void)startupflags;
    (void)runtimeinfoflags;
    (void)pdirectory;
    (void)dwdirectory;
    (void)dwdirectorylength;
    (void)pversion;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1getRequestedRuntimeVersion(JNIEnv* km_env, jclass km_clazz, jlong pexe, jlong pversion, jint cchbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRequestedRuntimeVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pexe, (void*)(uintptr_t)pversion, (uint32_t)cchbuffer, (void*)(uintptr_t)dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pexe;
    (void)pversion;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1getRequestedRuntimeVersionForCLSID(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong pversion, jint cchbuffer, jlong dwlength, jint dwresolutionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRequestedRuntimeVersionForCLSID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)pversion, (uint32_t)cchbuffer, (void*)(uintptr_t)dwlength, (int32_t)dwresolutionflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rclsid;
    (void)pversion;
    (void)cchbuffer;
    (void)dwlength;
    (void)dwresolutionflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1getVersionFromProcess(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pversion, jint cchbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionFromProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pversion, (uint32_t)cchbuffer, (void*)(uintptr_t)dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)pversion;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1loadLibraryShim(JNIEnv* km_env, jclass km_clazz, jlong szdllname, jlong szversion, jlong pvreserved, jlong phmoddll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadLibraryShim");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdllname, (void*)(uintptr_t)szversion, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)phmoddll);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szdllname;
    (void)szversion;
    (void)pvreserved;
    (void)phmoddll;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1loadStringRC(JNIEnv* km_env, jclass km_clazz, jint iresouceid, jlong szbuffer, jint imax, jint bquiet) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadStringRC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)iresouceid, (void*)(uintptr_t)szbuffer, (int32_t)imax, (int32_t)bquiet);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iresouceid;
    (void)szbuffer;
    (void)imax;
    (void)bquiet;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1loadStringRCEx(JNIEnv* km_env, jclass km_clazz, jint lcid, jint iresouceid, jlong szbuffer, jint imax, jint bquiet, jlong pcwchused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadStringRCEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)lcid, (uint32_t)iresouceid, (void*)(uintptr_t)szbuffer, (int32_t)imax, (int32_t)bquiet, (void*)(uintptr_t)pcwchused);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lcid;
    (void)iresouceid;
    (void)szbuffer;
    (void)imax;
    (void)bquiet;
    (void)pcwchused;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1lockClrVersion(JNIEnv* km_env, jclass km_clazz, jlong hostcallback, jlong pbeginhostsetup, jlong pendhostsetup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockClrVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostcallback, (void*)(uintptr_t)pbeginhostsetup, (void*)(uintptr_t)pendhostsetup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hostcallback;
    (void)pbeginhostsetup;
    (void)pendhostsetup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_clrhosting_WindowsWin32SystemClrhostingJniBridge_windowssys_1windows_1win32_1system_1clrhosting_1runDll32ShimW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinst, jlong lpszcmdline, jint ncmdshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RunDll32ShimW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinst, (void*)(uintptr_t)lpszcmdline, (int32_t)ncmdshow);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hinst;
    (void)lpszcmdline;
    (void)ncmdshow;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

