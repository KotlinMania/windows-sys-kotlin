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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1bstrFromVector(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong pbstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BstrFromVector");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)pbstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)pbstr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1clearCustData(JNIEnv* km_env, jclass km_clazz, jlong pcustdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearCustData");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pcustdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pcustdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1createDispTypeInfo(JNIEnv* km_env, jclass km_clazz, jlong pidata, jint lcid, jlong pptinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDispTypeInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pidata, (uint32_t)lcid, (void*)(uintptr_t)pptinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pidata;
    (void)lcid;
    (void)pptinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1createErrorInfo(JNIEnv* km_env, jclass km_clazz, jlong pperrinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateErrorInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pperrinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pperrinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1createOleAdviseHolder(JNIEnv* km_env, jclass km_clazz, jlong ppoaholder) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateOleAdviseHolder");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppoaholder);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppoaholder;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1createStdDispatch(JNIEnv* km_env, jclass km_clazz, jlong punkouter, jlong pvthis, jlong ptinfo, jlong ppunkstddisp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStdDispatch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punkouter, (void*)(uintptr_t)pvthis, (void*)(uintptr_t)ptinfo, (void*)(uintptr_t)ppunkstddisp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punkouter;
    (void)pvthis;
    (void)ptinfo;
    (void)ppunkstddisp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1createTypeLib(JNIEnv* km_env, jclass km_clazz, jint syskind, jlong szfile, jlong ppctlib) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTypeLib");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)syskind, (void*)(uintptr_t)szfile, (void*)(uintptr_t)ppctlib);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)syskind;
    (void)szfile;
    (void)ppctlib;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1createTypeLib2(JNIEnv* km_env, jclass km_clazz, jint syskind, jlong szfile, jlong ppctlib) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTypeLib2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)syskind, (void*)(uintptr_t)szfile, (void*)(uintptr_t)ppctlib);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)syskind;
    (void)szfile;
    (void)ppctlib;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1dispCallFunc(JNIEnv* km_env, jclass km_clazz, jlong pvinstance, jlong ovft, jint cc, jshort vtreturn, jint cactuals, jlong prgvt, jlong prgpvarg, jlong pvargresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, uint16_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispCallFunc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvinstance, (uint64_t)ovft, (int32_t)cc, (uint16_t)vtreturn, (uint32_t)cactuals, (void*)(uintptr_t)prgvt, (void*)(uintptr_t)prgpvarg, (void*)(uintptr_t)pvargresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvinstance;
    (void)ovft;
    (void)cc;
    (void)vtreturn;
    (void)cactuals;
    (void)prgvt;
    (void)prgpvarg;
    (void)pvargresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1dispGetIDsOfNames(JNIEnv* km_env, jclass km_clazz, jlong ptinfo, jlong rgsznames, jint cnames, jlong rgdispid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispGetIDsOfNames");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptinfo, (void*)(uintptr_t)rgsznames, (uint32_t)cnames, (void*)(uintptr_t)rgdispid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptinfo;
    (void)rgsznames;
    (void)cnames;
    (void)rgdispid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1dispGetParam(JNIEnv* km_env, jclass km_clazz, jlong pdispparams, jint position, jshort vttarg, jlong pvarresult, jlong puargerr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispGetParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispparams, (uint32_t)position, (uint16_t)vttarg, (void*)(uintptr_t)pvarresult, (void*)(uintptr_t)puargerr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispparams;
    (void)position;
    (void)vttarg;
    (void)pvarresult;
    (void)puargerr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1dispInvoke(JNIEnv* km_env, jclass km_clazz, jlong arg_0_this, jlong ptinfo, jint dispidmember, jshort wflags, jlong pparams, jlong pvarresult, jlong pexcepinfo, jlong puargerr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispInvoke");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_this, (void*)(uintptr_t)ptinfo, (int32_t)dispidmember, (uint16_t)wflags, (void*)(uintptr_t)pparams, (void*)(uintptr_t)pvarresult, (void*)(uintptr_t)pexcepinfo, (void*)(uintptr_t)puargerr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_this;
    (void)ptinfo;
    (void)dispidmember;
    (void)wflags;
    (void)pparams;
    (void)pvarresult;
    (void)pexcepinfo;
    (void)puargerr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1doDragDrop(JNIEnv* km_env, jclass km_clazz, jlong pdataobj, jlong pdropsource, jint dwokeffects, jlong pdweffect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DoDragDrop");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdataobj, (void*)(uintptr_t)pdropsource, (uint32_t)dwokeffects, (void*)(uintptr_t)pdweffect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdataobj;
    (void)pdropsource;
    (void)dwokeffects;
    (void)pdweffect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1getActiveObject(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong pvreserved, jlong ppunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)ppunk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rclsid;
    (void)pvreserved;
    (void)ppunk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1getAltMonthNames(JNIEnv* km_env, jclass km_clazz, jint lcid, jlong prgp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAltMonthNames");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)lcid, (void*)(uintptr_t)prgp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lcid;
    (void)prgp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1getRecordInfoFromGuids(JNIEnv* km_env, jclass km_clazz, jlong rguidtypelib, jint uvermajor, jint uverminor, jint lcid, jlong rguidtypeinfo, jlong pprecinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRecordInfoFromGuids");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rguidtypelib, (uint32_t)uvermajor, (uint32_t)uverminor, (uint32_t)lcid, (void*)(uintptr_t)rguidtypeinfo, (void*)(uintptr_t)pprecinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rguidtypelib;
    (void)uvermajor;
    (void)uverminor;
    (void)lcid;
    (void)rguidtypeinfo;
    (void)pprecinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1getRecordInfoFromTypeInfo(JNIEnv* km_env, jclass km_clazz, jlong ptypeinfo, jlong pprecinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRecordInfoFromTypeInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptypeinfo, (void*)(uintptr_t)pprecinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptypeinfo;
    (void)pprecinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1hrgnUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1hrgnUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-marshal-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1hrgnUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1hrgnUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-marshal-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1hrgnUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1hrgnUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-marshal-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1hrgnUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1hrgnUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-marshal-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HRGN_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1isAccelerator(JNIEnv* km_env, jclass km_clazz, jlong haccel, jint caccelentries, jlong lpmsg, jlong lpwcmd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsAccelerator");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)haccel, (int32_t)caccelentries, (void*)(uintptr_t)lpmsg, (void*)(uintptr_t)lpwcmd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)haccel;
    (void)caccelentries;
    (void)lpmsg;
    (void)lpwcmd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1lHashValOfNameSys(JNIEnv* km_env, jclass km_clazz, jint syskind, jint lcid, jlong szname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LHashValOfNameSys");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)syskind, (uint32_t)lcid, (void*)(uintptr_t)szname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)syskind;
    (void)lcid;
    (void)szname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1lHashValOfNameSysA(JNIEnv* km_env, jclass km_clazz, jint syskind, jint lcid, jlong szname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LHashValOfNameSysA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)syskind, (uint32_t)lcid, (void*)(uintptr_t)szname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)syskind;
    (void)lcid;
    (void)szname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1loadRegTypeLib(JNIEnv* km_env, jclass km_clazz, jlong rguid, jshort wvermajor, jshort wverminor, jint lcid, jlong pptlib) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadRegTypeLib");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rguid, (uint16_t)wvermajor, (uint16_t)wverminor, (uint32_t)lcid, (void*)(uintptr_t)pptlib);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rguid;
    (void)wvermajor;
    (void)wverminor;
    (void)lcid;
    (void)pptlib;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1loadTypeLib(JNIEnv* km_env, jclass km_clazz, jlong szfile, jlong pptlib) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadTypeLib");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfile, (void*)(uintptr_t)pptlib);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfile;
    (void)pptlib;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1loadTypeLibEx(JNIEnv* km_env, jclass km_clazz, jlong szfile, jint regkind, jlong pptlib) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadTypeLibEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfile, (int32_t)regkind, (void*)(uintptr_t)pptlib);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfile;
    (void)regkind;
    (void)pptlib;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oaBuildVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OaBuildVersion");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oaEnablePerUserTLibRegistration(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OaEnablePerUserTLibRegistration");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleBuildVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleBuildVersion");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleConvertOLESTREAMToIStorage2(JNIEnv* km_env, jclass km_clazz, jlong lpolestream, jlong pstg, jlong ptd, jint opt, jlong pvcallbackcontext, jlong pqueryconvertolelinkcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertOLESTREAMToIStorage2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpolestream, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ptd, (uint32_t)opt, (void*)(uintptr_t)pvcallbackcontext, (void*)(uintptr_t)pqueryconvertolelinkcallback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpolestream;
    (void)pstg;
    (void)ptd;
    (void)opt;
    (void)pvcallbackcontext;
    (void)pqueryconvertolelinkcallback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleConvertOLESTREAMToIStorageEx2(JNIEnv* km_env, jclass km_clazz, jlong polestm, jlong pstg, jlong pcfformat, jlong plwwidth, jlong plheight, jlong pdwsize, jlong pmedium, jint opt, jlong pvcallbackcontext, jlong pqueryconvertolelinkcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertOLESTREAMToIStorageEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)polestm, (void*)(uintptr_t)pstg, (void*)(uintptr_t)pcfformat, (void*)(uintptr_t)plwwidth, (void*)(uintptr_t)plheight, (void*)(uintptr_t)pdwsize, (void*)(uintptr_t)pmedium, (uint32_t)opt, (void*)(uintptr_t)pvcallbackcontext, (void*)(uintptr_t)pqueryconvertolelinkcallback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)polestm;
    (void)pstg;
    (void)pcfformat;
    (void)plwwidth;
    (void)plheight;
    (void)pdwsize;
    (void)pmedium;
    (void)opt;
    (void)pvcallbackcontext;
    (void)pqueryconvertolelinkcallback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreate(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong riid, jint renderopt, jlong pformatetc, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)riid, (uint32_t)renderopt, (void*)(uintptr_t)pformatetc, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rclsid;
    (void)riid;
    (void)renderopt;
    (void)pformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateDefaultHandler(JNIEnv* km_env, jclass km_clazz, jlong clsid, jlong punkouter, jlong riid, jlong lplpobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateDefaultHandler");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsid, (void*)(uintptr_t)punkouter, (void*)(uintptr_t)riid, (void*)(uintptr_t)lplpobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsid;
    (void)punkouter;
    (void)riid;
    (void)lplpobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateEmbeddingHelper(JNIEnv* km_env, jclass km_clazz, jlong clsid, jlong punkouter, jint flags, jlong pcf, jlong riid, jlong lplpobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateEmbeddingHelper");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsid, (void*)(uintptr_t)punkouter, (uint32_t)flags, (void*)(uintptr_t)pcf, (void*)(uintptr_t)riid, (void*)(uintptr_t)lplpobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsid;
    (void)punkouter;
    (void)flags;
    (void)pcf;
    (void)riid;
    (void)lplpobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateEx(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong riid, jint dwflags, jint renderopt, jint cformats, jlong rgadvf, jlong rgformatetc, jlong lpadvisesink, jlong rgdwconnection, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)riid, (uint32_t)dwflags, (uint32_t)renderopt, (uint32_t)cformats, (void*)(uintptr_t)rgadvf, (void*)(uintptr_t)rgformatetc, (void*)(uintptr_t)lpadvisesink, (void*)(uintptr_t)rgdwconnection, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rclsid;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateFontIndirect(JNIEnv* km_env, jclass km_clazz, jlong lpfontdesc, jlong riid, jlong lplpvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateFontIndirect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfontdesc, (void*)(uintptr_t)riid, (void*)(uintptr_t)lplpvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfontdesc;
    (void)riid;
    (void)lplpvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateFromData(JNIEnv* km_env, jclass km_clazz, jlong psrcdataobj, jlong riid, jint renderopt, jlong pformatetc, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateFromData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psrcdataobj, (void*)(uintptr_t)riid, (uint32_t)renderopt, (void*)(uintptr_t)pformatetc, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psrcdataobj;
    (void)riid;
    (void)renderopt;
    (void)pformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateFromDataEx(JNIEnv* km_env, jclass km_clazz, jlong psrcdataobj, jlong riid, jint dwflags, jint renderopt, jint cformats, jlong rgadvf, jlong rgformatetc, jlong lpadvisesink, jlong rgdwconnection, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateFromDataEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psrcdataobj, (void*)(uintptr_t)riid, (uint32_t)dwflags, (uint32_t)renderopt, (uint32_t)cformats, (void*)(uintptr_t)rgadvf, (void*)(uintptr_t)rgformatetc, (void*)(uintptr_t)lpadvisesink, (void*)(uintptr_t)rgdwconnection, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psrcdataobj;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateFromFile(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong lpszfilename, jlong riid, jint renderopt, jlong lpformatetc, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateFromFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)riid, (uint32_t)renderopt, (void*)(uintptr_t)lpformatetc, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rclsid;
    (void)lpszfilename;
    (void)riid;
    (void)renderopt;
    (void)lpformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateFromFileEx(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong lpszfilename, jlong riid, jint dwflags, jint renderopt, jint cformats, jlong rgadvf, jlong rgformatetc, jlong lpadvisesink, jlong rgdwconnection, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateFromFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)riid, (uint32_t)dwflags, (uint32_t)renderopt, (uint32_t)cformats, (void*)(uintptr_t)rgadvf, (void*)(uintptr_t)rgformatetc, (void*)(uintptr_t)lpadvisesink, (void*)(uintptr_t)rgdwconnection, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rclsid;
    (void)lpszfilename;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateLink(JNIEnv* km_env, jclass km_clazz, jlong pmklinksrc, jlong riid, jint renderopt, jlong lpformatetc, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLink");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmklinksrc, (void*)(uintptr_t)riid, (uint32_t)renderopt, (void*)(uintptr_t)lpformatetc, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmklinksrc;
    (void)riid;
    (void)renderopt;
    (void)lpformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateLinkEx(JNIEnv* km_env, jclass km_clazz, jlong pmklinksrc, jlong riid, jint dwflags, jint renderopt, jint cformats, jlong rgadvf, jlong rgformatetc, jlong lpadvisesink, jlong rgdwconnection, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLinkEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmklinksrc, (void*)(uintptr_t)riid, (uint32_t)dwflags, (uint32_t)renderopt, (uint32_t)cformats, (void*)(uintptr_t)rgadvf, (void*)(uintptr_t)rgformatetc, (void*)(uintptr_t)lpadvisesink, (void*)(uintptr_t)rgdwconnection, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmklinksrc;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateLinkFromData(JNIEnv* km_env, jclass km_clazz, jlong psrcdataobj, jlong riid, jint renderopt, jlong pformatetc, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLinkFromData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psrcdataobj, (void*)(uintptr_t)riid, (uint32_t)renderopt, (void*)(uintptr_t)pformatetc, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psrcdataobj;
    (void)riid;
    (void)renderopt;
    (void)pformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateLinkFromDataEx(JNIEnv* km_env, jclass km_clazz, jlong psrcdataobj, jlong riid, jint dwflags, jint renderopt, jint cformats, jlong rgadvf, jlong rgformatetc, jlong lpadvisesink, jlong rgdwconnection, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLinkFromDataEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psrcdataobj, (void*)(uintptr_t)riid, (uint32_t)dwflags, (uint32_t)renderopt, (uint32_t)cformats, (void*)(uintptr_t)rgadvf, (void*)(uintptr_t)rgformatetc, (void*)(uintptr_t)lpadvisesink, (void*)(uintptr_t)rgdwconnection, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psrcdataobj;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateLinkToFile(JNIEnv* km_env, jclass km_clazz, jlong lpszfilename, jlong riid, jint renderopt, jlong lpformatetc, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLinkToFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)riid, (uint32_t)renderopt, (void*)(uintptr_t)lpformatetc, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszfilename;
    (void)riid;
    (void)renderopt;
    (void)lpformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateLinkToFileEx(JNIEnv* km_env, jclass km_clazz, jlong lpszfilename, jlong riid, jint dwflags, jint renderopt, jint cformats, jlong rgadvf, jlong rgformatetc, jlong lpadvisesink, jlong rgdwconnection, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateLinkToFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)riid, (uint32_t)dwflags, (uint32_t)renderopt, (uint32_t)cformats, (void*)(uintptr_t)rgadvf, (void*)(uintptr_t)rgformatetc, (void*)(uintptr_t)lpadvisesink, (void*)(uintptr_t)rgdwconnection, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszfilename;
    (void)riid;
    (void)dwflags;
    (void)renderopt;
    (void)cformats;
    (void)rgadvf;
    (void)rgformatetc;
    (void)lpadvisesink;
    (void)rgdwconnection;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateMenuDescriptor(JNIEnv* km_env, jclass km_clazz, jlong hmenucombined, jlong lpmenuwidths) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateMenuDescriptor");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmenucombined, (void*)(uintptr_t)lpmenuwidths);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmenucombined;
    (void)lpmenuwidths;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreatePictureIndirect(JNIEnv* km_env, jclass km_clazz, jlong lppictdesc, jlong riid, jint fown, jlong lplpvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreatePictureIndirect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lppictdesc, (void*)(uintptr_t)riid, (int32_t)fown, (void*)(uintptr_t)lplpvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lppictdesc;
    (void)riid;
    (void)fown;
    (void)lplpvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreatePropertyFrame(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jint x, jint y, jlong lpszcaption, jint cobjects, jlong ppunk, jint cpages, jlong ppageclsid, jint lcid, jint dwreserved, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreatePropertyFrame");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndowner, (uint32_t)x, (uint32_t)y, (void*)(uintptr_t)lpszcaption, (uint32_t)cobjects, (void*)(uintptr_t)ppunk, (uint32_t)cpages, (void*)(uintptr_t)ppageclsid, (uint32_t)lcid, (uint32_t)dwreserved, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndowner;
    (void)x;
    (void)y;
    (void)lpszcaption;
    (void)cobjects;
    (void)ppunk;
    (void)cpages;
    (void)ppageclsid;
    (void)lcid;
    (void)dwreserved;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreatePropertyFrameIndirect(JNIEnv* km_env, jclass km_clazz, jlong lpparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreatePropertyFrameIndirect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleCreateStaticFromData(JNIEnv* km_env, jclass km_clazz, jlong psrcdataobj, jlong iid, jint renderopt, jlong pformatetc, jlong pclientsite, jlong pstg, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleCreateStaticFromData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psrcdataobj, (void*)(uintptr_t)iid, (uint32_t)renderopt, (void*)(uintptr_t)pformatetc, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psrcdataobj;
    (void)iid;
    (void)renderopt;
    (void)pformatetc;
    (void)pclientsite;
    (void)pstg;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleDestroyMenuDescriptor(JNIEnv* km_env, jclass km_clazz, jlong holemenu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleDestroyMenuDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)holemenu);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)holemenu;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleDoAutoConvert(JNIEnv* km_env, jclass km_clazz, jlong pstg, jlong pclsidnew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleDoAutoConvert");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstg, (void*)(uintptr_t)pclsidnew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    (void)pclsidnew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleDraw(JNIEnv* km_env, jclass km_clazz, jlong punknown, jint dwaspect, jlong hdcdraw, jlong lprcbounds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleDraw");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punknown, (uint32_t)dwaspect, (void*)(uintptr_t)hdcdraw, (void*)(uintptr_t)lprcbounds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punknown;
    (void)dwaspect;
    (void)hdcdraw;
    (void)lprcbounds;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleDuplicateData(JNIEnv* km_env, jclass km_clazz, jlong hsrc, jshort cfformat, jint uiflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleDuplicateData");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsrc, (uint16_t)cfformat, (uint32_t)uiflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hsrc;
    (void)cfformat;
    (void)uiflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleFlushClipboard(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleFlushClipboard");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleGetAutoConvert(JNIEnv* km_env, jclass km_clazz, jlong clsidold, jlong pclsidnew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleGetAutoConvert");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsidold, (void*)(uintptr_t)pclsidnew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsidold;
    (void)pclsidnew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleGetClipboard(JNIEnv* km_env, jclass km_clazz, jlong ppdataobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleGetClipboard");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppdataobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppdataobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleGetClipboardWithEnterpriseInfo(JNIEnv* km_env, jclass km_clazz, jlong dataobject, jlong dataenterpriseid, jlong sourcedescription, jlong targetdescription, jlong datadescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleGetClipboardWithEnterpriseInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dataobject, (void*)(uintptr_t)dataenterpriseid, (void*)(uintptr_t)sourcedescription, (void*)(uintptr_t)targetdescription, (void*)(uintptr_t)datadescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dataobject;
    (void)dataenterpriseid;
    (void)sourcedescription;
    (void)targetdescription;
    (void)datadescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleGetIconOfClass(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jlong lpszlabel, jint fusetypeaslabel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleGetIconOfClass");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rclsid, (void*)(uintptr_t)lpszlabel, (int32_t)fusetypeaslabel);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)rclsid;
    (void)lpszlabel;
    (void)fusetypeaslabel;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleGetIconOfFile(JNIEnv* km_env, jclass km_clazz, jlong lpszpath, jint fusefileaslabel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleGetIconOfFile");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszpath, (int32_t)fusefileaslabel);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszpath;
    (void)fusefileaslabel;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleIconToCursor(JNIEnv* km_env, jclass km_clazz, jlong hinstexe, jlong hicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleIconToCursor");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinstexe, (void*)(uintptr_t)hicon);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hinstexe;
    (void)hicon;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleInitialize(JNIEnv* km_env, jclass km_clazz, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleInitialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleIsCurrentClipboard(JNIEnv* km_env, jclass km_clazz, jlong pdataobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleIsCurrentClipboard");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdataobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdataobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleIsRunning(JNIEnv* km_env, jclass km_clazz, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleIsRunning");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleLoad(JNIEnv* km_env, jclass km_clazz, jlong pstg, jlong riid, jlong pclientsite, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLoad");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstg, (void*)(uintptr_t)riid, (void*)(uintptr_t)pclientsite, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    (void)riid;
    (void)pclientsite;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleLoadFromStream(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong iidinterface, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLoadFromStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)iidinterface, (void*)(uintptr_t)ppvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    (void)iidinterface;
    (void)ppvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleLoadPicture(JNIEnv* km_env, jclass km_clazz, jlong lpstream, jint lsize, jint frunmode, jlong riid, jlong lplpvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLoadPicture");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstream, (int32_t)lsize, (int32_t)frunmode, (void*)(uintptr_t)riid, (void*)(uintptr_t)lplpvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpstream;
    (void)lsize;
    (void)frunmode;
    (void)riid;
    (void)lplpvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleLoadPictureEx(JNIEnv* km_env, jclass km_clazz, jlong lpstream, jint lsize, jint frunmode, jlong riid, jint xsizedesired, jint ysizedesired, jint dwflags, jlong lplpvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLoadPictureEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstream, (int32_t)lsize, (int32_t)frunmode, (void*)(uintptr_t)riid, (uint32_t)xsizedesired, (uint32_t)ysizedesired, (uint32_t)dwflags, (void*)(uintptr_t)lplpvobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpstream;
    (void)lsize;
    (void)frunmode;
    (void)riid;
    (void)xsizedesired;
    (void)ysizedesired;
    (void)dwflags;
    (void)lplpvobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleLoadPicturePath(JNIEnv* km_env, jclass km_clazz, jlong szurlorpath, jlong punkcaller, jint dwreserved, jint clrreserved, jlong riid, jlong ppvret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLoadPicturePath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szurlorpath, (void*)(uintptr_t)punkcaller, (uint32_t)dwreserved, (uint32_t)clrreserved, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szurlorpath;
    (void)punkcaller;
    (void)dwreserved;
    (void)clrreserved;
    (void)riid;
    (void)ppvret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleLockRunning(JNIEnv* km_env, jclass km_clazz, jlong punknown, jint flock, jint flastunlockcloses) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleLockRunning");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punknown, (int32_t)flock, (int32_t)flastunlockcloses);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punknown;
    (void)flock;
    (void)flastunlockcloses;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleMetafilePictFromIconAndLabel(JNIEnv* km_env, jclass km_clazz, jlong hicon, jlong lpszlabel, jlong lpszsourcefile, jint iiconindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleMetafilePictFromIconAndLabel");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hicon, (void*)(uintptr_t)lpszlabel, (void*)(uintptr_t)lpszsourcefile, (uint32_t)iiconindex);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hicon;
    (void)lpszlabel;
    (void)lpszsourcefile;
    (void)iiconindex;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleNoteObjectVisible(JNIEnv* km_env, jclass km_clazz, jlong punknown, jint fvisible) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleNoteObjectVisible");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punknown, (int32_t)fvisible);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punknown;
    (void)fvisible;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleQueryCreateFromData(JNIEnv* km_env, jclass km_clazz, jlong psrcdataobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleQueryCreateFromData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psrcdataobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psrcdataobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleQueryLinkFromData(JNIEnv* km_env, jclass km_clazz, jlong psrcdataobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleQueryLinkFromData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psrcdataobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psrcdataobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleRegEnumFormatEtc(JNIEnv* km_env, jclass km_clazz, jlong clsid, jint dwdirection, jlong ppenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleRegEnumFormatEtc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsid, (uint32_t)dwdirection, (void*)(uintptr_t)ppenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsid;
    (void)dwdirection;
    (void)ppenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleRegEnumVerbs(JNIEnv* km_env, jclass km_clazz, jlong clsid, jlong ppenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleRegEnumVerbs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsid, (void*)(uintptr_t)ppenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsid;
    (void)ppenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleRegGetMiscStatus(JNIEnv* km_env, jclass km_clazz, jlong clsid, jint dwaspect, jlong pdwstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleRegGetMiscStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsid, (uint32_t)dwaspect, (void*)(uintptr_t)pdwstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsid;
    (void)dwaspect;
    (void)pdwstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleRegGetUserType(JNIEnv* km_env, jclass km_clazz, jlong clsid, jint dwformoftype, jlong pszusertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleRegGetUserType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsid, (uint32_t)dwformoftype, (void*)(uintptr_t)pszusertype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsid;
    (void)dwformoftype;
    (void)pszusertype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleRun(JNIEnv* km_env, jclass km_clazz, jlong punknown) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleRun");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punknown);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punknown;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleSave(JNIEnv* km_env, jclass km_clazz, jlong pps, jlong pstg, jint fsameasload) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSave");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pps, (void*)(uintptr_t)pstg, (int32_t)fsameasload);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pps;
    (void)pstg;
    (void)fsameasload;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleSavePictureFile(JNIEnv* km_env, jclass km_clazz, jlong lpdisppicture, jlong bstrfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSavePictureFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdisppicture, (void*)(uintptr_t)bstrfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdisppicture;
    (void)bstrfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleSaveToStream(JNIEnv* km_env, jclass km_clazz, jlong ppstm, jlong pstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSaveToStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppstm, (void*)(uintptr_t)pstm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppstm;
    (void)pstm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleSetAutoConvert(JNIEnv* km_env, jclass km_clazz, jlong clsidold, jlong clsidnew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSetAutoConvert");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsidold, (void*)(uintptr_t)clsidnew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsidold;
    (void)clsidnew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleSetClipboard(JNIEnv* km_env, jclass km_clazz, jlong pdataobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSetClipboard");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdataobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdataobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleSetContainedObject(JNIEnv* km_env, jclass km_clazz, jlong punknown, jint fcontained) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSetContainedObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punknown, (int32_t)fcontained);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punknown;
    (void)fcontained;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleSetMenuDescriptor(JNIEnv* km_env, jclass km_clazz, jlong holemenu, jlong hwndframe, jlong hwndactiveobject, jlong lpframe, jlong lpactiveobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSetMenuDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)holemenu, (void*)(uintptr_t)hwndframe, (void*)(uintptr_t)hwndactiveobject, (void*)(uintptr_t)lpframe, (void*)(uintptr_t)lpactiveobj);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)holemenu;
    (void)hwndframe;
    (void)hwndactiveobject;
    (void)lpframe;
    (void)lpactiveobj;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleTranslateAccelerator(JNIEnv* km_env, jclass km_clazz, jlong lpframe, jlong lpframeinfo, jlong lpmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleTranslateAccelerator");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpframe, (void*)(uintptr_t)lpframeinfo, (void*)(uintptr_t)lpmsg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpframe;
    (void)lpframeinfo;
    (void)lpmsg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleTranslateColor(JNIEnv* km_env, jclass km_clazz, jint clr, jlong hpal, jlong lpcolorref) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleTranslateColor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)clr, (void*)(uintptr_t)hpal, (void*)(uintptr_t)lpcolorref);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clr;
    (void)hpal;
    (void)lpcolorref;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIAddVerbMenuA(JNIEnv* km_env, jclass km_clazz, jlong lpoleobj, jlong lpszshorttype, jlong hmenu, jint upos, jint uidverbmin, jint uidverbmax, jint baddconvert, jint idconvert, jlong lphmenu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIAddVerbMenuA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpoleobj, (void*)(uintptr_t)lpszshorttype, (void*)(uintptr_t)hmenu, (uint32_t)upos, (uint32_t)uidverbmin, (uint32_t)uidverbmax, (int32_t)baddconvert, (uint32_t)idconvert, (void*)(uintptr_t)lphmenu);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpoleobj;
    (void)lpszshorttype;
    (void)hmenu;
    (void)upos;
    (void)uidverbmin;
    (void)uidverbmax;
    (void)baddconvert;
    (void)idconvert;
    (void)lphmenu;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIAddVerbMenuW(JNIEnv* km_env, jclass km_clazz, jlong lpoleobj, jlong lpszshorttype, jlong hmenu, jint upos, jint uidverbmin, jint uidverbmax, jint baddconvert, jint idconvert, jlong lphmenu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIAddVerbMenuW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpoleobj, (void*)(uintptr_t)lpszshorttype, (void*)(uintptr_t)hmenu, (uint32_t)upos, (uint32_t)uidverbmin, (uint32_t)uidverbmax, (int32_t)baddconvert, (uint32_t)idconvert, (void*)(uintptr_t)lphmenu);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpoleobj;
    (void)lpszshorttype;
    (void)hmenu;
    (void)upos;
    (void)uidverbmin;
    (void)uidverbmax;
    (void)baddconvert;
    (void)idconvert;
    (void)lphmenu;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIBusyA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIBusyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIBusyW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIBusyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUICanConvertOrActivateAs(JNIEnv* km_env, jclass km_clazz, jlong rclsid, jint fislinkedobject, jshort wformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUICanConvertOrActivateAs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rclsid, (int32_t)fislinkedobject, (uint16_t)wformat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rclsid;
    (void)fislinkedobject;
    (void)wformat;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIChangeIconA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIChangeIconA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIChangeIconW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIChangeIconW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIChangeSourceA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIChangeSourceA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIChangeSourceW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIChangeSourceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIConvertA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIConvertA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIConvertW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIConvertW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIEditLinksA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIEditLinksA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIEditLinksW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIEditLinksW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIInsertObjectA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIInsertObjectA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIInsertObjectW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIInsertObjectW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIObjectPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIObjectPropertiesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIObjectPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIObjectPropertiesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIPasteSpecialA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIPasteSpecialA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIPasteSpecialW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIPasteSpecialW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIPromptUserA(JNIEnv* km_env, jclass km_clazz, jint ntemplate, jlong hwndparent, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIPromptUserA");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int32_t)ntemplate, (void*)(uintptr_t)hwndparent); break;
            case 1: km_res = km_fn_ptr((int32_t)ntemplate, (void*)(uintptr_t)hwndparent, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int32_t)ntemplate, (void*)(uintptr_t)hwndparent, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int32_t)ntemplate, (void*)(uintptr_t)hwndparent, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int32_t)ntemplate, (void*)(uintptr_t)hwndparent, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)ntemplate;
    (void)hwndparent;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIPromptUserW(JNIEnv* km_env, jclass km_clazz, jint ntemplate, jlong hwndparent, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(int32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIPromptUserW");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((int32_t)ntemplate, (void*)(uintptr_t)hwndparent); break;
            case 1: km_res = km_fn_ptr((int32_t)ntemplate, (void*)(uintptr_t)hwndparent, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((int32_t)ntemplate, (void*)(uintptr_t)hwndparent, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((int32_t)ntemplate, (void*)(uintptr_t)hwndparent, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((int32_t)ntemplate, (void*)(uintptr_t)hwndparent, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)ntemplate;
    (void)hwndparent;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIUpdateLinksA(JNIEnv* km_env, jclass km_clazz, jlong lpoleuilinkcntr, jlong hwndparent, jlong lpsztitle, jint clinks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIUpdateLinksA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpoleuilinkcntr, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpsztitle, (int32_t)clinks);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpoleuilinkcntr;
    (void)hwndparent;
    (void)lpsztitle;
    (void)clinks;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUIUpdateLinksW(JNIEnv* km_env, jclass km_clazz, jlong lpoleuilinkcntr, jlong hwndparent, jlong lpsztitle, jint clinks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oledlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUIUpdateLinksW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpoleuilinkcntr, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpsztitle, (int32_t)clinks);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpoleuilinkcntr;
    (void)hwndparent;
    (void)lpsztitle;
    (void)clinks;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1oleUninitialize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleUninitialize");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1queryPathOfRegTypeLib(JNIEnv* km_env, jclass km_clazz, jlong guid, jshort wmaj, jshort wmin, jint lcid, jlong lpbstrpathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryPathOfRegTypeLib");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)guid, (uint16_t)wmaj, (uint16_t)wmin, (uint32_t)lcid, (void*)(uintptr_t)lpbstrpathname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)guid;
    (void)wmaj;
    (void)wmin;
    (void)lcid;
    (void)lpbstrpathname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1registerActiveObject(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong rclsid, jint dwflags, jlong pdwregister) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterActiveObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)rclsid, (uint32_t)dwflags, (void*)(uintptr_t)pdwregister);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punk;
    (void)rclsid;
    (void)dwflags;
    (void)pdwregister;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1registerDragDrop(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pdroptarget) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDragDrop");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pdroptarget);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)pdroptarget;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1registerTypeLib(JNIEnv* km_env, jclass km_clazz, jlong ptlib, jlong szfullpath, jlong szhelpdir) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTypeLib");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptlib, (void*)(uintptr_t)szfullpath, (void*)(uintptr_t)szhelpdir);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptlib;
    (void)szfullpath;
    (void)szhelpdir;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1registerTypeLibForUser(JNIEnv* km_env, jclass km_clazz, jlong ptlib, jlong szfullpath, jlong szhelpdir) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTypeLibForUser");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptlib, (void*)(uintptr_t)szfullpath, (void*)(uintptr_t)szhelpdir);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptlib;
    (void)szfullpath;
    (void)szhelpdir;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1releaseStgMedium(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseStgMedium");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1revokeActiveObject(JNIEnv* km_env, jclass km_clazz, jint dwregister, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevokeActiveObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwregister, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwregister;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1revokeDragDrop(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevokeDragDrop");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayAccessData(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong ppvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayAccessData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)ppvdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)ppvdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayAddRef(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong ppdatatorelease) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayAddRef");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)ppdatatorelease);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)ppdatatorelease;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayAllocData(JNIEnv* km_env, jclass km_clazz, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayAllocData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayAllocDescriptor(JNIEnv* km_env, jclass km_clazz, jint cdims, jlong ppsaout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayAllocDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cdims, (void*)(uintptr_t)ppsaout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cdims;
    (void)ppsaout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayAllocDescriptorEx(JNIEnv* km_env, jclass km_clazz, jshort vt, jint cdims, jlong ppsaout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayAllocDescriptorEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)vt, (uint32_t)cdims, (void*)(uintptr_t)ppsaout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vt;
    (void)cdims;
    (void)ppsaout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayCopy(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong ppsaout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCopy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)ppsaout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)ppsaout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayCopyData(JNIEnv* km_env, jclass km_clazz, jlong psasource, jlong psatarget) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCopyData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psasource, (void*)(uintptr_t)psatarget);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psasource;
    (void)psatarget;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayCreate(JNIEnv* km_env, jclass km_clazz, jshort vt, jint cdims, jlong rgsabound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCreate");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)vt, (uint32_t)cdims, (void*)(uintptr_t)rgsabound);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)vt;
    (void)cdims;
    (void)rgsabound;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayCreateEx(JNIEnv* km_env, jclass km_clazz, jshort vt, jint cdims, jlong rgsabound, jlong pvextra) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCreateEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)vt, (uint32_t)cdims, (void*)(uintptr_t)rgsabound, (void*)(uintptr_t)pvextra);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)vt;
    (void)cdims;
    (void)rgsabound;
    (void)pvextra;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayCreateVector(JNIEnv* km_env, jclass km_clazz, jshort vt, jint llbound, jint celements) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCreateVector");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)vt, (int32_t)llbound, (uint32_t)celements);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)vt;
    (void)llbound;
    (void)celements;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayCreateVectorEx(JNIEnv* km_env, jclass km_clazz, jshort vt, jint llbound, jint celements, jlong pvextra) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayCreateVectorEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)vt, (int32_t)llbound, (uint32_t)celements, (void*)(uintptr_t)pvextra);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)vt;
    (void)llbound;
    (void)celements;
    (void)pvextra;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayDestroy(JNIEnv* km_env, jclass km_clazz, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayDestroy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayDestroyData(JNIEnv* km_env, jclass km_clazz, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayDestroyData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayDestroyDescriptor(JNIEnv* km_env, jclass km_clazz, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayDestroyDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayGetDim(JNIEnv* km_env, jclass km_clazz, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetDim");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psa;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayGetElement(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong rgindices, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)rgindices, (void*)(uintptr_t)pv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)rgindices;
    (void)pv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayGetElemsize(JNIEnv* km_env, jclass km_clazz, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetElemsize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psa;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayGetIID(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong pguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetIID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)pguid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)pguid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayGetLBound(JNIEnv* km_env, jclass km_clazz, jlong psa, jint ndim, jlong pllbound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetLBound");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (uint32_t)ndim, (void*)(uintptr_t)pllbound);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)ndim;
    (void)pllbound;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayGetRecordInfo(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong prinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetRecordInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)prinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)prinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayGetUBound(JNIEnv* km_env, jclass km_clazz, jlong psa, jint ndim, jlong plubound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetUBound");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (uint32_t)ndim, (void*)(uintptr_t)plubound);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)ndim;
    (void)plubound;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayGetVartype(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong pvt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayGetVartype");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)pvt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)pvt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayLock(JNIEnv* km_env, jclass km_clazz, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayLock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayPtrOfIndex(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong rgindices, jlong ppvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayPtrOfIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)rgindices, (void*)(uintptr_t)ppvdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)rgindices;
    (void)ppvdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayPutElement(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong rgindices, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayPutElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)rgindices, (void*)(uintptr_t)pv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)rgindices;
    (void)pv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayRedim(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong psaboundnew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayRedim");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)psaboundnew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)psaboundnew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayReleaseData(JNIEnv* km_env, jclass km_clazz, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayReleaseData");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayReleaseDescriptor(JNIEnv* km_env, jclass km_clazz, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayReleaseDescriptor");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)psa);
    } else {
        errno = ENOSYS;
    }
#else
    (void)psa;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArraySetIID(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArraySetIID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)guid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)guid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArraySetRecordInfo(JNIEnv* km_env, jclass km_clazz, jlong psa, jlong prinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArraySetRecordInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa, (void*)(uintptr_t)prinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    (void)prinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayUnaccessData(JNIEnv* km_env, jclass km_clazz, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayUnaccessData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1safeArrayUnlock(JNIEnv* km_env, jclass km_clazz, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SafeArrayUnlock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1unRegisterTypeLib(JNIEnv* km_env, jclass km_clazz, jlong libid, jshort wvermajor, jshort wverminor, jint lcid, jint syskind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnRegisterTypeLib");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)libid, (uint16_t)wvermajor, (uint16_t)wverminor, (uint32_t)lcid, (int32_t)syskind);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)libid;
    (void)wvermajor;
    (void)wverminor;
    (void)lcid;
    (void)syskind;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1unRegisterTypeLibForUser(JNIEnv* km_env, jclass km_clazz, jlong libid, jshort wmajorvernum, jshort wminorvernum, jint lcid, jint syskind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnRegisterTypeLibForUser");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)libid, (uint16_t)wmajorvernum, (uint16_t)wminorvernum, (uint32_t)lcid, (int32_t)syskind);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)libid;
    (void)wmajorvernum;
    (void)wminorvernum;
    (void)lcid;
    (void)syskind;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varAbs(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarAbs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varAdd(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarAdd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varAnd(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarAnd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromI2(JNIEnv* km_env, jclass km_clazz, jshort arg_0_sin, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)arg_0_sin, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_sin;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBoolFromUI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong pboolout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBoolFromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)i64in, (void*)(uintptr_t)pboolout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)pboolout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrCat(JNIEnv* km_env, jclass km_clazz, jlong bstrleft, jlong bstrright, jlong pbstrresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrCat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bstrleft, (void*)(uintptr_t)bstrright, (void*)(uintptr_t)pbstrresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bstrleft;
    (void)bstrright;
    (void)pbstrresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrCmp(JNIEnv* km_env, jclass km_clazz, jlong bstrleft, jlong bstrright, jint lcid, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrCmp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bstrleft, (void*)(uintptr_t)bstrright, (uint32_t)lcid, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bstrleft;
    (void)bstrright;
    (void)lcid;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromI2(JNIEnv* km_env, jclass km_clazz, jshort ival, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)ival, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ival;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bval, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bval, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bval;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varBstrFromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jint lcid, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarBstrFromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)lcid;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCat(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCmp(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jint lcid, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCmp");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (uint32_t)lcid, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)lcid;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromI2(JNIEnv* km_env, jclass km_clazz, jshort arg_0_sin, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)arg_0_sin, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_sin;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varCyFromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong pcyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarCyFromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (void*)(uintptr_t)pcyout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)pcyout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromI2(JNIEnv* km_env, jclass km_clazz, jshort arg_0_sin, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)arg_0_sin, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_sin;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromUdate(JNIEnv* km_env, jclass km_clazz, jlong pudatein, jint dwflags, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUdate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pudatein, (uint32_t)dwflags, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pudatein;
    (void)dwflags;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDateFromUdateEx(JNIEnv* km_env, jclass km_clazz, jlong pudatein, jint lcid, jint dwflags, jlong pdateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDateFromUdateEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pudatein, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pdateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pudatein;
    (void)lcid;
    (void)dwflags;
    (void)pdateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecAbs(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pdecresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecAbs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pdecresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pdecresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecAdd(JNIEnv* km_env, jclass km_clazz, jlong pdecleft, jlong pdecright, jlong pdecresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecAdd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecleft, (void*)(uintptr_t)pdecright, (void*)(uintptr_t)pdecresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecleft;
    (void)pdecright;
    (void)pdecresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecCmp(JNIEnv* km_env, jclass km_clazz, jlong pdecleft, jlong pdecright) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecCmp");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecleft, (void*)(uintptr_t)pdecright);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdecleft;
    (void)pdecright;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecCmpR8(JNIEnv* km_env, jclass km_clazz, jlong pdecleft, jdouble dblright) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecCmpR8");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecleft, (double)dblright);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdecleft;
    (void)dblright;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecDiv(JNIEnv* km_env, jclass km_clazz, jlong pdecleft, jlong pdecright, jlong pdecresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecDiv");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecleft, (void*)(uintptr_t)pdecright, (void*)(uintptr_t)pdecresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecleft;
    (void)pdecright;
    (void)pdecresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFix(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pdecresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pdecresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pdecresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)uiin, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecFromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong pdecout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecFromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (void*)(uintptr_t)pdecout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)pdecout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecInt(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pdecresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecInt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pdecresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pdecresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecMul(JNIEnv* km_env, jclass km_clazz, jlong pdecleft, jlong pdecright, jlong pdecresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecMul");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecleft, (void*)(uintptr_t)pdecright, (void*)(uintptr_t)pdecresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecleft;
    (void)pdecright;
    (void)pdecresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecNeg(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pdecresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecNeg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pdecresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pdecresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecRound(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jint cdecimals, jlong pdecresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecRound");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (int32_t)cdecimals, (void*)(uintptr_t)pdecresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)cdecimals;
    (void)pdecresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDecSub(JNIEnv* km_env, jclass km_clazz, jlong pdecleft, jlong pdecright, jlong pdecresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDecSub");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecleft, (void*)(uintptr_t)pdecright, (void*)(uintptr_t)pdecresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecleft;
    (void)pdecright;
    (void)pdecresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varDiv(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarDiv");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varEqv(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarEqv");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varFix(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varFormat(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jlong pstrformat, jint ifirstday, jint ifirstweek, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (void*)(uintptr_t)pstrformat, (int32_t)ifirstday, (int32_t)ifirstweek, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)pstrformat;
    (void)ifirstday;
    (void)ifirstweek;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varFormatCurrency(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jint inumdig, jint iinclead, jint iuseparens, jint igroup, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormatCurrency");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (int32_t)inumdig, (int32_t)iinclead, (int32_t)iuseparens, (int32_t)igroup, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)inumdig;
    (void)iinclead;
    (void)iuseparens;
    (void)igroup;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varFormatDateTime(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jint inamedformat, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormatDateTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (int32_t)inamedformat, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)inamedformat;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varFormatFromTokens(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jlong pstrformat, jlong pbtokcur, jint dwflags, jlong pbstrout, jint lcid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormatFromTokens");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (void*)(uintptr_t)pstrformat, (void*)(uintptr_t)pbtokcur, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout, (uint32_t)lcid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)pstrformat;
    (void)pbtokcur;
    (void)dwflags;
    (void)pbstrout;
    (void)lcid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varFormatNumber(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jint inumdig, jint iinclead, jint iuseparens, jint igroup, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormatNumber");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (int32_t)inumdig, (int32_t)iinclead, (int32_t)iuseparens, (int32_t)igroup, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)inumdig;
    (void)iinclead;
    (void)iuseparens;
    (void)igroup;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varFormatPercent(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jint inumdig, jint iinclead, jint iuseparens, jint igroup, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarFormatPercent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (int32_t)inumdig, (int32_t)iinclead, (int32_t)iuseparens, (int32_t)igroup, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)inumdig;
    (void)iinclead;
    (void)iuseparens;
    (void)igroup;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)uiin, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI1FromUI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong pcout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI1FromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)i64in, (void*)(uintptr_t)pcout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)pcout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI2FromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong psout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI2FromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (void*)(uintptr_t)psout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)psout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromI2(JNIEnv* km_env, jclass km_clazz, jshort arg_0_sin, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)arg_0_sin, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_sin;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI4FromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI4FromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromI2(JNIEnv* km_env, jclass km_clazz, jshort arg_0_sin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)arg_0_sin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_sin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varI8FromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarI8FromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varIdiv(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarIdiv");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varImp(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarImp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varInt(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarInt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varMod(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarMod");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varMonthName(JNIEnv* km_env, jclass km_clazz, jint imonth, jint fabbrev, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarMonthName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)imonth, (int32_t)fabbrev, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)imonth;
    (void)fabbrev;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varMul(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarMul");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varNeg(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarNeg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varNot(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarNot");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varNumFromParseNum(JNIEnv* km_env, jclass km_clazz, jlong pnumprs, jlong rgbdig, jint dwvtbits, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarNumFromParseNum");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pnumprs, (void*)(uintptr_t)rgbdig, (uint32_t)dwvtbits, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pnumprs;
    (void)rgbdig;
    (void)dwvtbits;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varOr(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarOr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varParseNumFromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pnumprs, jlong rgbdig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarParseNumFromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pnumprs, (void*)(uintptr_t)rgbdig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pnumprs;
    (void)rgbdig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varPow(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarPow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4CmpR8(JNIEnv* km_env, jclass km_clazz, jfloat fltleft, jdouble dblright) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(float, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4CmpR8");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltleft, (double)dblright);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)fltleft;
    (void)dblright;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromI2(JNIEnv* km_env, jclass km_clazz, jshort arg_0_sin, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)arg_0_sin, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_sin;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR4FromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong pfltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR4FromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (void*)(uintptr_t)pfltout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)pfltout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromI2(JNIEnv* km_env, jclass km_clazz, jshort arg_0_sin, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)arg_0_sin, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_sin;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8FromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong pdblout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8FromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (void*)(uintptr_t)pdblout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)pdblout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8Pow(JNIEnv* km_env, jclass km_clazz, jdouble dblleft, jdouble dblright, jlong pdblresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8Pow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblleft, (double)dblright, (void*)(uintptr_t)pdblresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblleft;
    (void)dblright;
    (void)pdblresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varR8Round(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jint cdecimals, jlong pdblresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarR8Round");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (int32_t)cdecimals, (void*)(uintptr_t)pdblresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)cdecimals;
    (void)pdblresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varRound(JNIEnv* km_env, jclass km_clazz, jlong pvarin, jint cdecimals, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarRound");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarin, (int32_t)cdecimals, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarin;
    (void)cdecimals;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varSub(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarSub");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varTokenizeFormatString(JNIEnv* km_env, jclass km_clazz, jlong pstrformat, jlong rgbtok, jint cbtok, jint ifirstday, jint ifirstweek, jint lcid, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarTokenizeFormatString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstrformat, (void*)(uintptr_t)rgbtok, (int32_t)cbtok, (int32_t)ifirstday, (int32_t)ifirstweek, (uint32_t)lcid, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstrformat;
    (void)rgbtok;
    (void)cbtok;
    (void)ifirstday;
    (void)ifirstweek;
    (void)lcid;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromI2(JNIEnv* km_env, jclass km_clazz, jshort arg_0_sin, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)arg_0_sin, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_sin;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI1FromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong pbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI1FromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (void*)(uintptr_t)pbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)pbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)uiin, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI2FromUI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong puiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI2FromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)i64in, (void*)(uintptr_t)puiout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)puiout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)uiin, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromI4(JNIEnv* km_env, jclass km_clazz, jint lin, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)lin, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lin;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromI8(JNIEnv* km_env, jclass km_clazz, jlong i64in, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)i64in, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)i64in;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pulout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pulout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pulout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI4FromUI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong plout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI4FromUI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ui64in, (void*)(uintptr_t)plout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)plout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromBool(JNIEnv* km_env, jclass km_clazz, jshort boolin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)boolin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boolin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromDec(JNIEnv* km_env, jclass km_clazz, jlong pdecin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromDec");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromDisp(JNIEnv* km_env, jclass km_clazz, jlong pdispin, jint lcid, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromDisp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdispin, (uint32_t)lcid, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdispin;
    (void)lcid;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromI1(JNIEnv* km_env, jclass km_clazz, jbyte cin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)cin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromI2(JNIEnv* km_env, jclass km_clazz, jshort arg_0_sin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int16_t)arg_0_sin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_sin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromI8(JNIEnv* km_env, jclass km_clazz, jlong ui64in, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromI8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)ui64in, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ui64in;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromR4(JNIEnv* km_env, jclass km_clazz, jfloat fltin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromR4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromR8(JNIEnv* km_env, jclass km_clazz, jdouble dblin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromR8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)dblin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dblin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromStr(JNIEnv* km_env, jclass km_clazz, jlong strin, jint lcid, jint dwflags, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)strin, (uint32_t)lcid, (uint32_t)dwflags, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)strin;
    (void)lcid;
    (void)dwflags;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromUI1(JNIEnv* km_env, jclass km_clazz, jbyte bin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromUI1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)bin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromUI2(JNIEnv* km_env, jclass km_clazz, jshort uiin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromUI2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)uiin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uiin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUI8FromUI4(JNIEnv* km_env, jclass km_clazz, jint ulin, jlong pi64out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUI8FromUI4");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulin, (void*)(uintptr_t)pi64out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ulin;
    (void)pi64out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varUdateFromDate(JNIEnv* km_env, jclass km_clazz, jdouble datein, jint dwflags, jlong pudateout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarUdateFromDate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)datein, (uint32_t)dwflags, (void*)(uintptr_t)pudateout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datein;
    (void)dwflags;
    (void)pudateout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varWeekdayName(JNIEnv* km_env, jclass km_clazz, jint iweekday, jint fabbrev, jint ifirstday, jint dwflags, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarWeekdayName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)iweekday, (int32_t)fabbrev, (int32_t)ifirstday, (uint32_t)dwflags, (void*)(uintptr_t)pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)iweekday;
    (void)fabbrev;
    (void)ifirstday;
    (void)dwflags;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1varXor(JNIEnv* km_env, jclass km_clazz, jlong pvarleft, jlong pvarright, jlong pvarresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VarXor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarleft, (void*)(uintptr_t)pvarright, (void*)(uintptr_t)pvarresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarleft;
    (void)pvarright;
    (void)pvarresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_ole_WindowsWin32SystemOleJniBridge_windowssys_1windows_1win32_1system_1ole_1vectorFromBstr(JNIEnv* km_env, jclass km_clazz, jlong bstr, jlong ppsa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VectorFromBstr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bstr, (void*)(uintptr_t)ppsa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bstr;
    (void)ppsa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

