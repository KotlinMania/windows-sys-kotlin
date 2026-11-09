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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsBuildEnumerator(JNIEnv* km_env, jclass km_clazz, jlong padscontainer, jlong ppenumvariant) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsBuildEnumerator");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)padscontainer, (void*)(uintptr_t)ppenumvariant) : -1;
#else
    (void)padscontainer;
    (void)ppenumvariant;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsBuildVarArrayInt(JNIEnv* km_env, jclass km_clazz, jlong lpdwobjecttypes, jint dwobjecttypes, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsBuildVarArrayInt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwobjecttypes, (uint32_t)dwobjecttypes, (void*)(uintptr_t)pvar) : -1;
#else
    (void)lpdwobjecttypes;
    (void)dwobjecttypes;
    (void)pvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsBuildVarArrayStr(JNIEnv* km_env, jclass km_clazz, jlong lpppathnames, jint dwpathnames, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsBuildVarArrayStr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpppathnames, (uint32_t)dwpathnames, (void*)(uintptr_t)pvar) : -1;
#else
    (void)lpppathnames;
    (void)dwpathnames;
    (void)pvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsDecodeBinaryData(JNIEnv* km_env, jclass km_clazz, jlong szsrcdata, jlong ppbdestdata, jlong pdwdestlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsDecodeBinaryData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szsrcdata, (void*)(uintptr_t)ppbdestdata, (void*)(uintptr_t)pdwdestlen) : -1;
#else
    (void)szsrcdata;
    (void)ppbdestdata;
    (void)pdwdestlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsEncodeBinaryData(JNIEnv* km_env, jclass km_clazz, jlong pbsrcdata, jint dwsrclen, jlong ppszdestdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsEncodeBinaryData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbsrcdata, (uint32_t)dwsrclen, (void*)(uintptr_t)ppszdestdata) : -1;
#else
    (void)pbsrcdata;
    (void)dwsrclen;
    (void)ppszdestdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsEnumerateNext(JNIEnv* km_env, jclass km_clazz, jlong penumvariant, jint celements, jlong pvar, jlong pcelementsfetched) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsEnumerateNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)penumvariant, (uint32_t)celements, (void*)(uintptr_t)pvar, (void*)(uintptr_t)pcelementsfetched) : -1;
#else
    (void)penumvariant;
    (void)celements;
    (void)pvar;
    (void)pcelementsfetched;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsFreeEnumerator(JNIEnv* km_env, jclass km_clazz, jlong penumvariant) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsFreeEnumerator");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)penumvariant) : -1;
#else
    (void)penumvariant;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsGetLastError(JNIEnv* km_env, jclass km_clazz, jlong lperror, jlong lperrorbuf, jint dwerrorbuflen, jlong lpnamebuf, jint dwnamebuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsGetLastError");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lperror, (void*)(uintptr_t)lperrorbuf, (uint32_t)dwerrorbuflen, (void*)(uintptr_t)lpnamebuf, (uint32_t)dwnamebuflen) : -1;
#else
    (void)lperror;
    (void)lperrorbuf;
    (void)dwerrorbuflen;
    (void)lpnamebuf;
    (void)dwnamebuflen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsGetObject(JNIEnv* km_env, jclass km_clazz, jlong lpszpathname, jlong riid, jlong ppobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsGetObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszpathname, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppobject) : -1;
#else
    (void)lpszpathname;
    (void)riid;
    (void)ppobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsOpenObject(JNIEnv* km_env, jclass km_clazz, jlong lpszpathname, jlong lpszusername, jlong lpszpassword, jint dwreserved, jlong riid, jlong ppobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsOpenObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszpathname, (void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszpassword, (uint32_t)dwreserved, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppobject) : -1;
#else
    (void)lpszpathname;
    (void)lpszusername;
    (void)lpszpassword;
    (void)dwreserved;
    (void)riid;
    (void)ppobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsPropCheckIfWritable(JNIEnv* km_env, jclass km_clazz, jlong pwzattr, jlong pwritableattrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropCheckIfWritable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzattr, (void*)(uintptr_t)pwritableattrs) : -1;
#else
    (void)pwzattr;
    (void)pwritableattrs;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsPropCreateNotifyObj(JNIEnv* km_env, jclass km_clazz, jlong pappthddataobj, jlong pwzadsobjname, jlong phnotifyobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropCreateNotifyObj");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pappthddataobj, (void*)(uintptr_t)pwzadsobjname, (void*)(uintptr_t)phnotifyobj) : -1;
#else
    (void)pappthddataobj;
    (void)pwzadsobjname;
    (void)phnotifyobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsPropGetInitInfo(JNIEnv* km_env, jclass km_clazz, jlong hnotifyobj, jlong pinitparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropGetInitInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnotifyobj, (void*)(uintptr_t)pinitparams) : -1;
#else
    (void)hnotifyobj;
    (void)pinitparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsPropSendErrorMessage(JNIEnv* km_env, jclass km_clazz, jlong hnotifyobj, jlong perror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropSendErrorMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnotifyobj, (void*)(uintptr_t)perror) : -1;
#else
    (void)hnotifyobj;
    (void)perror;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsPropSetHwnd(JNIEnv* km_env, jclass km_clazz, jlong hnotifyobj, jlong hpage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropSetHwnd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnotifyobj, (void*)(uintptr_t)hpage) : -1;
#else
    (void)hnotifyobj;
    (void)hpage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsPropSetHwndWithTitle(JNIEnv* km_env, jclass km_clazz, jlong hnotifyobj, jlong hpage, jlong ptztitle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropSetHwndWithTitle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnotifyobj, (void*)(uintptr_t)hpage, (void*)(uintptr_t)ptztitle) : -1;
#else
    (void)hnotifyobj;
    (void)hpage;
    (void)ptztitle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsPropShowErrorDialog(JNIEnv* km_env, jclass km_clazz, jlong hnotifyobj, jlong hpage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropShowErrorDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnotifyobj, (void*)(uintptr_t)hpage) : -1;
#else
    (void)hnotifyobj;
    (void)hpage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ADsSetLastError(JNIEnv* km_env, jclass km_clazz, jint dwerr, jlong pszerror, jlong pszprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsSetLastError");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)dwerr, (void*)(uintptr_t)pszerror, (void*)(uintptr_t)pszprovider);
#else
    (void)dwerr;
    (void)pszerror;
    (void)pszprovider;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1AdsFreeAdsValues(JNIEnv* km_env, jclass km_clazz, jlong padsvalues, jint dwnumvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdsFreeAdsValues");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)padsvalues, (uint32_t)dwnumvalues);
#else
    (void)padsvalues;
    (void)dwnumvalues;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1AdsTypeToPropVariant(JNIEnv* km_env, jclass km_clazz, jlong padsvalues, jint dwnumvalues, jlong pvariant) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdsTypeToPropVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)padsvalues, (uint32_t)dwnumvalues, (void*)(uintptr_t)pvariant) : -1;
#else
    (void)padsvalues;
    (void)dwnumvalues;
    (void)pvariant;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1AllocADsMem(JNIEnv* km_env, jclass km_clazz, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocADsMem");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cb) : NULL;
#else
    (void)cb;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1AllocADsStr(JNIEnv* km_env, jclass km_clazz, jlong pstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocADsStr");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstr) : NULL;
#else
    (void)pstr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1BinarySDToSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong pvarsec, jlong pszservername, jlong username, jlong password, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BinarySDToSecurityDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)pvarsec, (void*)(uintptr_t)pszservername, (void*)(uintptr_t)username, (void*)(uintptr_t)password, (uint32_t)dwflags) : -1;
#else
    (void)psecuritydescriptor;
    (void)pvarsec;
    (void)pszservername;
    (void)username;
    (void)password;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsAddSidHistoryA(JNIEnv* km_env, jclass km_clazz, jlong hds, jint flags, jlong srcdomain, jlong srcprincipal, jlong srcdomaincontroller, jlong srcdomaincreds, jlong dstdomain, jlong dstprincipal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddSidHistoryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (uint32_t)flags, (void*)(uintptr_t)srcdomain, (void*)(uintptr_t)srcprincipal, (void*)(uintptr_t)srcdomaincontroller, (void*)(uintptr_t)srcdomaincreds, (void*)(uintptr_t)dstdomain, (void*)(uintptr_t)dstprincipal) : 0;
#else
    (void)hds;
    (void)flags;
    (void)srcdomain;
    (void)srcprincipal;
    (void)srcdomaincontroller;
    (void)srcdomaincreds;
    (void)dstdomain;
    (void)dstprincipal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsAddSidHistoryW(JNIEnv* km_env, jclass km_clazz, jlong hds, jint flags, jlong srcdomain, jlong srcprincipal, jlong srcdomaincontroller, jlong srcdomaincreds, jlong dstdomain, jlong dstprincipal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddSidHistoryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (uint32_t)flags, (void*)(uintptr_t)srcdomain, (void*)(uintptr_t)srcprincipal, (void*)(uintptr_t)srcdomaincontroller, (void*)(uintptr_t)srcdomaincreds, (void*)(uintptr_t)dstdomain, (void*)(uintptr_t)dstprincipal) : 0;
#else
    (void)hds;
    (void)flags;
    (void)srcdomain;
    (void)srcprincipal;
    (void)srcdomaincontroller;
    (void)srcdomaincreds;
    (void)dstdomain;
    (void)dstprincipal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsAddressToSiteNamesA(JNIEnv* km_env, jclass km_clazz, jlong computername, jint entrycount, jlong socketaddresses, jlong sitenames) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddressToSiteNamesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computername, (uint32_t)entrycount, (void*)(uintptr_t)socketaddresses, (void*)(uintptr_t)sitenames) : 0;
#else
    (void)computername;
    (void)entrycount;
    (void)socketaddresses;
    (void)sitenames;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsAddressToSiteNamesExA(JNIEnv* km_env, jclass km_clazz, jlong computername, jint entrycount, jlong socketaddresses, jlong sitenames, jlong subnetnames) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddressToSiteNamesExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computername, (uint32_t)entrycount, (void*)(uintptr_t)socketaddresses, (void*)(uintptr_t)sitenames, (void*)(uintptr_t)subnetnames) : 0;
#else
    (void)computername;
    (void)entrycount;
    (void)socketaddresses;
    (void)sitenames;
    (void)subnetnames;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsAddressToSiteNamesExW(JNIEnv* km_env, jclass km_clazz, jlong computername, jint entrycount, jlong socketaddresses, jlong sitenames, jlong subnetnames) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddressToSiteNamesExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computername, (uint32_t)entrycount, (void*)(uintptr_t)socketaddresses, (void*)(uintptr_t)sitenames, (void*)(uintptr_t)subnetnames) : 0;
#else
    (void)computername;
    (void)entrycount;
    (void)socketaddresses;
    (void)sitenames;
    (void)subnetnames;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsAddressToSiteNamesW(JNIEnv* km_env, jclass km_clazz, jlong computername, jint entrycount, jlong socketaddresses, jlong sitenames) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddressToSiteNamesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computername, (uint32_t)entrycount, (void*)(uintptr_t)socketaddresses, (void*)(uintptr_t)sitenames) : 0;
#else
    (void)computername;
    (void)entrycount;
    (void)socketaddresses;
    (void)sitenames;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindA(JNIEnv* km_env, jclass km_clazz, jlong domaincontrollername, jlong dnsdomainname, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domaincontrollername, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)phds) : 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindByInstanceA(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong annotation, jlong instanceguid, jlong dnsdomainname, jlong authidentity, jlong serviceprincipalname, jint bindflags, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindByInstanceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)annotation, (void*)(uintptr_t)instanceguid, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)serviceprincipalname, (uint32_t)bindflags, (void*)(uintptr_t)phds) : 0;
#else
    (void)servername;
    (void)annotation;
    (void)instanceguid;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)bindflags;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindByInstanceW(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong annotation, jlong instanceguid, jlong dnsdomainname, jlong authidentity, jlong serviceprincipalname, jint bindflags, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindByInstanceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)annotation, (void*)(uintptr_t)instanceguid, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)serviceprincipalname, (uint32_t)bindflags, (void*)(uintptr_t)phds) : 0;
#else
    (void)servername;
    (void)annotation;
    (void)instanceguid;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)bindflags;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindToISTGA(JNIEnv* km_env, jclass km_clazz, jlong sitename, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindToISTGA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sitename, (void*)(uintptr_t)phds) : 0;
#else
    (void)sitename;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindToISTGW(JNIEnv* km_env, jclass km_clazz, jlong sitename, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindToISTGW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sitename, (void*)(uintptr_t)phds) : 0;
#else
    (void)sitename;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindW(JNIEnv* km_env, jclass km_clazz, jlong domaincontrollername, jlong dnsdomainname, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domaincontrollername, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)phds) : 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindWithCredA(JNIEnv* km_env, jclass km_clazz, jlong domaincontrollername, jlong dnsdomainname, jlong authidentity, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithCredA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domaincontrollername, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)phds) : 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindWithCredW(JNIEnv* km_env, jclass km_clazz, jlong domaincontrollername, jlong dnsdomainname, jlong authidentity, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithCredW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domaincontrollername, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)phds) : 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindWithSpnA(JNIEnv* km_env, jclass km_clazz, jlong domaincontrollername, jlong dnsdomainname, jlong authidentity, jlong serviceprincipalname, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithSpnA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domaincontrollername, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)serviceprincipalname, (void*)(uintptr_t)phds) : 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindWithSpnExA(JNIEnv* km_env, jclass km_clazz, jlong domaincontrollername, jlong dnsdomainname, jlong authidentity, jlong serviceprincipalname, jint bindflags, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithSpnExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domaincontrollername, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)serviceprincipalname, (uint32_t)bindflags, (void*)(uintptr_t)phds) : 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)bindflags;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindWithSpnExW(JNIEnv* km_env, jclass km_clazz, jlong domaincontrollername, jlong dnsdomainname, jlong authidentity, jlong serviceprincipalname, jint bindflags, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithSpnExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domaincontrollername, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)serviceprincipalname, (uint32_t)bindflags, (void*)(uintptr_t)phds) : 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)bindflags;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindWithSpnW(JNIEnv* km_env, jclass km_clazz, jlong domaincontrollername, jlong dnsdomainname, jlong authidentity, jlong serviceprincipalname, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithSpnW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domaincontrollername, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)serviceprincipalname, (void*)(uintptr_t)phds) : 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBindingSetTimeout(JNIEnv* km_env, jclass km_clazz, jlong hds, jint ctimeoutsecs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindingSetTimeout");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (uint32_t)ctimeoutsecs) : 0;
#else
    (void)hds;
    (void)ctimeoutsecs;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBrowseForContainerA(JNIEnv* km_env, jclass km_clazz, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsuiext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBrowseForContainerA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinfo) : -1;
#else
    (void)pinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsBrowseForContainerW(JNIEnv* km_env, jclass km_clazz, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsuiext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBrowseForContainerW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinfo) : -1;
#else
    (void)pinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsClientMakeSpnForTargetServerA(JNIEnv* km_env, jclass km_clazz, jlong serviceclass, jlong servicename, jlong pcspnlength, jlong pszspn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsClientMakeSpnForTargetServerA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (void*)(uintptr_t)pcspnlength, (void*)(uintptr_t)pszspn) : 0;
#else
    (void)serviceclass;
    (void)servicename;
    (void)pcspnlength;
    (void)pszspn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsClientMakeSpnForTargetServerW(JNIEnv* km_env, jclass km_clazz, jlong serviceclass, jlong servicename, jlong pcspnlength, jlong pszspn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsClientMakeSpnForTargetServerW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (void*)(uintptr_t)pcspnlength, (void*)(uintptr_t)pszspn) : 0;
#else
    (void)serviceclass;
    (void)servicename;
    (void)pcspnlength;
    (void)pszspn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsCrackNamesA(JNIEnv* km_env, jclass km_clazz, jlong hds, jint flags, jint formatoffered, jint formatdesired, jint cnames, jlong rpnames, jlong ppresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackNamesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (int32_t)flags, (int32_t)formatoffered, (int32_t)formatdesired, (uint32_t)cnames, (void*)(uintptr_t)rpnames, (void*)(uintptr_t)ppresult) : 0;
#else
    (void)hds;
    (void)flags;
    (void)formatoffered;
    (void)formatdesired;
    (void)cnames;
    (void)rpnames;
    (void)ppresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsCrackNamesW(JNIEnv* km_env, jclass km_clazz, jlong hds, jint flags, jint formatoffered, jint formatdesired, jint cnames, jlong rpnames, jlong ppresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackNamesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (int32_t)flags, (int32_t)formatoffered, (int32_t)formatdesired, (uint32_t)cnames, (void*)(uintptr_t)rpnames, (void*)(uintptr_t)ppresult) : 0;
#else
    (void)hds;
    (void)flags;
    (void)formatoffered;
    (void)formatdesired;
    (void)cnames;
    (void)rpnames;
    (void)ppresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsCrackSpn2A(JNIEnv* km_env, jclass km_clazz, jlong pszspn, jint cspn, jlong pcserviceclass, jlong serviceclass, jlong pcservicename, jlong servicename, jlong pcinstancename, jlong instancename, jlong pinstanceport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpn2A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszspn, (uint32_t)cspn, (void*)(uintptr_t)pcserviceclass, (void*)(uintptr_t)serviceclass, (void*)(uintptr_t)pcservicename, (void*)(uintptr_t)servicename, (void*)(uintptr_t)pcinstancename, (void*)(uintptr_t)instancename, (void*)(uintptr_t)pinstanceport) : 0;
#else
    (void)pszspn;
    (void)cspn;
    (void)pcserviceclass;
    (void)serviceclass;
    (void)pcservicename;
    (void)servicename;
    (void)pcinstancename;
    (void)instancename;
    (void)pinstanceport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsCrackSpn2W(JNIEnv* km_env, jclass km_clazz, jlong pszspn, jint cspn, jlong pcserviceclass, jlong serviceclass, jlong pcservicename, jlong servicename, jlong pcinstancename, jlong instancename, jlong pinstanceport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpn2W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszspn, (uint32_t)cspn, (void*)(uintptr_t)pcserviceclass, (void*)(uintptr_t)serviceclass, (void*)(uintptr_t)pcservicename, (void*)(uintptr_t)servicename, (void*)(uintptr_t)pcinstancename, (void*)(uintptr_t)instancename, (void*)(uintptr_t)pinstanceport) : 0;
#else
    (void)pszspn;
    (void)cspn;
    (void)pcserviceclass;
    (void)serviceclass;
    (void)pcservicename;
    (void)servicename;
    (void)pcinstancename;
    (void)instancename;
    (void)pinstanceport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsCrackSpn3W(JNIEnv* km_env, jclass km_clazz, jlong pszspn, jint cspn, jlong pchostname, jlong hostname, jlong pcinstancename, jlong instancename, jlong pportnumber, jlong pcdomainname, jlong domainname, jlong pcrealmname, jlong realmname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpn3W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszspn, (uint32_t)cspn, (void*)(uintptr_t)pchostname, (void*)(uintptr_t)hostname, (void*)(uintptr_t)pcinstancename, (void*)(uintptr_t)instancename, (void*)(uintptr_t)pportnumber, (void*)(uintptr_t)pcdomainname, (void*)(uintptr_t)domainname, (void*)(uintptr_t)pcrealmname, (void*)(uintptr_t)realmname) : 0;
#else
    (void)pszspn;
    (void)cspn;
    (void)pchostname;
    (void)hostname;
    (void)pcinstancename;
    (void)instancename;
    (void)pportnumber;
    (void)pcdomainname;
    (void)domainname;
    (void)pcrealmname;
    (void)realmname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsCrackSpn4W(JNIEnv* km_env, jclass km_clazz, jlong pszspn, jint cspn, jlong pchostname, jlong hostname, jlong pcinstancename, jlong instancename, jlong pcportname, jlong portname, jlong pcdomainname, jlong domainname, jlong pcrealmname, jlong realmname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpn4W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszspn, (uint32_t)cspn, (void*)(uintptr_t)pchostname, (void*)(uintptr_t)hostname, (void*)(uintptr_t)pcinstancename, (void*)(uintptr_t)instancename, (void*)(uintptr_t)pcportname, (void*)(uintptr_t)portname, (void*)(uintptr_t)pcdomainname, (void*)(uintptr_t)domainname, (void*)(uintptr_t)pcrealmname, (void*)(uintptr_t)realmname) : 0;
#else
    (void)pszspn;
    (void)cspn;
    (void)pchostname;
    (void)hostname;
    (void)pcinstancename;
    (void)instancename;
    (void)pcportname;
    (void)portname;
    (void)pcdomainname;
    (void)domainname;
    (void)pcrealmname;
    (void)realmname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsCrackSpnA(JNIEnv* km_env, jclass km_clazz, jlong pszspn, jlong pcserviceclass, jlong serviceclass, jlong pcservicename, jlong servicename, jlong pcinstancename, jlong instancename, jlong pinstanceport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpnA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszspn, (void*)(uintptr_t)pcserviceclass, (void*)(uintptr_t)serviceclass, (void*)(uintptr_t)pcservicename, (void*)(uintptr_t)servicename, (void*)(uintptr_t)pcinstancename, (void*)(uintptr_t)instancename, (void*)(uintptr_t)pinstanceport) : 0;
#else
    (void)pszspn;
    (void)pcserviceclass;
    (void)serviceclass;
    (void)pcservicename;
    (void)servicename;
    (void)pcinstancename;
    (void)instancename;
    (void)pinstanceport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsCrackSpnW(JNIEnv* km_env, jclass km_clazz, jlong pszspn, jlong pcserviceclass, jlong serviceclass, jlong pcservicename, jlong servicename, jlong pcinstancename, jlong instancename, jlong pinstanceport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpnW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszspn, (void*)(uintptr_t)pcserviceclass, (void*)(uintptr_t)serviceclass, (void*)(uintptr_t)pcservicename, (void*)(uintptr_t)servicename, (void*)(uintptr_t)pcinstancename, (void*)(uintptr_t)instancename, (void*)(uintptr_t)pinstanceport) : 0;
#else
    (void)pszspn;
    (void)pcserviceclass;
    (void)serviceclass;
    (void)pcservicename;
    (void)servicename;
    (void)pcinstancename;
    (void)instancename;
    (void)pinstanceport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsCrackUnquotedMangledRdnA(JNIEnv* km_env, jclass km_clazz, jlong pszrdn, jint cchrdn, jlong pguid, jlong pedsmanglefor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackUnquotedMangledRdnA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszrdn, (uint32_t)cchrdn, (void*)(uintptr_t)pguid, (void*)(uintptr_t)pedsmanglefor) : -1;
#else
    (void)pszrdn;
    (void)cchrdn;
    (void)pguid;
    (void)pedsmanglefor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsCrackUnquotedMangledRdnW(JNIEnv* km_env, jclass km_clazz, jlong pszrdn, jint cchrdn, jlong pguid, jlong pedsmanglefor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackUnquotedMangledRdnW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszrdn, (uint32_t)cchrdn, (void*)(uintptr_t)pguid, (void*)(uintptr_t)pedsmanglefor) : -1;
#else
    (void)pszrdn;
    (void)cchrdn;
    (void)pguid;
    (void)pedsmanglefor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsDeregisterDnsHostRecordsA(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dnsdomainname, jlong domainguid, jlong dsaguid, jlong dnshostname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsDeregisterDnsHostRecordsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)domainguid, (void*)(uintptr_t)dsaguid, (void*)(uintptr_t)dnshostname) : 0;
#else
    (void)servername;
    (void)dnsdomainname;
    (void)domainguid;
    (void)dsaguid;
    (void)dnshostname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsDeregisterDnsHostRecordsW(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dnsdomainname, jlong domainguid, jlong dsaguid, jlong dnshostname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsDeregisterDnsHostRecordsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dnsdomainname, (void*)(uintptr_t)domainguid, (void*)(uintptr_t)dsaguid, (void*)(uintptr_t)dnshostname) : 0;
#else
    (void)servername;
    (void)dnsdomainname;
    (void)domainguid;
    (void)dsaguid;
    (void)dnshostname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsEnumerateDomainTrustsA(JNIEnv* km_env, jclass km_clazz, jlong servername, jint flags, jlong domains, jlong domaincount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsEnumerateDomainTrustsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)flags, (void*)(uintptr_t)domains, (void*)(uintptr_t)domaincount) : 0;
#else
    (void)servername;
    (void)flags;
    (void)domains;
    (void)domaincount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsEnumerateDomainTrustsW(JNIEnv* km_env, jclass km_clazz, jlong servername, jint flags, jlong domains, jlong domaincount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsEnumerateDomainTrustsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)flags, (void*)(uintptr_t)domains, (void*)(uintptr_t)domaincount) : 0;
#else
    (void)servername;
    (void)flags;
    (void)domains;
    (void)domaincount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsFreeDomainControllerInfoA(JNIEnv* km_env, jclass km_clazz, jint infolevel, jint cinfo, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeDomainControllerInfoA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)infolevel, (uint32_t)cinfo, (void*)(uintptr_t)pinfo);
#else
    (void)infolevel;
    (void)cinfo;
    (void)pinfo;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsFreeDomainControllerInfoW(JNIEnv* km_env, jclass km_clazz, jint infolevel, jint cinfo, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeDomainControllerInfoW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)infolevel, (uint32_t)cinfo, (void*)(uintptr_t)pinfo);
#else
    (void)infolevel;
    (void)cinfo;
    (void)pinfo;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsFreeNameResultA(JNIEnv* km_env, jclass km_clazz, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeNameResultA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)presult);
#else
    (void)presult;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsFreeNameResultW(JNIEnv* km_env, jclass km_clazz, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeNameResultW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)presult);
#else
    (void)presult;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsFreePasswordCredentials(JNIEnv* km_env, jclass km_clazz, jlong authidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreePasswordCredentials");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)authidentity);
#else
    (void)authidentity;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsFreeSchemaGuidMapA(JNIEnv* km_env, jclass km_clazz, jlong pguidmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeSchemaGuidMapA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pguidmap);
#else
    (void)pguidmap;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsFreeSchemaGuidMapW(JNIEnv* km_env, jclass km_clazz, jlong pguidmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeSchemaGuidMapW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pguidmap);
#else
    (void)pguidmap;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsFreeSpnArrayA(JNIEnv* km_env, jclass km_clazz, jint cspn, jlong rpszspn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeSpnArrayA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)cspn, (void*)(uintptr_t)rpszspn);
#else
    (void)cspn;
    (void)rpszspn;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsFreeSpnArrayW(JNIEnv* km_env, jclass km_clazz, jint cspn, jlong rpszspn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeSpnArrayW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)cspn, (void*)(uintptr_t)rpszspn);
#else
    (void)cspn;
    (void)rpszspn;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDcCloseW(JNIEnv* km_env, jclass km_clazz, jlong getdccontexthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcCloseW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)getdccontexthandle);
#else
    (void)getdccontexthandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDcNameA(JNIEnv* km_env, jclass km_clazz, jlong computername, jlong domainname, jlong domainguid, jlong sitename, jint flags, jlong domaincontrollerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computername, (void*)(uintptr_t)domainname, (void*)(uintptr_t)domainguid, (void*)(uintptr_t)sitename, (uint32_t)flags, (void*)(uintptr_t)domaincontrollerinfo) : 0;
#else
    (void)computername;
    (void)domainname;
    (void)domainguid;
    (void)sitename;
    (void)flags;
    (void)domaincontrollerinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDcNameW(JNIEnv* km_env, jclass km_clazz, jlong computername, jlong domainname, jlong domainguid, jlong sitename, jint flags, jlong domaincontrollerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computername, (void*)(uintptr_t)domainname, (void*)(uintptr_t)domainguid, (void*)(uintptr_t)sitename, (uint32_t)flags, (void*)(uintptr_t)domaincontrollerinfo) : 0;
#else
    (void)computername;
    (void)domainname;
    (void)domainguid;
    (void)sitename;
    (void)flags;
    (void)domaincontrollerinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDcNextA(JNIEnv* km_env, jclass km_clazz, jlong getdccontexthandle, jlong sockaddresscount, jlong sockaddresses, jlong dnshostname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcNextA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)getdccontexthandle, (void*)(uintptr_t)sockaddresscount, (void*)(uintptr_t)sockaddresses, (void*)(uintptr_t)dnshostname) : 0;
#else
    (void)getdccontexthandle;
    (void)sockaddresscount;
    (void)sockaddresses;
    (void)dnshostname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDcNextW(JNIEnv* km_env, jclass km_clazz, jlong getdccontexthandle, jlong sockaddresscount, jlong sockaddresses, jlong dnshostname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcNextW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)getdccontexthandle, (void*)(uintptr_t)sockaddresscount, (void*)(uintptr_t)sockaddresses, (void*)(uintptr_t)dnshostname) : 0;
#else
    (void)getdccontexthandle;
    (void)sockaddresscount;
    (void)sockaddresses;
    (void)dnshostname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDcOpenA(JNIEnv* km_env, jclass km_clazz, jlong dnsname, jint optionflags, jlong sitename, jlong domainguid, jlong dnsforestname, jint dcflags, jlong retgetdccontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcOpenA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dnsname, (uint32_t)optionflags, (void*)(uintptr_t)sitename, (void*)(uintptr_t)domainguid, (void*)(uintptr_t)dnsforestname, (uint32_t)dcflags, (void*)(uintptr_t)retgetdccontext) : 0;
#else
    (void)dnsname;
    (void)optionflags;
    (void)sitename;
    (void)domainguid;
    (void)dnsforestname;
    (void)dcflags;
    (void)retgetdccontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDcOpenW(JNIEnv* km_env, jclass km_clazz, jlong dnsname, jint optionflags, jlong sitename, jlong domainguid, jlong dnsforestname, jint dcflags, jlong retgetdccontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcOpenW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dnsname, (uint32_t)optionflags, (void*)(uintptr_t)sitename, (void*)(uintptr_t)domainguid, (void*)(uintptr_t)dnsforestname, (uint32_t)dcflags, (void*)(uintptr_t)retgetdccontext) : 0;
#else
    (void)dnsname;
    (void)optionflags;
    (void)sitename;
    (void)domainguid;
    (void)dnsforestname;
    (void)dcflags;
    (void)retgetdccontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDcSiteCoverageA(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong entrycount, jlong sitenames) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcSiteCoverageA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)entrycount, (void*)(uintptr_t)sitenames) : 0;
#else
    (void)servername;
    (void)entrycount;
    (void)sitenames;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDcSiteCoverageW(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong entrycount, jlong sitenames) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcSiteCoverageW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)entrycount, (void*)(uintptr_t)sitenames) : 0;
#else
    (void)servername;
    (void)entrycount;
    (void)sitenames;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDomainControllerInfoA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong domainname, jint infolevel, jlong pcout, jlong ppinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDomainControllerInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)domainname, (uint32_t)infolevel, (void*)(uintptr_t)pcout, (void*)(uintptr_t)ppinfo) : 0;
#else
    (void)hds;
    (void)domainname;
    (void)infolevel;
    (void)pcout;
    (void)ppinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetDomainControllerInfoW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong domainname, jint infolevel, jlong pcout, jlong ppinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDomainControllerInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)domainname, (uint32_t)infolevel, (void*)(uintptr_t)pcout, (void*)(uintptr_t)ppinfo) : 0;
#else
    (void)hds;
    (void)domainname;
    (void)infolevel;
    (void)pcout;
    (void)ppinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetForestTrustInformationW(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong trusteddomainname, jint flags, jlong foresttrustinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetForestTrustInformationW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)trusteddomainname, (uint32_t)flags, (void*)(uintptr_t)foresttrustinfo) : 0;
#else
    (void)servername;
    (void)trusteddomainname;
    (void)flags;
    (void)foresttrustinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetFriendlyClassName(JNIEnv* km_env, jclass km_clazz, jlong pszobjectclass, jlong pszbuffer, jint cchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsuiext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetFriendlyClassName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszobjectclass, (void*)(uintptr_t)pszbuffer, (uint32_t)cchbuffer) : -1;
#else
    (void)pszobjectclass;
    (void)pszbuffer;
    (void)cchbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetIcon(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pszobjectclass, jint cximage, jint cyimage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsuiext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetIcon");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pszobjectclass, (int32_t)cximage, (int32_t)cyimage) : NULL;
#else
    (void)dwflags;
    (void)pszobjectclass;
    (void)cximage;
    (void)cyimage;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetRdnW(JNIEnv* km_env, jclass km_clazz, jlong ppdn, jlong pcdn, jlong ppkey, jlong pckey, jlong ppval, jlong pcval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetRdnW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppdn, (void*)(uintptr_t)pcdn, (void*)(uintptr_t)ppkey, (void*)(uintptr_t)pckey, (void*)(uintptr_t)ppval, (void*)(uintptr_t)pcval) : 0;
#else
    (void)ppdn;
    (void)pcdn;
    (void)ppkey;
    (void)pckey;
    (void)ppval;
    (void)pcval;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetSiteNameA(JNIEnv* km_env, jclass km_clazz, jlong computername, jlong sitename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetSiteNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computername, (void*)(uintptr_t)sitename) : 0;
#else
    (void)computername;
    (void)sitename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetSiteNameW(JNIEnv* km_env, jclass km_clazz, jlong computername, jlong sitename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetSiteNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computername, (void*)(uintptr_t)sitename) : 0;
#else
    (void)computername;
    (void)sitename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetSpnA(JNIEnv* km_env, jclass km_clazz, jint servicetype, jlong serviceclass, jlong servicename, jshort instanceport, jshort cinstancenames, jlong pinstancenames, jlong pinstanceports, jlong pcspn, jlong prpszspn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint16_t, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetSpnA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)servicetype, (void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (uint16_t)instanceport, (uint16_t)cinstancenames, (void*)(uintptr_t)pinstancenames, (void*)(uintptr_t)pinstanceports, (void*)(uintptr_t)pcspn, (void*)(uintptr_t)prpszspn) : 0;
#else
    (void)servicetype;
    (void)serviceclass;
    (void)servicename;
    (void)instanceport;
    (void)cinstancenames;
    (void)pinstancenames;
    (void)pinstanceports;
    (void)pcspn;
    (void)prpszspn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsGetSpnW(JNIEnv* km_env, jclass km_clazz, jint servicetype, jlong serviceclass, jlong servicename, jshort instanceport, jshort cinstancenames, jlong pinstancenames, jlong pinstanceports, jlong pcspn, jlong prpszspn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint16_t, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetSpnW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)servicetype, (void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (uint16_t)instanceport, (uint16_t)cinstancenames, (void*)(uintptr_t)pinstancenames, (void*)(uintptr_t)pinstanceports, (void*)(uintptr_t)pcspn, (void*)(uintptr_t)prpszspn) : 0;
#else
    (void)servicetype;
    (void)serviceclass;
    (void)servicename;
    (void)instanceport;
    (void)cinstancenames;
    (void)pinstancenames;
    (void)pinstanceports;
    (void)pcspn;
    (void)prpszspn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsInheritSecurityIdentityA(JNIEnv* km_env, jclass km_clazz, jlong hds, jint flags, jlong srcprincipal, jlong dstprincipal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsInheritSecurityIdentityA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (uint32_t)flags, (void*)(uintptr_t)srcprincipal, (void*)(uintptr_t)dstprincipal) : 0;
#else
    (void)hds;
    (void)flags;
    (void)srcprincipal;
    (void)dstprincipal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsInheritSecurityIdentityW(JNIEnv* km_env, jclass km_clazz, jlong hds, jint flags, jlong srcprincipal, jlong dstprincipal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsInheritSecurityIdentityW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (uint32_t)flags, (void*)(uintptr_t)srcprincipal, (void*)(uintptr_t)dstprincipal) : 0;
#else
    (void)hds;
    (void)flags;
    (void)srcprincipal;
    (void)dstprincipal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsIsMangledDnA(JNIEnv* km_env, jclass km_clazz, jlong pszdn, jint edsmanglefor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsIsMangledDnA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdn, (int32_t)edsmanglefor) : -1;
#else
    (void)pszdn;
    (void)edsmanglefor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsIsMangledDnW(JNIEnv* km_env, jclass km_clazz, jlong pszdn, jint edsmanglefor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsIsMangledDnW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdn, (int32_t)edsmanglefor) : -1;
#else
    (void)pszdn;
    (void)edsmanglefor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsIsMangledRdnValueA(JNIEnv* km_env, jclass km_clazz, jlong pszrdn, jint crdn, jint edsmanglefordesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsIsMangledRdnValueA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszrdn, (uint32_t)crdn, (int32_t)edsmanglefordesired) : -1;
#else
    (void)pszrdn;
    (void)crdn;
    (void)edsmanglefordesired;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsIsMangledRdnValueW(JNIEnv* km_env, jclass km_clazz, jlong pszrdn, jint crdn, jint edsmanglefordesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsIsMangledRdnValueW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszrdn, (uint32_t)crdn, (int32_t)edsmanglefordesired) : -1;
#else
    (void)pszrdn;
    (void)crdn;
    (void)edsmanglefordesired;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListDomainsInSiteA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong site, jlong ppdomains) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListDomainsInSiteA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)site, (void*)(uintptr_t)ppdomains) : 0;
#else
    (void)hds;
    (void)site;
    (void)ppdomains;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListDomainsInSiteW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong site, jlong ppdomains) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListDomainsInSiteW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)site, (void*)(uintptr_t)ppdomains) : 0;
#else
    (void)hds;
    (void)site;
    (void)ppdomains;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListInfoForServerA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong server, jlong ppinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListInfoForServerA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)server, (void*)(uintptr_t)ppinfo) : 0;
#else
    (void)hds;
    (void)server;
    (void)ppinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListInfoForServerW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong server, jlong ppinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListInfoForServerW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)server, (void*)(uintptr_t)ppinfo) : 0;
#else
    (void)hds;
    (void)server;
    (void)ppinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListRolesA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong pproles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListRolesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)pproles) : 0;
#else
    (void)hds;
    (void)pproles;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListRolesW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong pproles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListRolesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)pproles) : 0;
#else
    (void)hds;
    (void)pproles;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListServersForDomainInSiteA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong domain, jlong site, jlong ppservers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListServersForDomainInSiteA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)domain, (void*)(uintptr_t)site, (void*)(uintptr_t)ppservers) : 0;
#else
    (void)hds;
    (void)domain;
    (void)site;
    (void)ppservers;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListServersForDomainInSiteW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong domain, jlong site, jlong ppservers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListServersForDomainInSiteW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)domain, (void*)(uintptr_t)site, (void*)(uintptr_t)ppservers) : 0;
#else
    (void)hds;
    (void)domain;
    (void)site;
    (void)ppservers;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListServersInSiteA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong site, jlong ppservers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListServersInSiteA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)site, (void*)(uintptr_t)ppservers) : 0;
#else
    (void)hds;
    (void)site;
    (void)ppservers;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListServersInSiteW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong site, jlong ppservers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListServersInSiteW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)site, (void*)(uintptr_t)ppservers) : 0;
#else
    (void)hds;
    (void)site;
    (void)ppservers;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListSitesA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong ppsites) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListSitesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)ppsites) : 0;
#else
    (void)hds;
    (void)ppsites;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsListSitesW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong ppsites) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListSitesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)ppsites) : 0;
#else
    (void)hds;
    (void)ppsites;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsMakePasswordCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong user, jlong domain, jlong password, jlong pauthidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMakePasswordCredentialsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (void*)(uintptr_t)domain, (void*)(uintptr_t)password, (void*)(uintptr_t)pauthidentity) : 0;
#else
    (void)user;
    (void)domain;
    (void)password;
    (void)pauthidentity;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsMakePasswordCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong user, jlong domain, jlong password, jlong pauthidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMakePasswordCredentialsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (void*)(uintptr_t)domain, (void*)(uintptr_t)password, (void*)(uintptr_t)pauthidentity) : 0;
#else
    (void)user;
    (void)domain;
    (void)password;
    (void)pauthidentity;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsMakeSpnA(JNIEnv* km_env, jclass km_clazz, jlong serviceclass, jlong servicename, jlong instancename, jshort instanceport, jlong referrer, jlong pcspnlength, jlong pszspn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMakeSpnA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (void*)(uintptr_t)instancename, (uint16_t)instanceport, (void*)(uintptr_t)referrer, (void*)(uintptr_t)pcspnlength, (void*)(uintptr_t)pszspn) : 0;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)pcspnlength;
    (void)pszspn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsMakeSpnW(JNIEnv* km_env, jclass km_clazz, jlong serviceclass, jlong servicename, jlong instancename, jshort instanceport, jlong referrer, jlong pcspnlength, jlong pszspn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMakeSpnW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (void*)(uintptr_t)instancename, (uint16_t)instanceport, (void*)(uintptr_t)referrer, (void*)(uintptr_t)pcspnlength, (void*)(uintptr_t)pszspn) : 0;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)pcspnlength;
    (void)pszspn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsMapSchemaGuidsA(JNIEnv* km_env, jclass km_clazz, jlong hds, jint cguids, jlong rguids, jlong ppguidmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMapSchemaGuidsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (uint32_t)cguids, (void*)(uintptr_t)rguids, (void*)(uintptr_t)ppguidmap) : 0;
#else
    (void)hds;
    (void)cguids;
    (void)rguids;
    (void)ppguidmap;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsMapSchemaGuidsW(JNIEnv* km_env, jclass km_clazz, jlong hds, jint cguids, jlong rguids, jlong ppguidmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMapSchemaGuidsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (uint32_t)cguids, (void*)(uintptr_t)rguids, (void*)(uintptr_t)ppguidmap) : 0;
#else
    (void)hds;
    (void)cguids;
    (void)rguids;
    (void)ppguidmap;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsMergeForestTrustInformationW(JNIEnv* km_env, jclass km_clazz, jlong domainname, jlong newforesttrustinfo, jlong oldforesttrustinfo, jlong mergedforesttrustinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMergeForestTrustInformationW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domainname, (void*)(uintptr_t)newforesttrustinfo, (void*)(uintptr_t)oldforesttrustinfo, (void*)(uintptr_t)mergedforesttrustinfo) : 0;
#else
    (void)domainname;
    (void)newforesttrustinfo;
    (void)oldforesttrustinfo;
    (void)mergedforesttrustinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsQuerySitesByCostA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong pszfromsite, jlong rgsztosites, jint ctosites, jint dwflags, jlong prgsiteinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsQuerySitesByCostA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)pszfromsite, (void*)(uintptr_t)rgsztosites, (uint32_t)ctosites, (uint32_t)dwflags, (void*)(uintptr_t)prgsiteinfo) : 0;
#else
    (void)hds;
    (void)pszfromsite;
    (void)rgsztosites;
    (void)ctosites;
    (void)dwflags;
    (void)prgsiteinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsQuerySitesByCostW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong pwszfromsite, jlong rgwsztosites, jint ctosites, jint dwflags, jlong prgsiteinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsQuerySitesByCostW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)pwszfromsite, (void*)(uintptr_t)rgwsztosites, (uint32_t)ctosites, (uint32_t)dwflags, (void*)(uintptr_t)prgsiteinfo) : 0;
#else
    (void)hds;
    (void)pwszfromsite;
    (void)rgwsztosites;
    (void)ctosites;
    (void)dwflags;
    (void)prgsiteinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsQuerySitesFree(JNIEnv* km_env, jclass km_clazz, jlong rgsiteinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsQuerySitesFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)rgsiteinfo);
#else
    (void)rgsiteinfo;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsQuoteRdnValueA(JNIEnv* km_env, jclass km_clazz, jint cunquotedrdnvaluelength, jlong psunquotedrdnvalue, jlong pcquotedrdnvaluelength, jlong psquotedrdnvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsQuoteRdnValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cunquotedrdnvaluelength, (void*)(uintptr_t)psunquotedrdnvalue, (void*)(uintptr_t)pcquotedrdnvaluelength, (void*)(uintptr_t)psquotedrdnvalue) : 0;
#else
    (void)cunquotedrdnvaluelength;
    (void)psunquotedrdnvalue;
    (void)pcquotedrdnvaluelength;
    (void)psquotedrdnvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsQuoteRdnValueW(JNIEnv* km_env, jclass km_clazz, jint cunquotedrdnvaluelength, jlong psunquotedrdnvalue, jlong pcquotedrdnvaluelength, jlong psquotedrdnvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsQuoteRdnValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cunquotedrdnvaluelength, (void*)(uintptr_t)psunquotedrdnvalue, (void*)(uintptr_t)pcquotedrdnvaluelength, (void*)(uintptr_t)psquotedrdnvalue) : 0;
#else
    (void)cunquotedrdnvaluelength;
    (void)psunquotedrdnvalue;
    (void)pcquotedrdnvaluelength;
    (void)psquotedrdnvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsRemoveDsDomainA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong domaindn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRemoveDsDomainA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)domaindn) : 0;
#else
    (void)hds;
    (void)domaindn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsRemoveDsDomainW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong domaindn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRemoveDsDomainW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)domaindn) : 0;
#else
    (void)hds;
    (void)domaindn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsRemoveDsServerA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong serverdn, jlong domaindn, jlong flastdcindomain, jint fcommit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRemoveDsServerA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)serverdn, (void*)(uintptr_t)domaindn, (void*)(uintptr_t)flastdcindomain, (int32_t)fcommit) : 0;
#else
    (void)hds;
    (void)serverdn;
    (void)domaindn;
    (void)flastdcindomain;
    (void)fcommit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsRemoveDsServerW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong serverdn, jlong domaindn, jlong flastdcindomain, jint fcommit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRemoveDsServerW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)serverdn, (void*)(uintptr_t)domaindn, (void*)(uintptr_t)flastdcindomain, (int32_t)fcommit) : 0;
#else
    (void)hds;
    (void)serverdn;
    (void)domaindn;
    (void)flastdcindomain;
    (void)fcommit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaAddA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong sourcedsadn, jlong transportdn, jlong sourcedsaaddress, jlong pschedule, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaAddA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)sourcedsadn, (void*)(uintptr_t)transportdn, (void*)(uintptr_t)sourcedsaaddress, (void*)(uintptr_t)pschedule, (uint32_t)options) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)sourcedsadn;
    (void)transportdn;
    (void)sourcedsaaddress;
    (void)pschedule;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaAddW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong sourcedsadn, jlong transportdn, jlong sourcedsaaddress, jlong pschedule, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaAddW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)sourcedsadn, (void*)(uintptr_t)transportdn, (void*)(uintptr_t)sourcedsaaddress, (void*)(uintptr_t)pschedule, (uint32_t)options) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)sourcedsadn;
    (void)transportdn;
    (void)sourcedsaaddress;
    (void)pschedule;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaConsistencyCheck(JNIEnv* km_env, jclass km_clazz, jlong hds, jint taskid, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaConsistencyCheck");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (int32_t)taskid, (uint32_t)dwflags) : 0;
#else
    (void)hds;
    (void)taskid;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaDelA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong dsasrc, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaDelA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)dsasrc, (uint32_t)options) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)dsasrc;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaDelW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong dsasrc, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaDelW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)dsasrc, (uint32_t)options) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)dsasrc;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaFreeInfo(JNIEnv* km_env, jclass km_clazz, jint infotype, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaFreeInfo");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)infotype, (void*)(uintptr_t)pinfo);
#else
    (void)infotype;
    (void)pinfo;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaGetInfo2W(JNIEnv* km_env, jclass km_clazz, jlong hds, jint infotype, jlong pszobject, jlong puuidforsourcedsaobjguid, jlong pszattributename, jlong pszvalue, jint dwflags, jint dwenumerationcontext, jlong ppinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaGetInfo2W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (int32_t)infotype, (void*)(uintptr_t)pszobject, (void*)(uintptr_t)puuidforsourcedsaobjguid, (void*)(uintptr_t)pszattributename, (void*)(uintptr_t)pszvalue, (uint32_t)dwflags, (uint32_t)dwenumerationcontext, (void*)(uintptr_t)ppinfo) : 0;
#else
    (void)hds;
    (void)infotype;
    (void)pszobject;
    (void)puuidforsourcedsaobjguid;
    (void)pszattributename;
    (void)pszvalue;
    (void)dwflags;
    (void)dwenumerationcontext;
    (void)ppinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaGetInfoW(JNIEnv* km_env, jclass km_clazz, jlong hds, jint infotype, jlong pszobject, jlong puuidforsourcedsaobjguid, jlong ppinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaGetInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (int32_t)infotype, (void*)(uintptr_t)pszobject, (void*)(uintptr_t)puuidforsourcedsaobjguid, (void*)(uintptr_t)ppinfo) : 0;
#else
    (void)hds;
    (void)infotype;
    (void)pszobject;
    (void)puuidforsourcedsaobjguid;
    (void)ppinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaModifyA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong puuidsourcedsa, jlong transportdn, jlong sourcedsaaddress, jlong pschedule, jint replicaflags, jint modifyfields, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaModifyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)puuidsourcedsa, (void*)(uintptr_t)transportdn, (void*)(uintptr_t)sourcedsaaddress, (void*)(uintptr_t)pschedule, (uint32_t)replicaflags, (uint32_t)modifyfields, (uint32_t)options) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuidsourcedsa;
    (void)transportdn;
    (void)sourcedsaaddress;
    (void)pschedule;
    (void)replicaflags;
    (void)modifyfields;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaModifyW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong puuidsourcedsa, jlong transportdn, jlong sourcedsaaddress, jlong pschedule, jint replicaflags, jint modifyfields, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaModifyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)puuidsourcedsa, (void*)(uintptr_t)transportdn, (void*)(uintptr_t)sourcedsaaddress, (void*)(uintptr_t)pschedule, (uint32_t)replicaflags, (uint32_t)modifyfields, (uint32_t)options) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuidsourcedsa;
    (void)transportdn;
    (void)sourcedsaaddress;
    (void)pschedule;
    (void)replicaflags;
    (void)modifyfields;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaSyncA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong puuiddsasrc, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaSyncA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)puuiddsasrc, (uint32_t)options) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuiddsasrc;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaSyncAllA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong psznamecontext, jint ulflags, jlong pfncallback, jlong pcallbackdata, jlong perrors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaSyncAllA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)psznamecontext, (uint32_t)ulflags, (int64_t)pfncallback, (void*)(uintptr_t)pcallbackdata, (void*)(uintptr_t)perrors) : 0;
#else
    (void)hds;
    (void)psznamecontext;
    (void)ulflags;
    (void)pfncallback;
    (void)pcallbackdata;
    (void)perrors;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaSyncAllW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong psznamecontext, jint ulflags, jlong pfncallback, jlong pcallbackdata, jlong perrors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaSyncAllW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)psznamecontext, (uint32_t)ulflags, (int64_t)pfncallback, (void*)(uintptr_t)pcallbackdata, (void*)(uintptr_t)perrors) : 0;
#else
    (void)hds;
    (void)psznamecontext;
    (void)ulflags;
    (void)pfncallback;
    (void)pcallbackdata;
    (void)perrors;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaSyncW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong puuiddsasrc, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaSyncW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)puuiddsasrc, (uint32_t)options) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuiddsasrc;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaUpdateRefsA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong dsadest, jlong puuiddsadest, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaUpdateRefsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)dsadest, (void*)(uintptr_t)puuiddsadest, (uint32_t)options) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)dsadest;
    (void)puuiddsadest;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaUpdateRefsW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong dsadest, jlong puuiddsadest, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaUpdateRefsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)dsadest, (void*)(uintptr_t)puuiddsadest, (uint32_t)options) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)dsadest;
    (void)puuiddsadest;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaVerifyObjectsA(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong puuiddsasrc, jint uloptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaVerifyObjectsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)puuiddsasrc, (uint32_t)uloptions) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuiddsasrc;
    (void)uloptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsReplicaVerifyObjectsW(JNIEnv* km_env, jclass km_clazz, jlong hds, jlong namecontext, jlong puuiddsasrc, jint uloptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaVerifyObjectsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (void*)(uintptr_t)namecontext, (void*)(uintptr_t)puuiddsasrc, (uint32_t)uloptions) : 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuiddsasrc;
    (void)uloptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsRoleFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRoleFreeMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)buffer);
#else
    (void)buffer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsRoleGetPrimaryDomainInformation(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jint infolevel, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRoleGetPrimaryDomainInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserver, (int32_t)infolevel, (void*)(uintptr_t)buffer) : 0;
#else
    (void)lpserver;
    (void)infolevel;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsServerRegisterSpnA(JNIEnv* km_env, jclass km_clazz, jint operation, jlong serviceclass, jlong userobjectdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsServerRegisterSpnA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)operation, (void*)(uintptr_t)serviceclass, (void*)(uintptr_t)userobjectdn) : 0;
#else
    (void)operation;
    (void)serviceclass;
    (void)userobjectdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsServerRegisterSpnW(JNIEnv* km_env, jclass km_clazz, jint operation, jlong serviceclass, jlong userobjectdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsServerRegisterSpnW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)operation, (void*)(uintptr_t)serviceclass, (void*)(uintptr_t)userobjectdn) : 0;
#else
    (void)operation;
    (void)serviceclass;
    (void)userobjectdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsUnBindA(JNIEnv* km_env, jclass km_clazz, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsUnBindA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phds) : 0;
#else
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsUnBindW(JNIEnv* km_env, jclass km_clazz, jlong phds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsUnBindW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phds) : 0;
#else
    (void)phds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsUnquoteRdnValueA(JNIEnv* km_env, jclass km_clazz, jint cquotedrdnvaluelength, jlong psquotedrdnvalue, jlong pcunquotedrdnvaluelength, jlong psunquotedrdnvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsUnquoteRdnValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cquotedrdnvaluelength, (void*)(uintptr_t)psquotedrdnvalue, (void*)(uintptr_t)pcunquotedrdnvaluelength, (void*)(uintptr_t)psunquotedrdnvalue) : 0;
#else
    (void)cquotedrdnvaluelength;
    (void)psquotedrdnvalue;
    (void)pcunquotedrdnvaluelength;
    (void)psunquotedrdnvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsUnquoteRdnValueW(JNIEnv* km_env, jclass km_clazz, jint cquotedrdnvaluelength, jlong psquotedrdnvalue, jlong pcunquotedrdnvaluelength, jlong psunquotedrdnvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsUnquoteRdnValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cquotedrdnvaluelength, (void*)(uintptr_t)psquotedrdnvalue, (void*)(uintptr_t)pcunquotedrdnvaluelength, (void*)(uintptr_t)psunquotedrdnvalue) : 0;
#else
    (void)cquotedrdnvaluelength;
    (void)psquotedrdnvalue;
    (void)pcunquotedrdnvaluelength;
    (void)psunquotedrdnvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsValidateSubnetNameA(JNIEnv* km_env, jclass km_clazz, jlong subnetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsValidateSubnetNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subnetname) : 0;
#else
    (void)subnetname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsValidateSubnetNameW(JNIEnv* km_env, jclass km_clazz, jlong subnetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsValidateSubnetNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subnetname) : 0;
#else
    (void)subnetname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsWriteAccountSpnA(JNIEnv* km_env, jclass km_clazz, jlong hds, jint operation, jlong pszaccount, jint cspn, jlong rpszspn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsWriteAccountSpnA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (int32_t)operation, (void*)(uintptr_t)pszaccount, (uint32_t)cspn, (void*)(uintptr_t)rpszspn) : 0;
#else
    (void)hds;
    (void)operation;
    (void)pszaccount;
    (void)cspn;
    (void)rpszspn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1DsWriteAccountSpnW(JNIEnv* km_env, jclass km_clazz, jlong hds, jint operation, jlong pszaccount, jint cspn, jlong rpszspn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsWriteAccountSpnW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hds, (int32_t)operation, (void*)(uintptr_t)pszaccount, (uint32_t)cspn, (void*)(uintptr_t)rpszspn) : 0;
#else
    (void)hds;
    (void)operation;
    (void)pszaccount;
    (void)cspn;
    (void)rpszspn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1FreeADsMem(JNIEnv* km_env, jclass km_clazz, jlong pmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeADsMem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pmem) : -1;
#else
    (void)pmem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1FreeADsStr(JNIEnv* km_env, jclass km_clazz, jlong pstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeADsStr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstr) : -1;
#else
    (void)pstr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1PropVariantToAdsType(JNIEnv* km_env, jclass km_clazz, jlong pvariant, jint dwnumvariant, jlong ppadsvalues, jlong pdwnumvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToAdsType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvariant, (uint32_t)dwnumvariant, (void*)(uintptr_t)ppadsvalues, (void*)(uintptr_t)pdwnumvalues) : -1;
#else
    (void)pvariant;
    (void)dwnumvariant;
    (void)ppadsvalues;
    (void)pdwnumvalues;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ReallocADsMem(JNIEnv* km_env, jclass km_clazz, jlong poldmem, jint cbold, jint cbnew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReallocADsMem");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poldmem, (uint32_t)cbold, (uint32_t)cbnew) : NULL;
#else
    (void)poldmem;
    (void)cbold;
    (void)cbnew;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_activedirectory_WindowsWin32NetworkingActivedirectoryJniBridge_windowssys_1windows_1win32_1networking_1activedirectory_1ReallocADsStr(JNIEnv* km_env, jclass km_clazz, jlong ppstr, jlong pstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReallocADsStr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppstr, (void*)(uintptr_t)pstr) : -1;
#else
    (void)ppstr;
    (void)pstr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

