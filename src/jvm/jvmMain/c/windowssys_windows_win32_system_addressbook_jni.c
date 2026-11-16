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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookBuildDisplayTable(JNIEnv* km_env, jclass km_clazz, jlong lpallocatebuffer, jlong lpallocatemore, jlong lpfreebuffer, jlong lpmalloc, jlong hinstance, jint cpages, jlong lppage, jint ulflags, jlong lpptable, jlong lpptbldata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildDisplayTable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpallocatemore, (void*)(uintptr_t)lpfreebuffer, (void*)(uintptr_t)lpmalloc, (void*)(uintptr_t)hinstance, (uint32_t)cpages, (void*)(uintptr_t)lppage, (uint32_t)ulflags, (void*)(uintptr_t)lpptable, (void*)(uintptr_t)lpptbldata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpallocatebuffer;
    (void)lpallocatemore;
    (void)lpfreebuffer;
    (void)lpmalloc;
    (void)hinstance;
    (void)cpages;
    (void)lppage;
    (void)ulflags;
    (void)lpptable;
    (void)lpptbldata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookChangeIdleRoutine(JNIEnv* km_env, jclass km_clazz, jlong ftg, jlong lpfnidle, jlong lpvidleparam, jshort priidle, jint csecidle, jshort iroidle, jshort ircidle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t, uint32_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeIdleRoutine");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ftg, (void*)(uintptr_t)lpfnidle, (void*)(uintptr_t)lpvidleparam, (int16_t)priidle, (uint32_t)csecidle, (uint16_t)iroidle, (uint16_t)ircidle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ftg;
    (void)lpfnidle;
    (void)lpvidleparam;
    (void)priidle;
    (void)csecidle;
    (void)iroidle;
    (void)ircidle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookCreateIProp(JNIEnv* km_env, jclass km_clazz, jlong lpinterface, jlong lpallocatebuffer, jlong lpallocatemore, jlong lpfreebuffer, jlong lpvreserved, jlong lpppropdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIProp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpinterface, (void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpallocatemore, (void*)(uintptr_t)lpfreebuffer, (void*)(uintptr_t)lpvreserved, (void*)(uintptr_t)lpppropdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpinterface;
    (void)lpallocatebuffer;
    (void)lpallocatemore;
    (void)lpfreebuffer;
    (void)lpvreserved;
    (void)lpppropdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookCreateTable(JNIEnv* km_env, jclass km_clazz, jlong lpinterface, jlong lpallocatebuffer, jlong lpallocatemore, jlong lpfreebuffer, jlong lpvreserved, jint ultabletype, jint ulproptagindexcolumn, jlong lpsproptagarraycolumns, jlong lpptabledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpinterface, (void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpallocatemore, (void*)(uintptr_t)lpfreebuffer, (void*)(uintptr_t)lpvreserved, (uint32_t)ultabletype, (uint32_t)ulproptagindexcolumn, (void*)(uintptr_t)lpsproptagarraycolumns, (void*)(uintptr_t)lpptabledata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpinterface;
    (void)lpallocatebuffer;
    (void)lpallocatemore;
    (void)lpfreebuffer;
    (void)lpvreserved;
    (void)ultabletype;
    (void)ulproptagindexcolumn;
    (void)lpsproptagarraycolumns;
    (void)lpptabledata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookDeinitMapiUtil(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeinitMapiUtil");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine(JNIEnv* km_env, jclass km_clazz, jlong ftg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeregisterIdleRoutine");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ftg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ftg;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookEnableIdleRoutine(JNIEnv* km_env, jclass km_clazz, jlong ftg, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableIdleRoutine");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ftg, (int32_t)fenable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ftg;
    (void)fenable;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookFEqualNames(JNIEnv* km_env, jclass km_clazz, jlong lpname1, jlong lpname2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FEqualNames");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpname1, (void*)(uintptr_t)lpname2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpname1;
    (void)lpname2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookFPropCompareProp(JNIEnv* km_env, jclass km_clazz, jlong lpspropvalue1, jint ulrelop, jlong lpspropvalue2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FPropCompareProp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpspropvalue1, (uint32_t)ulrelop, (void*)(uintptr_t)lpspropvalue2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpspropvalue1;
    (void)ulrelop;
    (void)lpspropvalue2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookFPropContainsProp(JNIEnv* km_env, jclass km_clazz, jlong lpspropvaluedst, jlong lpspropvaluesrc, jint ulfuzzylevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FPropContainsProp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpspropvaluedst, (void*)(uintptr_t)lpspropvaluesrc, (uint32_t)ulfuzzylevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpspropvaluedst;
    (void)lpspropvaluesrc;
    (void)ulfuzzylevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookFPropExists(JNIEnv* km_env, jclass km_clazz, jlong lpmapiprop, jint ulproptag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FPropExists");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmapiprop, (uint32_t)ulproptag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpmapiprop;
    (void)ulproptag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookFreePadrlist(JNIEnv* km_env, jclass km_clazz, jlong lpadrlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePadrlist");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpadrlist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpadrlist;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookFreeProws(JNIEnv* km_env, jclass km_clazz, jlong lprows) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeProws");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lprows);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lprows;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine(JNIEnv* km_env, jclass km_clazz, jlong lpfnidle, jlong lpvidleparam, jshort priidle, jint csecidle, jshort iroidle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int16_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtgRegisterIdleRoutine");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfnidle, (void*)(uintptr_t)lpvidleparam, (int16_t)priidle, (uint32_t)csecidle, (uint16_t)iroidle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpfnidle;
    (void)lpvidleparam;
    (void)priidle;
    (void)csecidle;
    (void)iroidle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookHrAddColumns(JNIEnv* km_env, jclass km_clazz, jlong lptbl, jlong lpproptagcolumnsnew, jlong lpallocatebuffer, jlong lpfreebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrAddColumns");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lptbl, (void*)(uintptr_t)lpproptagcolumnsnew, (void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpfreebuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lptbl;
    (void)lpproptagcolumnsnew;
    (void)lpallocatebuffer;
    (void)lpfreebuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookHrAddColumnsEx(JNIEnv* km_env, jclass km_clazz, jlong lptbl, jlong lpproptagcolumnsnew, jlong lpallocatebuffer, jlong lpfreebuffer, jlong lpfnfiltercolumns) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrAddColumnsEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lptbl, (void*)(uintptr_t)lpproptagcolumnsnew, (void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpfreebuffer, (int64_t)lpfnfiltercolumns);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lptbl;
    (void)lpproptagcolumnsnew;
    (void)lpallocatebuffer;
    (void)lpfreebuffer;
    (void)lpfnfiltercolumns;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookHrAllocAdviseSink(JNIEnv* km_env, jclass km_clazz, jlong lpfncallback, jlong lpvcontext, jlong lppadvisesink) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrAllocAdviseSink");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpvcontext, (void*)(uintptr_t)lppadvisesink);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfncallback;
    (void)lpvcontext;
    (void)lppadvisesink;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookHrDispatchNotifications(JNIEnv* km_env, jclass km_clazz, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrDispatchNotifications");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookHrGetOneProp(JNIEnv* km_env, jclass km_clazz, jlong lpmapiprop, jint ulproptag, jlong lppprop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrGetOneProp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmapiprop, (uint32_t)ulproptag, (void*)(uintptr_t)lppprop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpmapiprop;
    (void)ulproptag;
    (void)lppprop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookHrIStorageFromStream(JNIEnv* km_env, jclass km_clazz, jlong lpunkin, jlong lpinterface, jint ulflags, jlong lppstorageout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrIStorageFromStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpunkin, (void*)(uintptr_t)lpinterface, (uint32_t)ulflags, (void*)(uintptr_t)lppstorageout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpunkin;
    (void)lpinterface;
    (void)ulflags;
    (void)lppstorageout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookHrQueryAllRows(JNIEnv* km_env, jclass km_clazz, jlong lptable, jlong lpproptags, jlong lprestriction, jlong lpsortorderset, jint crowsmax, jlong lpprows) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrQueryAllRows");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lptable, (void*)(uintptr_t)lpproptags, (void*)(uintptr_t)lprestriction, (void*)(uintptr_t)lpsortorderset, (int32_t)crowsmax, (void*)(uintptr_t)lpprows);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lptable;
    (void)lpproptags;
    (void)lprestriction;
    (void)lpsortorderset;
    (void)crowsmax;
    (void)lpprows;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookHrSetOneProp(JNIEnv* km_env, jclass km_clazz, jlong lpmapiprop, jlong lpprop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrSetOneProp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmapiprop, (void*)(uintptr_t)lpprop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpmapiprop;
    (void)lpprop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink(JNIEnv* km_env, jclass km_clazz, jlong lpadvisesink, jlong lppadvisesink) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrThisThreadAdviseSink");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpadvisesink, (void*)(uintptr_t)lppadvisesink);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpadvisesink;
    (void)lppadvisesink;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookLPropCompareProp(JNIEnv* km_env, jclass km_clazz, jlong lpspropvaluea, jlong lpspropvalueb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPropCompareProp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpspropvaluea, (void*)(uintptr_t)lpspropvalueb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpspropvaluea;
    (void)lpspropvalueb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookLpValFindProp(JNIEnv* km_env, jclass km_clazz, jint ulproptag, jint cvalues, jlong lpproparray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LpValFindProp");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulproptag, (uint32_t)cvalues, (void*)(uintptr_t)lpproparray);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ulproptag;
    (void)cvalues;
    (void)lpproparray;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookMAPIDeinitIdle(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MAPIDeinitIdle");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MAPIGetDefaultMalloc");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookMAPIInitIdle(JNIEnv* km_env, jclass km_clazz, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MAPIInitIdle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookOpenStreamOnFile(JNIEnv* km_env, jclass km_clazz, jlong lpallocatebuffer, jlong lpfreebuffer, jint ulflags, jlong lpszfilename, jlong lpszprefix, jlong lppstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenStreamOnFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpfreebuffer, (uint32_t)ulflags, (void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)lpszprefix, (void*)(uintptr_t)lppstream);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpallocatebuffer;
    (void)lpfreebuffer;
    (void)ulflags;
    (void)lpszfilename;
    (void)lpszprefix;
    (void)lppstream;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookPpropFindProp(JNIEnv* km_env, jclass km_clazz, jlong lpproparray, jint cvalues, jint ulproptag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PpropFindProp");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproparray, (uint32_t)cvalues, (uint32_t)ulproptag);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpproparray;
    (void)cvalues;
    (void)ulproptag;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookPropCopyMore(JNIEnv* km_env, jclass km_clazz, jlong lpspropvaluedest, jlong lpspropvaluesrc, jlong lpfallocmore, jlong lpvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropCopyMore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpspropvaluedest, (void*)(uintptr_t)lpspropvaluesrc, (void*)(uintptr_t)lpfallocmore, (void*)(uintptr_t)lpvobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpspropvaluedest;
    (void)lpspropvaluesrc;
    (void)lpfallocmore;
    (void)lpvobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookRTFSync(JNIEnv* km_env, jclass km_clazz, jlong lpmessage, jint ulflags, jlong lpfmessageupdated) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RTFSync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmessage, (uint32_t)ulflags, (void*)(uintptr_t)lpfmessageupdated);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpmessage;
    (void)ulflags;
    (void)lpfmessageupdated;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScCopyNotifications(JNIEnv* km_env, jclass km_clazz, jint cnotification, jlong lpnotifications, jlong lpvdst, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCopyNotifications");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)cnotification, (void*)(uintptr_t)lpnotifications, (void*)(uintptr_t)lpvdst, (void*)(uintptr_t)lpcb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cnotification;
    (void)lpnotifications;
    (void)lpvdst;
    (void)lpcb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScCopyProps(JNIEnv* km_env, jclass km_clazz, jint cvalues, jlong lpproparray, jlong lpvdst, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCopyProps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)cvalues, (void*)(uintptr_t)lpproparray, (void*)(uintptr_t)lpvdst, (void*)(uintptr_t)lpcb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpvdst;
    (void)lpcb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScCountNotifications(JNIEnv* km_env, jclass km_clazz, jint cnotifications, jlong lpnotifications, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCountNotifications");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)cnotifications, (void*)(uintptr_t)lpnotifications, (void*)(uintptr_t)lpcb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cnotifications;
    (void)lpnotifications;
    (void)lpcb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScCountProps(JNIEnv* km_env, jclass km_clazz, jint cvalues, jlong lpproparray, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCountProps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)cvalues, (void*)(uintptr_t)lpproparray, (void*)(uintptr_t)lpcb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpcb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScCreateConversationIndex(JNIEnv* km_env, jclass km_clazz, jint cbparent, jlong lpbparent, jlong lpcbconvindex, jlong lppbconvindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCreateConversationIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cbparent, (void*)(uintptr_t)lpbparent, (void*)(uintptr_t)lpcbconvindex, (void*)(uintptr_t)lppbconvindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cbparent;
    (void)lpbparent;
    (void)lpcbconvindex;
    (void)lppbconvindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScDupPropset(JNIEnv* km_env, jclass km_clazz, jint cvalues, jlong lpproparray, jlong lpallocatebuffer, jlong lppproparray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScDupPropset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)cvalues, (void*)(uintptr_t)lpproparray, (void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lppproparray);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpallocatebuffer;
    (void)lppproparray;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScInitMapiUtil(JNIEnv* km_env, jclass km_clazz, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScInitMapiUtil");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScLocalPathFromUNC(JNIEnv* km_env, jclass km_clazz, jlong lpszunc, jlong lpszlocal, jint cchlocal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScLocalPathFromUNC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszunc, (void*)(uintptr_t)lpszlocal, (uint32_t)cchlocal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszunc;
    (void)lpszlocal;
    (void)cchlocal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScRelocNotifications(JNIEnv* km_env, jclass km_clazz, jint cnotification, jlong lpnotifications, jlong lpvbaseold, jlong lpvbasenew, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScRelocNotifications");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)cnotification, (void*)(uintptr_t)lpnotifications, (void*)(uintptr_t)lpvbaseold, (void*)(uintptr_t)lpvbasenew, (void*)(uintptr_t)lpcb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cnotification;
    (void)lpnotifications;
    (void)lpvbaseold;
    (void)lpvbasenew;
    (void)lpcb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScRelocProps(JNIEnv* km_env, jclass km_clazz, jint cvalues, jlong lpproparray, jlong lpvbaseold, jlong lpvbasenew, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScRelocProps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)cvalues, (void*)(uintptr_t)lpproparray, (void*)(uintptr_t)lpvbaseold, (void*)(uintptr_t)lpvbasenew, (void*)(uintptr_t)lpcb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpvbaseold;
    (void)lpvbasenew;
    (void)lpcb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookScUNCFromLocalPath(JNIEnv* km_env, jclass km_clazz, jlong lpszlocal, jlong lpszunc, jint cchunc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScUNCFromLocalPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszlocal, (void*)(uintptr_t)lpszunc, (uint32_t)cchunc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszlocal;
    (void)lpszunc;
    (void)cchunc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookSzFindCh(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jshort ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SzFindCh");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsz, (uint16_t)ch);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpsz;
    (void)ch;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookSzFindLastCh(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jshort ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SzFindLastCh");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsz, (uint16_t)ch);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpsz;
    (void)ch;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookSzFindSz(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jlong lpszkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SzFindSz");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsz, (void*)(uintptr_t)lpszkey);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpsz;
    (void)lpszkey;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookUFromSz(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UFromSz");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsz);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpsz;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookUlAddRef(JNIEnv* km_env, jclass km_clazz, jlong lpunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UlAddRef");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpunk);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpunk;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookUlPropSize(JNIEnv* km_env, jclass km_clazz, jlong lpspropvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UlPropSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpspropvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpspropvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookUlRelease(JNIEnv* km_env, jclass km_clazz, jlong lpunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UlRelease");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpunk);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpunk;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream(JNIEnv* km_env, jclass km_clazz, jlong lpcompressedrtfstream, jint ulflags, jlong lpuncompressedrtfstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WrapCompressedRTFStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcompressedrtfstream, (uint32_t)ulflags, (void*)(uintptr_t)lpuncompressedrtfstream);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcompressedrtfstream;
    (void)ulflags;
    (void)lpuncompressedrtfstream;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssysWindowsWin32SystemAddressbookWrapStoreEntryID(JNIEnv* km_env, jclass km_clazz, jint ulflags, jlong lpszdllname, jint cborigentry, jlong lporigentry, jlong lpcbwrappedentry, jlong lppwrappedentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WrapStoreEntryID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulflags, (void*)(uintptr_t)lpszdllname, (uint32_t)cborigentry, (void*)(uintptr_t)lporigentry, (void*)(uintptr_t)lpcbwrappedentry, (void*)(uintptr_t)lppwrappedentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulflags;
    (void)lpszdllname;
    (void)cborigentry;
    (void)lporigentry;
    (void)lpcbwrappedentry;
    (void)lppwrappedentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

