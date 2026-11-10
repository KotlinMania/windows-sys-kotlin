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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1browseForGPO(JNIEnv* km_env, jclass km_clazz, jlong lpbrowseinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BrowseForGPO");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbrowseinfo) : -1;
#else
    (void)lpbrowseinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1commandLineFromMsiDescriptor(JNIEnv* km_env, jclass km_clazz, jlong descriptor, jlong commandline, jlong commandlinelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommandLineFromMsiDescriptor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)descriptor, (void*)(uintptr_t)commandline, (void*)(uintptr_t)commandlinelength) : 0;
#else
    (void)descriptor;
    (void)commandline;
    (void)commandlinelength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1createGPOLink(JNIEnv* km_env, jclass km_clazz, jlong lpgpo, jlong lpcontainer, jint fhighpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateGPOLink");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpgpo, (void*)(uintptr_t)lpcontainer, (int32_t)fhighpriority) : -1;
#else
    (void)lpgpo;
    (void)lpcontainer;
    (void)fhighpriority;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1deleteAllGPOLinks(JNIEnv* km_env, jclass km_clazz, jlong lpcontainer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAllGPOLinks");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcontainer) : -1;
#else
    (void)lpcontainer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1deleteGPOLink(JNIEnv* km_env, jclass km_clazz, jlong lpgpo, jlong lpcontainer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteGPOLink");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpgpo, (void*)(uintptr_t)lpcontainer) : -1;
#else
    (void)lpgpo;
    (void)lpcontainer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1enterCriticalPolicySection(JNIEnv* km_env, jclass km_clazz, jint bmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnterCriticalPolicySection");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)bmachine) : NULL;
#else
    (void)bmachine;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1exportRSoPData(JNIEnv* km_env, jclass km_clazz, jlong lpnamespace, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportRSoPData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnamespace, (void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpnamespace;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1freeGPOListA(JNIEnv* km_env, jclass km_clazz, jlong pgpolist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeGPOListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pgpolist) : -1;
#else
    (void)pgpolist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1freeGPOListW(JNIEnv* km_env, jclass km_clazz, jlong pgpolist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeGPOListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pgpolist) : -1;
#else
    (void)pgpolist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1generateGPNotification(JNIEnv* km_env, jclass km_clazz, jint bmachine, jlong lpwszmgmtproduct, jint dwmgmtproductoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GenerateGPNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)bmachine, (void*)(uintptr_t)lpwszmgmtproduct, (uint32_t)dwmgmtproductoptions) : 0;
#else
    (void)bmachine;
    (void)lpwszmgmtproduct;
    (void)dwmgmtproductoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1getAppliedGPOListA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pmachinename, jlong psiduser, jlong pguidextension, jlong ppgpolist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppliedGPOListA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pmachinename, (void*)(uintptr_t)psiduser, (void*)(uintptr_t)pguidextension, (void*)(uintptr_t)ppgpolist) : 0;
#else
    (void)dwflags;
    (void)pmachinename;
    (void)psiduser;
    (void)pguidextension;
    (void)ppgpolist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1getAppliedGPOListW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pmachinename, jlong psiduser, jlong pguidextension, jlong ppgpolist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppliedGPOListW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pmachinename, (void*)(uintptr_t)psiduser, (void*)(uintptr_t)pguidextension, (void*)(uintptr_t)ppgpolist) : 0;
#else
    (void)dwflags;
    (void)pmachinename;
    (void)psiduser;
    (void)pguidextension;
    (void)ppgpolist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1getGPOListA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong lpname, jlong lphostname, jlong lpcomputername, jint dwflags, jlong pgpolist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGPOListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lphostname, (void*)(uintptr_t)lpcomputername, (uint32_t)dwflags, (void*)(uintptr_t)pgpolist) : -1;
#else
    (void)htoken;
    (void)lpname;
    (void)lphostname;
    (void)lpcomputername;
    (void)dwflags;
    (void)pgpolist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1getGPOListW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong lpname, jlong lphostname, jlong lpcomputername, jint dwflags, jlong pgpolist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGPOListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lphostname, (void*)(uintptr_t)lpcomputername, (uint32_t)dwflags, (void*)(uintptr_t)pgpolist) : -1;
#else
    (void)htoken;
    (void)lpname;
    (void)lphostname;
    (void)lpcomputername;
    (void)dwflags;
    (void)pgpolist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1getLocalManagedApplicationData(JNIEnv* km_env, jclass km_clazz, jlong productcode, jlong displayname, jlong supporturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLocalManagedApplicationData");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)productcode, (void*)(uintptr_t)displayname, (void*)(uintptr_t)supporturl);
#else
    (void)productcode;
    (void)displayname;
    (void)supporturl;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1getLocalManagedApplications(JNIEnv* km_env, jclass km_clazz, jint buserapps, jlong pdwapps, jlong prglocalapps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLocalManagedApplications");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)buserapps, (void*)(uintptr_t)pdwapps, (void*)(uintptr_t)prglocalapps) : 0;
#else
    (void)buserapps;
    (void)pdwapps;
    (void)prglocalapps;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1getManagedApplicationCategories(JNIEnv* km_env, jclass km_clazz, jint dwreserved, jlong pappcategory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetManagedApplicationCategories");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwreserved, (void*)(uintptr_t)pappcategory) : 0;
#else
    (void)dwreserved;
    (void)pappcategory;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1getManagedApplications(JNIEnv* km_env, jclass km_clazz, jlong pcategory, jint dwqueryflags, jint dwinfolevel, jlong pdwapps, jlong prgmanagedapps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetManagedApplications");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcategory, (uint32_t)dwqueryflags, (uint32_t)dwinfolevel, (void*)(uintptr_t)pdwapps, (void*)(uintptr_t)prgmanagedapps) : 0;
#else
    (void)pcategory;
    (void)dwqueryflags;
    (void)dwinfolevel;
    (void)pdwapps;
    (void)prgmanagedapps;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1importRSoPData(JNIEnv* km_env, jclass km_clazz, jlong lpnamespace, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gpedit.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportRSoPData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnamespace, (void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpnamespace;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1installApplication(JNIEnv* km_env, jclass km_clazz, jlong pinstallinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallApplication");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstallinfo) : 0;
#else
    (void)pinstallinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1leaveCriticalPolicySection(JNIEnv* km_env, jclass km_clazz, jlong hsection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LeaveCriticalPolicySection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsection) : -1;
#else
    (void)hsection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1processGroupPolicyCompleted(JNIEnv* km_env, jclass km_clazz, jlong extensionid, jlong pasynchandle, jint dwstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessGroupPolicyCompleted");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)extensionid, (uint64_t)pasynchandle, (uint32_t)dwstatus) : 0;
#else
    (void)extensionid;
    (void)pasynchandle;
    (void)dwstatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1processGroupPolicyCompletedEx(JNIEnv* km_env, jclass km_clazz, jlong extensionid, jlong pasynchandle, jint dwstatus, jint rsopstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessGroupPolicyCompletedEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)extensionid, (uint64_t)pasynchandle, (uint32_t)dwstatus, (int32_t)rsopstatus) : 0;
#else
    (void)extensionid;
    (void)pasynchandle;
    (void)dwstatus;
    (void)rsopstatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1refreshPolicy(JNIEnv* km_env, jclass km_clazz, jint bmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)bmachine) : -1;
#else
    (void)bmachine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1refreshPolicyEx(JNIEnv* km_env, jclass km_clazz, jint bmachine, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshPolicyEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)bmachine, (uint32_t)dwoptions) : -1;
#else
    (void)bmachine;
    (void)dwoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1registerGPNotification(JNIEnv* km_env, jclass km_clazz, jlong hevent, jint bmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterGPNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hevent, (int32_t)bmachine) : -1;
#else
    (void)hevent;
    (void)bmachine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1rsopAccessCheckByType(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong pprincipalselfsid, jlong prsoptoken, jint dwdesiredaccessmask, jlong pobjecttypelist, jint objecttypelistlength, jlong pgenericmapping, jlong pprivilegeset, jlong pdwprivilegesetlength, jlong pdwgrantedaccessmask, jlong pbaccessstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RsopAccessCheckByType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)pprincipalselfsid, (void*)(uintptr_t)prsoptoken, (uint32_t)dwdesiredaccessmask, (void*)(uintptr_t)pobjecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)pgenericmapping, (void*)(uintptr_t)pprivilegeset, (void*)(uintptr_t)pdwprivilegesetlength, (void*)(uintptr_t)pdwgrantedaccessmask, (void*)(uintptr_t)pbaccessstatus) : -1;
#else
    (void)psecuritydescriptor;
    (void)pprincipalselfsid;
    (void)prsoptoken;
    (void)dwdesiredaccessmask;
    (void)pobjecttypelist;
    (void)objecttypelistlength;
    (void)pgenericmapping;
    (void)pprivilegeset;
    (void)pdwprivilegesetlength;
    (void)pdwgrantedaccessmask;
    (void)pbaccessstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1rsopFileAccessCheck(JNIEnv* km_env, jclass km_clazz, jlong pszfilename, jlong prsoptoken, jint dwdesiredaccessmask, jlong pdwgrantedaccessmask, jlong pbaccessstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RsopFileAccessCheck");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfilename, (void*)(uintptr_t)prsoptoken, (uint32_t)dwdesiredaccessmask, (void*)(uintptr_t)pdwgrantedaccessmask, (void*)(uintptr_t)pbaccessstatus) : -1;
#else
    (void)pszfilename;
    (void)prsoptoken;
    (void)dwdesiredaccessmask;
    (void)pdwgrantedaccessmask;
    (void)pbaccessstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1rsopResetPolicySettingStatus(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pservices, jlong psettinginstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RsopResetPolicySettingStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pservices, (void*)(uintptr_t)psettinginstance) : -1;
#else
    (void)dwflags;
    (void)pservices;
    (void)psettinginstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1rsopSetPolicySettingStatus(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pservices, jlong psettinginstance, jint ninfo, jlong pstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RsopSetPolicySettingStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pservices, (void*)(uintptr_t)psettinginstance, (uint32_t)ninfo, (void*)(uintptr_t)pstatus) : -1;
#else
    (void)dwflags;
    (void)pservices;
    (void)psettinginstance;
    (void)ninfo;
    (void)pstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1uninstallApplication(JNIEnv* km_env, jclass km_clazz, jlong productcode, jint dwstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UninstallApplication");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)productcode, (uint32_t)dwstatus) : 0;
#else
    (void)productcode;
    (void)dwstatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_grouppolicy_WindowsWin32SystemGrouppolicyJniBridge_windowssys_1windows_1win32_1system_1grouppolicy_1unregisterGPNotification(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterGPNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

