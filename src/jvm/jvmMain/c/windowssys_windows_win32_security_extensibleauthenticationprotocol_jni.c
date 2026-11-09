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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerClearConnection(JNIEnv* km_env, jclass km_clazz, jlong pconnectionid, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerClearConnection");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pconnectionid, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)pconnectionid;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerEndSession(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerEndSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerFreeEapError(JNIEnv* km_env, jclass km_clazz, jlong peaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerFreeEapError");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)peaperror);
#else
    (void)peaperror;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerFreeErrorMemory(JNIEnv* km_env, jclass km_clazz, jlong peaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerFreeErrorMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)peaperror);
#else
    (void)peaperror;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerFreeMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pdata);
#else
    (void)pdata;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerFreeRuntimeMemory(JNIEnv* km_env, jclass km_clazz, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerFreeRuntimeMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pdata);
#else
    (void)pdata;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerGetAuthStatus(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint authparam, jlong pcbauthdata, jlong ppauthdata, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetAuthStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (int32_t)authparam, (void*)(uintptr_t)pcbauthdata, (void*)(uintptr_t)ppauthdata, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)authparam;
    (void)pcbauthdata;
    (void)ppauthdata;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerGetDataToUnplumbCredentials(JNIEnv* km_env, jclass km_clazz, jlong pconnectionidthatlastsavedcreds, jlong phcredentialimpersonationtoken, jint sessionhandle, jlong ppeaperror, jlong fsavetocredman) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetDataToUnplumbCredentials");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pconnectionidthatlastsavedcreds, (void*)(uintptr_t)phcredentialimpersonationtoken, (uint32_t)sessionhandle, (void*)(uintptr_t)ppeaperror, (void*)(uintptr_t)fsavetocredman) : 0;
#else
    (void)pconnectionidthatlastsavedcreds;
    (void)phcredentialimpersonationtoken;
    (void)sessionhandle;
    (void)ppeaperror;
    (void)fsavetocredman;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerGetEncryptedPassword(JNIEnv* km_env, jclass km_clazz, jint dwsizeofpassword, jlong szpassword, jlong ppszencpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetEncryptedPassword");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsizeofpassword, (void*)(uintptr_t)szpassword, (void*)(uintptr_t)ppszencpassword) : 0;
#else
    (void)dwsizeofpassword;
    (void)szpassword;
    (void)ppszencpassword;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerGetMethods(JNIEnv* km_env, jclass km_clazz, jlong peapmethodinfoarray, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetMethods");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)peapmethodinfoarray, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)peapmethodinfoarray;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerGetResponseAttributes(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong pattribs, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetResponseAttributes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)pattribs, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)pattribs;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerGetResult(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint reason, jlong ppresult, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetResult");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (int32_t)reason, (void*)(uintptr_t)ppresult, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)reason;
    (void)ppresult;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerGetSendPacket(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong pcbsendpacket, jlong ppsendpacket, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetSendPacket");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)pcbsendpacket, (void*)(uintptr_t)ppsendpacket, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)pcbsendpacket;
    (void)ppsendpacket;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerGetUIContext(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong pdwsizeofuicontextdata, jlong ppuicontextdata, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetUIContext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)pdwsizeofuicontextdata, (void*)(uintptr_t)ppuicontextdata, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)pdwsizeofuicontextdata;
    (void)ppuicontextdata;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerInitialize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerInitialize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerInvokeInteractiveUI(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jint dwsizeofuicontextdata, jlong puicontextdata, jlong pdwsizeofdatafrominteractiveui, jlong ppdatafrominteractiveui, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerInvokeInteractiveUI");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (uint32_t)dwsizeofuicontextdata, (void*)(uintptr_t)puicontextdata, (void*)(uintptr_t)pdwsizeofdatafrominteractiveui, (void*)(uintptr_t)ppdatafrominteractiveui, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)hwndparent;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)pdwsizeofdatafrominteractiveui;
    (void)ppdatafrominteractiveui;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerProcessReceivedPacket(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint cbreceivepacket, jlong preceivepacket, jlong peapoutput, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerProcessReceivedPacket");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)cbreceivepacket, (void*)(uintptr_t)preceivepacket, (void*)(uintptr_t)peapoutput, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)cbreceivepacket;
    (void)preceivepacket;
    (void)peapoutput;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerQueryInteractiveUIInputFields(JNIEnv* km_env, jclass km_clazz, jint dwversion, jint dwflags, jint dwsizeofuicontextdata, jlong puicontextdata, jlong peapinteractiveuidata, jlong ppeaperror, jlong ppvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerQueryInteractiveUIInputFields");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwversion, (uint32_t)dwflags, (uint32_t)dwsizeofuicontextdata, (void*)(uintptr_t)puicontextdata, (void*)(uintptr_t)peapinteractiveuidata, (void*)(uintptr_t)ppeaperror, (void*)(uintptr_t)ppvreserved) : 0;
#else
    (void)dwversion;
    (void)dwflags;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)peapinteractiveuidata;
    (void)ppeaperror;
    (void)ppvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerQueryUIBlobFromInteractiveUIInputFields(JNIEnv* km_env, jclass km_clazz, jint dwversion, jint dwflags, jint dwsizeofuicontextdata, jlong puicontextdata, jlong peapinteractiveuidata, jlong pdwsizeofdatafrominteractiveui, jlong ppdatafrominteractiveui, jlong ppeaperror, jlong ppvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerQueryUIBlobFromInteractiveUIInputFields");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwversion, (uint32_t)dwflags, (uint32_t)dwsizeofuicontextdata, (void*)(uintptr_t)puicontextdata, (void*)(uintptr_t)peapinteractiveuidata, (void*)(uintptr_t)pdwsizeofdatafrominteractiveui, (void*)(uintptr_t)ppdatafrominteractiveui, (void*)(uintptr_t)ppeaperror, (void*)(uintptr_t)ppvreserved) : 0;
#else
    (void)dwversion;
    (void)dwflags;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)peapinteractiveuidata;
    (void)pdwsizeofdatafrominteractiveui;
    (void)ppdatafrominteractiveui;
    (void)ppeaperror;
    (void)ppvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerSetResponseAttributes(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong pattribs, jlong peapoutput, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerSetResponseAttributes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)pattribs, (void*)(uintptr_t)peapoutput, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)pattribs;
    (void)peapoutput;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerSetUIContext(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint dwsizeofuicontextdata, jlong puicontextdata, jlong peapoutput, jlong ppeaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerSetUIContext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)dwsizeofuicontextdata, (void*)(uintptr_t)puicontextdata, (void*)(uintptr_t)peapoutput, (void*)(uintptr_t)ppeaperror) : 0;
#else
    (void)sessionhandle;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)peapoutput;
    (void)ppeaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_extensibleauthenticationprotocol_WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge_windowssys_1windows_1win32_1security_1extensibleauthenticationprotocol_1EapHostPeerUninitialize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerUninitialize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

