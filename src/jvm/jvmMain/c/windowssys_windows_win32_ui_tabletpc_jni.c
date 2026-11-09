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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1AddStroke(JNIEnv* km_env, jclass km_clazz, jlong hrc, jlong ppacketdesc, jint cbpacket, jlong ppacket, jlong pxform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddStroke");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (void*)(uintptr_t)ppacketdesc, (uint32_t)cbpacket, (void*)(uintptr_t)ppacket, (void*)(uintptr_t)pxform) : -1;
#else
    (void)hrc;
    (void)ppacketdesc;
    (void)cbpacket;
    (void)ppacket;
    (void)pxform;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1AddWordsToWordList(JNIEnv* km_env, jclass km_clazz, jlong hwl, jlong pwcwords) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddWordsToWordList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwl, (void*)(uintptr_t)pwcwords) : -1;
#else
    (void)hwl;
    (void)pwcwords;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1AdviseInkChange(JNIEnv* km_env, jclass km_clazz, jlong hrc, jint bnewstroke) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdviseInkChange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (int32_t)bnewstroke) : -1;
#else
    (void)hrc;
    (void)bnewstroke;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1CreateContext(JNIEnv* km_env, jclass km_clazz, jlong hrec, jlong phrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrec, (void*)(uintptr_t)phrc) : -1;
#else
    (void)hrec;
    (void)phrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1CreateRecognizer(JNIEnv* km_env, jclass km_clazz, jlong pclsid, jlong phrec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRecognizer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pclsid, (void*)(uintptr_t)phrec) : -1;
#else
    (void)pclsid;
    (void)phrec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1DestroyContext(JNIEnv* km_env, jclass km_clazz, jlong hrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc) : -1;
#else
    (void)hrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1DestroyRecognizer(JNIEnv* km_env, jclass km_clazz, jlong hrec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyRecognizer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrec) : -1;
#else
    (void)hrec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1DestroyWordList(JNIEnv* km_env, jclass km_clazz, jlong hwl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyWordList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwl) : -1;
#else
    (void)hwl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1EndInkInput(JNIEnv* km_env, jclass km_clazz, jlong hrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndInkInput");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc) : -1;
#else
    (void)hrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1GetAllRecognizers(JNIEnv* km_env, jclass km_clazz, jlong recognizerclsids, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAllRecognizers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)recognizerclsids, (void*)(uintptr_t)count) : -1;
#else
    (void)recognizerclsids;
    (void)count;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1GetBestResultString(JNIEnv* km_env, jclass km_clazz, jlong hrc, jlong pcsize, jlong pwcbestresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBestResultString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (void*)(uintptr_t)pcsize, (void*)(uintptr_t)pwcbestresult) : -1;
#else
    (void)hrc;
    (void)pcsize;
    (void)pwcbestresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1GetLatticePtr(JNIEnv* km_env, jclass km_clazz, jlong hrc, jlong pplattice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLatticePtr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (void*)(uintptr_t)pplattice) : -1;
#else
    (void)hrc;
    (void)pplattice;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1GetLeftSeparator(JNIEnv* km_env, jclass km_clazz, jlong hrc, jlong pcsize, jlong pwcleftseparator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLeftSeparator");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (void*)(uintptr_t)pcsize, (void*)(uintptr_t)pwcleftseparator) : -1;
#else
    (void)hrc;
    (void)pcsize;
    (void)pwcleftseparator;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1GetRecoAttributes(JNIEnv* km_env, jclass km_clazz, jlong hrec, jlong precoattrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRecoAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrec, (void*)(uintptr_t)precoattrs) : -1;
#else
    (void)hrec;
    (void)precoattrs;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1GetResultPropertyList(JNIEnv* km_env, jclass km_clazz, jlong hrec, jlong ppropertycount, jlong ppropertyguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetResultPropertyList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrec, (void*)(uintptr_t)ppropertycount, (void*)(uintptr_t)ppropertyguid) : -1;
#else
    (void)hrec;
    (void)ppropertycount;
    (void)ppropertyguid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1GetRightSeparator(JNIEnv* km_env, jclass km_clazz, jlong hrc, jlong pcsize, jlong pwcrightseparator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRightSeparator");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (void*)(uintptr_t)pcsize, (void*)(uintptr_t)pwcrightseparator) : -1;
#else
    (void)hrc;
    (void)pcsize;
    (void)pwcrightseparator;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1GetUnicodeRanges(JNIEnv* km_env, jclass km_clazz, jlong hrec, jlong pcranges, jlong pcr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUnicodeRanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrec, (void*)(uintptr_t)pcranges, (void*)(uintptr_t)pcr) : -1;
#else
    (void)hrec;
    (void)pcranges;
    (void)pcr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1IsStringSupported(JNIEnv* km_env, jclass km_clazz, jlong hrc, jint wcstring, jlong pwcstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsStringSupported");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (uint32_t)wcstring, (void*)(uintptr_t)pwcstring) : -1;
#else
    (void)hrc;
    (void)wcstring;
    (void)pwcstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1MakeWordList(JNIEnv* km_env, jclass km_clazz, jlong hrec, jlong pbuffer, jlong phwl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeWordList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrec, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)phwl) : -1;
#else
    (void)hrec;
    (void)pbuffer;
    (void)phwl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1Process(JNIEnv* km_env, jclass km_clazz, jlong hrc, jlong pbpartialprocessing) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Process");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (void*)(uintptr_t)pbpartialprocessing) : -1;
#else
    (void)hrc;
    (void)pbpartialprocessing;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1SetEnabledUnicodeRanges(JNIEnv* km_env, jclass km_clazz, jlong hrc, jint cranges, jlong pcr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnabledUnicodeRanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (uint32_t)cranges, (void*)(uintptr_t)pcr) : -1;
#else
    (void)hrc;
    (void)cranges;
    (void)pcr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1SetFactoid(JNIEnv* km_env, jclass km_clazz, jlong hrc, jint cwcfactoid, jlong pwcfactoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFactoid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (uint32_t)cwcfactoid, (void*)(uintptr_t)pwcfactoid) : -1;
#else
    (void)hrc;
    (void)cwcfactoid;
    (void)pwcfactoid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1SetFlags(JNIEnv* km_env, jclass km_clazz, jlong hrc, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFlags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (uint32_t)dwflags) : -1;
#else
    (void)hrc;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1SetGuide(JNIEnv* km_env, jclass km_clazz, jlong hrc, jlong pguide, jint iindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGuide");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (void*)(uintptr_t)pguide, (uint32_t)iindex) : -1;
#else
    (void)hrc;
    (void)pguide;
    (void)iindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1SetTextContext(JNIEnv* km_env, jclass km_clazz, jlong hrc, jint cwcbefore, jlong pwcbefore, jint cwcafter, jlong pwcafter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTextContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (uint32_t)cwcbefore, (void*)(uintptr_t)pwcbefore, (uint32_t)cwcafter, (void*)(uintptr_t)pwcafter) : -1;
#else
    (void)hrc;
    (void)cwcbefore;
    (void)pwcbefore;
    (void)cwcafter;
    (void)pwcafter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_tabletpc_WindowsWin32UiTabletpcJniBridge_windowssys_1windows_1win32_1ui_1tabletpc_1SetWordList(JNIEnv* km_env, jclass km_clazz, jlong hrc, jlong hwl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("inkobjcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWordList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrc, (void*)(uintptr_t)hwl) : -1;
#else
    (void)hrc;
    (void)hwl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

