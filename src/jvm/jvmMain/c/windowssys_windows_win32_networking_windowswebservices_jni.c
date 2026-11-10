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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNAuthenticatorGetAssertion(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pwszrpid, jlong pwebauthnclientdata, jlong pwebauthngetassertionoptions, jlong ppwebauthnassertion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNAuthenticatorGetAssertion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pwszrpid, (void*)(uintptr_t)pwebauthnclientdata, (void*)(uintptr_t)pwebauthngetassertionoptions, (void*)(uintptr_t)ppwebauthnassertion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)pwszrpid;
    (void)pwebauthnclientdata;
    (void)pwebauthngetassertionoptions;
    (void)ppwebauthnassertion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNAuthenticatorMakeCredential(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong prpinformation, jlong puserinformation, jlong ppubkeycredparams, jlong pwebauthnclientdata, jlong pwebauthnmakecredentialoptions, jlong ppwebauthncredentialattestation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNAuthenticatorMakeCredential");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)prpinformation, (void*)(uintptr_t)puserinformation, (void*)(uintptr_t)ppubkeycredparams, (void*)(uintptr_t)pwebauthnclientdata, (void*)(uintptr_t)pwebauthnmakecredentialoptions, (void*)(uintptr_t)ppwebauthncredentialattestation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)prpinformation;
    (void)puserinformation;
    (void)ppubkeycredparams;
    (void)pwebauthnclientdata;
    (void)pwebauthnmakecredentialoptions;
    (void)ppwebauthncredentialattestation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNCancelCurrentOperation(JNIEnv* km_env, jclass km_clazz, jlong pcancellationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNCancelCurrentOperation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcancellationid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcancellationid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNDeletePlatformCredential(JNIEnv* km_env, jclass km_clazz, jint cbcredentialid, jlong pbcredentialid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNDeletePlatformCredential");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cbcredentialid, (void*)(uintptr_t)pbcredentialid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cbcredentialid;
    (void)pbcredentialid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNFreeAssertion(JNIEnv* km_env, jclass km_clazz, jlong pwebauthnassertion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNFreeAssertion");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pwebauthnassertion);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwebauthnassertion;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNFreeCredentialAttestation(JNIEnv* km_env, jclass km_clazz, jlong pwebauthncredentialattestation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNFreeCredentialAttestation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pwebauthncredentialattestation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwebauthncredentialattestation;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNFreePlatformCredentialList(JNIEnv* km_env, jclass km_clazz, jlong pcredentialdetailslist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNFreePlatformCredentialList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pcredentialdetailslist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pcredentialdetailslist;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNGetApiVersionNumber(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNGetApiVersionNumber");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNGetCancellationId(JNIEnv* km_env, jclass km_clazz, jlong pcancellationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNGetCancellationId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcancellationid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcancellationid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNGetErrorName(JNIEnv* km_env, jclass km_clazz, jint hr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNGetErrorName");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)hr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNGetPlatformCredentialList(JNIEnv* km_env, jclass km_clazz, jlong pgetcredentialsoptions, jlong ppcredentialdetailslist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNGetPlatformCredentialList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pgetcredentialsoptions, (void*)(uintptr_t)ppcredentialdetailslist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pgetcredentialsoptions;
    (void)ppcredentialdetailslist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNGetW3CExceptionDOMError(JNIEnv* km_env, jclass km_clazz, jint hr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNGetW3CExceptionDOMError");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)hr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(JNIEnv* km_env, jclass km_clazz, jlong pbisuserverifyingplatformauthenticatoravailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbisuserverifyingplatformauthenticatoravailable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbisuserverifyingplatformauthenticatoravailable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAbandonCall(JNIEnv* km_env, jclass km_clazz, jlong serviceproxy, jint callid, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbandonCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serviceproxy, (uint32_t)callid, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serviceproxy;
    (void)callid;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAbandonMessage(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbandonMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)message;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAbortChannel(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbortChannel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAbortListener(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbortListener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listener, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAbortServiceHost(JNIEnv* km_env, jclass km_clazz, jlong servicehost, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbortServiceHost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servicehost, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servicehost;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAbortServiceProxy(JNIEnv* km_env, jclass km_clazz, jlong serviceproxy, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbortServiceProxy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serviceproxy, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serviceproxy;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAcceptChannel(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong channel, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAcceptChannel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listener, (void*)(uintptr_t)channel, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)channel;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAddCustomHeader(JNIEnv* km_env, jclass km_clazz, jlong message, jlong headerdescription, jint writeoption, jlong value, jint valuesize, jint headerattributes, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAddCustomHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)headerdescription, (int32_t)writeoption, (void*)(uintptr_t)value, (uint32_t)valuesize, (uint32_t)headerattributes, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)headerdescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)headerattributes;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAddErrorString(JNIEnv* km_env, jclass km_clazz, jlong error, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAddErrorString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)error, (void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)error;
    (void)string;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAddMappedHeader(JNIEnv* km_env, jclass km_clazz, jlong message, jlong headername, jint valuetype, jint writeoption, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAddMappedHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)headername, (int32_t)valuetype, (int32_t)writeoption, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)headername;
    (void)valuetype;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAddressMessage(JNIEnv* km_env, jclass km_clazz, jlong message, jlong address, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAddressMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)address, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)address;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAlloc(JNIEnv* km_env, jclass km_clazz, jlong heap, jlong size, jlong ptr, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)heap, (uint64_t)size, (void*)(uintptr_t)ptr, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)heap;
    (void)size;
    (void)ptr;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsAsyncExecute(JNIEnv* km_env, jclass km_clazz, jlong asyncstate, jlong operation, jint callbackmodel, jlong callbackstate, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAsyncExecute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)asyncstate, (void*)(uintptr_t)operation, (int32_t)callbackmodel, (void*)(uintptr_t)callbackstate, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)asyncstate;
    (void)operation;
    (void)callbackmodel;
    (void)callbackstate;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCall(JNIEnv* km_env, jclass km_clazz, jlong serviceproxy, jlong operation, jlong arguments, jlong heap, jlong callproperties, jint callpropertycount, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serviceproxy, (void*)(uintptr_t)operation, (void*)(uintptr_t)arguments, (void*)(uintptr_t)heap, (void*)(uintptr_t)callproperties, (uint32_t)callpropertycount, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serviceproxy;
    (void)operation;
    (void)arguments;
    (void)heap;
    (void)callproperties;
    (void)callpropertycount;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCheckMustUnderstandHeaders(JNIEnv* km_env, jclass km_clazz, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCheckMustUnderstandHeaders");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCloseChannel(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCloseChannel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCloseListener(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCloseListener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listener, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCloseServiceHost(JNIEnv* km_env, jclass km_clazz, jlong servicehost, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCloseServiceHost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servicehost, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servicehost;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCloseServiceProxy(JNIEnv* km_env, jclass km_clazz, jlong serviceproxy, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCloseServiceProxy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serviceproxy, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serviceproxy;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCombineUrl(JNIEnv* km_env, jclass km_clazz, jlong baseurl, jlong referenceurl, jint flags, jlong heap, jlong resulturl, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCombineUrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)baseurl, (void*)(uintptr_t)referenceurl, (uint32_t)flags, (void*)(uintptr_t)heap, (void*)(uintptr_t)resulturl, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)baseurl;
    (void)referenceurl;
    (void)flags;
    (void)heap;
    (void)resulturl;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCopyError(JNIEnv* km_env, jclass km_clazz, jlong source, jlong destination) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCopyError");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)source, (void*)(uintptr_t)destination);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)source;
    (void)destination;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCopyNode(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong reader, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCopyNode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)reader, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)reader;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateChannel(JNIEnv* km_env, jclass km_clazz, jint channeltype, jint channelbinding, jlong properties, jint propertycount, jlong securitydescription, jlong channel, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateChannel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)channeltype, (int32_t)channelbinding, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)securitydescription, (void*)(uintptr_t)channel, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channeltype;
    (void)channelbinding;
    (void)properties;
    (void)propertycount;
    (void)securitydescription;
    (void)channel;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateChannelForListener(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong properties, jint propertycount, jlong channel, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateChannelForListener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listener, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)channel, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)properties;
    (void)propertycount;
    (void)channel;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateError(JNIEnv* km_env, jclass km_clazz, jlong properties, jint propertycount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateError");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateFaultFromError(JNIEnv* km_env, jclass km_clazz, jlong error, jint faulterrorcode, jint faultdisclosure, jlong heap, jlong fault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateFaultFromError");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)error, (int32_t)faulterrorcode, (int32_t)faultdisclosure, (void*)(uintptr_t)heap, (void*)(uintptr_t)fault);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)error;
    (void)faulterrorcode;
    (void)faultdisclosure;
    (void)heap;
    (void)fault;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateHeap(JNIEnv* km_env, jclass km_clazz, jlong maxsize, jlong trimsize, jlong properties, jint propertycount, jlong heap, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateHeap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)maxsize, (uint64_t)trimsize, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)heap, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)maxsize;
    (void)trimsize;
    (void)properties;
    (void)propertycount;
    (void)heap;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateListener(JNIEnv* km_env, jclass km_clazz, jint channeltype, jint channelbinding, jlong properties, jint propertycount, jlong securitydescription, jlong listener, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateListener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)channeltype, (int32_t)channelbinding, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)securitydescription, (void*)(uintptr_t)listener, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channeltype;
    (void)channelbinding;
    (void)properties;
    (void)propertycount;
    (void)securitydescription;
    (void)listener;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateMessage(JNIEnv* km_env, jclass km_clazz, jint envelopeversion, jint addressingversion, jlong properties, jint propertycount, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)envelopeversion, (int32_t)addressingversion, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)envelopeversion;
    (void)addressingversion;
    (void)properties;
    (void)propertycount;
    (void)message;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateMessageForChannel(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong properties, jint propertycount, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateMessageForChannel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)properties;
    (void)propertycount;
    (void)message;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateMetadata(JNIEnv* km_env, jclass km_clazz, jlong properties, jint propertycount, jlong metadata, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateMetadata");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)metadata, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)properties;
    (void)propertycount;
    (void)metadata;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateReader(JNIEnv* km_env, jclass km_clazz, jlong properties, jint propertycount, jlong reader, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateReader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)reader, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)properties;
    (void)propertycount;
    (void)reader;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateServiceEndpointFromTemplate(JNIEnv* km_env, jclass km_clazz, jint channeltype, jlong properties, jint propertycount, jlong addressurl, jlong contract, jlong authorizationcallback, jlong heap, jint templatetype, jlong templatevalue, jint templatesize, jlong templatedescription, jint templatedescriptionsize, jlong serviceendpoint, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, void*, void*, int32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateServiceEndpointFromTemplate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)channeltype, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)addressurl, (void*)(uintptr_t)contract, (void*)(uintptr_t)authorizationcallback, (void*)(uintptr_t)heap, (int32_t)templatetype, (void*)(uintptr_t)templatevalue, (uint32_t)templatesize, (void*)(uintptr_t)templatedescription, (uint32_t)templatedescriptionsize, (void*)(uintptr_t)serviceendpoint, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channeltype;
    (void)properties;
    (void)propertycount;
    (void)addressurl;
    (void)contract;
    (void)authorizationcallback;
    (void)heap;
    (void)templatetype;
    (void)templatevalue;
    (void)templatesize;
    (void)templatedescription;
    (void)templatedescriptionsize;
    (void)serviceendpoint;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateServiceHost(JNIEnv* km_env, jclass km_clazz, jlong endpoints, jshort endpointcount, jlong serviceproperties, jint servicepropertycount, jlong servicehost, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateServiceHost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)endpoints, (uint16_t)endpointcount, (void*)(uintptr_t)serviceproperties, (uint32_t)servicepropertycount, (void*)(uintptr_t)servicehost, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)endpoints;
    (void)endpointcount;
    (void)serviceproperties;
    (void)servicepropertycount;
    (void)servicehost;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateServiceProxy(JNIEnv* km_env, jclass km_clazz, jint channeltype, jint channelbinding, jlong securitydescription, jlong properties, jint propertycount, jlong channelproperties, jint channelpropertycount, jlong serviceproxy, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateServiceProxy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)channeltype, (int32_t)channelbinding, (void*)(uintptr_t)securitydescription, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)channelproperties, (uint32_t)channelpropertycount, (void*)(uintptr_t)serviceproxy, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channeltype;
    (void)channelbinding;
    (void)securitydescription;
    (void)properties;
    (void)propertycount;
    (void)channelproperties;
    (void)channelpropertycount;
    (void)serviceproxy;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateServiceProxyFromTemplate(JNIEnv* km_env, jclass km_clazz, jint channeltype, jlong properties, jint propertycount, jint templatetype, jlong templatevalue, jint templatesize, jlong templatedescription, jint templatedescriptionsize, jlong serviceproxy, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, int32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateServiceProxyFromTemplate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)channeltype, (void*)(uintptr_t)properties, (uint32_t)propertycount, (int32_t)templatetype, (void*)(uintptr_t)templatevalue, (uint32_t)templatesize, (void*)(uintptr_t)templatedescription, (uint32_t)templatedescriptionsize, (void*)(uintptr_t)serviceproxy, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channeltype;
    (void)properties;
    (void)propertycount;
    (void)templatetype;
    (void)templatevalue;
    (void)templatesize;
    (void)templatedescription;
    (void)templatedescriptionsize;
    (void)serviceproxy;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateWriter(JNIEnv* km_env, jclass km_clazz, jlong properties, jint propertycount, jlong writer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateWriter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)writer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)properties;
    (void)propertycount;
    (void)writer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateXmlBuffer(JNIEnv* km_env, jclass km_clazz, jlong heap, jlong properties, jint propertycount, jlong buffer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateXmlBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)heap, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)buffer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)heap;
    (void)properties;
    (void)propertycount;
    (void)buffer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsCreateXmlSecurityToken(JNIEnv* km_env, jclass km_clazz, jlong tokenxml, jlong tokenkey, jlong properties, jint propertycount, jlong token, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateXmlSecurityToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenxml, (void*)(uintptr_t)tokenkey, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)token, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenxml;
    (void)tokenkey;
    (void)properties;
    (void)propertycount;
    (void)token;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsDateTimeToFileTime(JNIEnv* km_env, jclass km_clazz, jlong datetime, jlong filetime, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsDateTimeToFileTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)datetime, (void*)(uintptr_t)filetime, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)datetime;
    (void)filetime;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsDecodeUrl(JNIEnv* km_env, jclass km_clazz, jlong url, jint flags, jlong heap, jlong outurl, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsDecodeUrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)url, (uint32_t)flags, (void*)(uintptr_t)heap, (void*)(uintptr_t)outurl, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)url;
    (void)flags;
    (void)heap;
    (void)outurl;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsEncodeUrl(JNIEnv* km_env, jclass km_clazz, jlong url, jint flags, jlong heap, jlong outurl, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsEncodeUrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)url, (uint32_t)flags, (void*)(uintptr_t)heap, (void*)(uintptr_t)outurl, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)url;
    (void)flags;
    (void)heap;
    (void)outurl;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsEndReaderCanonicalization(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsEndReaderCanonicalization");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsEndWriterCanonicalization(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsEndWriterCanonicalization");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFileTimeToDateTime(JNIEnv* km_env, jclass km_clazz, jlong filetime, jlong datetime, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFileTimeToDateTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filetime, (void*)(uintptr_t)datetime, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filetime;
    (void)datetime;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFillBody(JNIEnv* km_env, jclass km_clazz, jlong message, jint minsize, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFillBody");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (uint32_t)minsize, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)minsize;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFillReader(JNIEnv* km_env, jclass km_clazz, jlong reader, jint minsize, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFillReader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (uint32_t)minsize, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)minsize;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFindAttribute(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong localname, jlong ns, jint required, jlong attributeindex, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFindAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)localname, (void*)(uintptr_t)ns, (int32_t)required, (void*)(uintptr_t)attributeindex, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)localname;
    (void)ns;
    (void)required;
    (void)attributeindex;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFlushBody(JNIEnv* km_env, jclass km_clazz, jlong message, jint minsize, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFlushBody");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (uint32_t)minsize, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)minsize;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFlushWriter(JNIEnv* km_env, jclass km_clazz, jlong writer, jint minsize, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFlushWriter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (uint32_t)minsize, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)minsize;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeChannel(JNIEnv* km_env, jclass km_clazz, jlong channel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeChannel");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)channel);
    } else {
        errno = ENOSYS;
    }
#else
    (void)channel;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeError(JNIEnv* km_env, jclass km_clazz, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeError");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
    }
#else
    (void)error;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeHeap(JNIEnv* km_env, jclass km_clazz, jlong heap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeHeap");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)heap);
    } else {
        errno = ENOSYS;
    }
#else
    (void)heap;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeListener(JNIEnv* km_env, jclass km_clazz, jlong listener) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeListener");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)listener);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeMessage(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeMessage");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)message);
    } else {
        errno = ENOSYS;
    }
#else
    (void)message;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeMetadata(JNIEnv* km_env, jclass km_clazz, jlong metadata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeMetadata");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)metadata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)metadata;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeReader(JNIEnv* km_env, jclass km_clazz, jlong reader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeReader");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)reader);
    } else {
        errno = ENOSYS;
    }
#else
    (void)reader;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeSecurityToken(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeSecurityToken");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
    }
#else
    (void)token;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeServiceHost(JNIEnv* km_env, jclass km_clazz, jlong servicehost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeServiceHost");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)servicehost);
    } else {
        errno = ENOSYS;
    }
#else
    (void)servicehost;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeServiceProxy(JNIEnv* km_env, jclass km_clazz, jlong serviceproxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeServiceProxy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)serviceproxy);
    } else {
        errno = ENOSYS;
    }
#else
    (void)serviceproxy;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsFreeWriter(JNIEnv* km_env, jclass km_clazz, jlong writer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeWriter");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)writer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)writer;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetChannelProperty(JNIEnv* km_env, jclass km_clazz, jlong channel, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetChannelProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetCustomHeader(JNIEnv* km_env, jclass km_clazz, jlong message, jlong customheaderdescription, jint repeatingoption, jint headerindex, jint readoption, jlong heap, jlong value, jint valuesize, jlong headerattributes, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, int32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetCustomHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)customheaderdescription, (int32_t)repeatingoption, (uint32_t)headerindex, (int32_t)readoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)headerattributes, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)customheaderdescription;
    (void)repeatingoption;
    (void)headerindex;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)headerattributes;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetDictionary(JNIEnv* km_env, jclass km_clazz, jint encoding, jlong dictionary, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetDictionary");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)encoding, (void*)(uintptr_t)dictionary, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)encoding;
    (void)dictionary;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetErrorProperty(JNIEnv* km_env, jclass km_clazz, jlong error, jint id, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetErrorProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)error, (int32_t)id, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)error;
    (void)id;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetErrorString(JNIEnv* km_env, jclass km_clazz, jlong error, jint arg_1_index, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetErrorString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)error, (uint32_t)arg_1_index, (void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)error;
    (void)arg_1_index;
    (void)string;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetFaultErrorDetail(JNIEnv* km_env, jclass km_clazz, jlong error, jlong faultdetaildescription, jint readoption, jlong heap, jlong value, jint valuesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetFaultErrorDetail");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)error, (void*)(uintptr_t)faultdetaildescription, (int32_t)readoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)error;
    (void)faultdetaildescription;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetFaultErrorProperty(JNIEnv* km_env, jclass km_clazz, jlong error, jint id, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetFaultErrorProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)error, (int32_t)id, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)error;
    (void)id;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetHeader(JNIEnv* km_env, jclass km_clazz, jlong message, jint headertype, jint valuetype, jint readoption, jlong heap, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (int32_t)headertype, (int32_t)valuetype, (int32_t)readoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)headertype;
    (void)valuetype;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetHeaderAttributes(JNIEnv* km_env, jclass km_clazz, jlong message, jlong reader, jlong headerattributes, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetHeaderAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)reader, (void*)(uintptr_t)headerattributes, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)reader;
    (void)headerattributes;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetHeapProperty(JNIEnv* km_env, jclass km_clazz, jlong heap, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetHeapProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)heap, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)heap;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetListenerProperty(JNIEnv* km_env, jclass km_clazz, jlong listener, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetListenerProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listener, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetMappedHeader(JNIEnv* km_env, jclass km_clazz, jlong message, jlong headername, jint repeatingoption, jint headerindex, jint valuetype, jint readoption, jlong heap, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, int32_t, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetMappedHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)headername, (int32_t)repeatingoption, (uint32_t)headerindex, (int32_t)valuetype, (int32_t)readoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)headername;
    (void)repeatingoption;
    (void)headerindex;
    (void)valuetype;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetMessageProperty(JNIEnv* km_env, jclass km_clazz, jlong message, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetMessageProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetMetadataEndpoints(JNIEnv* km_env, jclass km_clazz, jlong metadata, jlong endpoints, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetMetadataEndpoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)metadata, (void*)(uintptr_t)endpoints, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)metadata;
    (void)endpoints;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetMetadataProperty(JNIEnv* km_env, jclass km_clazz, jlong metadata, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetMetadataProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)metadata, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)metadata;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetMissingMetadataDocumentAddress(JNIEnv* km_env, jclass km_clazz, jlong metadata, jlong address, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetMissingMetadataDocumentAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)metadata, (void*)(uintptr_t)address, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)metadata;
    (void)address;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetNamespaceFromPrefix(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong prefix, jint required, jlong ns, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetNamespaceFromPrefix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)prefix, (int32_t)required, (void*)(uintptr_t)ns, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)prefix;
    (void)required;
    (void)ns;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetOperationContextProperty(JNIEnv* km_env, jclass km_clazz, jlong context, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetOperationContextProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetPolicyAlternativeCount(JNIEnv* km_env, jclass km_clazz, jlong policy, jlong count, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetPolicyAlternativeCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policy, (void*)(uintptr_t)count, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policy;
    (void)count;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetPolicyProperty(JNIEnv* km_env, jclass km_clazz, jlong policy, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetPolicyProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policy, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policy;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetPrefixFromNamespace(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong ns, jint required, jlong prefix, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetPrefixFromNamespace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)ns, (int32_t)required, (void*)(uintptr_t)prefix, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)ns;
    (void)required;
    (void)prefix;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetReaderNode(JNIEnv* km_env, jclass km_clazz, jlong xmlreader, jlong node, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetReaderNode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)xmlreader, (void*)(uintptr_t)node, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)xmlreader;
    (void)node;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetReaderPosition(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong nodeposition, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetReaderPosition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)nodeposition, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)nodeposition;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetReaderProperty(JNIEnv* km_env, jclass km_clazz, jlong reader, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetReaderProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetSecurityContextProperty(JNIEnv* km_env, jclass km_clazz, jlong securitycontext, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetSecurityContextProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitycontext, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitycontext;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetSecurityTokenProperty(JNIEnv* km_env, jclass km_clazz, jlong securitytoken, jint id, jlong value, jint valuesize, jlong heap, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetSecurityTokenProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitytoken, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)heap, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitytoken;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)heap;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetServiceHostProperty(JNIEnv* km_env, jclass km_clazz, jlong servicehost, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetServiceHostProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servicehost, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servicehost;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetServiceProxyProperty(JNIEnv* km_env, jclass km_clazz, jlong serviceproxy, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetServiceProxyProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serviceproxy, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serviceproxy;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetWriterPosition(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong nodeposition, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetWriterPosition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)nodeposition, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)nodeposition;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetWriterProperty(JNIEnv* km_env, jclass km_clazz, jlong writer, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetWriterProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsGetXmlAttribute(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong localname, jlong heap, jlong valuechars, jlong valuecharcount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetXmlAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)localname, (void*)(uintptr_t)heap, (void*)(uintptr_t)valuechars, (void*)(uintptr_t)valuecharcount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)localname;
    (void)heap;
    (void)valuechars;
    (void)valuecharcount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsInitializeMessage(JNIEnv* km_env, jclass km_clazz, jlong message, jint initialization, jlong sourcemessage, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsInitializeMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (int32_t)initialization, (void*)(uintptr_t)sourcemessage, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)initialization;
    (void)sourcemessage;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsMarkHeaderAsUnderstood(JNIEnv* km_env, jclass km_clazz, jlong message, jlong headerposition, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsMarkHeaderAsUnderstood");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)headerposition, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)headerposition;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsMatchPolicyAlternative(JNIEnv* km_env, jclass km_clazz, jlong policy, jint alternativeindex, jlong policyconstraints, jint matchrequired, jlong heap, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsMatchPolicyAlternative");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policy, (uint32_t)alternativeindex, (void*)(uintptr_t)policyconstraints, (int32_t)matchrequired, (void*)(uintptr_t)heap, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policy;
    (void)alternativeindex;
    (void)policyconstraints;
    (void)matchrequired;
    (void)heap;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsMoveReader(JNIEnv* km_env, jclass km_clazz, jlong reader, jint moveto, jlong found, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsMoveReader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (int32_t)moveto, (void*)(uintptr_t)found, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)moveto;
    (void)found;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsMoveWriter(JNIEnv* km_env, jclass km_clazz, jlong writer, jint moveto, jlong found, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsMoveWriter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (int32_t)moveto, (void*)(uintptr_t)found, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)moveto;
    (void)found;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsOpenChannel(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong endpointaddress, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsOpenChannel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)endpointaddress, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)endpointaddress;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsOpenListener(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong url, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsOpenListener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listener, (void*)(uintptr_t)url, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)url;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsOpenServiceHost(JNIEnv* km_env, jclass km_clazz, jlong servicehost, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsOpenServiceHost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servicehost, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servicehost;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsOpenServiceProxy(JNIEnv* km_env, jclass km_clazz, jlong serviceproxy, jlong address, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsOpenServiceProxy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serviceproxy, (void*)(uintptr_t)address, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serviceproxy;
    (void)address;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsPullBytes(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong callback, jlong callbackstate, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsPullBytes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)callback, (void*)(uintptr_t)callbackstate, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)callback;
    (void)callbackstate;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsPushBytes(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong callback, jlong callbackstate, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsPushBytes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)callback, (void*)(uintptr_t)callbackstate, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)callback;
    (void)callbackstate;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadArray(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong localname, jlong ns, jint valuetype, jlong array, jint arraysize, jint itemoffset, jint itemcount, jlong actualitemcount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)localname, (void*)(uintptr_t)ns, (int32_t)valuetype, (void*)(uintptr_t)array, (uint32_t)arraysize, (uint32_t)itemoffset, (uint32_t)itemcount, (void*)(uintptr_t)actualitemcount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)localname;
    (void)ns;
    (void)valuetype;
    (void)array;
    (void)arraysize;
    (void)itemoffset;
    (void)itemcount;
    (void)actualitemcount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadAttribute(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong attributedescription, jint readoption, jlong heap, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)attributedescription, (int32_t)readoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)attributedescription;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadBody(JNIEnv* km_env, jclass km_clazz, jlong message, jlong bodydescription, jint readoption, jlong heap, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadBody");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)bodydescription, (int32_t)readoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)bodydescription;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadBytes(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong bytes, jint maxbytecount, jlong actualbytecount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadBytes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)bytes, (uint32_t)maxbytecount, (void*)(uintptr_t)actualbytecount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)bytes;
    (void)maxbytecount;
    (void)actualbytecount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadChars(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong chars, jint maxcharcount, jlong actualcharcount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadChars");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)chars, (uint32_t)maxcharcount, (void*)(uintptr_t)actualcharcount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)chars;
    (void)maxcharcount;
    (void)actualcharcount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadCharsUtf8(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong bytes, jint maxbytecount, jlong actualbytecount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadCharsUtf8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)bytes, (uint32_t)maxbytecount, (void*)(uintptr_t)actualbytecount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)bytes;
    (void)maxbytecount;
    (void)actualbytecount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadElement(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong elementdescription, jint readoption, jlong heap, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)elementdescription, (int32_t)readoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)elementdescription;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadEndAttribute(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadEndAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadEndElement(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadEndElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadEndpointAddressExtension(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong endpointaddress, jint extensiontype, jint readoption, jlong heap, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadEndpointAddressExtension");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)endpointaddress, (int32_t)extensiontype, (int32_t)readoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)endpointaddress;
    (void)extensiontype;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadEnvelopeEnd(JNIEnv* km_env, jclass km_clazz, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadEnvelopeEnd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadEnvelopeStart(JNIEnv* km_env, jclass km_clazz, jlong message, jlong reader, jlong donecallback, jlong donecallbackstate, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadEnvelopeStart");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)reader, (void*)(uintptr_t)donecallback, (void*)(uintptr_t)donecallbackstate, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)reader;
    (void)donecallback;
    (void)donecallbackstate;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadMessageEnd(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong message, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadMessageEnd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)message, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)message;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadMessageStart(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong message, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadMessageStart");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)message, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)message;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadMetadata(JNIEnv* km_env, jclass km_clazz, jlong metadata, jlong reader, jlong url, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadMetadata");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)metadata, (void*)(uintptr_t)reader, (void*)(uintptr_t)url, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)metadata;
    (void)reader;
    (void)url;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadNode(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadNode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadQualifiedName(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong heap, jlong prefix, jlong localname, jlong ns, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadQualifiedName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)heap, (void*)(uintptr_t)prefix, (void*)(uintptr_t)localname, (void*)(uintptr_t)ns, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)heap;
    (void)prefix;
    (void)localname;
    (void)ns;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadStartAttribute(JNIEnv* km_env, jclass km_clazz, jlong reader, jint attributeindex, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadStartAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (uint32_t)attributeindex, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)attributeindex;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadStartElement(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadStartElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadToStartElement(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong localname, jlong ns, jlong found, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadToStartElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)localname, (void*)(uintptr_t)ns, (void*)(uintptr_t)found, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)localname;
    (void)ns;
    (void)found;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadType(JNIEnv* km_env, jclass km_clazz, jlong reader, jint typemapping, jint type, jlong typedescription, jint readoption, jlong heap, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (int32_t)typemapping, (int32_t)type, (void*)(uintptr_t)typedescription, (int32_t)readoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)typemapping;
    (void)type;
    (void)typedescription;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadValue(JNIEnv* km_env, jclass km_clazz, jlong reader, jint valuetype, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (int32_t)valuetype, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)valuetype;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadXmlBuffer(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong heap, jlong xmlbuffer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadXmlBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)heap, (void*)(uintptr_t)xmlbuffer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)heap;
    (void)xmlbuffer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReadXmlBufferFromBytes(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong encoding, jlong properties, jint propertycount, jlong bytes, jint bytecount, jlong heap, jlong xmlbuffer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadXmlBufferFromBytes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)encoding, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)bytes, (uint32_t)bytecount, (void*)(uintptr_t)heap, (void*)(uintptr_t)xmlbuffer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)encoding;
    (void)properties;
    (void)propertycount;
    (void)bytes;
    (void)bytecount;
    (void)heap;
    (void)xmlbuffer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsReceiveMessage(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong message, jlong messagedescriptions, jint messagedescriptioncount, jint receiveoption, jint readbodyoption, jlong heap, jlong value, jint valuesize, jlong arg_9_index, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, int32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReceiveMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)message, (void*)(uintptr_t)messagedescriptions, (uint32_t)messagedescriptioncount, (int32_t)receiveoption, (int32_t)readbodyoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)arg_9_index, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)message;
    (void)messagedescriptions;
    (void)messagedescriptioncount;
    (void)receiveoption;
    (void)readbodyoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)arg_9_index;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsRegisterOperationForCancel(JNIEnv* km_env, jclass km_clazz, jlong context, jlong cancelcallback, jlong freestatecallback, jlong userstate, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRegisterOperationForCancel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)cancelcallback, (void*)(uintptr_t)freestatecallback, (void*)(uintptr_t)userstate, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)cancelcallback;
    (void)freestatecallback;
    (void)userstate;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsRemoveCustomHeader(JNIEnv* km_env, jclass km_clazz, jlong message, jlong headername, jlong headerns, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRemoveCustomHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)headername, (void*)(uintptr_t)headerns, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)headername;
    (void)headerns;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsRemoveHeader(JNIEnv* km_env, jclass km_clazz, jlong message, jint headertype, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRemoveHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (int32_t)headertype, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)headertype;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsRemoveMappedHeader(JNIEnv* km_env, jclass km_clazz, jlong message, jlong headername, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRemoveMappedHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)headername, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)headername;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsRemoveNode(JNIEnv* km_env, jclass km_clazz, jlong nodeposition, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRemoveNode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nodeposition, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nodeposition;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsRequestReply(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong requestmessage, jlong requestmessagedescription, jint writeoption, jlong requestbodyvalue, jint requestbodyvaluesize, jlong replymessage, jlong replymessagedescription, jint readoption, jlong heap, jlong value, jint valuesize, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*, void*, int32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRequestReply");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)requestmessage, (void*)(uintptr_t)requestmessagedescription, (int32_t)writeoption, (void*)(uintptr_t)requestbodyvalue, (uint32_t)requestbodyvaluesize, (void*)(uintptr_t)replymessage, (void*)(uintptr_t)replymessagedescription, (int32_t)readoption, (void*)(uintptr_t)heap, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)requestmessage;
    (void)requestmessagedescription;
    (void)writeoption;
    (void)requestbodyvalue;
    (void)requestbodyvaluesize;
    (void)replymessage;
    (void)replymessagedescription;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsRequestSecurityToken(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong properties, jint propertycount, jlong token, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRequestSecurityToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)token, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)properties;
    (void)propertycount;
    (void)token;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsResetChannel(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetChannel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsResetError(JNIEnv* km_env, jclass km_clazz, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetError");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsResetHeap(JNIEnv* km_env, jclass km_clazz, jlong heap, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetHeap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)heap, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)heap;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsResetListener(JNIEnv* km_env, jclass km_clazz, jlong listener, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetListener");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listener, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsResetMessage(JNIEnv* km_env, jclass km_clazz, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsResetMetadata(JNIEnv* km_env, jclass km_clazz, jlong metadata, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetMetadata");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)metadata, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)metadata;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsResetServiceHost(JNIEnv* km_env, jclass km_clazz, jlong servicehost, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetServiceHost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servicehost, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servicehost;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsResetServiceProxy(JNIEnv* km_env, jclass km_clazz, jlong serviceproxy, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetServiceProxy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serviceproxy, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serviceproxy;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsRevokeSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong securitycontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRevokeSecurityContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitycontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitycontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSendFaultMessageForError(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong replymessage, jlong faulterror, jint faulterrorcode, jint faultdisclosure, jlong requestmessage, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSendFaultMessageForError");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)replymessage, (void*)(uintptr_t)faulterror, (int32_t)faulterrorcode, (int32_t)faultdisclosure, (void*)(uintptr_t)requestmessage, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)replymessage;
    (void)faulterror;
    (void)faulterrorcode;
    (void)faultdisclosure;
    (void)requestmessage;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSendMessage(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong message, jlong messagedescription, jint writeoption, jlong bodyvalue, jint bodyvaluesize, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSendMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)message, (void*)(uintptr_t)messagedescription, (int32_t)writeoption, (void*)(uintptr_t)bodyvalue, (uint32_t)bodyvaluesize, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)message;
    (void)messagedescription;
    (void)writeoption;
    (void)bodyvalue;
    (void)bodyvaluesize;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSendReplyMessage(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong replymessage, jlong replymessagedescription, jint writeoption, jlong replybodyvalue, jint replybodyvaluesize, jlong requestmessage, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSendReplyMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)replymessage, (void*)(uintptr_t)replymessagedescription, (int32_t)writeoption, (void*)(uintptr_t)replybodyvalue, (uint32_t)replybodyvaluesize, (void*)(uintptr_t)requestmessage, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)replymessage;
    (void)replymessagedescription;
    (void)writeoption;
    (void)replybodyvalue;
    (void)replybodyvaluesize;
    (void)requestmessage;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetChannelProperty(JNIEnv* km_env, jclass km_clazz, jlong channel, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetChannelProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetErrorProperty(JNIEnv* km_env, jclass km_clazz, jlong error, jint id, jlong value, jint valuesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetErrorProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)error, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)error;
    (void)id;
    (void)value;
    (void)valuesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetFaultErrorDetail(JNIEnv* km_env, jclass km_clazz, jlong error, jlong faultdetaildescription, jint writeoption, jlong value, jint valuesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetFaultErrorDetail");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)error, (void*)(uintptr_t)faultdetaildescription, (int32_t)writeoption, (void*)(uintptr_t)value, (uint32_t)valuesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)error;
    (void)faultdetaildescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetFaultErrorProperty(JNIEnv* km_env, jclass km_clazz, jlong error, jint id, jlong value, jint valuesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetFaultErrorProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)error, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)error;
    (void)id;
    (void)value;
    (void)valuesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetHeader(JNIEnv* km_env, jclass km_clazz, jlong message, jint headertype, jint valuetype, jint writeoption, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (int32_t)headertype, (int32_t)valuetype, (int32_t)writeoption, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)headertype;
    (void)valuetype;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetInput(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong encoding, jlong input, jlong properties, jint propertycount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetInput");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)encoding, (void*)(uintptr_t)input, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)encoding;
    (void)input;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetInputToBuffer(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong buffer, jlong properties, jint propertycount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetInputToBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)buffer, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)buffer;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetListenerProperty(JNIEnv* km_env, jclass km_clazz, jlong listener, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetListenerProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listener, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)listener;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetMessageProperty(JNIEnv* km_env, jclass km_clazz, jlong message, jint id, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetMessageProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (int32_t)id, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetOutput(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong encoding, jlong output, jlong properties, jint propertycount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetOutput");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)encoding, (void*)(uintptr_t)output, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)encoding;
    (void)output;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetOutputToBuffer(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong buffer, jlong properties, jint propertycount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetOutputToBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)buffer, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)buffer;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetReaderPosition(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong nodeposition, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetReaderPosition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)nodeposition, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)nodeposition;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSetWriterPosition(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong nodeposition, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetWriterPosition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)nodeposition, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)nodeposition;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsShutdownSessionChannel(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsShutdownSessionChannel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsSkipNode(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSkipNode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsStartReaderCanonicalization(JNIEnv* km_env, jclass km_clazz, jlong reader, jlong writecallback, jlong writecallbackstate, jlong properties, jint propertycount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsStartReaderCanonicalization");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reader, (void*)(uintptr_t)writecallback, (void*)(uintptr_t)writecallbackstate, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reader;
    (void)writecallback;
    (void)writecallbackstate;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsStartWriterCanonicalization(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong writecallback, jlong writecallbackstate, jlong properties, jint propertycount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsStartWriterCanonicalization");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)writecallback, (void*)(uintptr_t)writecallbackstate, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)writecallback;
    (void)writecallbackstate;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsTrimXmlWhitespace(JNIEnv* km_env, jclass km_clazz, jlong chars, jint charcount, jlong trimmedchars, jlong trimmedcount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsTrimXmlWhitespace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)chars, (uint32_t)charcount, (void*)(uintptr_t)trimmedchars, (void*)(uintptr_t)trimmedcount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)chars;
    (void)charcount;
    (void)trimmedchars;
    (void)trimmedcount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsVerifyXmlNCName(JNIEnv* km_env, jclass km_clazz, jlong ncnamechars, jint ncnamecharcount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsVerifyXmlNCName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ncnamechars, (uint32_t)ncnamecharcount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ncnamechars;
    (void)ncnamecharcount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteArray(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong localname, jlong ns, jint valuetype, jlong array, jint arraysize, jint itemoffset, jint itemcount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)localname, (void*)(uintptr_t)ns, (int32_t)valuetype, (void*)(uintptr_t)array, (uint32_t)arraysize, (uint32_t)itemoffset, (uint32_t)itemcount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)localname;
    (void)ns;
    (void)valuetype;
    (void)array;
    (void)arraysize;
    (void)itemoffset;
    (void)itemcount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteAttribute(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong attributedescription, jint writeoption, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)attributedescription, (int32_t)writeoption, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)attributedescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteBody(JNIEnv* km_env, jclass km_clazz, jlong message, jlong bodydescription, jint writeoption, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteBody");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)bodydescription, (int32_t)writeoption, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)bodydescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteBytes(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong bytes, jint bytecount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteBytes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)bytes, (uint32_t)bytecount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)bytes;
    (void)bytecount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteChars(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong chars, jint charcount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteChars");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)chars, (uint32_t)charcount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)chars;
    (void)charcount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteCharsUtf8(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong bytes, jint bytecount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteCharsUtf8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)bytes, (uint32_t)bytecount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)bytes;
    (void)bytecount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteElement(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong elementdescription, jint writeoption, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)elementdescription, (int32_t)writeoption, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)elementdescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteEndAttribute(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEndAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteEndCData(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEndCData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteEndElement(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEndElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteEndStartElement(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEndStartElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteEnvelopeEnd(JNIEnv* km_env, jclass km_clazz, jlong message, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEnvelopeEnd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteEnvelopeStart(JNIEnv* km_env, jclass km_clazz, jlong message, jlong writer, jlong donecallback, jlong donecallbackstate, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEnvelopeStart");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)writer, (void*)(uintptr_t)donecallback, (void*)(uintptr_t)donecallbackstate, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)writer;
    (void)donecallback;
    (void)donecallbackstate;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteMessageEnd(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong message, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteMessageEnd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)message, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)message;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteMessageStart(JNIEnv* km_env, jclass km_clazz, jlong channel, jlong message, jlong asynccontext, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteMessageStart");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)channel, (void*)(uintptr_t)message, (void*)(uintptr_t)asynccontext, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)channel;
    (void)message;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteNode(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong node, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteNode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)node, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)node;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteQualifiedName(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong prefix, jlong localname, jlong ns, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteQualifiedName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)prefix, (void*)(uintptr_t)localname, (void*)(uintptr_t)ns, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)prefix;
    (void)localname;
    (void)ns;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteStartAttribute(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong prefix, jlong localname, jlong ns, jint singlequote, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteStartAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)prefix, (void*)(uintptr_t)localname, (void*)(uintptr_t)ns, (int32_t)singlequote, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)prefix;
    (void)localname;
    (void)ns;
    (void)singlequote;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteStartCData(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteStartCData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteStartElement(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong prefix, jlong localname, jlong ns, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteStartElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)prefix, (void*)(uintptr_t)localname, (void*)(uintptr_t)ns, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)prefix;
    (void)localname;
    (void)ns;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteText(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong text, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteText");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)text, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)text;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteType(JNIEnv* km_env, jclass km_clazz, jlong writer, jint typemapping, jint type, jlong typedescription, jint writeoption, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (int32_t)typemapping, (int32_t)type, (void*)(uintptr_t)typedescription, (int32_t)writeoption, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)typemapping;
    (void)type;
    (void)typedescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteValue(JNIEnv* km_env, jclass km_clazz, jlong writer, jint valuetype, jlong value, jint valuesize, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (int32_t)valuetype, (void*)(uintptr_t)value, (uint32_t)valuesize, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)valuetype;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteXmlBuffer(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong xmlbuffer, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteXmlBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)xmlbuffer, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)xmlbuffer;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteXmlBufferToBytes(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong xmlbuffer, jlong encoding, jlong properties, jint propertycount, jlong heap, jlong bytes, jlong bytecount, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteXmlBufferToBytes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)xmlbuffer, (void*)(uintptr_t)encoding, (void*)(uintptr_t)properties, (uint32_t)propertycount, (void*)(uintptr_t)heap, (void*)(uintptr_t)bytes, (void*)(uintptr_t)bytecount, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)xmlbuffer;
    (void)encoding;
    (void)properties;
    (void)propertycount;
    (void)heap;
    (void)bytes;
    (void)bytecount;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsWriteXmlnsAttribute(JNIEnv* km_env, jclass km_clazz, jlong writer, jlong prefix, jlong ns, jint singlequote, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteXmlnsAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)writer, (void*)(uintptr_t)prefix, (void*)(uintptr_t)ns, (int32_t)singlequote, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)writer;
    (void)prefix;
    (void)ns;
    (void)singlequote;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_windowswebservices_WindowsWin32NetworkingWindowswebservicesJniBridge_windowssys_1windows_1win32_1networking_1windowswebservices_1wsXmlStringEquals(JNIEnv* km_env, jclass km_clazz, jlong string1, jlong string2, jlong error) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsXmlStringEquals");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)string1, (void*)(uintptr_t)string2, (void*)(uintptr_t)error);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)string1;
    (void)string2;
    (void)error;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

