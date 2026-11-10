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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1multinetGetConnectionPerformanceA(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lpnetconnectinfostruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MultinetGetConnectionPerformanceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lpnetconnectinfostruct) : 0;
#else
    (void)lpnetresource;
    (void)lpnetconnectinfostruct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1multinetGetConnectionPerformanceW(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lpnetconnectinfostruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MultinetGetConnectionPerformanceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lpnetconnectinfostruct) : 0;
#else
    (void)lpnetresource;
    (void)lpnetconnectinfostruct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPAddConnection(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lppassword, jlong lpusername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPAddConnection");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpusername) : 0;
#else
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPAddConnection3(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong lpnetresource, jlong lppassword, jlong lpusername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPAddConnection3");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpusername, (uint32_t)dwflags) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPAddConnection4(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong lpnetresource, jlong lpauthbuffer, jint cbauthbuffer, jint dwflags, jlong lpuseoptions, jint cbuseoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPAddConnection4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lpauthbuffer, (uint32_t)cbauthbuffer, (uint32_t)dwflags, (void*)(uintptr_t)lpuseoptions, (uint32_t)cbuseoptions) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lpauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPCancelConnection(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint fforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPCancelConnection");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (int32_t)fforce) : 0;
#else
    (void)lpname;
    (void)fforce;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPCancelConnection2(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint fforce, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPCancelConnection2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (int32_t)fforce, (uint32_t)dwflags) : 0;
#else
    (void)lpname;
    (void)fforce;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPCloseEnum(JNIEnv* km_env, jclass km_clazz, jlong henum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPCloseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPEnumResource(JNIEnv* km_env, jclass km_clazz, jlong henum, jlong lpccount, jlong lpbuffer, jlong lpbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPEnumResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henum, (void*)(uintptr_t)lpccount, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpbuffersize) : 0;
#else
    (void)henum;
    (void)lpccount;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPFormatNetworkName(JNIEnv* km_env, jclass km_clazz, jlong lpremotename, jlong lpformattedname, jlong lpnlength, jint dwflags, jint dwavecharperline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPFormatNetworkName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpremotename, (void*)(uintptr_t)lpformattedname, (void*)(uintptr_t)lpnlength, (uint32_t)dwflags, (uint32_t)dwavecharperline) : 0;
#else
    (void)lpremotename;
    (void)lpformattedname;
    (void)lpnlength;
    (void)dwflags;
    (void)dwavecharperline;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPGetCaps(JNIEnv* km_env, jclass km_clazz, jint ndex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetCaps");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ndex) : 0;
#else
    (void)ndex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPGetConnection(JNIEnv* km_env, jclass km_clazz, jlong lplocalname, jlong lpremotename, jlong lpnbufferlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetConnection");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lplocalname, (void*)(uintptr_t)lpremotename, (void*)(uintptr_t)lpnbufferlen) : 0;
#else
    (void)lplocalname;
    (void)lpremotename;
    (void)lpnbufferlen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPGetConnection3(JNIEnv* km_env, jclass km_clazz, jlong lplocalname, jint dwlevel, jlong lpbuffer, jlong lpbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetConnection3");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lplocalname, (uint32_t)dwlevel, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpbuffersize) : 0;
#else
    (void)lplocalname;
    (void)dwlevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPGetConnectionPerformance(JNIEnv* km_env, jclass km_clazz, jlong lpremotename, jlong lpnetconnectinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetConnectionPerformance");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpremotename, (void*)(uintptr_t)lpnetconnectinfo) : 0;
#else
    (void)lpremotename;
    (void)lpnetconnectinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPGetPersistentUseOptionsForConnection(JNIEnv* km_env, jclass km_clazz, jlong lpremotepath, jlong lpreaduseoptions, jint cbreaduseoptions, jlong lpwriteuseoptions, jlong lpsizewriteuseoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetPersistentUseOptionsForConnection");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpremotepath, (void*)(uintptr_t)lpreaduseoptions, (uint32_t)cbreaduseoptions, (void*)(uintptr_t)lpwriteuseoptions, (void*)(uintptr_t)lpsizewriteuseoptions) : 0;
#else
    (void)lpremotepath;
    (void)lpreaduseoptions;
    (void)cbreaduseoptions;
    (void)lpwriteuseoptions;
    (void)lpsizewriteuseoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPGetResourceInformation(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lpbuffer, jlong lpbuffersize, jlong lplpsystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetResourceInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpbuffersize, (void*)(uintptr_t)lplpsystem) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpbuffersize;
    (void)lplpsystem;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPGetResourceParent(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lpbuffer, jlong lpbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetResourceParent");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpbuffersize) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPGetUniversalName(JNIEnv* km_env, jclass km_clazz, jlong lplocalpath, jint dwinfolevel, jlong lpbuffer, jlong lpbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetUniversalName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lplocalpath, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpbuffersize) : 0;
#else
    (void)lplocalpath;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPGetUser(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpusername, jlong lpnbufferlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPGetUser");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpusername, (void*)(uintptr_t)lpnbufferlen) : 0;
#else
    (void)lpname;
    (void)lpusername;
    (void)lpnbufferlen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1nPOpenEnum(JNIEnv* km_env, jclass km_clazz, jint dwscope, jint dwtype, jint dwusage, jlong lpnetresource, jlong lphenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NPOpenEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwscope, (uint32_t)dwtype, (uint32_t)dwusage, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lphenum) : 0;
#else
    (void)dwscope;
    (void)dwtype;
    (void)dwusage;
    (void)lpnetresource;
    (void)lphenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetAddConnection2A(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lppassword, jlong lpusername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection2A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpusername, (uint32_t)dwflags) : 0;
#else
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetAddConnection2W(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lppassword, jlong lpusername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection2W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpusername, (uint32_t)dwflags) : 0;
#else
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetAddConnection3A(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong lpnetresource, jlong lppassword, jlong lpusername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection3A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpusername, (uint32_t)dwflags) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetAddConnection3W(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong lpnetresource, jlong lppassword, jlong lpusername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection3W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpusername, (uint32_t)dwflags) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpusername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetAddConnection4A(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong lpnetresource, jlong pauthbuffer, jint cbauthbuffer, jint dwflags, jlong lpuseoptions, jint cbuseoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection4A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)pauthbuffer, (uint32_t)cbauthbuffer, (uint32_t)dwflags, (void*)(uintptr_t)lpuseoptions, (uint32_t)cbuseoptions) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetAddConnection4W(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong lpnetresource, jlong pauthbuffer, jint cbauthbuffer, jint dwflags, jlong lpuseoptions, jint cbuseoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnection4W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)pauthbuffer, (uint32_t)cbauthbuffer, (uint32_t)dwflags, (void*)(uintptr_t)lpuseoptions, (uint32_t)cbuseoptions) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetAddConnectionA(JNIEnv* km_env, jclass km_clazz, jlong lpremotename, jlong lppassword, jlong lplocalname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnectionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpremotename, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lplocalname) : 0;
#else
    (void)lpremotename;
    (void)lppassword;
    (void)lplocalname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetAddConnectionW(JNIEnv* km_env, jclass km_clazz, jlong lpremotename, jlong lppassword, jlong lplocalname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetAddConnectionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpremotename, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lplocalname) : 0;
#else
    (void)lpremotename;
    (void)lppassword;
    (void)lplocalname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetCancelConnection2A(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint dwflags, jint fforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetCancelConnection2A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (uint32_t)dwflags, (int32_t)fforce) : 0;
#else
    (void)lpname;
    (void)dwflags;
    (void)fforce;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetCancelConnection2W(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint dwflags, jint fforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetCancelConnection2W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (uint32_t)dwflags, (int32_t)fforce) : 0;
#else
    (void)lpname;
    (void)dwflags;
    (void)fforce;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetCancelConnectionA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint fforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetCancelConnectionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (int32_t)fforce) : 0;
#else
    (void)lpname;
    (void)fforce;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetCancelConnectionW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint fforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetCancelConnectionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (int32_t)fforce) : 0;
#else
    (void)lpname;
    (void)fforce;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetCloseEnum(JNIEnv* km_env, jclass km_clazz, jlong henum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetCloseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetConnectionDialog(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetConnectionDialog");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwtype) : 0;
#else
    (void)hwnd;
    (void)dwtype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetConnectionDialog1A(JNIEnv* km_env, jclass km_clazz, jlong lpconndlgstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetConnectionDialog1A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconndlgstruct) : 0;
#else
    (void)lpconndlgstruct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetConnectionDialog1W(JNIEnv* km_env, jclass km_clazz, jlong lpconndlgstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetConnectionDialog1W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconndlgstruct) : 0;
#else
    (void)lpconndlgstruct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetDisconnectDialog(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetDisconnectDialog");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwtype) : 0;
#else
    (void)hwnd;
    (void)dwtype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetDisconnectDialog1A(JNIEnv* km_env, jclass km_clazz, jlong lpconndlgstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetDisconnectDialog1A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconndlgstruct) : 0;
#else
    (void)lpconndlgstruct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetDisconnectDialog1W(JNIEnv* km_env, jclass km_clazz, jlong lpconndlgstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetDisconnectDialog1W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpconndlgstruct) : 0;
#else
    (void)lpconndlgstruct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetEnumResourceA(JNIEnv* km_env, jclass km_clazz, jlong henum, jlong lpccount, jlong lpbuffer, jlong lpbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetEnumResourceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henum, (void*)(uintptr_t)lpccount, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpbuffersize) : 0;
#else
    (void)henum;
    (void)lpccount;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetEnumResourceW(JNIEnv* km_env, jclass km_clazz, jlong henum, jlong lpccount, jlong lpbuffer, jlong lpbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetEnumResourceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henum, (void*)(uintptr_t)lpccount, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpbuffersize) : 0;
#else
    (void)henum;
    (void)lpccount;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetConnectionA(JNIEnv* km_env, jclass km_clazz, jlong lplocalname, jlong lpremotename, jlong lpnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetConnectionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lplocalname, (void*)(uintptr_t)lpremotename, (void*)(uintptr_t)lpnlength) : 0;
#else
    (void)lplocalname;
    (void)lpremotename;
    (void)lpnlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetConnectionW(JNIEnv* km_env, jclass km_clazz, jlong lplocalname, jlong lpremotename, jlong lpnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetConnectionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lplocalname, (void*)(uintptr_t)lpremotename, (void*)(uintptr_t)lpnlength) : 0;
#else
    (void)lplocalname;
    (void)lpremotename;
    (void)lpnlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetLastErrorA(JNIEnv* km_env, jclass km_clazz, jlong lperror, jlong lperrorbuf, jint nerrorbufsize, jlong lpnamebuf, jint nnamebufsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetLastErrorA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lperror, (void*)(uintptr_t)lperrorbuf, (uint32_t)nerrorbufsize, (void*)(uintptr_t)lpnamebuf, (uint32_t)nnamebufsize) : 0;
#else
    (void)lperror;
    (void)lperrorbuf;
    (void)nerrorbufsize;
    (void)lpnamebuf;
    (void)nnamebufsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetLastErrorW(JNIEnv* km_env, jclass km_clazz, jlong lperror, jlong lperrorbuf, jint nerrorbufsize, jlong lpnamebuf, jint nnamebufsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetLastErrorW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lperror, (void*)(uintptr_t)lperrorbuf, (uint32_t)nerrorbufsize, (void*)(uintptr_t)lpnamebuf, (uint32_t)nnamebufsize) : 0;
#else
    (void)lperror;
    (void)lperrorbuf;
    (void)nerrorbufsize;
    (void)lpnamebuf;
    (void)nnamebufsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetNetworkInformationA(JNIEnv* km_env, jclass km_clazz, jlong lpprovider, jlong lpnetinfostruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetNetworkInformationA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprovider, (void*)(uintptr_t)lpnetinfostruct) : 0;
#else
    (void)lpprovider;
    (void)lpnetinfostruct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetNetworkInformationW(JNIEnv* km_env, jclass km_clazz, jlong lpprovider, jlong lpnetinfostruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetNetworkInformationW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprovider, (void*)(uintptr_t)lpnetinfostruct) : 0;
#else
    (void)lpprovider;
    (void)lpnetinfostruct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetProviderNameA(JNIEnv* km_env, jclass km_clazz, jint dwnettype, jlong lpprovidername, jlong lpbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetProviderNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwnettype, (void*)(uintptr_t)lpprovidername, (void*)(uintptr_t)lpbuffersize) : 0;
#else
    (void)dwnettype;
    (void)lpprovidername;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetProviderNameW(JNIEnv* km_env, jclass km_clazz, jint dwnettype, jlong lpprovidername, jlong lpbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetProviderNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwnettype, (void*)(uintptr_t)lpprovidername, (void*)(uintptr_t)lpbuffersize) : 0;
#else
    (void)dwnettype;
    (void)lpprovidername;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetResourceInformationA(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lpbuffer, jlong lpcbbuffer, jlong lplpsystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetResourceInformationA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpcbbuffer, (void*)(uintptr_t)lplpsystem) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    (void)lplpsystem;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetResourceInformationW(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lpbuffer, jlong lpcbbuffer, jlong lplpsystem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetResourceInformationW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpcbbuffer, (void*)(uintptr_t)lplpsystem) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    (void)lplpsystem;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetResourceParentA(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lpbuffer, jlong lpcbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetResourceParentA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpcbbuffer) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetResourceParentW(JNIEnv* km_env, jclass km_clazz, jlong lpnetresource, jlong lpbuffer, jlong lpcbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetResourceParentW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpcbbuffer) : 0;
#else
    (void)lpnetresource;
    (void)lpbuffer;
    (void)lpcbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetUniversalNameA(JNIEnv* km_env, jclass km_clazz, jlong lplocalpath, jint dwinfolevel, jlong lpbuffer, jlong lpbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetUniversalNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lplocalpath, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpbuffersize) : 0;
#else
    (void)lplocalpath;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetUniversalNameW(JNIEnv* km_env, jclass km_clazz, jlong lplocalpath, jint dwinfolevel, jlong lpbuffer, jlong lpbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetUniversalNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lplocalpath, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpbuffersize) : 0;
#else
    (void)lplocalpath;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetUserA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpusername, jlong lpnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetUserA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpusername, (void*)(uintptr_t)lpnlength) : 0;
#else
    (void)lpname;
    (void)lpusername;
    (void)lpnlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetGetUserW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpusername, jlong lpnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetGetUserW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpusername, (void*)(uintptr_t)lpnlength) : 0;
#else
    (void)lpname;
    (void)lpusername;
    (void)lpnlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetOpenEnumA(JNIEnv* km_env, jclass km_clazz, jint dwscope, jint dwtype, jint dwusage, jlong lpnetresource, jlong lphenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetOpenEnumA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwscope, (uint32_t)dwtype, (uint32_t)dwusage, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lphenum) : 0;
#else
    (void)dwscope;
    (void)dwtype;
    (void)dwusage;
    (void)lpnetresource;
    (void)lphenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetOpenEnumW(JNIEnv* km_env, jclass km_clazz, jint dwscope, jint dwtype, jint dwusage, jlong lpnetresource, jlong lphenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetOpenEnumW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwscope, (uint32_t)dwtype, (uint32_t)dwusage, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lphenum) : 0;
#else
    (void)dwscope;
    (void)dwtype;
    (void)dwusage;
    (void)lpnetresource;
    (void)lphenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetSetLastErrorA(JNIEnv* km_env, jclass km_clazz, jint err, jlong lperror, jlong lpproviders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetSetLastErrorA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)err, (void*)(uintptr_t)lperror, (void*)(uintptr_t)lpproviders);
#else
    (void)err;
    (void)lperror;
    (void)lpproviders;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetSetLastErrorW(JNIEnv* km_env, jclass km_clazz, jint err, jlong lperror, jlong lpproviders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetSetLastErrorW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)err, (void*)(uintptr_t)lperror, (void*)(uintptr_t)lpproviders);
#else
    (void)err;
    (void)lperror;
    (void)lpproviders;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetUseConnection4A(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong lpnetresource, jlong pauthbuffer, jint cbauthbuffer, jint dwflags, jlong lpuseoptions, jint cbuseoptions, jlong lpaccessname, jlong lpbuffersize, jlong lpresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetUseConnection4A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)pauthbuffer, (uint32_t)cbauthbuffer, (uint32_t)dwflags, (void*)(uintptr_t)lpuseoptions, (uint32_t)cbuseoptions, (void*)(uintptr_t)lpaccessname, (void*)(uintptr_t)lpbuffersize, (void*)(uintptr_t)lpresult) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetUseConnection4W(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong lpnetresource, jlong pauthbuffer, jint cbauthbuffer, jint dwflags, jlong lpuseoptions, jint cbuseoptions, jlong lpaccessname, jlong lpbuffersize, jlong lpresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetUseConnection4W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)pauthbuffer, (uint32_t)cbauthbuffer, (uint32_t)dwflags, (void*)(uintptr_t)lpuseoptions, (uint32_t)cbuseoptions, (void*)(uintptr_t)lpaccessname, (void*)(uintptr_t)lpbuffersize, (void*)(uintptr_t)lpresult) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)dwflags;
    (void)lpuseoptions;
    (void)cbuseoptions;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetUseConnectionA(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong lpnetresource, jlong lppassword, jlong lpuserid, jint dwflags, jlong lpaccessname, jlong lpbuffersize, jlong lpresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetUseConnectionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpuserid, (uint32_t)dwflags, (void*)(uintptr_t)lpaccessname, (void*)(uintptr_t)lpbuffersize, (void*)(uintptr_t)lpresult) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpuserid;
    (void)dwflags;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wnet_WindowsWin32NetworkmanagementWnetJniBridge_windowssys_1windows_1win32_1networkmanagement_1wnet_1wNetUseConnectionW(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong lpnetresource, jlong lppassword, jlong lpuserid, jint dwflags, jlong lpaccessname, jlong lpbuffersize, jlong lpresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mpr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WNetUseConnectionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpnetresource, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpuserid, (uint32_t)dwflags, (void*)(uintptr_t)lpaccessname, (void*)(uintptr_t)lpbuffersize, (void*)(uintptr_t)lpresult) : 0;
#else
    (void)hwndowner;
    (void)lpnetresource;
    (void)lppassword;
    (void)lpuserid;
    (void)dwflags;
    (void)lpaccessname;
    (void)lpbuffersize;
    (void)lpresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

