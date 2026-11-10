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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterAttach(JNIEnv* km_env, jclass km_clazz, jlong lpfiltername, jlong lpvolumename, jlong lpinstancename, jint dwcreatedinstancenamelength, jlong lpcreatedinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterAttach");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiltername, (void*)(uintptr_t)lpvolumename, (void*)(uintptr_t)lpinstancename, (uint32_t)dwcreatedinstancenamelength, (void*)(uintptr_t)lpcreatedinstancename) : -1;
#else
    (void)lpfiltername;
    (void)lpvolumename;
    (void)lpinstancename;
    (void)dwcreatedinstancenamelength;
    (void)lpcreatedinstancename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterAttachAtAltitude(JNIEnv* km_env, jclass km_clazz, jlong lpfiltername, jlong lpvolumename, jlong lpaltitude, jlong lpinstancename, jint dwcreatedinstancenamelength, jlong lpcreatedinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterAttachAtAltitude");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiltername, (void*)(uintptr_t)lpvolumename, (void*)(uintptr_t)lpaltitude, (void*)(uintptr_t)lpinstancename, (uint32_t)dwcreatedinstancenamelength, (void*)(uintptr_t)lpcreatedinstancename) : -1;
#else
    (void)lpfiltername;
    (void)lpvolumename;
    (void)lpaltitude;
    (void)lpinstancename;
    (void)dwcreatedinstancenamelength;
    (void)lpcreatedinstancename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterClose(JNIEnv* km_env, jclass km_clazz, jlong hfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hfilter) : -1;
#else
    (void)hfilter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterConnectCommunicationPort(JNIEnv* km_env, jclass km_clazz, jlong lpportname, jint dwoptions, jlong lpcontext, jshort wsizeofcontext, jlong lpsecurityattributes, jlong hport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterConnectCommunicationPort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpportname, (uint32_t)dwoptions, (void*)(uintptr_t)lpcontext, (uint16_t)wsizeofcontext, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)hport) : -1;
#else
    (void)lpportname;
    (void)dwoptions;
    (void)lpcontext;
    (void)wsizeofcontext;
    (void)lpsecurityattributes;
    (void)hport;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterCreate(JNIEnv* km_env, jclass km_clazz, jlong lpfiltername, jlong hfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiltername, (void*)(uintptr_t)hfilter) : -1;
#else
    (void)lpfiltername;
    (void)hfilter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterDetach(JNIEnv* km_env, jclass km_clazz, jlong lpfiltername, jlong lpvolumename, jlong lpinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterDetach");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiltername, (void*)(uintptr_t)lpvolumename, (void*)(uintptr_t)lpinstancename) : -1;
#else
    (void)lpfiltername;
    (void)lpvolumename;
    (void)lpinstancename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterFindClose(JNIEnv* km_env, jclass km_clazz, jlong hfilterfind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterFindClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfilterfind) : -1;
#else
    (void)hfilterfind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterFindFirst(JNIEnv* km_env, jclass km_clazz, jint dwinformationclass, jlong lpbuffer, jint dwbuffersize, jlong lpbytesreturned, jlong lpfilterfind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterFindFirst");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)dwinformationclass, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpfilterfind) : -1;
#else
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    (void)lpfilterfind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterFindNext(JNIEnv* km_env, jclass km_clazz, jlong hfilterfind, jint dwinformationclass, jlong lpbuffer, jint dwbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterFindNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfilterfind, (int32_t)dwinformationclass, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpbytesreturned) : -1;
#else
    (void)hfilterfind;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterGetDosName(JNIEnv* km_env, jclass km_clazz, jlong lpvolumename, jlong lpdosname, jint dwdosnamebuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterGetDosName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpvolumename, (void*)(uintptr_t)lpdosname, (uint32_t)dwdosnamebuffersize) : -1;
#else
    (void)lpvolumename;
    (void)lpdosname;
    (void)dwdosnamebuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterGetInformation(JNIEnv* km_env, jclass km_clazz, jlong hfilter, jint dwinformationclass, jlong lpbuffer, jint dwbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterGetInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hfilter, (int32_t)dwinformationclass, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpbytesreturned) : -1;
#else
    (void)hfilter;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterGetMessage(JNIEnv* km_env, jclass km_clazz, jlong hport, jlong lpmessagebuffer, jint dwmessagebuffersize, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterGetMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hport, (void*)(uintptr_t)lpmessagebuffer, (uint32_t)dwmessagebuffersize, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hport;
    (void)lpmessagebuffer;
    (void)dwmessagebuffersize;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterInstanceClose(JNIEnv* km_env, jclass km_clazz, jlong hinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hinstance) : -1;
#else
    (void)hinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterInstanceCreate(JNIEnv* km_env, jclass km_clazz, jlong lpfiltername, jlong lpvolumename, jlong lpinstancename, jlong hinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiltername, (void*)(uintptr_t)lpvolumename, (void*)(uintptr_t)lpinstancename, (void*)(uintptr_t)hinstance) : -1;
#else
    (void)lpfiltername;
    (void)lpvolumename;
    (void)lpinstancename;
    (void)hinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterInstanceFindClose(JNIEnv* km_env, jclass km_clazz, jlong hfilterinstancefind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceFindClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfilterinstancefind) : -1;
#else
    (void)hfilterinstancefind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterInstanceFindFirst(JNIEnv* km_env, jclass km_clazz, jlong lpfiltername, jint dwinformationclass, jlong lpbuffer, jint dwbuffersize, jlong lpbytesreturned, jlong lpfilterinstancefind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceFindFirst");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiltername, (int32_t)dwinformationclass, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpfilterinstancefind) : -1;
#else
    (void)lpfiltername;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    (void)lpfilterinstancefind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterInstanceFindNext(JNIEnv* km_env, jclass km_clazz, jlong hfilterinstancefind, jint dwinformationclass, jlong lpbuffer, jint dwbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceFindNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfilterinstancefind, (int32_t)dwinformationclass, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpbytesreturned) : -1;
#else
    (void)hfilterinstancefind;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterInstanceGetInformation(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jint dwinformationclass, jlong lpbuffer, jint dwbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterInstanceGetInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hinstance, (int32_t)dwinformationclass, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpbytesreturned) : -1;
#else
    (void)hinstance;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterLoad(JNIEnv* km_env, jclass km_clazz, jlong lpfiltername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterLoad");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiltername) : -1;
#else
    (void)lpfiltername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterReplyMessage(JNIEnv* km_env, jclass km_clazz, jlong hport, jlong lpreplybuffer, jint dwreplybuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterReplyMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hport, (void*)(uintptr_t)lpreplybuffer, (uint32_t)dwreplybuffersize) : -1;
#else
    (void)hport;
    (void)lpreplybuffer;
    (void)dwreplybuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterSendMessage(JNIEnv* km_env, jclass km_clazz, jlong hport, jlong lpinbuffer, jint dwinbuffersize, jlong lpoutbuffer, jint dwoutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterSendMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hport, (void*)(uintptr_t)lpinbuffer, (uint32_t)dwinbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)dwoutbuffersize, (void*)(uintptr_t)lpbytesreturned) : -1;
#else
    (void)hport;
    (void)lpinbuffer;
    (void)dwinbuffersize;
    (void)lpoutbuffer;
    (void)dwoutbuffersize;
    (void)lpbytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterUnload(JNIEnv* km_env, jclass km_clazz, jlong lpfiltername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterUnload");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiltername) : -1;
#else
    (void)lpfiltername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterVolumeFindClose(JNIEnv* km_env, jclass km_clazz, jlong hvolumefind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeFindClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hvolumefind) : -1;
#else
    (void)hvolumefind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterVolumeFindFirst(JNIEnv* km_env, jclass km_clazz, jint dwinformationclass, jlong lpbuffer, jint dwbuffersize, jlong lpbytesreturned, jlong lpvolumefind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeFindFirst");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)dwinformationclass, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpvolumefind) : -1;
#else
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    (void)lpvolumefind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterVolumeFindNext(JNIEnv* km_env, jclass km_clazz, jlong hvolumefind, jint dwinformationclass, jlong lpbuffer, jint dwbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeFindNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hvolumefind, (int32_t)dwinformationclass, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpbytesreturned) : -1;
#else
    (void)hvolumefind;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterVolumeInstanceFindClose(JNIEnv* km_env, jclass km_clazz, jlong hvolumeinstancefind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeInstanceFindClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hvolumeinstancefind) : -1;
#else
    (void)hvolumeinstancefind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterVolumeInstanceFindFirst(JNIEnv* km_env, jclass km_clazz, jlong lpvolumename, jint dwinformationclass, jlong lpbuffer, jint dwbuffersize, jlong lpbytesreturned, jlong lpvolumeinstancefind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeInstanceFindFirst");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpvolumename, (int32_t)dwinformationclass, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpvolumeinstancefind) : -1;
#else
    (void)lpvolumename;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    (void)lpvolumeinstancefind;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_installablefilesystems_WindowsWin32StorageInstallablefilesystemsJniBridge_windowssys_1windows_1win32_1storage_1installablefilesystems_1filterVolumeInstanceFindNext(JNIEnv* km_env, jclass km_clazz, jlong hvolumeinstancefind, jint dwinformationclass, jlong lpbuffer, jint dwbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fltlib.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FilterVolumeInstanceFindNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hvolumeinstancefind, (int32_t)dwinformationclass, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpbytesreturned) : -1;
#else
    (void)hvolumeinstancefind;
    (void)dwinformationclass;
    (void)lpbuffer;
    (void)dwbuffersize;
    (void)lpbytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

