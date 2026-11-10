#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_extensibleauthenticationprotocol_wrapper.h"
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

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerClearConnection(void* pconnectionid, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerClearConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pconnectionid, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pconnectionid;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerEndSession(uint32_t sessionhandle, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerEndSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionhandle;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeEapError(void* peaperror) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerFreeEapError");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(peaperror);
        return;
    }
    errno = ENOSYS;
#else
    (void)peaperror;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeErrorMemory(void* peaperror) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerFreeErrorMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(peaperror);
        return;
    }
    errno = ENOSYS;
#else
    (void)peaperror;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeMemory(void* pdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)pdata;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeRuntimeMemory(void* pdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerFreeRuntimeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)pdata;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetAuthStatus(uint32_t sessionhandle, int32_t authparam, void* pcbauthdata, void* ppauthdata, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetAuthStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, authparam, pcbauthdata, ppauthdata, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionhandle;
    (void)authparam;
    (void)pcbauthdata;
    (void)ppauthdata;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetDataToUnplumbCredentials(void* pconnectionidthatlastsavedcreds, void* phcredentialimpersonationtoken, uint32_t sessionhandle, void* ppeaperror, void* fsavetocredman) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetDataToUnplumbCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pconnectionidthatlastsavedcreds, phcredentialimpersonationtoken, sessionhandle, ppeaperror, fsavetocredman);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pconnectionidthatlastsavedcreds;
    (void)phcredentialimpersonationtoken;
    (void)sessionhandle;
    (void)ppeaperror;
    (void)fsavetocredman;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetEncryptedPassword(uint32_t dwsizeofpassword, void* szpassword, void* ppszencpassword) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetEncryptedPassword");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsizeofpassword, szpassword, ppszencpassword);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwsizeofpassword;
    (void)szpassword;
    (void)ppszencpassword;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetMethods(void* peapmethodinfoarray, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetMethods");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(peapmethodinfoarray, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)peapmethodinfoarray;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResponseAttributes(uint32_t sessionhandle, void* pattribs, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetResponseAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, pattribs, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionhandle;
    (void)pattribs;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResult(uint32_t sessionhandle, int32_t reason, void* ppresult, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, reason, ppresult, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionhandle;
    (void)reason;
    (void)ppresult;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetSendPacket(uint32_t sessionhandle, void* pcbsendpacket, void* ppsendpacket, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetSendPacket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, pcbsendpacket, ppsendpacket, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionhandle;
    (void)pcbsendpacket;
    (void)ppsendpacket;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetUIContext(uint32_t sessionhandle, void* pdwsizeofuicontextdata, void* ppuicontextdata, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerGetUIContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, pdwsizeofuicontextdata, ppuicontextdata, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionhandle;
    (void)pdwsizeofuicontextdata;
    (void)ppuicontextdata;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInitialize(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInvokeInteractiveUI(void* hwndparent, uint32_t dwsizeofuicontextdata, void* puicontextdata, void* pdwsizeofdatafrominteractiveui, void* ppdatafrominteractiveui, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerInvokeInteractiveUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dwsizeofuicontextdata, puicontextdata, pdwsizeofdatafrominteractiveui, ppdatafrominteractiveui, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)pdwsizeofdatafrominteractiveui;
    (void)ppdatafrominteractiveui;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerProcessReceivedPacket(uint32_t sessionhandle, uint32_t cbreceivepacket, void* preceivepacket, void* peapoutput, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerProcessReceivedPacket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, cbreceivepacket, preceivepacket, peapoutput, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionhandle;
    (void)cbreceivepacket;
    (void)preceivepacket;
    (void)peapoutput;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryInteractiveUIInputFields(uint32_t dwversion, uint32_t dwflags, uint32_t dwsizeofuicontextdata, void* puicontextdata, void* peapinteractiveuidata, void* ppeaperror, void* ppvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerQueryInteractiveUIInputFields");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata, peapinteractiveuidata, ppeaperror, ppvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwversion;
    (void)dwflags;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)peapinteractiveuidata;
    (void)ppeaperror;
    (void)ppvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryUIBlobFromInteractiveUIInputFields(uint32_t dwversion, uint32_t dwflags, uint32_t dwsizeofuicontextdata, void* puicontextdata, void* peapinteractiveuidata, void* pdwsizeofdatafrominteractiveui, void* ppdatafrominteractiveui, void* ppeaperror, void* ppvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappcfg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerQueryUIBlobFromInteractiveUIInputFields");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata, peapinteractiveuidata, pdwsizeofdatafrominteractiveui, ppdatafrominteractiveui, ppeaperror, ppvreserved);
    }
    errno = ENOSYS;
    return 0;
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
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetResponseAttributes(uint32_t sessionhandle, void* pattribs, void* peapoutput, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerSetResponseAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, pattribs, peapoutput, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionhandle;
    (void)pattribs;
    (void)peapoutput;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetUIContext(uint32_t sessionhandle, uint32_t dwsizeofuicontextdata, void* puicontextdata, void* peapoutput, void* ppeaperror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerSetUIContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, dwsizeofuicontextdata, puicontextdata, peapoutput, ppeaperror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sessionhandle;
    (void)dwsizeofuicontextdata;
    (void)puicontextdata;
    (void)peapoutput;
    (void)ppeaperror;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerUninitialize(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("eappprxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EapHostPeerUninitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

