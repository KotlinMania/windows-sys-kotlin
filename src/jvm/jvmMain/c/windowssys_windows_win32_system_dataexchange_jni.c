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

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1AddAtomA(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAtomA");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring) : 0;
#else
    (void)lpstring;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1AddAtomW(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAtomW");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring) : 0;
#else
    (void)lpstring;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1AddClipboardFormatListener(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClipboardFormatListener");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ChangeClipboardChain(JNIEnv* km_env, jclass km_clazz, jlong hwndremove, jlong hwndnewnext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeClipboardChain");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndremove, (void*)(uintptr_t)hwndnewnext) : -1;
#else
    (void)hwndremove;
    (void)hwndnewnext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1CloseClipboard(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClipboard");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1CountClipboardFormats(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CountClipboardFormats");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeAbandonTransaction(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hconv, jint idtransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeAbandonTransaction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hconv, (uint32_t)idtransaction) : -1;
#else
    (void)idinst;
    (void)hconv;
    (void)idtransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeAccessData(JNIEnv* km_env, jclass km_clazz, jlong hdata, jlong pcbdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeAccessData");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdata, (void*)(uintptr_t)pcbdatasize) : NULL;
#else
    (void)hdata;
    (void)pcbdatasize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeAddData(JNIEnv* km_env, jclass km_clazz, jlong hdata, jlong psrc, jint cb, jint cboff) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeAddData");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdata, (void*)(uintptr_t)psrc, (uint32_t)cb, (uint32_t)cboff) : NULL;
#else
    (void)hdata;
    (void)psrc;
    (void)cb;
    (void)cboff;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeClientTransaction(JNIEnv* km_env, jclass km_clazz, jlong pdata, jint cbdata, jlong hconv, jlong hszitem, jint wfmt, jint wtype, jint dwtimeout, jlong pdwresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeClientTransaction");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdata, (uint32_t)cbdata, (void*)(uintptr_t)hconv, (void*)(uintptr_t)hszitem, (uint32_t)wfmt, (uint32_t)wtype, (uint32_t)dwtimeout, (void*)(uintptr_t)pdwresult) : NULL;
#else
    (void)pdata;
    (void)cbdata;
    (void)hconv;
    (void)hszitem;
    (void)wfmt;
    (void)wtype;
    (void)dwtimeout;
    (void)pdwresult;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeCmpStringHandles(JNIEnv* km_env, jclass km_clazz, jlong hsz1, jlong hsz2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCmpStringHandles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsz1, (void*)(uintptr_t)hsz2) : -1;
#else
    (void)hsz1;
    (void)hsz2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeConnect(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hszservice, jlong hsztopic, jlong pcc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeConnect");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hszservice, (void*)(uintptr_t)hsztopic, (void*)(uintptr_t)pcc) : NULL;
#else
    (void)idinst;
    (void)hszservice;
    (void)hsztopic;
    (void)pcc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeConnectList(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hszservice, jlong hsztopic, jlong hconvlist, jlong pcc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeConnectList");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hszservice, (void*)(uintptr_t)hsztopic, (void*)(uintptr_t)hconvlist, (void*)(uintptr_t)pcc) : NULL;
#else
    (void)idinst;
    (void)hszservice;
    (void)hsztopic;
    (void)hconvlist;
    (void)pcc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeCreateDataHandle(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong psrc, jint cb, jint cboff, jlong hszitem, jint wfmt, jint afcmd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCreateDataHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)psrc, (uint32_t)cb, (uint32_t)cboff, (void*)(uintptr_t)hszitem, (uint32_t)wfmt, (uint32_t)afcmd) : NULL;
#else
    (void)idinst;
    (void)psrc;
    (void)cb;
    (void)cboff;
    (void)hszitem;
    (void)wfmt;
    (void)afcmd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeCreateStringHandleA(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong psz, jint icodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCreateStringHandleA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)psz, (int32_t)icodepage) : NULL;
#else
    (void)idinst;
    (void)psz;
    (void)icodepage;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeCreateStringHandleW(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong psz, jint icodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCreateStringHandleW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)psz, (int32_t)icodepage) : NULL;
#else
    (void)idinst;
    (void)psz;
    (void)icodepage;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hconv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeDisconnect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconv) : -1;
#else
    (void)hconv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeDisconnectList(JNIEnv* km_env, jclass km_clazz, jlong hconvlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeDisconnectList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconvlist) : -1;
#else
    (void)hconvlist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeEnableCallback(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hconv, jint wcmd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeEnableCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hconv, (uint32_t)wcmd) : -1;
#else
    (void)idinst;
    (void)hconv;
    (void)wcmd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeFreeDataHandle(JNIEnv* km_env, jclass km_clazz, jlong hdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeFreeDataHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdata) : -1;
#else
    (void)hdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeFreeStringHandle(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeFreeStringHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsz) : -1;
#else
    (void)idinst;
    (void)hsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeGetData(JNIEnv* km_env, jclass km_clazz, jlong hdata, jlong pdst, jint cbmax, jint cboff) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeGetData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdata, (void*)(uintptr_t)pdst, (uint32_t)cbmax, (uint32_t)cboff) : 0;
#else
    (void)hdata;
    (void)pdst;
    (void)cbmax;
    (void)cboff;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeGetLastError(JNIEnv* km_env, jclass km_clazz, jint idinst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeGetLastError");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst) : 0;
#else
    (void)idinst;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeImpersonateClient(JNIEnv* km_env, jclass km_clazz, jlong hconv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeImpersonateClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconv) : -1;
#else
    (void)hconv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeInitializeA(JNIEnv* km_env, jclass km_clazz, jlong pidinst, jlong pfncallback, jint afcmd, jint ulres) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeInitializeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidinst, (void*)(uintptr_t)pfncallback, (uint32_t)afcmd, (uint32_t)ulres) : 0;
#else
    (void)pidinst;
    (void)pfncallback;
    (void)afcmd;
    (void)ulres;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeInitializeW(JNIEnv* km_env, jclass km_clazz, jlong pidinst, jlong pfncallback, jint afcmd, jint ulres) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeInitializeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidinst, (void*)(uintptr_t)pfncallback, (uint32_t)afcmd, (uint32_t)ulres) : 0;
#else
    (void)pidinst;
    (void)pfncallback;
    (void)afcmd;
    (void)ulres;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeKeepStringHandle(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeKeepStringHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsz) : -1;
#else
    (void)idinst;
    (void)hsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeNameService(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsz1, jlong hsz2, jint afcmd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeNameService");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsz1, (void*)(uintptr_t)hsz2, (uint32_t)afcmd) : NULL;
#else
    (void)idinst;
    (void)hsz1;
    (void)hsz2;
    (void)afcmd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdePostAdvise(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsztopic, jlong hszitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdePostAdvise");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsztopic, (void*)(uintptr_t)hszitem) : -1;
#else
    (void)idinst;
    (void)hsztopic;
    (void)hszitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeQueryConvInfo(JNIEnv* km_env, jclass km_clazz, jlong hconv, jint idtransaction, jlong pconvinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryConvInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconv, (uint32_t)idtransaction, (void*)(uintptr_t)pconvinfo) : 0;
#else
    (void)hconv;
    (void)idtransaction;
    (void)pconvinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeQueryNextServer(JNIEnv* km_env, jclass km_clazz, jlong hconvlist, jlong hconvprev) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryNextServer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconvlist, (void*)(uintptr_t)hconvprev) : NULL;
#else
    (void)hconvlist;
    (void)hconvprev;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeQueryStringA(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsz, jlong psz, jint cchmax, jint icodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryStringA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsz, (void*)(uintptr_t)psz, (uint32_t)cchmax, (int32_t)icodepage) : 0;
#else
    (void)idinst;
    (void)hsz;
    (void)psz;
    (void)cchmax;
    (void)icodepage;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeQueryStringW(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsz, jlong psz, jint cchmax, jint icodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryStringW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsz, (void*)(uintptr_t)psz, (uint32_t)cchmax, (int32_t)icodepage) : 0;
#else
    (void)idinst;
    (void)hsz;
    (void)psz;
    (void)cchmax;
    (void)icodepage;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeReconnect(JNIEnv* km_env, jclass km_clazz, jlong hconv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeReconnect");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconv) : NULL;
#else
    (void)hconv;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeSetQualityOfService(JNIEnv* km_env, jclass km_clazz, jlong hwndclient, jlong pqosnew, jlong pqosprev) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeSetQualityOfService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndclient, (void*)(uintptr_t)pqosnew, (void*)(uintptr_t)pqosprev) : -1;
#else
    (void)hwndclient;
    (void)pqosnew;
    (void)pqosprev;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeSetUserHandle(JNIEnv* km_env, jclass km_clazz, jlong hconv, jint id, jlong huser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeSetUserHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconv, (uint32_t)id, (uint64_t)huser) : -1;
#else
    (void)hconv;
    (void)id;
    (void)huser;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeUnaccessData(JNIEnv* km_env, jclass km_clazz, jlong hdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeUnaccessData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdata) : -1;
#else
    (void)hdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DdeUninitialize(JNIEnv* km_env, jclass km_clazz, jint idinst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeUninitialize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)idinst) : -1;
#else
    (void)idinst;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1DeleteAtom(JNIEnv* km_env, jclass km_clazz, jshort natom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAtom");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)natom) : 0;
#else
    (void)natom;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1EmptyClipboard(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EmptyClipboard");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1EnumClipboardFormats(JNIEnv* km_env, jclass km_clazz, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumClipboardFormats");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)format) : 0;
#else
    (void)format;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1FindAtomA(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindAtomA");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring) : 0;
#else
    (void)lpstring;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1FindAtomW(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindAtomW");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring) : 0;
#else
    (void)lpstring;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1FreeDDElParam(JNIEnv* km_env, jclass km_clazz, jint msg, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeDDElParam");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)msg, (int64_t)lparam) : -1;
#else
    (void)msg;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetAtomNameA(JNIEnv* km_env, jclass km_clazz, jshort natom, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAtomNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)natom, (void*)(uintptr_t)lpbuffer, (int32_t)nsize) : 0;
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetAtomNameW(JNIEnv* km_env, jclass km_clazz, jshort natom, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAtomNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)natom, (void*)(uintptr_t)lpbuffer, (int32_t)nsize) : 0;
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetClipboardData(JNIEnv* km_env, jclass km_clazz, jint uformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardData");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uformat) : NULL;
#else
    (void)uformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetClipboardFormatNameA(JNIEnv* km_env, jclass km_clazz, jint format, jlong lpszformatname, jint cchmaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardFormatNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)format, (void*)(uintptr_t)lpszformatname, (int32_t)cchmaxcount) : -1;
#else
    (void)format;
    (void)lpszformatname;
    (void)cchmaxcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetClipboardFormatNameW(JNIEnv* km_env, jclass km_clazz, jint format, jlong lpszformatname, jint cchmaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardFormatNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)format, (void*)(uintptr_t)lpszformatname, (int32_t)cchmaxcount) : -1;
#else
    (void)format;
    (void)lpszformatname;
    (void)cchmaxcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetClipboardOwner(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardOwner");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetClipboardSequenceNumber(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardSequenceNumber");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetClipboardViewer(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardViewer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetOpenClipboardWindow(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenClipboardWindow");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetPriorityClipboardFormat(JNIEnv* km_env, jclass km_clazz, jlong paformatprioritylist, jint cformats) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPriorityClipboardFormat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)paformatprioritylist, (int32_t)cformats) : -1;
#else
    (void)paformatprioritylist;
    (void)cformats;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GetUpdatedClipboardFormats(JNIEnv* km_env, jclass km_clazz, jlong lpuiformats, jint cformats, jlong pcformatsout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUpdatedClipboardFormats");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpuiformats, (uint32_t)cformats, (void*)(uintptr_t)pcformatsout) : -1;
#else
    (void)lpuiformats;
    (void)cformats;
    (void)pcformatsout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GlobalAddAtomA(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomA");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring) : 0;
#else
    (void)lpstring;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GlobalAddAtomExA(JNIEnv* km_env, jclass km_clazz, jlong lpstring, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomExA");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring, (uint32_t)flags) : 0;
#else
    (void)lpstring;
    (void)flags;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GlobalAddAtomExW(JNIEnv* km_env, jclass km_clazz, jlong lpstring, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomExW");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring, (uint32_t)flags) : 0;
#else
    (void)lpstring;
    (void)flags;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GlobalAddAtomW(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomW");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring) : 0;
#else
    (void)lpstring;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GlobalDeleteAtom(JNIEnv* km_env, jclass km_clazz, jshort natom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalDeleteAtom");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)natom) : 0;
#else
    (void)natom;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GlobalFindAtomA(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFindAtomA");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring) : 0;
#else
    (void)lpstring;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GlobalFindAtomW(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFindAtomW");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstring) : 0;
#else
    (void)lpstring;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GlobalGetAtomNameA(JNIEnv* km_env, jclass km_clazz, jshort natom, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalGetAtomNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)natom, (void*)(uintptr_t)lpbuffer, (int32_t)nsize) : 0;
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1GlobalGetAtomNameW(JNIEnv* km_env, jclass km_clazz, jshort natom, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalGetAtomNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)natom, (void*)(uintptr_t)lpbuffer, (int32_t)nsize) : 0;
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ImpersonateDdeClientWindow(JNIEnv* km_env, jclass km_clazz, jlong hwndclient, jlong hwndserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateDdeClientWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndclient, (void*)(uintptr_t)hwndserver) : -1;
#else
    (void)hwndclient;
    (void)hwndserver;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1InitAtomTable(JNIEnv* km_env, jclass km_clazz, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitAtomTable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nsize) : -1;
#else
    (void)nsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1IsClipboardFormatAvailable(JNIEnv* km_env, jclass km_clazz, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsClipboardFormatAvailable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)format) : -1;
#else
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1OpenClipboard(JNIEnv* km_env, jclass km_clazz, jlong hwndnewowner) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClipboard");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndnewowner) : -1;
#else
    (void)hwndnewowner;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1PackDDElParam(JNIEnv* km_env, jclass km_clazz, jint msg, jlong uilo, jlong uihi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackDDElParam");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)msg, (uint64_t)uilo, (uint64_t)uihi) : -1;
#else
    (void)msg;
    (void)uilo;
    (void)uihi;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1RegisterClipboardFormatA(JNIEnv* km_env, jclass km_clazz, jlong lpszformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClipboardFormatA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszformat) : 0;
#else
    (void)lpszformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1RegisterClipboardFormatW(JNIEnv* km_env, jclass km_clazz, jlong lpszformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClipboardFormatW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszformat) : 0;
#else
    (void)lpszformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1RemoveClipboardFormatListener(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClipboardFormatListener");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ReuseDDElParam(JNIEnv* km_env, jclass km_clazz, jlong lparam, jint msgin, jint msgout, jlong uilo, jlong uihi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReuseDDElParam");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)lparam, (uint32_t)msgin, (uint32_t)msgout, (uint64_t)uilo, (uint64_t)uihi) : -1;
#else
    (void)lparam;
    (void)msgin;
    (void)msgout;
    (void)uilo;
    (void)uihi;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1SetClipboardData(JNIEnv* km_env, jclass km_clazz, jint uformat, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClipboardData");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uformat, (void*)(uintptr_t)hmem) : NULL;
#else
    (void)uformat;
    (void)hmem;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1SetClipboardViewer(JNIEnv* km_env, jclass km_clazz, jlong hwndnewviewer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClipboardViewer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndnewviewer) : NULL;
#else
    (void)hwndnewviewer;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1SetWinMetaFileBits(JNIEnv* km_env, jclass km_clazz, jint nsize, jlong lpmeta16data, jlong hdcref, jlong lpmfp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWinMetaFileBits");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nsize, (void*)(uintptr_t)lpmeta16data, (void*)(uintptr_t)hdcref, (void*)(uintptr_t)lpmfp) : NULL;
#else
    (void)nsize;
    (void)lpmeta16data;
    (void)hdcref;
    (void)lpmfp;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1UnpackDDElParam(JNIEnv* km_env, jclass km_clazz, jint msg, jlong lparam, jlong puilo, jlong puihi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnpackDDElParam");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)msg, (int64_t)lparam, (void*)(uintptr_t)puilo, (void*)(uintptr_t)puihi) : -1;
#else
    (void)msg;
    (void)lparam;
    (void)puilo;
    (void)puihi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

