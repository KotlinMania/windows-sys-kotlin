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

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1addAtomA(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAtomA");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpstring;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1addAtomW(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAtomW");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpstring;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1addClipboardFormatListener(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClipboardFormatListener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1changeClipboardChain(JNIEnv* km_env, jclass km_clazz, jlong hwndremove, jlong hwndnewnext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeClipboardChain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndremove, (void*)(uintptr_t)hwndnewnext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndremove;
    (void)hwndnewnext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1closeClipboard(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClipboard");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1countClipboardFormats(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CountClipboardFormats");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeAbandonTransaction(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hconv, jint idtransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeAbandonTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hconv, (uint32_t)idtransaction);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idinst;
    (void)hconv;
    (void)idtransaction;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeAccessData(JNIEnv* km_env, jclass km_clazz, jlong hdata, jlong pcbdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeAccessData");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdata, (void*)(uintptr_t)pcbdatasize);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdata;
    (void)pcbdatasize;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeAddData(JNIEnv* km_env, jclass km_clazz, jlong hdata, jlong psrc, jint cb, jint cboff) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeAddData");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdata, (void*)(uintptr_t)psrc, (uint32_t)cb, (uint32_t)cboff);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdata;
    (void)psrc;
    (void)cb;
    (void)cboff;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeClientTransaction(JNIEnv* km_env, jclass km_clazz, jlong pdata, jint cbdata, jlong hconv, jlong hszitem, jint wfmt, jint wtype, jint dwtimeout, jlong pdwresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeClientTransaction");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdata, (uint32_t)cbdata, (void*)(uintptr_t)hconv, (void*)(uintptr_t)hszitem, (uint32_t)wfmt, (uint32_t)wtype, (uint32_t)dwtimeout, (void*)(uintptr_t)pdwresult);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pdata;
    (void)cbdata;
    (void)hconv;
    (void)hszitem;
    (void)wfmt;
    (void)wtype;
    (void)dwtimeout;
    (void)pdwresult;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeCmpStringHandles(JNIEnv* km_env, jclass km_clazz, jlong hsz1, jlong hsz2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCmpStringHandles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsz1, (void*)(uintptr_t)hsz2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsz1;
    (void)hsz2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeConnect(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hszservice, jlong hsztopic, jlong pcc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeConnect");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hszservice, (void*)(uintptr_t)hsztopic, (void*)(uintptr_t)pcc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)idinst;
    (void)hszservice;
    (void)hsztopic;
    (void)pcc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeConnectList(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hszservice, jlong hsztopic, jlong hconvlist, jlong pcc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeConnectList");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hszservice, (void*)(uintptr_t)hsztopic, (void*)(uintptr_t)hconvlist, (void*)(uintptr_t)pcc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)idinst;
    (void)hszservice;
    (void)hsztopic;
    (void)hconvlist;
    (void)pcc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeCreateDataHandle(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong psrc, jint cb, jint cboff, jlong hszitem, jint wfmt, jint afcmd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCreateDataHandle");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)psrc, (uint32_t)cb, (uint32_t)cboff, (void*)(uintptr_t)hszitem, (uint32_t)wfmt, (uint32_t)afcmd);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)idinst;
    (void)psrc;
    (void)cb;
    (void)cboff;
    (void)hszitem;
    (void)wfmt;
    (void)afcmd;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeCreateStringHandleA(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong psz, jint icodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCreateStringHandleA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)psz, (int32_t)icodepage);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)idinst;
    (void)psz;
    (void)icodepage;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeCreateStringHandleW(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong psz, jint icodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeCreateStringHandleW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)psz, (int32_t)icodepage);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)idinst;
    (void)psz;
    (void)icodepage;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hconv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeDisconnect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeDisconnectList(JNIEnv* km_env, jclass km_clazz, jlong hconvlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeDisconnectList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconvlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconvlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeEnableCallback(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hconv, jint wcmd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeEnableCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hconv, (uint32_t)wcmd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idinst;
    (void)hconv;
    (void)wcmd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeFreeDataHandle(JNIEnv* km_env, jclass km_clazz, jlong hdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeFreeDataHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeFreeStringHandle(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeFreeStringHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idinst;
    (void)hsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeGetData(JNIEnv* km_env, jclass km_clazz, jlong hdata, jlong pdst, jint cbmax, jint cboff) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeGetData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdata, (void*)(uintptr_t)pdst, (uint32_t)cbmax, (uint32_t)cboff);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdata;
    (void)pdst;
    (void)cbmax;
    (void)cboff;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeGetLastError(JNIEnv* km_env, jclass km_clazz, jint idinst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeGetLastError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)idinst;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeImpersonateClient(JNIEnv* km_env, jclass km_clazz, jlong hconv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeImpersonateClient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeInitializeA(JNIEnv* km_env, jclass km_clazz, jlong pidinst, jlong pfncallback, jint afcmd, jint ulres) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeInitializeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pidinst, (void*)(uintptr_t)pfncallback, (uint32_t)afcmd, (uint32_t)ulres);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pidinst;
    (void)pfncallback;
    (void)afcmd;
    (void)ulres;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeInitializeW(JNIEnv* km_env, jclass km_clazz, jlong pidinst, jlong pfncallback, jint afcmd, jint ulres) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeInitializeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pidinst, (void*)(uintptr_t)pfncallback, (uint32_t)afcmd, (uint32_t)ulres);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pidinst;
    (void)pfncallback;
    (void)afcmd;
    (void)ulres;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeKeepStringHandle(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeKeepStringHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idinst;
    (void)hsz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeNameService(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsz1, jlong hsz2, jint afcmd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeNameService");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsz1, (void*)(uintptr_t)hsz2, (uint32_t)afcmd);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)idinst;
    (void)hsz1;
    (void)hsz2;
    (void)afcmd;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddePostAdvise(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsztopic, jlong hszitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdePostAdvise");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsztopic, (void*)(uintptr_t)hszitem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idinst;
    (void)hsztopic;
    (void)hszitem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeQueryConvInfo(JNIEnv* km_env, jclass km_clazz, jlong hconv, jint idtransaction, jlong pconvinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryConvInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconv, (uint32_t)idtransaction, (void*)(uintptr_t)pconvinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hconv;
    (void)idtransaction;
    (void)pconvinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeQueryNextServer(JNIEnv* km_env, jclass km_clazz, jlong hconvlist, jlong hconvprev) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryNextServer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconvlist, (void*)(uintptr_t)hconvprev);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconvlist;
    (void)hconvprev;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeQueryStringA(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsz, jlong psz, jint cchmax, jint icodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryStringA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsz, (void*)(uintptr_t)psz, (uint32_t)cchmax, (int32_t)icodepage);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)idinst;
    (void)hsz;
    (void)psz;
    (void)cchmax;
    (void)icodepage;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeQueryStringW(JNIEnv* km_env, jclass km_clazz, jint idinst, jlong hsz, jlong psz, jint cchmax, jint icodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeQueryStringW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst, (void*)(uintptr_t)hsz, (void*)(uintptr_t)psz, (uint32_t)cchmax, (int32_t)icodepage);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)idinst;
    (void)hsz;
    (void)psz;
    (void)cchmax;
    (void)icodepage;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeReconnect(JNIEnv* km_env, jclass km_clazz, jlong hconv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeReconnect");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconv);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconv;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeSetQualityOfService(JNIEnv* km_env, jclass km_clazz, jlong hwndclient, jlong pqosnew, jlong pqosprev) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeSetQualityOfService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndclient, (void*)(uintptr_t)pqosnew, (void*)(uintptr_t)pqosprev);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndclient;
    (void)pqosnew;
    (void)pqosprev;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeSetUserHandle(JNIEnv* km_env, jclass km_clazz, jlong hconv, jint id, jlong huser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeSetUserHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconv, (uint32_t)id, (uint64_t)huser);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconv;
    (void)id;
    (void)huser;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeUnaccessData(JNIEnv* km_env, jclass km_clazz, jlong hdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeUnaccessData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1ddeUninitialize(JNIEnv* km_env, jclass km_clazz, jint idinst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdeUninitialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idinst);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idinst;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1deleteAtom(JNIEnv* km_env, jclass km_clazz, jshort natom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAtom");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)natom);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)natom;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1emptyClipboard(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EmptyClipboard");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1enumClipboardFormats(JNIEnv* km_env, jclass km_clazz, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumClipboardFormats");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)format);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)format;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1findAtomA(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindAtomA");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpstring;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1findAtomW(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindAtomW");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpstring;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1freeDDElParam(JNIEnv* km_env, jclass km_clazz, jint msg, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeDDElParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)msg, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getAtomNameA(JNIEnv* km_env, jclass km_clazz, jshort natom, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAtomNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)natom, (void*)(uintptr_t)lpbuffer, (int32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getAtomNameW(JNIEnv* km_env, jclass km_clazz, jshort natom, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAtomNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)natom, (void*)(uintptr_t)lpbuffer, (int32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getClipboardData(JNIEnv* km_env, jclass km_clazz, jint uformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardData");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)uformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getClipboardFormatNameA(JNIEnv* km_env, jclass km_clazz, jint format, jlong lpszformatname, jint cchmaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardFormatNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)format, (void*)(uintptr_t)lpszformatname, (int32_t)cchmaxcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)lpszformatname;
    (void)cchmaxcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getClipboardFormatNameW(JNIEnv* km_env, jclass km_clazz, jint format, jlong lpszformatname, jint cchmaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardFormatNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)format, (void*)(uintptr_t)lpszformatname, (int32_t)cchmaxcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)lpszformatname;
    (void)cchmaxcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getClipboardOwner(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardOwner");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getClipboardSequenceNumber(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardSequenceNumber");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getClipboardViewer(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipboardViewer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getOpenClipboardWindow(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenClipboardWindow");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getPriorityClipboardFormat(JNIEnv* km_env, jclass km_clazz, jlong paformatprioritylist, jint cformats) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPriorityClipboardFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)paformatprioritylist, (int32_t)cformats);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)paformatprioritylist;
    (void)cformats;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1getUpdatedClipboardFormats(JNIEnv* km_env, jclass km_clazz, jlong lpuiformats, jint cformats, jlong pcformatsout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUpdatedClipboardFormats");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpuiformats, (uint32_t)cformats, (void*)(uintptr_t)pcformatsout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpuiformats;
    (void)cformats;
    (void)pcformatsout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1globalAddAtomA(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomA");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpstring;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1globalAddAtomExA(JNIEnv* km_env, jclass km_clazz, jlong lpstring, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomExA");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstring, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpstring;
    (void)flags;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1globalAddAtomExW(JNIEnv* km_env, jclass km_clazz, jlong lpstring, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomExW");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstring, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpstring;
    (void)flags;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1globalAddAtomW(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAddAtomW");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpstring;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1globalDeleteAtom(JNIEnv* km_env, jclass km_clazz, jshort natom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalDeleteAtom");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)natom);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)natom;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1globalFindAtomA(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFindAtomA");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpstring;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1globalFindAtomW(JNIEnv* km_env, jclass km_clazz, jlong lpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFindAtomW");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpstring;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1globalGetAtomNameA(JNIEnv* km_env, jclass km_clazz, jshort natom, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalGetAtomNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)natom, (void*)(uintptr_t)lpbuffer, (int32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1globalGetAtomNameW(JNIEnv* km_env, jclass km_clazz, jshort natom, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalGetAtomNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)natom, (void*)(uintptr_t)lpbuffer, (int32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)natom;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1impersonateDdeClientWindow(JNIEnv* km_env, jclass km_clazz, jlong hwndclient, jlong hwndserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateDdeClientWindow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndclient, (void*)(uintptr_t)hwndserver);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndclient;
    (void)hwndserver;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1initAtomTable(JNIEnv* km_env, jclass km_clazz, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitAtomTable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1isClipboardFormatAvailable(JNIEnv* km_env, jclass km_clazz, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsClipboardFormatAvailable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1openClipboard(JNIEnv* km_env, jclass km_clazz, jlong hwndnewowner) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClipboard");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndnewowner);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndnewowner;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1packDDElParam(JNIEnv* km_env, jclass km_clazz, jint msg, jlong uilo, jlong uihi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackDDElParam");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)msg, (uint64_t)uilo, (uint64_t)uihi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    (void)uilo;
    (void)uihi;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1registerClipboardFormatA(JNIEnv* km_env, jclass km_clazz, jlong lpszformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClipboardFormatA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1registerClipboardFormatW(JNIEnv* km_env, jclass km_clazz, jlong lpszformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClipboardFormatW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1removeClipboardFormatListener(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClipboardFormatListener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1reuseDDElParam(JNIEnv* km_env, jclass km_clazz, jlong lparam, jint msgin, jint msgout, jlong uilo, jlong uihi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReuseDDElParam");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)lparam, (uint32_t)msgin, (uint32_t)msgout, (uint64_t)uilo, (uint64_t)uihi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lparam;
    (void)msgin;
    (void)msgout;
    (void)uilo;
    (void)uihi;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1setClipboardData(JNIEnv* km_env, jclass km_clazz, jint uformat, jlong hmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClipboardData");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uformat, (void*)(uintptr_t)hmem);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)uformat;
    (void)hmem;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1setClipboardViewer(JNIEnv* km_env, jclass km_clazz, jlong hwndnewviewer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClipboardViewer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndnewviewer);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwndnewviewer;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1setWinMetaFileBits(JNIEnv* km_env, jclass km_clazz, jint nsize, jlong lpmeta16data, jlong hdcref, jlong lpmfp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWinMetaFileBits");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nsize, (void*)(uintptr_t)lpmeta16data, (void*)(uintptr_t)hdcref, (void*)(uintptr_t)lpmfp);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)nsize;
    (void)lpmeta16data;
    (void)hdcref;
    (void)lpmfp;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_dataexchange_WindowsWin32SystemDataexchangeJniBridge_windowssys_1windows_1win32_1system_1dataexchange_1unpackDDElParam(JNIEnv* km_env, jclass km_clazz, jint msg, jlong lparam, jlong puilo, jlong puihi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnpackDDElParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)msg, (int64_t)lparam, (void*)(uintptr_t)puilo, (void*)(uintptr_t)puihi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)msg;
    (void)lparam;
    (void)puilo;
    (void)puihi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

