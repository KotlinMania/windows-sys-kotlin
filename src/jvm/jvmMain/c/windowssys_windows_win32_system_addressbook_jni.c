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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1BuildDisplayTable(JNIEnv* km_env, jclass km_clazz, jlong lpallocatebuffer, jlong lpallocatemore, jlong lpfreebuffer, jlong lpmalloc, jlong hinstance, jint cpages, jlong lppage, jint ulflags, jlong lpptable, jlong lpptbldata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildDisplayTable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpallocatemore, (void*)(uintptr_t)lpfreebuffer, (void*)(uintptr_t)lpmalloc, (void*)(uintptr_t)hinstance, (uint32_t)cpages, (void*)(uintptr_t)lppage, (uint32_t)ulflags, (void*)(uintptr_t)lpptable, (void*)(uintptr_t)lpptbldata) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ChangeIdleRoutine(JNIEnv* km_env, jclass km_clazz, jlong ftg, jlong lpfnidle, jlong lpvidleparam, jshort priidle, jint csecidle, jshort iroidle, jshort ircidle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t, uint32_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeIdleRoutine");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ftg, (void*)(uintptr_t)lpfnidle, (void*)(uintptr_t)lpvidleparam, (int16_t)priidle, (uint32_t)csecidle, (uint16_t)iroidle, (uint16_t)ircidle);
#else
    (void)ftg;
    (void)lpfnidle;
    (void)lpvidleparam;
    (void)priidle;
    (void)csecidle;
    (void)iroidle;
    (void)ircidle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1CreateIProp(JNIEnv* km_env, jclass km_clazz, jlong lpinterface, jlong lpallocatebuffer, jlong lpallocatemore, jlong lpfreebuffer, jlong lpvreserved, jlong lpppropdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIProp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpinterface, (void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpallocatemore, (void*)(uintptr_t)lpfreebuffer, (void*)(uintptr_t)lpvreserved, (void*)(uintptr_t)lpppropdata) : -1;
#else
    (void)lpinterface;
    (void)lpallocatebuffer;
    (void)lpallocatemore;
    (void)lpfreebuffer;
    (void)lpvreserved;
    (void)lpppropdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1CreateTable(JNIEnv* km_env, jclass km_clazz, jlong lpinterface, jlong lpallocatebuffer, jlong lpallocatemore, jlong lpfreebuffer, jlong lpvreserved, jint ultabletype, jint ulproptagindexcolumn, jlong lpsproptagarraycolumns, jlong lpptabledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpinterface, (void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpallocatemore, (void*)(uintptr_t)lpfreebuffer, (void*)(uintptr_t)lpvreserved, (uint32_t)ultabletype, (uint32_t)ulproptagindexcolumn, (void*)(uintptr_t)lpsproptagarraycolumns, (void*)(uintptr_t)lpptabledata) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1DeinitMapiUtil(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeinitMapiUtil");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1DeregisterIdleRoutine(JNIEnv* km_env, jclass km_clazz, jlong ftg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeregisterIdleRoutine");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ftg);
#else
    (void)ftg;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1EnableIdleRoutine(JNIEnv* km_env, jclass km_clazz, jlong ftg, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableIdleRoutine");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ftg, (int32_t)fenable);
#else
    (void)ftg;
    (void)fenable;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1FEqualNames(JNIEnv* km_env, jclass km_clazz, jlong lpname1, jlong lpname2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FEqualNames");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname1, (void*)(uintptr_t)lpname2) : -1;
#else
    (void)lpname1;
    (void)lpname2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1FPropCompareProp(JNIEnv* km_env, jclass km_clazz, jlong lpspropvalue1, jint ulrelop, jlong lpspropvalue2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FPropCompareProp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpspropvalue1, (uint32_t)ulrelop, (void*)(uintptr_t)lpspropvalue2) : -1;
#else
    (void)lpspropvalue1;
    (void)ulrelop;
    (void)lpspropvalue2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1FPropContainsProp(JNIEnv* km_env, jclass km_clazz, jlong lpspropvaluedst, jlong lpspropvaluesrc, jint ulfuzzylevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FPropContainsProp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpspropvaluedst, (void*)(uintptr_t)lpspropvaluesrc, (uint32_t)ulfuzzylevel) : -1;
#else
    (void)lpspropvaluedst;
    (void)lpspropvaluesrc;
    (void)ulfuzzylevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1FPropExists(JNIEnv* km_env, jclass km_clazz, jlong lpmapiprop, jint ulproptag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FPropExists");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmapiprop, (uint32_t)ulproptag) : -1;
#else
    (void)lpmapiprop;
    (void)ulproptag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1FreePadrlist(JNIEnv* km_env, jclass km_clazz, jlong lpadrlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePadrlist");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpadrlist);
#else
    (void)lpadrlist;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1FreeProws(JNIEnv* km_env, jclass km_clazz, jlong lprows) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeProws");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lprows);
#else
    (void)lprows;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1FtgRegisterIdleRoutine(JNIEnv* km_env, jclass km_clazz, jlong lpfnidle, jlong lpvidleparam, jshort priidle, jint csecidle, jshort iroidle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int16_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtgRegisterIdleRoutine");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfnidle, (void*)(uintptr_t)lpvidleparam, (int16_t)priidle, (uint32_t)csecidle, (uint16_t)iroidle) : NULL;
#else
    (void)lpfnidle;
    (void)lpvidleparam;
    (void)priidle;
    (void)csecidle;
    (void)iroidle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1HrAddColumns(JNIEnv* km_env, jclass km_clazz, jlong lptbl, jlong lpproptagcolumnsnew, jlong lpallocatebuffer, jlong lpfreebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrAddColumns");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptbl, (void*)(uintptr_t)lpproptagcolumnsnew, (void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpfreebuffer) : -1;
#else
    (void)lptbl;
    (void)lpproptagcolumnsnew;
    (void)lpallocatebuffer;
    (void)lpfreebuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1HrAddColumnsEx(JNIEnv* km_env, jclass km_clazz, jlong lptbl, jlong lpproptagcolumnsnew, jlong lpallocatebuffer, jlong lpfreebuffer, jlong lpfnfiltercolumns) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrAddColumnsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptbl, (void*)(uintptr_t)lpproptagcolumnsnew, (void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpfreebuffer, (int64_t)lpfnfiltercolumns) : -1;
#else
    (void)lptbl;
    (void)lpproptagcolumnsnew;
    (void)lpallocatebuffer;
    (void)lpfreebuffer;
    (void)lpfnfiltercolumns;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1HrAllocAdviseSink(JNIEnv* km_env, jclass km_clazz, jlong lpfncallback, jlong lpvcontext, jlong lppadvisesink) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrAllocAdviseSink");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpvcontext, (void*)(uintptr_t)lppadvisesink) : -1;
#else
    (void)lpfncallback;
    (void)lpvcontext;
    (void)lppadvisesink;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1HrDispatchNotifications(JNIEnv* km_env, jclass km_clazz, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrDispatchNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ulflags) : -1;
#else
    (void)ulflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1HrGetOneProp(JNIEnv* km_env, jclass km_clazz, jlong lpmapiprop, jint ulproptag, jlong lppprop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrGetOneProp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmapiprop, (uint32_t)ulproptag, (void*)(uintptr_t)lppprop) : -1;
#else
    (void)lpmapiprop;
    (void)ulproptag;
    (void)lppprop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1HrIStorageFromStream(JNIEnv* km_env, jclass km_clazz, jlong lpunkin, jlong lpinterface, jint ulflags, jlong lppstorageout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrIStorageFromStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpunkin, (void*)(uintptr_t)lpinterface, (uint32_t)ulflags, (void*)(uintptr_t)lppstorageout) : -1;
#else
    (void)lpunkin;
    (void)lpinterface;
    (void)ulflags;
    (void)lppstorageout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1HrQueryAllRows(JNIEnv* km_env, jclass km_clazz, jlong lptable, jlong lpproptags, jlong lprestriction, jlong lpsortorderset, jint crowsmax, jlong lpprows) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrQueryAllRows");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptable, (void*)(uintptr_t)lpproptags, (void*)(uintptr_t)lprestriction, (void*)(uintptr_t)lpsortorderset, (int32_t)crowsmax, (void*)(uintptr_t)lpprows) : -1;
#else
    (void)lptable;
    (void)lpproptags;
    (void)lprestriction;
    (void)lpsortorderset;
    (void)crowsmax;
    (void)lpprows;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1HrSetOneProp(JNIEnv* km_env, jclass km_clazz, jlong lpmapiprop, jlong lpprop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrSetOneProp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmapiprop, (void*)(uintptr_t)lpprop) : -1;
#else
    (void)lpmapiprop;
    (void)lpprop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1HrThisThreadAdviseSink(JNIEnv* km_env, jclass km_clazz, jlong lpadvisesink, jlong lppadvisesink) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HrThisThreadAdviseSink");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpadvisesink, (void*)(uintptr_t)lppadvisesink) : -1;
#else
    (void)lpadvisesink;
    (void)lppadvisesink;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1LPropCompareProp(JNIEnv* km_env, jclass km_clazz, jlong lpspropvaluea, jlong lpspropvalueb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LPropCompareProp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpspropvaluea, (void*)(uintptr_t)lpspropvalueb) : -1;
#else
    (void)lpspropvaluea;
    (void)lpspropvalueb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1LpValFindProp(JNIEnv* km_env, jclass km_clazz, jint ulproptag, jint cvalues, jlong lpproparray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LpValFindProp");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ulproptag, (uint32_t)cvalues, (void*)(uintptr_t)lpproparray) : NULL;
#else
    (void)ulproptag;
    (void)cvalues;
    (void)lpproparray;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1MAPIDeinitIdle(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MAPIDeinitIdle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1MAPIGetDefaultMalloc(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MAPIGetDefaultMalloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1MAPIInitIdle(JNIEnv* km_env, jclass km_clazz, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MAPIInitIdle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpvreserved) : -1;
#else
    (void)lpvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1OpenStreamOnFile(JNIEnv* km_env, jclass km_clazz, jlong lpallocatebuffer, jlong lpfreebuffer, jint ulflags, jlong lpszfilename, jlong lpszprefix, jlong lppstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenStreamOnFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lpfreebuffer, (uint32_t)ulflags, (void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)lpszprefix, (void*)(uintptr_t)lppstream) : -1;
#else
    (void)lpallocatebuffer;
    (void)lpfreebuffer;
    (void)ulflags;
    (void)lpszfilename;
    (void)lpszprefix;
    (void)lppstream;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1PpropFindProp(JNIEnv* km_env, jclass km_clazz, jlong lpproparray, jint cvalues, jint ulproptag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PpropFindProp");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproparray, (uint32_t)cvalues, (uint32_t)ulproptag) : NULL;
#else
    (void)lpproparray;
    (void)cvalues;
    (void)ulproptag;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1PropCopyMore(JNIEnv* km_env, jclass km_clazz, jlong lpspropvaluedest, jlong lpspropvaluesrc, jlong lpfallocmore, jlong lpvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropCopyMore");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpspropvaluedest, (void*)(uintptr_t)lpspropvaluesrc, (void*)(uintptr_t)lpfallocmore, (void*)(uintptr_t)lpvobject) : -1;
#else
    (void)lpspropvaluedest;
    (void)lpspropvaluesrc;
    (void)lpfallocmore;
    (void)lpvobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1RTFSync(JNIEnv* km_env, jclass km_clazz, jlong lpmessage, jint ulflags, jlong lpfmessageupdated) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RTFSync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmessage, (uint32_t)ulflags, (void*)(uintptr_t)lpfmessageupdated) : -1;
#else
    (void)lpmessage;
    (void)ulflags;
    (void)lpfmessageupdated;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScCopyNotifications(JNIEnv* km_env, jclass km_clazz, jint cnotification, jlong lpnotifications, jlong lpvdst, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCopyNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cnotification, (void*)(uintptr_t)lpnotifications, (void*)(uintptr_t)lpvdst, (void*)(uintptr_t)lpcb) : -1;
#else
    (void)cnotification;
    (void)lpnotifications;
    (void)lpvdst;
    (void)lpcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScCopyProps(JNIEnv* km_env, jclass km_clazz, jint cvalues, jlong lpproparray, jlong lpvdst, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCopyProps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cvalues, (void*)(uintptr_t)lpproparray, (void*)(uintptr_t)lpvdst, (void*)(uintptr_t)lpcb) : -1;
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpvdst;
    (void)lpcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScCountNotifications(JNIEnv* km_env, jclass km_clazz, jint cnotifications, jlong lpnotifications, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCountNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cnotifications, (void*)(uintptr_t)lpnotifications, (void*)(uintptr_t)lpcb) : -1;
#else
    (void)cnotifications;
    (void)lpnotifications;
    (void)lpcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScCountProps(JNIEnv* km_env, jclass km_clazz, jint cvalues, jlong lpproparray, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCountProps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cvalues, (void*)(uintptr_t)lpproparray, (void*)(uintptr_t)lpcb) : -1;
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScCreateConversationIndex(JNIEnv* km_env, jclass km_clazz, jint cbparent, jlong lpbparent, jlong lpcbconvindex, jlong lppbconvindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScCreateConversationIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cbparent, (void*)(uintptr_t)lpbparent, (void*)(uintptr_t)lpcbconvindex, (void*)(uintptr_t)lppbconvindex) : -1;
#else
    (void)cbparent;
    (void)lpbparent;
    (void)lpcbconvindex;
    (void)lppbconvindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScDupPropset(JNIEnv* km_env, jclass km_clazz, jint cvalues, jlong lpproparray, jlong lpallocatebuffer, jlong lppproparray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScDupPropset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cvalues, (void*)(uintptr_t)lpproparray, (void*)(uintptr_t)lpallocatebuffer, (void*)(uintptr_t)lppproparray) : -1;
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpallocatebuffer;
    (void)lppproparray;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScInitMapiUtil(JNIEnv* km_env, jclass km_clazz, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScInitMapiUtil");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ulflags) : -1;
#else
    (void)ulflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScLocalPathFromUNC(JNIEnv* km_env, jclass km_clazz, jlong lpszunc, jlong lpszlocal, jint cchlocal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScLocalPathFromUNC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszunc, (void*)(uintptr_t)lpszlocal, (uint32_t)cchlocal) : -1;
#else
    (void)lpszunc;
    (void)lpszlocal;
    (void)cchlocal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScRelocNotifications(JNIEnv* km_env, jclass km_clazz, jint cnotification, jlong lpnotifications, jlong lpvbaseold, jlong lpvbasenew, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScRelocNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cnotification, (void*)(uintptr_t)lpnotifications, (void*)(uintptr_t)lpvbaseold, (void*)(uintptr_t)lpvbasenew, (void*)(uintptr_t)lpcb) : -1;
#else
    (void)cnotification;
    (void)lpnotifications;
    (void)lpvbaseold;
    (void)lpvbasenew;
    (void)lpcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScRelocProps(JNIEnv* km_env, jclass km_clazz, jint cvalues, jlong lpproparray, jlong lpvbaseold, jlong lpvbasenew, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScRelocProps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)cvalues, (void*)(uintptr_t)lpproparray, (void*)(uintptr_t)lpvbaseold, (void*)(uintptr_t)lpvbasenew, (void*)(uintptr_t)lpcb) : -1;
#else
    (void)cvalues;
    (void)lpproparray;
    (void)lpvbaseold;
    (void)lpvbasenew;
    (void)lpcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1ScUNCFromLocalPath(JNIEnv* km_env, jclass km_clazz, jlong lpszlocal, jlong lpszunc, jint cchunc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScUNCFromLocalPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszlocal, (void*)(uintptr_t)lpszunc, (uint32_t)cchunc) : -1;
#else
    (void)lpszlocal;
    (void)lpszunc;
    (void)cchunc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1SzFindCh(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jshort ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SzFindCh");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (uint16_t)ch) : NULL;
#else
    (void)lpsz;
    (void)ch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1SzFindLastCh(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jshort ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SzFindLastCh");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (uint16_t)ch) : NULL;
#else
    (void)lpsz;
    (void)ch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1SzFindSz(JNIEnv* km_env, jclass km_clazz, jlong lpsz, jlong lpszkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SzFindSz");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz, (void*)(uintptr_t)lpszkey) : NULL;
#else
    (void)lpsz;
    (void)lpszkey;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1UFromSz(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UFromSz");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : 0;
#else
    (void)lpsz;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1UlAddRef(JNIEnv* km_env, jclass km_clazz, jlong lpunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UlAddRef");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpunk) : 0;
#else
    (void)lpunk;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1UlPropSize(JNIEnv* km_env, jclass km_clazz, jlong lpspropvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UlPropSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpspropvalue) : 0;
#else
    (void)lpspropvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1UlRelease(JNIEnv* km_env, jclass km_clazz, jlong lpunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UlRelease");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpunk) : 0;
#else
    (void)lpunk;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1WrapCompressedRTFStream(JNIEnv* km_env, jclass km_clazz, jlong lpcompressedrtfstream, jint ulflags, jlong lpuncompressedrtfstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WrapCompressedRTFStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcompressedrtfstream, (uint32_t)ulflags, (void*)(uintptr_t)lpuncompressedrtfstream) : -1;
#else
    (void)lpcompressedrtfstream;
    (void)ulflags;
    (void)lpuncompressedrtfstream;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_addressbook_WindowsWin32SystemAddressbookJniBridge_windowssys_1windows_1win32_1system_1addressbook_1WrapStoreEntryID(JNIEnv* km_env, jclass km_clazz, jint ulflags, jlong lpszdllname, jint cborigentry, jlong lporigentry, jlong lpcbwrappedentry, jlong lppwrappedentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WrapStoreEntryID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ulflags, (void*)(uintptr_t)lpszdllname, (uint32_t)cborigentry, (void*)(uintptr_t)lporigentry, (void*)(uintptr_t)lpcbwrappedentry, (void*)(uintptr_t)lppwrappedentry) : -1;
#else
    (void)ulflags;
    (void)lpszdllname;
    (void)cborigentry;
    (void)lporigentry;
    (void)lpcbwrappedentry;
    (void)lppwrappedentry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

