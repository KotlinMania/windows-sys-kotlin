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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1computeInvCMAP(JNIEnv* km_env, jclass km_clazz, jlong prgbcolors, jint ncolors, jlong pinvtable, jint cbtable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComputeInvCMAP");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgbcolors, (uint32_t)ncolors, (void*)(uintptr_t)pinvtable, (uint32_t)cbtable) : -1;
#else
    (void)prgbcolors;
    (void)ncolors;
    (void)pinvtable;
    (void)cbtable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1createMIMEMap(JNIEnv* km_env, jclass km_clazz, jlong ppmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMIMEMap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppmap) : -1;
#else
    (void)ppmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1decodeImage(JNIEnv* km_env, jclass km_clazz, jlong pstream, jlong pmap, jlong peventsink) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodeImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstream, (void*)(uintptr_t)pmap, (void*)(uintptr_t)peventsink) : -1;
#else
    (void)pstream;
    (void)pmap;
    (void)peventsink;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1decodeImageEx(JNIEnv* km_env, jclass km_clazz, jlong pstream, jlong pmap, jlong peventsink, jlong pszmimetypeparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodeImageEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstream, (void*)(uintptr_t)pmap, (void*)(uintptr_t)peventsink, (void*)(uintptr_t)pszmimetypeparam) : -1;
#else
    (void)pstream;
    (void)pmap;
    (void)peventsink;
    (void)pszmimetypeparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ditherTo8(JNIEnv* km_env, jclass km_clazz, jlong pdestbits, jint ndestpitch, jlong psrcbits, jint nsrcpitch, jlong bfidsrc, jlong prgbdestcolors, jlong prgbsrccolors, jlong pbdestinvmap, jint x, jint y, jint cx, jint cy, jint ldesttrans, jint lsrctrans) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*, void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DitherTo8");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdestbits, (int32_t)ndestpitch, (void*)(uintptr_t)psrcbits, (int32_t)nsrcpitch, (void*)(uintptr_t)bfidsrc, (void*)(uintptr_t)prgbdestcolors, (void*)(uintptr_t)prgbsrccolors, (void*)(uintptr_t)pbdestinvmap, (int32_t)x, (int32_t)y, (int32_t)cx, (int32_t)cy, (int32_t)ldesttrans, (int32_t)lsrctrans) : -1;
#else
    (void)pdestbits;
    (void)ndestpitch;
    (void)psrcbits;
    (void)nsrcpitch;
    (void)bfidsrc;
    (void)prgbdestcolors;
    (void)prgbsrccolors;
    (void)pbdestinvmap;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)ldesttrans;
    (void)lsrctrans;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1getMaxMIMEIDBytes(JNIEnv* km_env, jclass km_clazz, jlong pnmaxbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMaxMIMEIDBytes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pnmaxbytes) : -1;
#else
    (void)pnmaxbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEAssociateThreadWithTab(JNIEnv* km_env, jclass km_clazz, jint dwtabthreadid, jint dwassociatedthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEAssociateThreadWithTab");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtabthreadid, (uint32_t)dwassociatedthreadid) : -1;
#else
    (void)dwtabthreadid;
    (void)dwassociatedthreadid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iECancelSaveFile(JNIEnv* km_env, jclass km_clazz, jlong hstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IECancelSaveFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstate) : -1;
#else
    (void)hstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iECreateDirectory(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IECreateDirectory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (void*)(uintptr_t)lpsecurityattributes) : -1;
#else
    (void)lppathname;
    (void)lpsecurityattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iECreateFile(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwdesiredaccess, jint dwsharemode, jlong lpsecurityattributes, jint dwcreationdisposition, jint dwflagsandattributes, jlong htemplatefile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IECreateFile");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)dwcreationdisposition, (uint32_t)dwflagsandattributes, (void*)(uintptr_t)htemplatefile) : NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwcreationdisposition;
    (void)dwflagsandattributes;
    (void)htemplatefile;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEDeleteFile(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEDeleteFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEDisassociateThreadWithTab(JNIEnv* km_env, jclass km_clazz, jint dwtabthreadid, jint dwassociatedthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEDisassociateThreadWithTab");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtabthreadid, (uint32_t)dwassociatedthreadid) : -1;
#else
    (void)dwtabthreadid;
    (void)dwassociatedthreadid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEFindFirstFile(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpfindfiledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEFindFirstFile");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpfindfiledata) : NULL;
#else
    (void)lpfilename;
    (void)lpfindfiledata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEGetFileAttributesEx(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEGetFileAttributesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfileinformation) : -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEGetProtectedModeCookie(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jlong pcchcookiedata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEGetProtectedModeCookie");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)pcchcookiedata, (uint32_t)dwflags) : -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)pcchcookiedata;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEGetWriteableFolderPath(JNIEnv* km_env, jclass km_clazz, jlong clsidfolderid, jlong lppwstrpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEGetWriteableFolderPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clsidfolderid, (void*)(uintptr_t)lppwstrpath) : -1;
#else
    (void)clsidfolderid;
    (void)lppwstrpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEGetWriteableLowHKCU(JNIEnv* km_env, jclass km_clazz, jlong phkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEGetWriteableLowHKCU");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phkey) : -1;
#else
    (void)phkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEInPrivateFilteringEnabled(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEInPrivateFilteringEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEIsInPrivateBrowsing(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEIsInPrivateBrowsing");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEIsProtectedModeProcess(JNIEnv* km_env, jclass km_clazz, jlong pbresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEIsProtectedModeProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbresult) : -1;
#else
    (void)pbresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEIsProtectedModeURL(JNIEnv* km_env, jclass km_clazz, jlong lpwstrurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEIsProtectedModeURL");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwstrurl) : -1;
#else
    (void)lpwstrurl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iELaunchURL(JNIEnv* km_env, jclass km_clazz, jlong lpwstrurl, jlong lpprocinfo, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IELaunchURL");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwstrurl, (void*)(uintptr_t)lpprocinfo, (void*)(uintptr_t)lpinfo) : -1;
#else
    (void)lpwstrurl;
    (void)lpprocinfo;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEMoveFileEx(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEMoveFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (uint32_t)dwflags) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iERefreshElevationPolicy(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IERefreshElevationPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iERegCreateKeyEx(JNIEnv* km_env, jclass km_clazz, jlong lpsubkey, jint reserved, jlong lpclass, jint dwoptions, jint samdesired, jlong lpsecurityattributes, jlong phkresult, jlong lpdwdisposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IERegCreateKeyEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsubkey, (uint32_t)reserved, (void*)(uintptr_t)lpclass, (uint32_t)dwoptions, (uint32_t)samdesired, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)phkresult, (void*)(uintptr_t)lpdwdisposition) : -1;
#else
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iERegSetValueEx(JNIEnv* km_env, jclass km_clazz, jlong lpsubkey, jlong lpvaluename, jint reserved, jint dwtype, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IERegSetValueEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpvaluename, (uint32_t)reserved, (uint32_t)dwtype, (void*)(uintptr_t)lpdata, (uint32_t)cbdata) : -1;
#else
    (void)lpsubkey;
    (void)lpvaluename;
    (void)reserved;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iERemoveDirectory(JNIEnv* km_env, jclass km_clazz, jlong lppathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IERemoveDirectory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname) : -1;
#else
    (void)lppathname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iESaveFile(JNIEnv* km_env, jclass km_clazz, jlong hstate, jlong lpwstrsourcefile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IESaveFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstate, (void*)(uintptr_t)lpwstrsourcefile) : -1;
#else
    (void)hstate;
    (void)lpwstrsourcefile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iESetProtectedModeCookie(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IESetProtectedModeCookie");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (uint32_t)dwflags) : -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEShowOpenFileDialog(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpwstrfilename, jint cchmaxfilename, jlong lpwstrinitialdir, jlong lpwstrfilter, jlong lpwstrdefext, jint dwfilterindex, jint dwflags, jlong phfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEShowOpenFileDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpwstrfilename, (uint32_t)cchmaxfilename, (void*)(uintptr_t)lpwstrinitialdir, (void*)(uintptr_t)lpwstrfilter, (void*)(uintptr_t)lpwstrdefext, (uint32_t)dwfilterindex, (uint32_t)dwflags, (void*)(uintptr_t)phfile) : -1;
#else
    (void)hwnd;
    (void)lpwstrfilename;
    (void)cchmaxfilename;
    (void)lpwstrinitialdir;
    (void)lpwstrfilter;
    (void)lpwstrdefext;
    (void)dwfilterindex;
    (void)dwflags;
    (void)phfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iEShowSaveFileDialog(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpwstrinitialfilename, jlong lpwstrinitialdir, jlong lpwstrfilter, jlong lpwstrdefext, jint dwfilterindex, jint dwflags, jlong lppwstrdestinationfilepath, jlong phstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEShowSaveFileDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpwstrinitialfilename, (void*)(uintptr_t)lpwstrinitialdir, (void*)(uintptr_t)lpwstrfilter, (void*)(uintptr_t)lpwstrdefext, (uint32_t)dwfilterindex, (uint32_t)dwflags, (void*)(uintptr_t)lppwstrdestinationfilepath, (void*)(uintptr_t)phstate) : -1;
#else
    (void)hwnd;
    (void)lpwstrinitialfilename;
    (void)lpwstrinitialdir;
    (void)lpwstrfilter;
    (void)lpwstrdefext;
    (void)dwfilterindex;
    (void)dwflags;
    (void)lppwstrdestinationfilepath;
    (void)phstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1iETrackingProtectionEnabled(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ieframe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IETrackingProtectionEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1identifyMIMEType(JNIEnv* km_env, jclass km_clazz, jlong pbbytes, jint nbytes, jlong pnformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IdentifyMIMEType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbbytes, (uint32_t)nbytes, (void*)(uintptr_t)pnformat) : -1;
#else
    (void)pbbytes;
    (void)nbytes;
    (void)pnformat;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingAccessDeniedDialog(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong pszusername, jlong pszcontentdescription, jlong pratingdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingAccessDeniedDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszcontentdescription, (void*)(uintptr_t)pratingdetails) : -1;
#else
    (void)hdlg;
    (void)pszusername;
    (void)pszcontentdescription;
    (void)pratingdetails;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingAccessDeniedDialog2(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong pszusername, jlong pratingdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingAccessDeniedDialog2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pratingdetails) : -1;
#else
    (void)hdlg;
    (void)pszusername;
    (void)pratingdetails;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingAccessDeniedDialog2W(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong pszusername, jlong pratingdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingAccessDeniedDialog2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pratingdetails) : -1;
#else
    (void)hdlg;
    (void)pszusername;
    (void)pratingdetails;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingAccessDeniedDialogW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong pszusername, jlong pszcontentdescription, jlong pratingdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingAccessDeniedDialogW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszcontentdescription, (void*)(uintptr_t)pratingdetails) : -1;
#else
    (void)hdlg;
    (void)pszusername;
    (void)pszcontentdescription;
    (void)pratingdetails;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingAddToApprovedSites(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint cbpasswordblob, jlong pbpasswordblob, jlong lpszurl, jint falwaysnever, jint fsitepage, jint fapprovedsitesenforced) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingAddToApprovedSites");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (uint32_t)cbpasswordblob, (void*)(uintptr_t)pbpasswordblob, (void*)(uintptr_t)lpszurl, (int32_t)falwaysnever, (int32_t)fsitepage, (int32_t)fapprovedsitesenforced) : -1;
#else
    (void)hdlg;
    (void)cbpasswordblob;
    (void)pbpasswordblob;
    (void)lpszurl;
    (void)falwaysnever;
    (void)fsitepage;
    (void)fapprovedsitesenforced;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingCheckUserAccess(JNIEnv* km_env, jclass km_clazz, jlong pszusername, jlong pszurl, jlong pszratinginfo, jlong pdata, jint cbdata, jlong ppratingdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingCheckUserAccess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszratinginfo, (void*)(uintptr_t)pdata, (uint32_t)cbdata, (void*)(uintptr_t)ppratingdetails) : -1;
#else
    (void)pszusername;
    (void)pszurl;
    (void)pszratinginfo;
    (void)pdata;
    (void)cbdata;
    (void)ppratingdetails;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingCheckUserAccessW(JNIEnv* km_env, jclass km_clazz, jlong pszusername, jlong pszurl, jlong pszratinginfo, jlong pdata, jint cbdata, jlong ppratingdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingCheckUserAccessW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszratinginfo, (void*)(uintptr_t)pdata, (uint32_t)cbdata, (void*)(uintptr_t)ppratingdetails) : -1;
#else
    (void)pszusername;
    (void)pszurl;
    (void)pszratinginfo;
    (void)pdata;
    (void)cbdata;
    (void)ppratingdetails;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingClickedOnPRFInternal(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong param1, jlong lpszfilename, jint nshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingClickedOnPRFInternal");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)param1, (void*)(uintptr_t)lpszfilename, (int32_t)nshow) : -1;
#else
    (void)hwndowner;
    (void)param1;
    (void)lpszfilename;
    (void)nshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingClickedOnRATInternal(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong param1, jlong lpszfilename, jint nshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingClickedOnRATInternal");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)param1, (void*)(uintptr_t)lpszfilename, (int32_t)nshow) : -1;
#else
    (void)hwndowner;
    (void)param1;
    (void)lpszfilename;
    (void)nshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingEnable(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong pszusername, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingEnable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)pszusername, (int32_t)fenable) : -1;
#else
    (void)hwndparent;
    (void)pszusername;
    (void)fenable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingEnableW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong pszusername, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingEnableW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)pszusername, (int32_t)fenable) : -1;
#else
    (void)hwndparent;
    (void)pszusername;
    (void)fenable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingEnabledQuery(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingEnabledQuery");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingFreeDetails(JNIEnv* km_env, jclass km_clazz, jlong pratingdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingFreeDetails");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pratingdetails) : -1;
#else
    (void)pratingdetails;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingInit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingInit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingObtainCancel(JNIEnv* km_env, jclass km_clazz, jlong hratingobtainquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingObtainCancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hratingobtainquery) : -1;
#else
    (void)hratingobtainquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingObtainQuery(JNIEnv* km_env, jclass km_clazz, jlong psztargeturl, jint dwuserdata, jlong fcallback, jlong phratingobtainquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingObtainQuery");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargeturl, (uint32_t)dwuserdata, (int64_t)fcallback, (void*)(uintptr_t)phratingobtainquery) : -1;
#else
    (void)psztargeturl;
    (void)dwuserdata;
    (void)fcallback;
    (void)phratingobtainquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingObtainQueryW(JNIEnv* km_env, jclass km_clazz, jlong psztargeturl, jint dwuserdata, jlong fcallback, jlong phratingobtainquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingObtainQueryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargeturl, (uint32_t)dwuserdata, (int64_t)fcallback, (void*)(uintptr_t)phratingobtainquery) : -1;
#else
    (void)psztargeturl;
    (void)dwuserdata;
    (void)fcallback;
    (void)phratingobtainquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingSetupUI(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong pszusername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingSetupUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)pszusername) : -1;
#else
    (void)hdlg;
    (void)pszusername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1ratingSetupUIW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jlong pszusername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msrating.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RatingSetupUIW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdlg, (void*)(uintptr_t)pszusername) : -1;
#else
    (void)hdlg;
    (void)pszusername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_web_internetexplorer_WindowsWin32WebInternetexplorerJniBridge_windowssys_1windows_1win32_1web_1internetexplorer_1sniffStream(JNIEnv* km_env, jclass km_clazz, jlong pinstream, jlong pnformat, jlong ppoutstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imgutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SniffStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstream, (void*)(uintptr_t)pnformat, (void*)(uintptr_t)ppoutstream) : -1;
#else
    (void)pinstream;
    (void)pnformat;
    (void)ppoutstream;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

