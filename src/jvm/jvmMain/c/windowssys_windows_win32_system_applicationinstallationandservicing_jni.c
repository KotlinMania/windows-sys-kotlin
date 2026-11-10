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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1activateActCtx(JNIEnv* km_env, jclass km_clazz, jlong hactctx, jlong lpcookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ActivateActCtx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hactctx, (void*)(uintptr_t)lpcookie) : -1;
#else
    (void)hactctx;
    (void)lpcookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1addRefActCtx(JNIEnv* km_env, jclass km_clazz, jlong hactctx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddRefActCtx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hactctx);
#else
    (void)hactctx;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1applyDeltaA(JNIEnv* km_env, jclass km_clazz, jlong applyflags, jlong lpsourcename, jlong lpdeltaname, jlong lptargetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyDeltaA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)applyflags, (void*)(uintptr_t)lpsourcename, (void*)(uintptr_t)lpdeltaname, (void*)(uintptr_t)lptargetname) : -1;
#else
    (void)applyflags;
    (void)lpsourcename;
    (void)lpdeltaname;
    (void)lptargetname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1applyDeltaW(JNIEnv* km_env, jclass km_clazz, jlong applyflags, jlong lpsourcename, jlong lpdeltaname, jlong lptargetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyDeltaW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)applyflags, (void*)(uintptr_t)lpsourcename, (void*)(uintptr_t)lpdeltaname, (void*)(uintptr_t)lptargetname) : -1;
#else
    (void)applyflags;
    (void)lpsourcename;
    (void)lpdeltaname;
    (void)lptargetname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1applyPatchToFileA(JNIEnv* km_env, jclass km_clazz, jlong patchfilename, jlong oldfilename, jlong newfilename, jint applyoptionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilename, (void*)(uintptr_t)oldfilename, (void*)(uintptr_t)newfilename, (uint32_t)applyoptionflags) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1applyPatchToFileByBuffers(JNIEnv* km_env, jclass km_clazz, jlong patchfilemapped, jint patchfilesize, jlong oldfilemapped, jint oldfilesize, jlong newfilebuffer, jint newfilebuffersize, jlong newfileactualsize, jlong newfiletime, jint applyoptionflags, jlong progresscallback, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileByBuffers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilemapped, (uint32_t)patchfilesize, (void*)(uintptr_t)oldfilemapped, (uint32_t)oldfilesize, (void*)(uintptr_t)newfilebuffer, (uint32_t)newfilebuffersize, (void*)(uintptr_t)newfileactualsize, (void*)(uintptr_t)newfiletime, (uint32_t)applyoptionflags, (void*)(uintptr_t)progresscallback, (void*)(uintptr_t)callbackcontext) : -1;
#else
    (void)patchfilemapped;
    (void)patchfilesize;
    (void)oldfilemapped;
    (void)oldfilesize;
    (void)newfilebuffer;
    (void)newfilebuffersize;
    (void)newfileactualsize;
    (void)newfiletime;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1applyPatchToFileByHandles(JNIEnv* km_env, jclass km_clazz, jlong patchfilehandle, jlong oldfilehandle, jlong newfilehandle, jint applyoptionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileByHandles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilehandle, (void*)(uintptr_t)oldfilehandle, (void*)(uintptr_t)newfilehandle, (uint32_t)applyoptionflags) : -1;
#else
    (void)patchfilehandle;
    (void)oldfilehandle;
    (void)newfilehandle;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1applyPatchToFileByHandlesEx(JNIEnv* km_env, jclass km_clazz, jlong patchfilehandle, jlong oldfilehandle, jlong newfilehandle, jint applyoptionflags, jlong progresscallback, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileByHandlesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilehandle, (void*)(uintptr_t)oldfilehandle, (void*)(uintptr_t)newfilehandle, (uint32_t)applyoptionflags, (void*)(uintptr_t)progresscallback, (void*)(uintptr_t)callbackcontext) : -1;
#else
    (void)patchfilehandle;
    (void)oldfilehandle;
    (void)newfilehandle;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1applyPatchToFileExA(JNIEnv* km_env, jclass km_clazz, jlong patchfilename, jlong oldfilename, jlong newfilename, jint applyoptionflags, jlong progresscallback, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilename, (void*)(uintptr_t)oldfilename, (void*)(uintptr_t)newfilename, (uint32_t)applyoptionflags, (void*)(uintptr_t)progresscallback, (void*)(uintptr_t)callbackcontext) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1applyPatchToFileExW(JNIEnv* km_env, jclass km_clazz, jlong patchfilename, jlong oldfilename, jlong newfilename, jint applyoptionflags, jlong progresscallback, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilename, (void*)(uintptr_t)oldfilename, (void*)(uintptr_t)newfilename, (uint32_t)applyoptionflags, (void*)(uintptr_t)progresscallback, (void*)(uintptr_t)callbackcontext) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1applyPatchToFileW(JNIEnv* km_env, jclass km_clazz, jlong patchfilename, jlong oldfilename, jlong newfilename, jint applyoptionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPatchToFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilename, (void*)(uintptr_t)oldfilename, (void*)(uintptr_t)newfilename, (uint32_t)applyoptionflags) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)newfilename;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1createActCtxA(JNIEnv* km_env, jclass km_clazz, jlong pactctx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateActCtxA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pactctx) : NULL;
#else
    (void)pactctx;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1createActCtxW(JNIEnv* km_env, jclass km_clazz, jlong pactctx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateActCtxW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pactctx) : NULL;
#else
    (void)pactctx;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1createPatchFileA(JNIEnv* km_env, jclass km_clazz, jlong oldfilename, jlong newfilename, jlong patchfilename, jint optionflags, jlong optiondata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oldfilename, (void*)(uintptr_t)newfilename, (void*)(uintptr_t)patchfilename, (uint32_t)optionflags, (void*)(uintptr_t)optiondata) : -1;
#else
    (void)oldfilename;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1createPatchFileByHandles(JNIEnv* km_env, jclass km_clazz, jlong oldfilehandle, jlong newfilehandle, jlong patchfilehandle, jint optionflags, jlong optiondata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileByHandles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oldfilehandle, (void*)(uintptr_t)newfilehandle, (void*)(uintptr_t)patchfilehandle, (uint32_t)optionflags, (void*)(uintptr_t)optiondata) : -1;
#else
    (void)oldfilehandle;
    (void)newfilehandle;
    (void)patchfilehandle;
    (void)optionflags;
    (void)optiondata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1createPatchFileByHandlesEx(JNIEnv* km_env, jclass km_clazz, jint oldfilecount, jlong oldfileinfoarray, jlong newfilehandle, jlong patchfilehandle, jint optionflags, jlong optiondata, jlong progresscallback, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileByHandlesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)oldfilecount, (void*)(uintptr_t)oldfileinfoarray, (void*)(uintptr_t)newfilehandle, (void*)(uintptr_t)patchfilehandle, (uint32_t)optionflags, (void*)(uintptr_t)optiondata, (void*)(uintptr_t)progresscallback, (void*)(uintptr_t)callbackcontext) : -1;
#else
    (void)oldfilecount;
    (void)oldfileinfoarray;
    (void)newfilehandle;
    (void)patchfilehandle;
    (void)optionflags;
    (void)optiondata;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1createPatchFileExA(JNIEnv* km_env, jclass km_clazz, jint oldfilecount, jlong oldfileinfoarray, jlong newfilename, jlong patchfilename, jint optionflags, jlong optiondata, jlong progresscallback, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)oldfilecount, (void*)(uintptr_t)oldfileinfoarray, (void*)(uintptr_t)newfilename, (void*)(uintptr_t)patchfilename, (uint32_t)optionflags, (void*)(uintptr_t)optiondata, (void*)(uintptr_t)progresscallback, (void*)(uintptr_t)callbackcontext) : -1;
#else
    (void)oldfilecount;
    (void)oldfileinfoarray;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1createPatchFileExW(JNIEnv* km_env, jclass km_clazz, jint oldfilecount, jlong oldfileinfoarray, jlong newfilename, jlong patchfilename, jint optionflags, jlong optiondata, jlong progresscallback, jlong callbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)oldfilecount, (void*)(uintptr_t)oldfileinfoarray, (void*)(uintptr_t)newfilename, (void*)(uintptr_t)patchfilename, (uint32_t)optionflags, (void*)(uintptr_t)optiondata, (void*)(uintptr_t)progresscallback, (void*)(uintptr_t)callbackcontext) : -1;
#else
    (void)oldfilecount;
    (void)oldfileinfoarray;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    (void)progresscallback;
    (void)callbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1createPatchFileW(JNIEnv* km_env, jclass km_clazz, jlong oldfilename, jlong newfilename, jlong patchfilename, jint optionflags, jlong optiondata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePatchFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oldfilename, (void*)(uintptr_t)newfilename, (void*)(uintptr_t)patchfilename, (uint32_t)optionflags, (void*)(uintptr_t)optiondata) : -1;
#else
    (void)oldfilename;
    (void)newfilename;
    (void)patchfilename;
    (void)optionflags;
    (void)optiondata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1deactivateActCtx(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong ulcookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeactivateActCtx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (uint64_t)ulcookie) : -1;
#else
    (void)dwflags;
    (void)ulcookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1deltaFree(JNIEnv* km_env, jclass km_clazz, jlong lpmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeltaFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmemory) : -1;
#else
    (void)lpmemory;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1extractPatchHeaderToFileA(JNIEnv* km_env, jclass km_clazz, jlong patchfilename, jlong patchheaderfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractPatchHeaderToFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilename, (void*)(uintptr_t)patchheaderfilename) : -1;
#else
    (void)patchfilename;
    (void)patchheaderfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1extractPatchHeaderToFileByHandles(JNIEnv* km_env, jclass km_clazz, jlong patchfilehandle, jlong patchheaderfilehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractPatchHeaderToFileByHandles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilehandle, (void*)(uintptr_t)patchheaderfilehandle) : -1;
#else
    (void)patchfilehandle;
    (void)patchheaderfilehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1extractPatchHeaderToFileW(JNIEnv* km_env, jclass km_clazz, jlong patchfilename, jlong patchheaderfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatchc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractPatchHeaderToFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilename, (void*)(uintptr_t)patchheaderfilename) : -1;
#else
    (void)patchfilename;
    (void)patchheaderfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1findActCtxSectionGuid(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpextensionguid, jint ulsectionid, jlong lpguidtofind, jlong returneddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindActCtxSectionGuid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpextensionguid, (uint32_t)ulsectionid, (void*)(uintptr_t)lpguidtofind, (void*)(uintptr_t)returneddata) : -1;
#else
    (void)dwflags;
    (void)lpextensionguid;
    (void)ulsectionid;
    (void)lpguidtofind;
    (void)returneddata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1findActCtxSectionStringA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpextensionguid, jint ulsectionid, jlong lpstringtofind, jlong returneddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindActCtxSectionStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpextensionguid, (uint32_t)ulsectionid, (void*)(uintptr_t)lpstringtofind, (void*)(uintptr_t)returneddata) : -1;
#else
    (void)dwflags;
    (void)lpextensionguid;
    (void)ulsectionid;
    (void)lpstringtofind;
    (void)returneddata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1findActCtxSectionStringW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpextensionguid, jint ulsectionid, jlong lpstringtofind, jlong returneddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindActCtxSectionStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpextensionguid, (uint32_t)ulsectionid, (void*)(uintptr_t)lpstringtofind, (void*)(uintptr_t)returneddata) : -1;
#else
    (void)dwflags;
    (void)lpextensionguid;
    (void)ulsectionid;
    (void)lpstringtofind;
    (void)returneddata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1getCurrentActCtx(JNIEnv* km_env, jclass km_clazz, jlong lphactctx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentActCtx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphactctx) : -1;
#else
    (void)lphactctx;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1getDeltaInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpdeltaname, jlong lpheaderinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeltaInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdeltaname, (void*)(uintptr_t)lpheaderinfo) : -1;
#else
    (void)lpdeltaname;
    (void)lpheaderinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1getDeltaInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpdeltaname, jlong lpheaderinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeltaInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdeltaname, (void*)(uintptr_t)lpheaderinfo) : -1;
#else
    (void)lpdeltaname;
    (void)lpheaderinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1getDeltaSignatureA(JNIEnv* km_env, jclass km_clazz, jlong filetypeset, jint hashalgid, jlong lpsourcename, jlong lphash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeltaSignatureA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filetypeset, (uint32_t)hashalgid, (void*)(uintptr_t)lpsourcename, (void*)(uintptr_t)lphash) : -1;
#else
    (void)filetypeset;
    (void)hashalgid;
    (void)lpsourcename;
    (void)lphash;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1getDeltaSignatureW(JNIEnv* km_env, jclass km_clazz, jlong filetypeset, jint hashalgid, jlong lpsourcename, jlong lphash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdelta.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeltaSignatureW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)filetypeset, (uint32_t)hashalgid, (void*)(uintptr_t)lpsourcename, (void*)(uintptr_t)lphash) : -1;
#else
    (void)filetypeset;
    (void)hashalgid;
    (void)lpsourcename;
    (void)lphash;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1getFilePatchSignatureA(JNIEnv* km_env, jclass km_clazz, jlong filename, jint optionflags, jlong optiondata, jint ignorerangecount, jlong ignorerangearray, jint retainrangecount, jlong retainrangearray, jint signaturebuffersize, jlong signaturebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFilePatchSignatureA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (uint32_t)optionflags, (void*)(uintptr_t)optiondata, (uint32_t)ignorerangecount, (void*)(uintptr_t)ignorerangearray, (uint32_t)retainrangecount, (void*)(uintptr_t)retainrangearray, (uint32_t)signaturebuffersize, (void*)(uintptr_t)signaturebuffer) : -1;
#else
    (void)filename;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1getFilePatchSignatureByBuffer(JNIEnv* km_env, jclass km_clazz, jlong filebufferwritable, jint filesize, jint optionflags, jlong optiondata, jint ignorerangecount, jlong ignorerangearray, jint retainrangecount, jlong retainrangearray, jint signaturebuffersize, jlong signaturebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFilePatchSignatureByBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filebufferwritable, (uint32_t)filesize, (uint32_t)optionflags, (void*)(uintptr_t)optiondata, (uint32_t)ignorerangecount, (void*)(uintptr_t)ignorerangearray, (uint32_t)retainrangecount, (void*)(uintptr_t)retainrangearray, (uint32_t)signaturebuffersize, (void*)(uintptr_t)signaturebuffer) : -1;
#else
    (void)filebufferwritable;
    (void)filesize;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1getFilePatchSignatureByHandle(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint optionflags, jlong optiondata, jint ignorerangecount, jlong ignorerangearray, jint retainrangecount, jlong retainrangearray, jint signaturebuffersize, jlong signaturebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFilePatchSignatureByHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)optionflags, (void*)(uintptr_t)optiondata, (uint32_t)ignorerangecount, (void*)(uintptr_t)ignorerangearray, (uint32_t)retainrangecount, (void*)(uintptr_t)retainrangearray, (uint32_t)signaturebuffersize, (void*)(uintptr_t)signaturebuffer) : -1;
#else
    (void)filehandle;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1getFilePatchSignatureW(JNIEnv* km_env, jclass km_clazz, jlong filename, jint optionflags, jlong optiondata, jint ignorerangecount, jlong ignorerangearray, jint retainrangecount, jlong retainrangearray, jint signaturebuffersize, jlong signaturebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFilePatchSignatureW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (uint32_t)optionflags, (void*)(uintptr_t)optiondata, (uint32_t)ignorerangecount, (void*)(uintptr_t)ignorerangearray, (uint32_t)retainrangecount, (void*)(uintptr_t)retainrangearray, (uint32_t)signaturebuffersize, (void*)(uintptr_t)signaturebuffer) : -1;
#else
    (void)filename;
    (void)optionflags;
    (void)optiondata;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    (void)signaturebuffersize;
    (void)signaturebuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiAdvertiseProductA(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath, jlong szscriptfilepath, jlong sztransforms, jshort lgidlanguage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseProductA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath, (void*)(uintptr_t)szscriptfilepath, (void*)(uintptr_t)sztransforms, (uint16_t)lgidlanguage) : 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiAdvertiseProductExA(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath, jlong szscriptfilepath, jlong sztransforms, jshort lgidlanguage, jint dwplatform, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseProductExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath, (void*)(uintptr_t)szscriptfilepath, (void*)(uintptr_t)sztransforms, (uint16_t)lgidlanguage, (uint32_t)dwplatform, (uint32_t)dwoptions) : 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    (void)dwplatform;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiAdvertiseProductExW(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath, jlong szscriptfilepath, jlong sztransforms, jshort lgidlanguage, jint dwplatform, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseProductExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath, (void*)(uintptr_t)szscriptfilepath, (void*)(uintptr_t)sztransforms, (uint16_t)lgidlanguage, (uint32_t)dwplatform, (uint32_t)dwoptions) : 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    (void)dwplatform;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiAdvertiseProductW(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath, jlong szscriptfilepath, jlong sztransforms, jshort lgidlanguage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseProductW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath, (void*)(uintptr_t)szscriptfilepath, (void*)(uintptr_t)sztransforms, (uint16_t)lgidlanguage) : 0;
#else
    (void)szpackagepath;
    (void)szscriptfilepath;
    (void)sztransforms;
    (void)lgidlanguage;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiAdvertiseScriptA(JNIEnv* km_env, jclass km_clazz, jlong szscriptfile, jint dwflags, jlong phregdata, jint fremoveitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseScriptA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szscriptfile, (uint32_t)dwflags, (void*)(uintptr_t)phregdata, (int32_t)fremoveitems) : 0;
#else
    (void)szscriptfile;
    (void)dwflags;
    (void)phregdata;
    (void)fremoveitems;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiAdvertiseScriptW(JNIEnv* km_env, jclass km_clazz, jlong szscriptfile, jint dwflags, jlong phregdata, jint fremoveitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiAdvertiseScriptW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szscriptfile, (uint32_t)dwflags, (void*)(uintptr_t)phregdata, (int32_t)fremoveitems) : 0;
#else
    (void)szscriptfile;
    (void)dwflags;
    (void)phregdata;
    (void)fremoveitems;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiApplyMultiplePatchesA(JNIEnv* km_env, jclass km_clazz, jlong szpatchpackages, jlong szproductcode, jlong szpropertieslist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiApplyMultiplePatchesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatchpackages, (void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szpropertieslist) : 0;
#else
    (void)szpatchpackages;
    (void)szproductcode;
    (void)szpropertieslist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiApplyMultiplePatchesW(JNIEnv* km_env, jclass km_clazz, jlong szpatchpackages, jlong szproductcode, jlong szpropertieslist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiApplyMultiplePatchesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatchpackages, (void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szpropertieslist) : 0;
#else
    (void)szpatchpackages;
    (void)szproductcode;
    (void)szpropertieslist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiApplyPatchA(JNIEnv* km_env, jclass km_clazz, jlong szpatchpackage, jlong szinstallpackage, jint einstalltype, jlong szcommandline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiApplyPatchA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatchpackage, (void*)(uintptr_t)szinstallpackage, (int32_t)einstalltype, (void*)(uintptr_t)szcommandline) : 0;
#else
    (void)szpatchpackage;
    (void)szinstallpackage;
    (void)einstalltype;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiApplyPatchW(JNIEnv* km_env, jclass km_clazz, jlong szpatchpackage, jlong szinstallpackage, jint einstalltype, jlong szcommandline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiApplyPatchW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatchpackage, (void*)(uintptr_t)szinstallpackage, (int32_t)einstalltype, (void*)(uintptr_t)szcommandline) : 0;
#else
    (void)szpatchpackage;
    (void)szinstallpackage;
    (void)einstalltype;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiBeginTransactionA(JNIEnv* km_env, jclass km_clazz, jlong szname, jint dwtransactionattributes, jlong phtransactionhandle, jlong phchangeofownerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiBeginTransactionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szname, (uint32_t)dwtransactionattributes, (void*)(uintptr_t)phtransactionhandle, (void*)(uintptr_t)phchangeofownerevent) : 0;
#else
    (void)szname;
    (void)dwtransactionattributes;
    (void)phtransactionhandle;
    (void)phchangeofownerevent;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiBeginTransactionW(JNIEnv* km_env, jclass km_clazz, jlong szname, jint dwtransactionattributes, jlong phtransactionhandle, jlong phchangeofownerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiBeginTransactionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szname, (uint32_t)dwtransactionattributes, (void*)(uintptr_t)phtransactionhandle, (void*)(uintptr_t)phchangeofownerevent) : 0;
#else
    (void)szname;
    (void)dwtransactionattributes;
    (void)phtransactionhandle;
    (void)phchangeofownerevent;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiCloseAllHandles(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCloseAllHandles");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiCloseHandle(JNIEnv* km_env, jclass km_clazz, jint hany) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCloseHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hany) : 0;
#else
    (void)hany;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiCollectUserInfoA(JNIEnv* km_env, jclass km_clazz, jlong szproduct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCollectUserInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct) : 0;
#else
    (void)szproduct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiCollectUserInfoW(JNIEnv* km_env, jclass km_clazz, jlong szproduct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCollectUserInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct) : 0;
#else
    (void)szproduct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiConfigureFeatureA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature, jint einstallstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureFeatureA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature, (int32_t)einstallstate) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiConfigureFeatureW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature, jint einstallstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureFeatureW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature, (int32_t)einstallstate) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiConfigureProductA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jint iinstalllevel, jint einstallstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureProductA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (int32_t)iinstalllevel, (int32_t)einstallstate) : 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiConfigureProductExA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jint iinstalllevel, jint einstallstate, jlong szcommandline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureProductExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (int32_t)iinstalllevel, (int32_t)einstallstate, (void*)(uintptr_t)szcommandline) : 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiConfigureProductExW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jint iinstalllevel, jint einstallstate, jlong szcommandline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureProductExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (int32_t)iinstalllevel, (int32_t)einstallstate, (void*)(uintptr_t)szcommandline) : 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiConfigureProductW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jint iinstalllevel, jint einstallstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiConfigureProductW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (int32_t)iinstalllevel, (int32_t)einstallstate) : 0;
#else
    (void)szproduct;
    (void)iinstalllevel;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiCreateRecord(JNIEnv* km_env, jclass km_clazz, jint cparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCreateRecord");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cparams) : 0;
#else
    (void)cparams;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiCreateTransformSummaryInfoA(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jint hdatabasereference, jlong sztransformfile, jint ierrorconditions, jint ivalidation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCreateTransformSummaryInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (uint32_t)hdatabasereference, (void*)(uintptr_t)sztransformfile, (int32_t)ierrorconditions, (int32_t)ivalidation) : 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ierrorconditions;
    (void)ivalidation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiCreateTransformSummaryInfoW(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jint hdatabasereference, jlong sztransformfile, jint ierrorconditions, jint ivalidation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiCreateTransformSummaryInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (uint32_t)hdatabasereference, (void*)(uintptr_t)sztransformfile, (int32_t)ierrorconditions, (int32_t)ivalidation) : 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ierrorconditions;
    (void)ivalidation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseApplyTransformA(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong sztransformfile, jint ierrorconditions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseApplyTransformA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)sztransformfile, (int32_t)ierrorconditions) : 0;
#else
    (void)hdatabase;
    (void)sztransformfile;
    (void)ierrorconditions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseApplyTransformW(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong sztransformfile, jint ierrorconditions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseApplyTransformW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)sztransformfile, (int32_t)ierrorconditions) : 0;
#else
    (void)hdatabase;
    (void)sztransformfile;
    (void)ierrorconditions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseCommit(JNIEnv* km_env, jclass km_clazz, jint hdatabase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseCommit");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase) : 0;
#else
    (void)hdatabase;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseExportA(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong sztablename, jlong szfolderpath, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseExportA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)szfolderpath, (void*)(uintptr_t)szfilename) : 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)szfolderpath;
    (void)szfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseExportW(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong sztablename, jlong szfolderpath, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseExportW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)szfolderpath, (void*)(uintptr_t)szfilename) : 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)szfolderpath;
    (void)szfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseGenerateTransformA(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jint hdatabasereference, jlong sztransformfile, jint ireserved1, jint ireserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseGenerateTransformA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (uint32_t)hdatabasereference, (void*)(uintptr_t)sztransformfile, (int32_t)ireserved1, (int32_t)ireserved2) : 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ireserved1;
    (void)ireserved2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseGenerateTransformW(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jint hdatabasereference, jlong sztransformfile, jint ireserved1, jint ireserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseGenerateTransformW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (uint32_t)hdatabasereference, (void*)(uintptr_t)sztransformfile, (int32_t)ireserved1, (int32_t)ireserved2) : 0;
#else
    (void)hdatabase;
    (void)hdatabasereference;
    (void)sztransformfile;
    (void)ireserved1;
    (void)ireserved2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseGetPrimaryKeysA(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong sztablename, jlong phrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseGetPrimaryKeysA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)phrecord) : 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)phrecord;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseGetPrimaryKeysW(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong sztablename, jlong phrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseGetPrimaryKeysW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)phrecord) : 0;
#else
    (void)hdatabase;
    (void)sztablename;
    (void)phrecord;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseImportA(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong szfolderpath, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseImportA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)szfolderpath, (void*)(uintptr_t)szfilename) : 0;
#else
    (void)hdatabase;
    (void)szfolderpath;
    (void)szfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseImportW(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong szfolderpath, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseImportW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)szfolderpath, (void*)(uintptr_t)szfilename) : 0;
#else
    (void)hdatabase;
    (void)szfolderpath;
    (void)szfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseIsTablePersistentA(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong sztablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseIsTablePersistentA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)sztablename) : -1;
#else
    (void)hdatabase;
    (void)sztablename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseIsTablePersistentW(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong sztablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseIsTablePersistentW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)sztablename) : -1;
#else
    (void)hdatabase;
    (void)sztablename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseMergeA(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jint hdatabasemerge, jlong sztablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseMergeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (uint32_t)hdatabasemerge, (void*)(uintptr_t)sztablename) : 0;
#else
    (void)hdatabase;
    (void)hdatabasemerge;
    (void)sztablename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseMergeW(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jint hdatabasemerge, jlong sztablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseMergeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (uint32_t)hdatabasemerge, (void*)(uintptr_t)sztablename) : 0;
#else
    (void)hdatabase;
    (void)hdatabasemerge;
    (void)sztablename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseOpenViewA(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong szquery, jlong phview) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseOpenViewA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)szquery, (void*)(uintptr_t)phview) : 0;
#else
    (void)hdatabase;
    (void)szquery;
    (void)phview;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDatabaseOpenViewW(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong szquery, jlong phview) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDatabaseOpenViewW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)szquery, (void*)(uintptr_t)phview) : 0;
#else
    (void)hdatabase;
    (void)szquery;
    (void)phview;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDetermineApplicablePatchesA(JNIEnv* km_env, jclass km_clazz, jlong szproductpackagepath, jint cpatchinfo, jlong ppatchinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDetermineApplicablePatchesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductpackagepath, (uint32_t)cpatchinfo, (void*)(uintptr_t)ppatchinfo) : 0;
#else
    (void)szproductpackagepath;
    (void)cpatchinfo;
    (void)ppatchinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDetermineApplicablePatchesW(JNIEnv* km_env, jclass km_clazz, jlong szproductpackagepath, jint cpatchinfo, jlong ppatchinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDetermineApplicablePatchesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductpackagepath, (uint32_t)cpatchinfo, (void*)(uintptr_t)ppatchinfo) : 0;
#else
    (void)szproductpackagepath;
    (void)cpatchinfo;
    (void)ppatchinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDeterminePatchSequenceA(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jint cpatchinfo, jlong ppatchinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDeterminePatchSequenceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)cpatchinfo, (void*)(uintptr_t)ppatchinfo) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)cpatchinfo;
    (void)ppatchinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDeterminePatchSequenceW(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jint cpatchinfo, jlong ppatchinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDeterminePatchSequenceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)cpatchinfo, (void*)(uintptr_t)ppatchinfo) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)cpatchinfo;
    (void)ppatchinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDoActionA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDoActionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szaction) : 0;
#else
    (void)hinstall;
    (void)szaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiDoActionW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiDoActionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szaction) : 0;
#else
    (void)hinstall;
    (void)szaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnableLogA(JNIEnv* km_env, jclass km_clazz, jint dwlogmode, jlong szlogfile, jint dwlogattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnableLogA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwlogmode, (void*)(uintptr_t)szlogfile, (uint32_t)dwlogattributes) : 0;
#else
    (void)dwlogmode;
    (void)szlogfile;
    (void)dwlogattributes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnableLogW(JNIEnv* km_env, jclass km_clazz, jint dwlogmode, jlong szlogfile, jint dwlogattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnableLogW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwlogmode, (void*)(uintptr_t)szlogfile, (uint32_t)dwlogattributes) : 0;
#else
    (void)dwlogmode;
    (void)szlogfile;
    (void)dwlogattributes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnableUIPreview(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong phpreview) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnableUIPreview");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)phpreview) : 0;
#else
    (void)hdatabase;
    (void)phpreview;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEndTransaction(JNIEnv* km_env, jclass km_clazz, jint dwtransactionstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEndTransaction");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtransactionstate) : 0;
#else
    (void)dwtransactionstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumClientsA(JNIEnv* km_env, jclass km_clazz, jlong szcomponent, jint iproductindex, jlong lpproductbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumClientsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomponent, (uint32_t)iproductindex, (void*)(uintptr_t)lpproductbuf) : 0;
#else
    (void)szcomponent;
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumClientsExA(JNIEnv* km_env, jclass km_clazz, jlong szcomponent, jlong szusersid, jint dwcontext, jint dwproductindex, jlong szproductbuf, jlong pdwinstalledcontext, jlong szsid, jlong pcchsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumClientsExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomponent, (void*)(uintptr_t)szusersid, (uint32_t)dwcontext, (uint32_t)dwproductindex, (void*)(uintptr_t)szproductbuf, (void*)(uintptr_t)pdwinstalledcontext, (void*)(uintptr_t)szsid, (void*)(uintptr_t)pcchsid) : 0;
#else
    (void)szcomponent;
    (void)szusersid;
    (void)dwcontext;
    (void)dwproductindex;
    (void)szproductbuf;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumClientsExW(JNIEnv* km_env, jclass km_clazz, jlong szcomponent, jlong szusersid, jint dwcontext, jint dwproductindex, jlong szproductbuf, jlong pdwinstalledcontext, jlong szsid, jlong pcchsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumClientsExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomponent, (void*)(uintptr_t)szusersid, (uint32_t)dwcontext, (uint32_t)dwproductindex, (void*)(uintptr_t)szproductbuf, (void*)(uintptr_t)pdwinstalledcontext, (void*)(uintptr_t)szsid, (void*)(uintptr_t)pcchsid) : 0;
#else
    (void)szcomponent;
    (void)szusersid;
    (void)dwcontext;
    (void)dwproductindex;
    (void)szproductbuf;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumClientsW(JNIEnv* km_env, jclass km_clazz, jlong szcomponent, jint iproductindex, jlong lpproductbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumClientsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomponent, (uint32_t)iproductindex, (void*)(uintptr_t)lpproductbuf) : 0;
#else
    (void)szcomponent;
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumComponentCostsA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szcomponent, jint dwindex, jint istate, jlong szdrivebuf, jlong pcchdrivebuf, jlong picost, jlong pitempcost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentCostsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szcomponent, (uint32_t)dwindex, (int32_t)istate, (void*)(uintptr_t)szdrivebuf, (void*)(uintptr_t)pcchdrivebuf, (void*)(uintptr_t)picost, (void*)(uintptr_t)pitempcost) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)dwindex;
    (void)istate;
    (void)szdrivebuf;
    (void)pcchdrivebuf;
    (void)picost;
    (void)pitempcost;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumComponentCostsW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szcomponent, jint dwindex, jint istate, jlong szdrivebuf, jlong pcchdrivebuf, jlong picost, jlong pitempcost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentCostsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szcomponent, (uint32_t)dwindex, (int32_t)istate, (void*)(uintptr_t)szdrivebuf, (void*)(uintptr_t)pcchdrivebuf, (void*)(uintptr_t)picost, (void*)(uintptr_t)pitempcost) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)dwindex;
    (void)istate;
    (void)szdrivebuf;
    (void)pcchdrivebuf;
    (void)picost;
    (void)pitempcost;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumComponentQualifiersA(JNIEnv* km_env, jclass km_clazz, jlong szcomponent, jint iindex, jlong lpqualifierbuf, jlong pcchqualifierbuf, jlong lpapplicationdatabuf, jlong pcchapplicationdatabuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentQualifiersA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomponent, (uint32_t)iindex, (void*)(uintptr_t)lpqualifierbuf, (void*)(uintptr_t)pcchqualifierbuf, (void*)(uintptr_t)lpapplicationdatabuf, (void*)(uintptr_t)pcchapplicationdatabuf) : 0;
#else
    (void)szcomponent;
    (void)iindex;
    (void)lpqualifierbuf;
    (void)pcchqualifierbuf;
    (void)lpapplicationdatabuf;
    (void)pcchapplicationdatabuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumComponentQualifiersW(JNIEnv* km_env, jclass km_clazz, jlong szcomponent, jint iindex, jlong lpqualifierbuf, jlong pcchqualifierbuf, jlong lpapplicationdatabuf, jlong pcchapplicationdatabuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentQualifiersW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomponent, (uint32_t)iindex, (void*)(uintptr_t)lpqualifierbuf, (void*)(uintptr_t)pcchqualifierbuf, (void*)(uintptr_t)lpapplicationdatabuf, (void*)(uintptr_t)pcchapplicationdatabuf) : 0;
#else
    (void)szcomponent;
    (void)iindex;
    (void)lpqualifierbuf;
    (void)pcchqualifierbuf;
    (void)lpapplicationdatabuf;
    (void)pcchapplicationdatabuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumComponentsA(JNIEnv* km_env, jclass km_clazz, jint icomponentindex, jlong lpcomponentbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)icomponentindex, (void*)(uintptr_t)lpcomponentbuf) : 0;
#else
    (void)icomponentindex;
    (void)lpcomponentbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumComponentsExA(JNIEnv* km_env, jclass km_clazz, jlong szusersid, jint dwcontext, jint dwindex, jlong szinstalledcomponentcode, jlong pdwinstalledcontext, jlong szsid, jlong pcchsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentsExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szusersid, (uint32_t)dwcontext, (uint32_t)dwindex, (void*)(uintptr_t)szinstalledcomponentcode, (void*)(uintptr_t)pdwinstalledcontext, (void*)(uintptr_t)szsid, (void*)(uintptr_t)pcchsid) : 0;
#else
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledcomponentcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumComponentsExW(JNIEnv* km_env, jclass km_clazz, jlong szusersid, jint dwcontext, jint dwindex, jlong szinstalledcomponentcode, jlong pdwinstalledcontext, jlong szsid, jlong pcchsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentsExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szusersid, (uint32_t)dwcontext, (uint32_t)dwindex, (void*)(uintptr_t)szinstalledcomponentcode, (void*)(uintptr_t)pdwinstalledcontext, (void*)(uintptr_t)szsid, (void*)(uintptr_t)pcchsid) : 0;
#else
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledcomponentcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumComponentsW(JNIEnv* km_env, jclass km_clazz, jint icomponentindex, jlong lpcomponentbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumComponentsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)icomponentindex, (void*)(uintptr_t)lpcomponentbuf) : 0;
#else
    (void)icomponentindex;
    (void)lpcomponentbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumFeaturesA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jint ifeatureindex, jlong lpfeaturebuf, jlong lpparentbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumFeaturesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (uint32_t)ifeatureindex, (void*)(uintptr_t)lpfeaturebuf, (void*)(uintptr_t)lpparentbuf) : 0;
#else
    (void)szproduct;
    (void)ifeatureindex;
    (void)lpfeaturebuf;
    (void)lpparentbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumFeaturesW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jint ifeatureindex, jlong lpfeaturebuf, jlong lpparentbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumFeaturesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (uint32_t)ifeatureindex, (void*)(uintptr_t)lpfeaturebuf, (void*)(uintptr_t)lpparentbuf) : 0;
#else
    (void)szproduct;
    (void)ifeatureindex;
    (void)lpfeaturebuf;
    (void)lpparentbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumPatchesA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jint ipatchindex, jlong lppatchbuf, jlong lptransformsbuf, jlong pcchtransformsbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumPatchesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (uint32_t)ipatchindex, (void*)(uintptr_t)lppatchbuf, (void*)(uintptr_t)lptransformsbuf, (void*)(uintptr_t)pcchtransformsbuf) : 0;
#else
    (void)szproduct;
    (void)ipatchindex;
    (void)lppatchbuf;
    (void)lptransformsbuf;
    (void)pcchtransformsbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumPatchesExA(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jint dwfilter, jint dwindex, jlong szpatchcode, jlong sztargetproductcode, jlong pdwtargetproductcontext, jlong sztargetusersid, jlong pcchtargetusersid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumPatchesExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (uint32_t)dwcontext, (uint32_t)dwfilter, (uint32_t)dwindex, (void*)(uintptr_t)szpatchcode, (void*)(uintptr_t)sztargetproductcode, (void*)(uintptr_t)pdwtargetproductcontext, (void*)(uintptr_t)sztargetusersid, (void*)(uintptr_t)pcchtargetusersid) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwfilter;
    (void)dwindex;
    (void)szpatchcode;
    (void)sztargetproductcode;
    (void)pdwtargetproductcontext;
    (void)sztargetusersid;
    (void)pcchtargetusersid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumPatchesExW(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jint dwfilter, jint dwindex, jlong szpatchcode, jlong sztargetproductcode, jlong pdwtargetproductcontext, jlong sztargetusersid, jlong pcchtargetusersid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumPatchesExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (uint32_t)dwcontext, (uint32_t)dwfilter, (uint32_t)dwindex, (void*)(uintptr_t)szpatchcode, (void*)(uintptr_t)sztargetproductcode, (void*)(uintptr_t)pdwtargetproductcontext, (void*)(uintptr_t)sztargetusersid, (void*)(uintptr_t)pcchtargetusersid) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwfilter;
    (void)dwindex;
    (void)szpatchcode;
    (void)sztargetproductcode;
    (void)pdwtargetproductcontext;
    (void)sztargetusersid;
    (void)pcchtargetusersid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumPatchesW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jint ipatchindex, jlong lppatchbuf, jlong lptransformsbuf, jlong pcchtransformsbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumPatchesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (uint32_t)ipatchindex, (void*)(uintptr_t)lppatchbuf, (void*)(uintptr_t)lptransformsbuf, (void*)(uintptr_t)pcchtransformsbuf) : 0;
#else
    (void)szproduct;
    (void)ipatchindex;
    (void)lppatchbuf;
    (void)lptransformsbuf;
    (void)pcchtransformsbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumProductsA(JNIEnv* km_env, jclass km_clazz, jint iproductindex, jlong lpproductbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumProductsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)iproductindex, (void*)(uintptr_t)lpproductbuf) : 0;
#else
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumProductsExA(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jint dwindex, jlong szinstalledproductcode, jlong pdwinstalledcontext, jlong szsid, jlong pcchsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumProductsExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (uint32_t)dwcontext, (uint32_t)dwindex, (void*)(uintptr_t)szinstalledproductcode, (void*)(uintptr_t)pdwinstalledcontext, (void*)(uintptr_t)szsid, (void*)(uintptr_t)pcchsid) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledproductcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumProductsExW(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jint dwindex, jlong szinstalledproductcode, jlong pdwinstalledcontext, jlong szsid, jlong pcchsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumProductsExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (uint32_t)dwcontext, (uint32_t)dwindex, (void*)(uintptr_t)szinstalledproductcode, (void*)(uintptr_t)pdwinstalledcontext, (void*)(uintptr_t)szsid, (void*)(uintptr_t)pcchsid) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwindex;
    (void)szinstalledproductcode;
    (void)pdwinstalledcontext;
    (void)szsid;
    (void)pcchsid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumProductsW(JNIEnv* km_env, jclass km_clazz, jint iproductindex, jlong lpproductbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumProductsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)iproductindex, (void*)(uintptr_t)lpproductbuf) : 0;
#else
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumRelatedProductsA(JNIEnv* km_env, jclass km_clazz, jlong lpupgradecode, jint dwreserved, jint iproductindex, jlong lpproductbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumRelatedProductsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpupgradecode, (uint32_t)dwreserved, (uint32_t)iproductindex, (void*)(uintptr_t)lpproductbuf) : 0;
#else
    (void)lpupgradecode;
    (void)dwreserved;
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEnumRelatedProductsW(JNIEnv* km_env, jclass km_clazz, jlong lpupgradecode, jint dwreserved, jint iproductindex, jlong lpproductbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEnumRelatedProductsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpupgradecode, (uint32_t)dwreserved, (uint32_t)iproductindex, (void*)(uintptr_t)lpproductbuf) : 0;
#else
    (void)lpupgradecode;
    (void)dwreserved;
    (void)iproductindex;
    (void)lpproductbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEvaluateConditionA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szcondition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEvaluateConditionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szcondition) : -1;
#else
    (void)hinstall;
    (void)szcondition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiEvaluateConditionW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szcondition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiEvaluateConditionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szcondition) : -1;
#else
    (void)hinstall;
    (void)szcondition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiExtractPatchXMLDataA(JNIEnv* km_env, jclass km_clazz, jlong szpatchpath, jint dwreserved, jlong szxmldata, jlong pcchxmldata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiExtractPatchXMLDataA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatchpath, (uint32_t)dwreserved, (void*)(uintptr_t)szxmldata, (void*)(uintptr_t)pcchxmldata) : 0;
#else
    (void)szpatchpath;
    (void)dwreserved;
    (void)szxmldata;
    (void)pcchxmldata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiExtractPatchXMLDataW(JNIEnv* km_env, jclass km_clazz, jlong szpatchpath, jint dwreserved, jlong szxmldata, jlong pcchxmldata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiExtractPatchXMLDataW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatchpath, (uint32_t)dwreserved, (void*)(uintptr_t)szxmldata, (void*)(uintptr_t)pcchxmldata) : 0;
#else
    (void)szpatchpath;
    (void)dwreserved;
    (void)szxmldata;
    (void)pcchxmldata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiFormatRecordA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jint hrecord, jlong szresultbuf, jlong pcchresultbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiFormatRecordA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (uint32_t)hrecord, (void*)(uintptr_t)szresultbuf, (void*)(uintptr_t)pcchresultbuf) : 0;
#else
    (void)hinstall;
    (void)hrecord;
    (void)szresultbuf;
    (void)pcchresultbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiFormatRecordW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jint hrecord, jlong szresultbuf, jlong pcchresultbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiFormatRecordW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (uint32_t)hrecord, (void*)(uintptr_t)szresultbuf, (void*)(uintptr_t)pcchresultbuf) : 0;
#else
    (void)hinstall;
    (void)hrecord;
    (void)szresultbuf;
    (void)pcchresultbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetActiveDatabase(JNIEnv* km_env, jclass km_clazz, jint hinstall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetActiveDatabase");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall) : 0;
#else
    (void)hinstall;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetComponentPathA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szcomponent, jlong lppathbuf, jlong pcchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentPathA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szcomponent, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchbuf) : -1;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetComponentPathExA(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szcomponentcode, jlong szusersid, jint dwcontext, jlong lpoutpathbuffer, jlong pcchoutpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentPathExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szcomponentcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (void*)(uintptr_t)lpoutpathbuffer, (void*)(uintptr_t)pcchoutpathbuffer) : -1;
#else
    (void)szproductcode;
    (void)szcomponentcode;
    (void)szusersid;
    (void)dwcontext;
    (void)lpoutpathbuffer;
    (void)pcchoutpathbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetComponentPathExW(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szcomponentcode, jlong szusersid, jint dwcontext, jlong lpoutpathbuffer, jlong pcchoutpathbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentPathExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szcomponentcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (void*)(uintptr_t)lpoutpathbuffer, (void*)(uintptr_t)pcchoutpathbuffer) : -1;
#else
    (void)szproductcode;
    (void)szcomponentcode;
    (void)szusersid;
    (void)dwcontext;
    (void)lpoutpathbuffer;
    (void)pcchoutpathbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetComponentPathW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szcomponent, jlong lppathbuf, jlong pcchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szcomponent, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchbuf) : -1;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetComponentStateA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szcomponent, jlong piinstalled, jlong piaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentStateA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szcomponent, (void*)(uintptr_t)piinstalled, (void*)(uintptr_t)piaction) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)piinstalled;
    (void)piaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetComponentStateW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szcomponent, jlong piinstalled, jlong piaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetComponentStateW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szcomponent, (void*)(uintptr_t)piinstalled, (void*)(uintptr_t)piaction) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)piinstalled;
    (void)piaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetDatabaseState(JNIEnv* km_env, jclass km_clazz, jint hdatabase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetDatabaseState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase) : -1;
#else
    (void)hdatabase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFeatureCostA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfeature, jint icosttree, jint istate, jlong picost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureCostA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfeature, (int32_t)icosttree, (int32_t)istate, (void*)(uintptr_t)picost) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)icosttree;
    (void)istate;
    (void)picost;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFeatureCostW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfeature, jint icosttree, jint istate, jlong picost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureCostW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfeature, (int32_t)icosttree, (int32_t)istate, (void*)(uintptr_t)picost) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)icosttree;
    (void)istate;
    (void)picost;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFeatureInfoA(JNIEnv* km_env, jclass km_clazz, jint hproduct, jlong szfeature, jlong lpattributes, jlong lptitlebuf, jlong pcchtitlebuf, jlong lphelpbuf, jlong pcchhelpbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hproduct, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)lpattributes, (void*)(uintptr_t)lptitlebuf, (void*)(uintptr_t)pcchtitlebuf, (void*)(uintptr_t)lphelpbuf, (void*)(uintptr_t)pcchhelpbuf) : 0;
#else
    (void)hproduct;
    (void)szfeature;
    (void)lpattributes;
    (void)lptitlebuf;
    (void)pcchtitlebuf;
    (void)lphelpbuf;
    (void)pcchhelpbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFeatureInfoW(JNIEnv* km_env, jclass km_clazz, jint hproduct, jlong szfeature, jlong lpattributes, jlong lptitlebuf, jlong pcchtitlebuf, jlong lphelpbuf, jlong pcchhelpbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hproduct, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)lpattributes, (void*)(uintptr_t)lptitlebuf, (void*)(uintptr_t)pcchtitlebuf, (void*)(uintptr_t)lphelpbuf, (void*)(uintptr_t)pcchhelpbuf) : 0;
#else
    (void)hproduct;
    (void)szfeature;
    (void)lpattributes;
    (void)lptitlebuf;
    (void)pcchtitlebuf;
    (void)lphelpbuf;
    (void)pcchhelpbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFeatureStateA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfeature, jlong piinstalled, jlong piaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureStateA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)piinstalled, (void*)(uintptr_t)piaction) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)piinstalled;
    (void)piaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFeatureStateW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfeature, jlong piinstalled, jlong piaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureStateW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)piinstalled, (void*)(uintptr_t)piaction) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)piinstalled;
    (void)piaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFeatureUsageA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature, jlong pdwusecount, jlong pwdateused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureUsageA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)pdwusecount, (void*)(uintptr_t)pwdateused) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)pdwusecount;
    (void)pwdateused;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFeatureUsageW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature, jlong pdwusecount, jlong pwdateused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureUsageW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)pdwusecount, (void*)(uintptr_t)pwdateused) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)pdwusecount;
    (void)pwdateused;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFeatureValidStatesA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfeature, jlong lpinstallstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureValidStatesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)lpinstallstates) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)lpinstallstates;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFeatureValidStatesW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfeature, jlong lpinstallstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFeatureValidStatesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)lpinstallstates) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)lpinstallstates;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFileHashA(JNIEnv* km_env, jclass km_clazz, jlong szfilepath, jint dwoptions, jlong phash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileHashA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilepath, (uint32_t)dwoptions, (void*)(uintptr_t)phash) : 0;
#else
    (void)szfilepath;
    (void)dwoptions;
    (void)phash;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFileHashW(JNIEnv* km_env, jclass km_clazz, jlong szfilepath, jint dwoptions, jlong phash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileHashW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilepath, (uint32_t)dwoptions, (void*)(uintptr_t)phash) : 0;
#else
    (void)szfilepath;
    (void)dwoptions;
    (void)phash;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFileSignatureInformationA(JNIEnv* km_env, jclass km_clazz, jlong szsignedobjectpath, jint dwflags, jlong ppccertcontext, jlong pbhashdata, jlong pcbhashdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileSignatureInformationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szsignedobjectpath, (uint32_t)dwflags, (void*)(uintptr_t)ppccertcontext, (void*)(uintptr_t)pbhashdata, (void*)(uintptr_t)pcbhashdata) : -1;
#else
    (void)szsignedobjectpath;
    (void)dwflags;
    (void)ppccertcontext;
    (void)pbhashdata;
    (void)pcbhashdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFileSignatureInformationW(JNIEnv* km_env, jclass km_clazz, jlong szsignedobjectpath, jint dwflags, jlong ppccertcontext, jlong pbhashdata, jlong pcbhashdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileSignatureInformationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szsignedobjectpath, (uint32_t)dwflags, (void*)(uintptr_t)ppccertcontext, (void*)(uintptr_t)pbhashdata, (void*)(uintptr_t)pcbhashdata) : -1;
#else
    (void)szsignedobjectpath;
    (void)dwflags;
    (void)ppccertcontext;
    (void)pbhashdata;
    (void)pcbhashdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFileVersionA(JNIEnv* km_env, jclass km_clazz, jlong szfilepath, jlong lpversionbuf, jlong pcchversionbuf, jlong lplangbuf, jlong pcchlangbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileVersionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilepath, (void*)(uintptr_t)lpversionbuf, (void*)(uintptr_t)pcchversionbuf, (void*)(uintptr_t)lplangbuf, (void*)(uintptr_t)pcchlangbuf) : 0;
#else
    (void)szfilepath;
    (void)lpversionbuf;
    (void)pcchversionbuf;
    (void)lplangbuf;
    (void)pcchlangbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetFileVersionW(JNIEnv* km_env, jclass km_clazz, jlong szfilepath, jlong lpversionbuf, jlong pcchversionbuf, jlong lplangbuf, jlong pcchlangbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetFileVersionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilepath, (void*)(uintptr_t)lpversionbuf, (void*)(uintptr_t)pcchversionbuf, (void*)(uintptr_t)lplangbuf, (void*)(uintptr_t)pcchlangbuf) : 0;
#else
    (void)szfilepath;
    (void)lpversionbuf;
    (void)pcchversionbuf;
    (void)lplangbuf;
    (void)pcchlangbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetLanguage(JNIEnv* km_env, jclass km_clazz, jint hinstall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetLanguage");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall) : 0;
#else
    (void)hinstall;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetLastErrorRecord(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetLastErrorRecord");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetMode(JNIEnv* km_env, jclass km_clazz, jint hinstall, jint erunmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (int32_t)erunmode) : -1;
#else
    (void)hinstall;
    (void)erunmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetPatchFileListA(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szpatchpackages, jlong pcfiles, jlong pphfilerecords) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchFileListA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szpatchpackages, (void*)(uintptr_t)pcfiles, (void*)(uintptr_t)pphfilerecords) : 0;
#else
    (void)szproductcode;
    (void)szpatchpackages;
    (void)pcfiles;
    (void)pphfilerecords;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetPatchFileListW(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szpatchpackages, jlong pcfiles, jlong pphfilerecords) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchFileListW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szpatchpackages, (void*)(uintptr_t)pcfiles, (void*)(uintptr_t)pphfilerecords) : 0;
#else
    (void)szproductcode;
    (void)szpatchpackages;
    (void)pcfiles;
    (void)pphfilerecords;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetPatchInfoA(JNIEnv* km_env, jclass km_clazz, jlong szpatch, jlong szattribute, jlong lpvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatch, (void*)(uintptr_t)szattribute, (void*)(uintptr_t)lpvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)szpatch;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetPatchInfoExA(JNIEnv* km_env, jclass km_clazz, jlong szpatchcode, jlong szproductcode, jlong szusersid, jint dwcontext, jlong szproperty, jlong lpvalue, jlong pcchvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchInfoExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatchcode, (void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (void*)(uintptr_t)szproperty, (void*)(uintptr_t)lpvalue, (void*)(uintptr_t)pcchvalue) : 0;
#else
    (void)szpatchcode;
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)lpvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetPatchInfoExW(JNIEnv* km_env, jclass km_clazz, jlong szpatchcode, jlong szproductcode, jlong szusersid, jint dwcontext, jlong szproperty, jlong lpvalue, jlong pcchvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchInfoExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatchcode, (void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (void*)(uintptr_t)szproperty, (void*)(uintptr_t)lpvalue, (void*)(uintptr_t)pcchvalue) : 0;
#else
    (void)szpatchcode;
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)lpvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetPatchInfoW(JNIEnv* km_env, jclass km_clazz, jlong szpatch, jlong szattribute, jlong lpvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPatchInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatch, (void*)(uintptr_t)szattribute, (void*)(uintptr_t)lpvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)szpatch;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetProductCodeA(JNIEnv* km_env, jclass km_clazz, jlong szcomponent, jlong lpbuf39) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductCodeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomponent, (void*)(uintptr_t)lpbuf39) : 0;
#else
    (void)szcomponent;
    (void)lpbuf39;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetProductCodeW(JNIEnv* km_env, jclass km_clazz, jlong szcomponent, jlong lpbuf39) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductCodeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomponent, (void*)(uintptr_t)lpbuf39) : 0;
#else
    (void)szcomponent;
    (void)lpbuf39;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetProductInfoA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szattribute, jlong lpvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szattribute, (void*)(uintptr_t)lpvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)szproduct;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetProductInfoExA(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jlong szproperty, jlong szvalue, jlong pcchvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (void*)(uintptr_t)szproperty, (void*)(uintptr_t)szvalue, (void*)(uintptr_t)pcchvalue) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetProductInfoExW(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jlong szproperty, jlong szvalue, jlong pcchvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (void*)(uintptr_t)szproperty, (void*)(uintptr_t)szvalue, (void*)(uintptr_t)pcchvalue) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetProductInfoFromScriptA(JNIEnv* km_env, jclass km_clazz, jlong szscriptfile, jlong lpproductbuf39, jlong plgidlanguage, jlong pdwversion, jlong lpnamebuf, jlong pcchnamebuf, jlong lppackagebuf, jlong pcchpackagebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoFromScriptA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szscriptfile, (void*)(uintptr_t)lpproductbuf39, (void*)(uintptr_t)plgidlanguage, (void*)(uintptr_t)pdwversion, (void*)(uintptr_t)lpnamebuf, (void*)(uintptr_t)pcchnamebuf, (void*)(uintptr_t)lppackagebuf, (void*)(uintptr_t)pcchpackagebuf) : 0;
#else
    (void)szscriptfile;
    (void)lpproductbuf39;
    (void)plgidlanguage;
    (void)pdwversion;
    (void)lpnamebuf;
    (void)pcchnamebuf;
    (void)lppackagebuf;
    (void)pcchpackagebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetProductInfoFromScriptW(JNIEnv* km_env, jclass km_clazz, jlong szscriptfile, jlong lpproductbuf39, jlong plgidlanguage, jlong pdwversion, jlong lpnamebuf, jlong pcchnamebuf, jlong lppackagebuf, jlong pcchpackagebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoFromScriptW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szscriptfile, (void*)(uintptr_t)lpproductbuf39, (void*)(uintptr_t)plgidlanguage, (void*)(uintptr_t)pdwversion, (void*)(uintptr_t)lpnamebuf, (void*)(uintptr_t)pcchnamebuf, (void*)(uintptr_t)lppackagebuf, (void*)(uintptr_t)pcchpackagebuf) : 0;
#else
    (void)szscriptfile;
    (void)lpproductbuf39;
    (void)plgidlanguage;
    (void)pdwversion;
    (void)lpnamebuf;
    (void)pcchnamebuf;
    (void)lppackagebuf;
    (void)pcchpackagebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetProductInfoW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szattribute, jlong lpvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szattribute, (void*)(uintptr_t)lpvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)szproduct;
    (void)szattribute;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetProductPropertyA(JNIEnv* km_env, jclass km_clazz, jint hproduct, jlong szproperty, jlong lpvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductPropertyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hproduct, (void*)(uintptr_t)szproperty, (void*)(uintptr_t)lpvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)hproduct;
    (void)szproperty;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetProductPropertyW(JNIEnv* km_env, jclass km_clazz, jint hproduct, jlong szproperty, jlong lpvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetProductPropertyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hproduct, (void*)(uintptr_t)szproperty, (void*)(uintptr_t)lpvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)hproduct;
    (void)szproperty;
    (void)lpvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetPropertyA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szname, jlong szvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPropertyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szname, (void*)(uintptr_t)szvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetPropertyW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szname, jlong szvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetPropertyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szname, (void*)(uintptr_t)szvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetShortcutTargetA(JNIEnv* km_env, jclass km_clazz, jlong szshortcutpath, jlong szproductcode, jlong szfeatureid, jlong szcomponentcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetShortcutTargetA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szshortcutpath, (void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szfeatureid, (void*)(uintptr_t)szcomponentcode) : 0;
#else
    (void)szshortcutpath;
    (void)szproductcode;
    (void)szfeatureid;
    (void)szcomponentcode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetShortcutTargetW(JNIEnv* km_env, jclass km_clazz, jlong szshortcutpath, jlong szproductcode, jlong szfeatureid, jlong szcomponentcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetShortcutTargetW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szshortcutpath, (void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szfeatureid, (void*)(uintptr_t)szcomponentcode) : 0;
#else
    (void)szshortcutpath;
    (void)szproductcode;
    (void)szfeatureid;
    (void)szcomponentcode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetSourcePathA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfolder, jlong szpathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetSourcePathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfolder, (void*)(uintptr_t)szpathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetSourcePathW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfolder, jlong szpathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetSourcePathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfolder, (void*)(uintptr_t)szpathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetSummaryInformationA(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong szdatabasepath, jint uiupdatecount, jlong phsummaryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetSummaryInformationA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)szdatabasepath, (uint32_t)uiupdatecount, (void*)(uintptr_t)phsummaryinfo) : 0;
#else
    (void)hdatabase;
    (void)szdatabasepath;
    (void)uiupdatecount;
    (void)phsummaryinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetSummaryInformationW(JNIEnv* km_env, jclass km_clazz, jint hdatabase, jlong szdatabasepath, jint uiupdatecount, jlong phsummaryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetSummaryInformationW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hdatabase, (void*)(uintptr_t)szdatabasepath, (uint32_t)uiupdatecount, (void*)(uintptr_t)phsummaryinfo) : 0;
#else
    (void)hdatabase;
    (void)szdatabasepath;
    (void)uiupdatecount;
    (void)phsummaryinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetTargetPathA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfolder, jlong szpathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetTargetPathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfolder, (void*)(uintptr_t)szpathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetTargetPathW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfolder, jlong szpathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetTargetPathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfolder, (void*)(uintptr_t)szpathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szpathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetUserInfoA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong lpusernamebuf, jlong pcchusernamebuf, jlong lporgnamebuf, jlong pcchorgnamebuf, jlong lpserialbuf, jlong pcchserialbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetUserInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)lpusernamebuf, (void*)(uintptr_t)pcchusernamebuf, (void*)(uintptr_t)lporgnamebuf, (void*)(uintptr_t)pcchorgnamebuf, (void*)(uintptr_t)lpserialbuf, (void*)(uintptr_t)pcchserialbuf) : -1;
#else
    (void)szproduct;
    (void)lpusernamebuf;
    (void)pcchusernamebuf;
    (void)lporgnamebuf;
    (void)pcchorgnamebuf;
    (void)lpserialbuf;
    (void)pcchserialbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiGetUserInfoW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong lpusernamebuf, jlong pcchusernamebuf, jlong lporgnamebuf, jlong pcchorgnamebuf, jlong lpserialbuf, jlong pcchserialbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiGetUserInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)lpusernamebuf, (void*)(uintptr_t)pcchusernamebuf, (void*)(uintptr_t)lporgnamebuf, (void*)(uintptr_t)pcchorgnamebuf, (void*)(uintptr_t)lpserialbuf, (void*)(uintptr_t)pcchserialbuf) : -1;
#else
    (void)szproduct;
    (void)lpusernamebuf;
    (void)pcchusernamebuf;
    (void)lporgnamebuf;
    (void)pcchorgnamebuf;
    (void)lpserialbuf;
    (void)pcchserialbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiInstallMissingComponentA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szcomponent, jint einstallstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallMissingComponentA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szcomponent, (int32_t)einstallstate) : 0;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiInstallMissingComponentW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szcomponent, jint einstallstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallMissingComponentW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szcomponent, (int32_t)einstallstate) : 0;
#else
    (void)szproduct;
    (void)szcomponent;
    (void)einstallstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiInstallMissingFileA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallMissingFileA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfile) : 0;
#else
    (void)szproduct;
    (void)szfile;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiInstallMissingFileW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallMissingFileW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfile) : 0;
#else
    (void)szproduct;
    (void)szfile;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiInstallProductA(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath, jlong szcommandline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallProductA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath, (void*)(uintptr_t)szcommandline) : 0;
#else
    (void)szpackagepath;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiInstallProductW(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath, jlong szcommandline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiInstallProductW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath, (void*)(uintptr_t)szcommandline) : 0;
#else
    (void)szpackagepath;
    (void)szcommandline;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiIsProductElevatedA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong pfelevated) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiIsProductElevatedA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)pfelevated) : 0;
#else
    (void)szproduct;
    (void)pfelevated;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiIsProductElevatedW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong pfelevated) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiIsProductElevatedW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)pfelevated) : 0;
#else
    (void)szproduct;
    (void)pfelevated;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiJoinTransaction(JNIEnv* km_env, jclass km_clazz, jint htransactionhandle, jint dwtransactionattributes, jlong phchangeofownerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiJoinTransaction");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)htransactionhandle, (uint32_t)dwtransactionattributes, (void*)(uintptr_t)phchangeofownerevent) : 0;
#else
    (void)htransactionhandle;
    (void)dwtransactionattributes;
    (void)phchangeofownerevent;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiLocateComponentA(JNIEnv* km_env, jclass km_clazz, jlong szcomponent, jlong lppathbuf, jlong pcchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiLocateComponentA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomponent, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchbuf) : -1;
#else
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiLocateComponentW(JNIEnv* km_env, jclass km_clazz, jlong szcomponent, jlong lppathbuf, jlong pcchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiLocateComponentW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcomponent, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchbuf) : -1;
#else
    (void)szcomponent;
    (void)lppathbuf;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiNotifySidChangeA(JNIEnv* km_env, jclass km_clazz, jlong poldsid, jlong pnewsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiNotifySidChangeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poldsid, (void*)(uintptr_t)pnewsid) : 0;
#else
    (void)poldsid;
    (void)pnewsid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiNotifySidChangeW(JNIEnv* km_env, jclass km_clazz, jlong poldsid, jlong pnewsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiNotifySidChangeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poldsid, (void*)(uintptr_t)pnewsid) : 0;
#else
    (void)poldsid;
    (void)pnewsid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiOpenDatabaseA(JNIEnv* km_env, jclass km_clazz, jlong szdatabasepath, jlong szpersist, jlong phdatabase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenDatabaseA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatabasepath, (void*)(uintptr_t)szpersist, (void*)(uintptr_t)phdatabase) : 0;
#else
    (void)szdatabasepath;
    (void)szpersist;
    (void)phdatabase;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiOpenDatabaseW(JNIEnv* km_env, jclass km_clazz, jlong szdatabasepath, jlong szpersist, jlong phdatabase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenDatabaseW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatabasepath, (void*)(uintptr_t)szpersist, (void*)(uintptr_t)phdatabase) : 0;
#else
    (void)szdatabasepath;
    (void)szpersist;
    (void)phdatabase;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiOpenPackageA(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath, jlong hproduct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenPackageA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath, (void*)(uintptr_t)hproduct) : 0;
#else
    (void)szpackagepath;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiOpenPackageExA(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath, jint dwoptions, jlong hproduct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenPackageExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath, (uint32_t)dwoptions, (void*)(uintptr_t)hproduct) : 0;
#else
    (void)szpackagepath;
    (void)dwoptions;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiOpenPackageExW(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath, jint dwoptions, jlong hproduct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenPackageExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath, (uint32_t)dwoptions, (void*)(uintptr_t)hproduct) : 0;
#else
    (void)szpackagepath;
    (void)dwoptions;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiOpenPackageW(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath, jlong hproduct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenPackageW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath, (void*)(uintptr_t)hproduct) : 0;
#else
    (void)szpackagepath;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiOpenProductA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong hproduct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenProductA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)hproduct) : 0;
#else
    (void)szproduct;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiOpenProductW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong hproduct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiOpenProductW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)hproduct) : 0;
#else
    (void)szproduct;
    (void)hproduct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiPreviewBillboardA(JNIEnv* km_env, jclass km_clazz, jint hpreview, jlong szcontrolname, jlong szbillboard) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiPreviewBillboardA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hpreview, (void*)(uintptr_t)szcontrolname, (void*)(uintptr_t)szbillboard) : 0;
#else
    (void)hpreview;
    (void)szcontrolname;
    (void)szbillboard;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiPreviewBillboardW(JNIEnv* km_env, jclass km_clazz, jint hpreview, jlong szcontrolname, jlong szbillboard) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiPreviewBillboardW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hpreview, (void*)(uintptr_t)szcontrolname, (void*)(uintptr_t)szbillboard) : 0;
#else
    (void)hpreview;
    (void)szcontrolname;
    (void)szbillboard;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiPreviewDialogA(JNIEnv* km_env, jclass km_clazz, jint hpreview, jlong szdialogname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiPreviewDialogA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hpreview, (void*)(uintptr_t)szdialogname) : 0;
#else
    (void)hpreview;
    (void)szdialogname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiPreviewDialogW(JNIEnv* km_env, jclass km_clazz, jint hpreview, jlong szdialogname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiPreviewDialogW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hpreview, (void*)(uintptr_t)szdialogname) : 0;
#else
    (void)hpreview;
    (void)szdialogname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProcessAdvertiseScriptA(JNIEnv* km_env, jclass km_clazz, jlong szscriptfile, jlong sziconfolder, jlong hregdata, jint fshortcuts, jint fremoveitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProcessAdvertiseScriptA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szscriptfile, (void*)(uintptr_t)sziconfolder, (void*)(uintptr_t)hregdata, (int32_t)fshortcuts, (int32_t)fremoveitems) : 0;
#else
    (void)szscriptfile;
    (void)sziconfolder;
    (void)hregdata;
    (void)fshortcuts;
    (void)fremoveitems;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProcessAdvertiseScriptW(JNIEnv* km_env, jclass km_clazz, jlong szscriptfile, jlong sziconfolder, jlong hregdata, jint fshortcuts, jint fremoveitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProcessAdvertiseScriptW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szscriptfile, (void*)(uintptr_t)sziconfolder, (void*)(uintptr_t)hregdata, (int32_t)fshortcuts, (int32_t)fremoveitems) : 0;
#else
    (void)szscriptfile;
    (void)sziconfolder;
    (void)hregdata;
    (void)fshortcuts;
    (void)fremoveitems;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProcessMessage(JNIEnv* km_env, jclass km_clazz, jint hinstall, jint emessagetype, jint hrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProcessMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (int32_t)emessagetype, (uint32_t)hrecord) : -1;
#else
    (void)hinstall;
    (void)emessagetype;
    (void)hrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProvideAssemblyA(JNIEnv* km_env, jclass km_clazz, jlong szassemblyname, jlong szappcontext, jint dwinstallmode, jint dwassemblyinfo, jlong lppathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideAssemblyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szassemblyname, (void*)(uintptr_t)szappcontext, (uint32_t)dwinstallmode, (uint32_t)dwassemblyinfo, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)szassemblyname;
    (void)szappcontext;
    (void)dwinstallmode;
    (void)dwassemblyinfo;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProvideAssemblyW(JNIEnv* km_env, jclass km_clazz, jlong szassemblyname, jlong szappcontext, jint dwinstallmode, jint dwassemblyinfo, jlong lppathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideAssemblyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szassemblyname, (void*)(uintptr_t)szappcontext, (uint32_t)dwinstallmode, (uint32_t)dwassemblyinfo, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)szassemblyname;
    (void)szappcontext;
    (void)dwinstallmode;
    (void)dwassemblyinfo;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProvideComponentA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature, jlong szcomponent, jint dwinstallmode, jlong lppathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideComponentA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)szcomponent, (uint32_t)dwinstallmode, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)szcomponent;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProvideComponentW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature, jlong szcomponent, jint dwinstallmode, jlong lppathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideComponentW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)szcomponent, (uint32_t)dwinstallmode, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)szcomponent;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProvideQualifiedComponentA(JNIEnv* km_env, jclass km_clazz, jlong szcategory, jlong szqualifier, jint dwinstallmode, jlong lppathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcategory, (void*)(uintptr_t)szqualifier, (uint32_t)dwinstallmode, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProvideQualifiedComponentExA(JNIEnv* km_env, jclass km_clazz, jlong szcategory, jlong szqualifier, jint dwinstallmode, jlong szproduct, jint dwunused1, jint dwunused2, jlong lppathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcategory, (void*)(uintptr_t)szqualifier, (uint32_t)dwinstallmode, (void*)(uintptr_t)szproduct, (uint32_t)dwunused1, (uint32_t)dwunused2, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)szproduct;
    (void)dwunused1;
    (void)dwunused2;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProvideQualifiedComponentExW(JNIEnv* km_env, jclass km_clazz, jlong szcategory, jlong szqualifier, jint dwinstallmode, jlong szproduct, jint dwunused1, jint dwunused2, jlong lppathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcategory, (void*)(uintptr_t)szqualifier, (uint32_t)dwinstallmode, (void*)(uintptr_t)szproduct, (uint32_t)dwunused1, (uint32_t)dwunused2, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)szproduct;
    (void)dwunused1;
    (void)dwunused2;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiProvideQualifiedComponentW(JNIEnv* km_env, jclass km_clazz, jlong szcategory, jlong szqualifier, jint dwinstallmode, jlong lppathbuf, jlong pcchpathbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiProvideQualifiedComponentW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcategory, (void*)(uintptr_t)szqualifier, (uint32_t)dwinstallmode, (void*)(uintptr_t)lppathbuf, (void*)(uintptr_t)pcchpathbuf) : 0;
#else
    (void)szcategory;
    (void)szqualifier;
    (void)dwinstallmode;
    (void)lppathbuf;
    (void)pcchpathbuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiQueryComponentStateA(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jlong szcomponentcode, jlong pdwstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryComponentStateA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (void*)(uintptr_t)szcomponentcode, (void*)(uintptr_t)pdwstate) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szcomponentcode;
    (void)pdwstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiQueryComponentStateW(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jlong szcomponentcode, jlong pdwstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryComponentStateW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (void*)(uintptr_t)szcomponentcode, (void*)(uintptr_t)pdwstate) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szcomponentcode;
    (void)pdwstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiQueryFeatureStateA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryFeatureStateA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiQueryFeatureStateExA(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jlong szfeature, jlong pdwstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryFeatureStateExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)pdwstate) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szfeature;
    (void)pdwstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiQueryFeatureStateExW(JNIEnv* km_env, jclass km_clazz, jlong szproductcode, jlong szusersid, jint dwcontext, jlong szfeature, jlong pdwstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryFeatureStateExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (void*)(uintptr_t)szfeature, (void*)(uintptr_t)pdwstate) : 0;
#else
    (void)szproductcode;
    (void)szusersid;
    (void)dwcontext;
    (void)szfeature;
    (void)pdwstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiQueryFeatureStateW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryFeatureStateW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiQueryProductStateA(JNIEnv* km_env, jclass km_clazz, jlong szproduct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryProductStateA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct) : -1;
#else
    (void)szproduct;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiQueryProductStateW(JNIEnv* km_env, jclass km_clazz, jlong szproduct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiQueryProductStateW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct) : -1;
#else
    (void)szproduct;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordClearData(JNIEnv* km_env, jclass km_clazz, jint hrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordClearData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord) : 0;
#else
    (void)hrecord;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordDataSize(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordDataSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield) : 0;
#else
    (void)hrecord;
    (void)ifield;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordGetFieldCount(JNIEnv* km_env, jclass km_clazz, jint hrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordGetFieldCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord) : 0;
#else
    (void)hrecord;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordGetInteger(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordGetInteger");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield) : -1;
#else
    (void)hrecord;
    (void)ifield;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordGetStringA(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield, jlong szvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordGetStringA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield, (void*)(uintptr_t)szvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordGetStringW(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield, jlong szvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordGetStringW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield, (void*)(uintptr_t)szvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordIsNull(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordIsNull");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield) : -1;
#else
    (void)hrecord;
    (void)ifield;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordReadStream(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield, jlong szdatabuf, jlong pcbdatabuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordReadStream");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield, (void*)(uintptr_t)szdatabuf, (void*)(uintptr_t)pcbdatabuf) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szdatabuf;
    (void)pcbdatabuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordSetInteger(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield, jint ivalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordSetInteger");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield, (int32_t)ivalue) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)ivalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordSetStreamA(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield, jlong szfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordSetStreamA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield, (void*)(uintptr_t)szfilepath) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szfilepath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordSetStreamW(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield, jlong szfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordSetStreamW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield, (void*)(uintptr_t)szfilepath) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szfilepath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordSetStringA(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield, jlong szvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordSetStringA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield, (void*)(uintptr_t)szvalue) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRecordSetStringW(JNIEnv* km_env, jclass km_clazz, jint hrecord, jint ifield, jlong szvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRecordSetStringW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hrecord, (uint32_t)ifield, (void*)(uintptr_t)szvalue) : 0;
#else
    (void)hrecord;
    (void)ifield;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiReinstallFeatureA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature, jint dwreinstallmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiReinstallFeatureA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature, (uint32_t)dwreinstallmode) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwreinstallmode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiReinstallFeatureW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature, jint dwreinstallmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiReinstallFeatureW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature, (uint32_t)dwreinstallmode) : 0;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwreinstallmode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiReinstallProductA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jint szreinstallmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiReinstallProductA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (uint32_t)szreinstallmode) : 0;
#else
    (void)szproduct;
    (void)szreinstallmode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiReinstallProductW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jint szreinstallmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiReinstallProductW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (uint32_t)szreinstallmode) : 0;
#else
    (void)szproduct;
    (void)szreinstallmode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRemovePatchesA(JNIEnv* km_env, jclass km_clazz, jlong szpatchlist, jlong szproductcode, jint euninstalltype, jlong szpropertylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRemovePatchesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatchlist, (void*)(uintptr_t)szproductcode, (int32_t)euninstalltype, (void*)(uintptr_t)szpropertylist) : 0;
#else
    (void)szpatchlist;
    (void)szproductcode;
    (void)euninstalltype;
    (void)szpropertylist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiRemovePatchesW(JNIEnv* km_env, jclass km_clazz, jlong szpatchlist, jlong szproductcode, jint euninstalltype, jlong szpropertylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiRemovePatchesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpatchlist, (void*)(uintptr_t)szproductcode, (int32_t)euninstalltype, (void*)(uintptr_t)szpropertylist) : 0;
#else
    (void)szpatchlist;
    (void)szproductcode;
    (void)euninstalltype;
    (void)szpropertylist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSequenceA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong sztable, jint isequencemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSequenceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)sztable, (int32_t)isequencemode) : 0;
#else
    (void)hinstall;
    (void)sztable;
    (void)isequencemode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSequenceW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong sztable, jint isequencemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSequenceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)sztable, (int32_t)isequencemode) : 0;
#else
    (void)hinstall;
    (void)sztable;
    (void)isequencemode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetComponentStateA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szcomponent, jint istate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetComponentStateA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szcomponent, (int32_t)istate) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)istate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetComponentStateW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szcomponent, jint istate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetComponentStateW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szcomponent, (int32_t)istate) : 0;
#else
    (void)hinstall;
    (void)szcomponent;
    (void)istate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetExternalUIA(JNIEnv* km_env, jclass km_clazz, jlong puihandler, jint dwmessagefilter, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetExternalUIA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puihandler, (uint32_t)dwmessagefilter, (void*)(uintptr_t)pvcontext) : NULL;
#else
    (void)puihandler;
    (void)dwmessagefilter;
    (void)pvcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetExternalUIRecord(JNIEnv* km_env, jclass km_clazz, jlong puihandler, jint dwmessagefilter, jlong pvcontext, jlong ppuiprevhandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetExternalUIRecord");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puihandler, (uint32_t)dwmessagefilter, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)ppuiprevhandler) : 0;
#else
    (void)puihandler;
    (void)dwmessagefilter;
    (void)pvcontext;
    (void)ppuiprevhandler;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetExternalUIW(JNIEnv* km_env, jclass km_clazz, jlong puihandler, jint dwmessagefilter, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetExternalUIW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puihandler, (uint32_t)dwmessagefilter, (void*)(uintptr_t)pvcontext) : NULL;
#else
    (void)puihandler;
    (void)dwmessagefilter;
    (void)pvcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetFeatureAttributesA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfeature, jint dwattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetFeatureAttributesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfeature, (uint32_t)dwattributes) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)dwattributes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetFeatureAttributesW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfeature, jint dwattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetFeatureAttributesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfeature, (uint32_t)dwattributes) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)dwattributes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetFeatureStateA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfeature, jint istate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetFeatureStateA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfeature, (int32_t)istate) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)istate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetFeatureStateW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfeature, jint istate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetFeatureStateW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfeature, (int32_t)istate) : 0;
#else
    (void)hinstall;
    (void)szfeature;
    (void)istate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetInstallLevel(JNIEnv* km_env, jclass km_clazz, jint hinstall, jint iinstalllevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetInstallLevel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (int32_t)iinstalllevel) : 0;
#else
    (void)hinstall;
    (void)iinstalllevel;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetInternalUI(JNIEnv* km_env, jclass km_clazz, jint dwuilevel, jlong phwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetInternalUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)dwuilevel, (void*)(uintptr_t)phwnd) : -1;
#else
    (void)dwuilevel;
    (void)phwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetMode(JNIEnv* km_env, jclass km_clazz, jint hinstall, jint erunmode, jint fstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetMode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (int32_t)erunmode, (int32_t)fstate) : 0;
#else
    (void)hinstall;
    (void)erunmode;
    (void)fstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetPropertyA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szname, jlong szvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetPropertyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szname, (void*)(uintptr_t)szvalue) : 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetPropertyW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szname, jlong szvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetPropertyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szname, (void*)(uintptr_t)szvalue) : 0;
#else
    (void)hinstall;
    (void)szname;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetTargetPathA(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfolder, jlong szfolderpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetTargetPathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfolder, (void*)(uintptr_t)szfolderpath) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szfolderpath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSetTargetPathW(JNIEnv* km_env, jclass km_clazz, jint hinstall, jlong szfolder, jlong szfolderpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSetTargetPathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall, (void*)(uintptr_t)szfolder, (void*)(uintptr_t)szfolderpath) : 0;
#else
    (void)hinstall;
    (void)szfolder;
    (void)szfolderpath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListAddMediaDiskA(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jint dwdiskid, jlong szvolumelabel, jlong szdiskprompt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddMediaDiskA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (uint32_t)dwdiskid, (void*)(uintptr_t)szvolumelabel, (void*)(uintptr_t)szdiskprompt) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    (void)szvolumelabel;
    (void)szdiskprompt;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListAddMediaDiskW(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jint dwdiskid, jlong szvolumelabel, jlong szdiskprompt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddMediaDiskW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (uint32_t)dwdiskid, (void*)(uintptr_t)szvolumelabel, (void*)(uintptr_t)szdiskprompt) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    (void)szvolumelabel;
    (void)szdiskprompt;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListAddSourceA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szusername, jint dwreserved, jlong szsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddSourceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szusername, (uint32_t)dwreserved, (void*)(uintptr_t)szsource) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    (void)szsource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListAddSourceExA(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jlong szsource, jint dwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddSourceExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (void*)(uintptr_t)szsource, (uint32_t)dwindex) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    (void)dwindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListAddSourceExW(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jlong szsource, jint dwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddSourceExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (void*)(uintptr_t)szsource, (uint32_t)dwindex) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    (void)dwindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListAddSourceW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szusername, jint dwreserved, jlong szsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListAddSourceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szusername, (uint32_t)dwreserved, (void*)(uintptr_t)szsource) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    (void)szsource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListClearAllA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szusername, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearAllA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szusername, (uint32_t)dwreserved) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListClearAllExA(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearAllExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListClearAllExW(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearAllExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListClearAllW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szusername, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearAllW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szusername, (uint32_t)dwreserved) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListClearMediaDiskA(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jint dwdiskid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearMediaDiskA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (uint32_t)dwdiskid) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListClearMediaDiskW(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jint dwdiskid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearMediaDiskW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (uint32_t)dwdiskid) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwdiskid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListClearSourceA(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jlong szsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearSourceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (void*)(uintptr_t)szsource) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListClearSourceW(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jlong szsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListClearSourceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (void*)(uintptr_t)szsource) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szsource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListEnumMediaDisksA(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jint dwindex, jlong pdwdiskid, jlong szvolumelabel, jlong pcchvolumelabel, jlong szdiskprompt, jlong pcchdiskprompt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListEnumMediaDisksA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (uint32_t)dwindex, (void*)(uintptr_t)pdwdiskid, (void*)(uintptr_t)szvolumelabel, (void*)(uintptr_t)pcchvolumelabel, (void*)(uintptr_t)szdiskprompt, (void*)(uintptr_t)pcchdiskprompt) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)pdwdiskid;
    (void)szvolumelabel;
    (void)pcchvolumelabel;
    (void)szdiskprompt;
    (void)pcchdiskprompt;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListEnumMediaDisksW(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jint dwindex, jlong pdwdiskid, jlong szvolumelabel, jlong pcchvolumelabel, jlong szdiskprompt, jlong pcchdiskprompt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListEnumMediaDisksW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (uint32_t)dwindex, (void*)(uintptr_t)pdwdiskid, (void*)(uintptr_t)szvolumelabel, (void*)(uintptr_t)pcchvolumelabel, (void*)(uintptr_t)szdiskprompt, (void*)(uintptr_t)pcchdiskprompt) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)pdwdiskid;
    (void)szvolumelabel;
    (void)pcchvolumelabel;
    (void)szdiskprompt;
    (void)pcchdiskprompt;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListEnumSourcesA(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jint dwindex, jlong szsource, jlong pcchsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListEnumSourcesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (uint32_t)dwindex, (void*)(uintptr_t)szsource, (void*)(uintptr_t)pcchsource) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)szsource;
    (void)pcchsource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListEnumSourcesW(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jint dwindex, jlong szsource, jlong pcchsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListEnumSourcesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (uint32_t)dwindex, (void*)(uintptr_t)szsource, (void*)(uintptr_t)pcchsource) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)dwindex;
    (void)szsource;
    (void)pcchsource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListForceResolutionA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szusername, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListForceResolutionA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szusername, (uint32_t)dwreserved) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListForceResolutionExA(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListForceResolutionExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListForceResolutionExW(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListForceResolutionExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListForceResolutionW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szusername, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListForceResolutionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szusername, (uint32_t)dwreserved) : 0;
#else
    (void)szproduct;
    (void)szusername;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListGetInfoA(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jlong szproperty, jlong szvalue, jlong pcchvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListGetInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (void*)(uintptr_t)szproperty, (void*)(uintptr_t)szvalue, (void*)(uintptr_t)pcchvalue) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListGetInfoW(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jlong szproperty, jlong szvalue, jlong pcchvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListGetInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (void*)(uintptr_t)szproperty, (void*)(uintptr_t)szvalue, (void*)(uintptr_t)pcchvalue) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    (void)pcchvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListSetInfoA(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jlong szproperty, jlong szvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListSetInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (void*)(uintptr_t)szproperty, (void*)(uintptr_t)szvalue) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSourceListSetInfoW(JNIEnv* km_env, jclass km_clazz, jlong szproductcodeorpatchcode, jlong szusersid, jint dwcontext, jint dwoptions, jlong szproperty, jlong szvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSourceListSetInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproductcodeorpatchcode, (void*)(uintptr_t)szusersid, (int32_t)dwcontext, (uint32_t)dwoptions, (void*)(uintptr_t)szproperty, (void*)(uintptr_t)szvalue) : 0;
#else
    (void)szproductcodeorpatchcode;
    (void)szusersid;
    (void)dwcontext;
    (void)dwoptions;
    (void)szproperty;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSummaryInfoGetPropertyA(JNIEnv* km_env, jclass km_clazz, jint hsummaryinfo, jint uiproperty, jlong puidatatype, jlong pivalue, jlong pftvalue, jlong szvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoGetPropertyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hsummaryinfo, (uint32_t)uiproperty, (void*)(uintptr_t)puidatatype, (void*)(uintptr_t)pivalue, (void*)(uintptr_t)pftvalue, (void*)(uintptr_t)szvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)puidatatype;
    (void)pivalue;
    (void)pftvalue;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSummaryInfoGetPropertyCount(JNIEnv* km_env, jclass km_clazz, jint hsummaryinfo, jlong puipropertycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoGetPropertyCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hsummaryinfo, (void*)(uintptr_t)puipropertycount) : 0;
#else
    (void)hsummaryinfo;
    (void)puipropertycount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSummaryInfoGetPropertyW(JNIEnv* km_env, jclass km_clazz, jint hsummaryinfo, jint uiproperty, jlong puidatatype, jlong pivalue, jlong pftvalue, jlong szvaluebuf, jlong pcchvaluebuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoGetPropertyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hsummaryinfo, (uint32_t)uiproperty, (void*)(uintptr_t)puidatatype, (void*)(uintptr_t)pivalue, (void*)(uintptr_t)pftvalue, (void*)(uintptr_t)szvaluebuf, (void*)(uintptr_t)pcchvaluebuf) : 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)puidatatype;
    (void)pivalue;
    (void)pftvalue;
    (void)szvaluebuf;
    (void)pcchvaluebuf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSummaryInfoPersist(JNIEnv* km_env, jclass km_clazz, jint hsummaryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoPersist");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hsummaryinfo) : 0;
#else
    (void)hsummaryinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSummaryInfoSetPropertyA(JNIEnv* km_env, jclass km_clazz, jint hsummaryinfo, jint uiproperty, jint uidatatype, jint ivalue, jlong pftvalue, jlong szvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoSetPropertyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hsummaryinfo, (uint32_t)uiproperty, (uint32_t)uidatatype, (int32_t)ivalue, (void*)(uintptr_t)pftvalue, (void*)(uintptr_t)szvalue) : 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)uidatatype;
    (void)ivalue;
    (void)pftvalue;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiSummaryInfoSetPropertyW(JNIEnv* km_env, jclass km_clazz, jint hsummaryinfo, jint uiproperty, jint uidatatype, jint ivalue, jlong pftvalue, jlong szvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiSummaryInfoSetPropertyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hsummaryinfo, (uint32_t)uiproperty, (uint32_t)uidatatype, (int32_t)ivalue, (void*)(uintptr_t)pftvalue, (void*)(uintptr_t)szvalue) : 0;
#else
    (void)hsummaryinfo;
    (void)uiproperty;
    (void)uidatatype;
    (void)ivalue;
    (void)pftvalue;
    (void)szvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiUseFeatureA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiUseFeatureA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiUseFeatureExA(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature, jint dwinstallmode, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiUseFeatureExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature, (uint32_t)dwinstallmode, (uint32_t)dwreserved) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwinstallmode;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiUseFeatureExW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature, jint dwinstallmode, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiUseFeatureExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature, (uint32_t)dwinstallmode, (uint32_t)dwreserved) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    (void)dwinstallmode;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiUseFeatureW(JNIEnv* km_env, jclass km_clazz, jlong szproduct, jlong szfeature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiUseFeatureW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szproduct, (void*)(uintptr_t)szfeature) : -1;
#else
    (void)szproduct;
    (void)szfeature;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiVerifyDiskSpace(JNIEnv* km_env, jclass km_clazz, jint hinstall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiVerifyDiskSpace");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hinstall) : 0;
#else
    (void)hinstall;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiVerifyPackageA(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiVerifyPackageA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath) : 0;
#else
    (void)szpackagepath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiVerifyPackageW(JNIEnv* km_env, jclass km_clazz, jlong szpackagepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiVerifyPackageW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szpackagepath) : 0;
#else
    (void)szpackagepath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiViewClose(JNIEnv* km_env, jclass km_clazz, jint hview) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hview) : 0;
#else
    (void)hview;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiViewExecute(JNIEnv* km_env, jclass km_clazz, jint hview, jint hrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewExecute");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hview, (uint32_t)hrecord) : 0;
#else
    (void)hview;
    (void)hrecord;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiViewFetch(JNIEnv* km_env, jclass km_clazz, jint hview, jlong phrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewFetch");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hview, (void*)(uintptr_t)phrecord) : 0;
#else
    (void)hview;
    (void)phrecord;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiViewGetColumnInfo(JNIEnv* km_env, jclass km_clazz, jint hview, jint ecolumninfo, jlong phrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewGetColumnInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hview, (int32_t)ecolumninfo, (void*)(uintptr_t)phrecord) : 0;
#else
    (void)hview;
    (void)ecolumninfo;
    (void)phrecord;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiViewGetErrorA(JNIEnv* km_env, jclass km_clazz, jint hview, jlong szcolumnnamebuffer, jlong pcchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewGetErrorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hview, (void*)(uintptr_t)szcolumnnamebuffer, (void*)(uintptr_t)pcchbuf) : -1;
#else
    (void)hview;
    (void)szcolumnnamebuffer;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiViewGetErrorW(JNIEnv* km_env, jclass km_clazz, jint hview, jlong szcolumnnamebuffer, jlong pcchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewGetErrorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hview, (void*)(uintptr_t)szcolumnnamebuffer, (void*)(uintptr_t)pcchbuf) : -1;
#else
    (void)hview;
    (void)szcolumnnamebuffer;
    (void)pcchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1msiViewModify(JNIEnv* km_env, jclass km_clazz, jint hview, jint emodifymode, jint hrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsiViewModify");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hview, (int32_t)emodifymode, (uint32_t)hrecord) : 0;
#else
    (void)hview;
    (void)emodifymode;
    (void)hrecord;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1normalizeFileForPatchSignature(JNIEnv* km_env, jclass km_clazz, jlong filebuffer, jint filesize, jint optionflags, jlong optiondata, jint newfilecoffbase, jint newfilecofftime, jint ignorerangecount, jlong ignorerangearray, jint retainrangecount, jlong retainrangearray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NormalizeFileForPatchSignature");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filebuffer, (uint32_t)filesize, (uint32_t)optionflags, (void*)(uintptr_t)optiondata, (uint32_t)newfilecoffbase, (uint32_t)newfilecofftime, (uint32_t)ignorerangecount, (void*)(uintptr_t)ignorerangearray, (uint32_t)retainrangecount, (void*)(uintptr_t)retainrangearray) : -1;
#else
    (void)filebuffer;
    (void)filesize;
    (void)optionflags;
    (void)optiondata;
    (void)newfilecoffbase;
    (void)newfilecofftime;
    (void)ignorerangecount;
    (void)ignorerangearray;
    (void)retainrangecount;
    (void)retainrangearray;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1queryActCtxSettingsW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong hactctx, jlong settingsnamespace, jlong settingname, jlong pvbuffer, jlong dwbuffer, jlong pdwwrittenorrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryActCtxSettingsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)hactctx, (void*)(uintptr_t)settingsnamespace, (void*)(uintptr_t)settingname, (void*)(uintptr_t)pvbuffer, (uint64_t)dwbuffer, (void*)(uintptr_t)pdwwrittenorrequired) : -1;
#else
    (void)dwflags;
    (void)hactctx;
    (void)settingsnamespace;
    (void)settingname;
    (void)pvbuffer;
    (void)dwbuffer;
    (void)pdwwrittenorrequired;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1queryActCtxW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong hactctx, jlong pvsubinstance, jint ulinfoclass, jlong pvbuffer, jlong cbbuffer, jlong pcbwrittenorrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryActCtxW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)hactctx, (void*)(uintptr_t)pvsubinstance, (uint32_t)ulinfoclass, (void*)(uintptr_t)pvbuffer, (uint64_t)cbbuffer, (void*)(uintptr_t)pcbwrittenorrequired) : -1;
#else
    (void)dwflags;
    (void)hactctx;
    (void)pvsubinstance;
    (void)ulinfoclass;
    (void)pvbuffer;
    (void)cbbuffer;
    (void)pcbwrittenorrequired;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1releaseActCtx(JNIEnv* km_env, jclass km_clazz, jlong hactctx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseActCtx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hactctx);
#else
    (void)hactctx;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1sfcGetNextProtectedFile(JNIEnv* km_env, jclass km_clazz, jlong rpchandle, jlong protfiledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SfcGetNextProtectedFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rpchandle, (void*)(uintptr_t)protfiledata) : -1;
#else
    (void)rpchandle;
    (void)protfiledata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1sfcIsFileProtected(JNIEnv* km_env, jclass km_clazz, jlong rpchandle, jlong protfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SfcIsFileProtected");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rpchandle, (void*)(uintptr_t)protfilename) : -1;
#else
    (void)rpchandle;
    (void)protfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1sfcIsKeyProtected(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong subkeyname, jint keysam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SfcIsKeyProtected");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)subkeyname, (uint32_t)keysam) : -1;
#else
    (void)keyhandle;
    (void)subkeyname;
    (void)keysam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1sfpVerifyFile(JNIEnv* km_env, jclass km_clazz, jlong pszfilename, jlong pszerror, jint dwerrsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SfpVerifyFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfilename, (void*)(uintptr_t)pszerror, (uint32_t)dwerrsize) : -1;
#else
    (void)pszfilename;
    (void)pszerror;
    (void)dwerrsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1testApplyPatchToFileA(JNIEnv* km_env, jclass km_clazz, jlong patchfilename, jlong oldfilename, jint applyoptionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TestApplyPatchToFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilename, (void*)(uintptr_t)oldfilename, (uint32_t)applyoptionflags) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1testApplyPatchToFileByBuffers(JNIEnv* km_env, jclass km_clazz, jlong patchfilebuffer, jint patchfilesize, jlong oldfilebuffer, jint oldfilesize, jlong newfilesize, jint applyoptionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TestApplyPatchToFileByBuffers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilebuffer, (uint32_t)patchfilesize, (void*)(uintptr_t)oldfilebuffer, (uint32_t)oldfilesize, (void*)(uintptr_t)newfilesize, (uint32_t)applyoptionflags) : -1;
#else
    (void)patchfilebuffer;
    (void)patchfilesize;
    (void)oldfilebuffer;
    (void)oldfilesize;
    (void)newfilesize;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1testApplyPatchToFileByHandles(JNIEnv* km_env, jclass km_clazz, jlong patchfilehandle, jlong oldfilehandle, jint applyoptionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TestApplyPatchToFileByHandles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilehandle, (void*)(uintptr_t)oldfilehandle, (uint32_t)applyoptionflags) : -1;
#else
    (void)patchfilehandle;
    (void)oldfilehandle;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1testApplyPatchToFileW(JNIEnv* km_env, jclass km_clazz, jlong patchfilename, jlong oldfilename, jint applyoptionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mspatcha.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TestApplyPatchToFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)patchfilename, (void*)(uintptr_t)oldfilename, (uint32_t)applyoptionflags) : -1;
#else
    (void)patchfilename;
    (void)oldfilename;
    (void)applyoptionflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationinstallationandservicing_WindowsWin32SystemApplicationinstallationandservicingJniBridge_windowssys_1windows_1win32_1system_1applicationinstallationandservicing_1zombifyActCtx(JNIEnv* km_env, jclass km_clazz, jlong hactctx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZombifyActCtx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hactctx) : -1;
#else
    (void)hactctx;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

