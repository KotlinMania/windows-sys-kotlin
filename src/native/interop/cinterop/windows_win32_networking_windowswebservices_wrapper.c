#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networking_windowswebservices_wrapper.h"
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

int32_t windowssys_windows_win32_networking_windowswebservices_WebAuthNAuthenticatorGetAssertion(void* hwnd, void* pwszrpid, void* pwebauthnclientdata, void* pwebauthngetassertionoptions, void* ppwebauthnassertion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNAuthenticatorGetAssertion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pwszrpid, pwebauthnclientdata, pwebauthngetassertionoptions, ppwebauthnassertion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pwszrpid;
    (void)pwebauthnclientdata;
    (void)pwebauthngetassertionoptions;
    (void)ppwebauthnassertion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WebAuthNAuthenticatorMakeCredential(void* hwnd, void* prpinformation, void* puserinformation, void* ppubkeycredparams, void* pwebauthnclientdata, void* pwebauthnmakecredentialoptions, void* ppwebauthncredentialattestation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNAuthenticatorMakeCredential");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, prpinformation, puserinformation, ppubkeycredparams, pwebauthnclientdata, pwebauthnmakecredentialoptions, ppwebauthncredentialattestation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)prpinformation;
    (void)puserinformation;
    (void)ppubkeycredparams;
    (void)pwebauthnclientdata;
    (void)pwebauthnmakecredentialoptions;
    (void)ppwebauthncredentialattestation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WebAuthNCancelCurrentOperation(void* pcancellationid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNCancelCurrentOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcancellationid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcancellationid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WebAuthNDeletePlatformCredential(uint32_t cbcredentialid, void* pbcredentialid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNDeletePlatformCredential");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cbcredentialid, pbcredentialid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cbcredentialid;
    (void)pbcredentialid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WebAuthNFreeAssertion(void* pwebauthnassertion) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNFreeAssertion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pwebauthnassertion);
        return;
    }
    errno = ENOSYS;
#else
    (void)pwebauthnassertion;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WebAuthNFreeCredentialAttestation(void* pwebauthncredentialattestation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNFreeCredentialAttestation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pwebauthncredentialattestation);
        return;
    }
    errno = ENOSYS;
#else
    (void)pwebauthncredentialattestation;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WebAuthNFreePlatformCredentialList(void* pcredentialdetailslist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNFreePlatformCredentialList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pcredentialdetailslist);
        return;
    }
    errno = ENOSYS;
#else
    (void)pcredentialdetailslist;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_windowswebservices_WebAuthNGetApiVersionNumber(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNGetApiVersionNumber");
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

int32_t windowssys_windows_win32_networking_windowswebservices_WebAuthNGetCancellationId(void* pcancellationid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNGetCancellationId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcancellationid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcancellationid;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_windowswebservices_WebAuthNGetErrorName(int32_t hr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNGetErrorName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hr;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WebAuthNGetPlatformCredentialList(void* pgetcredentialsoptions, void* ppcredentialdetailslist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNGetPlatformCredentialList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pgetcredentialsoptions, ppcredentialdetailslist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pgetcredentialsoptions;
    (void)ppcredentialdetailslist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WebAuthNGetW3CExceptionDOMError(int32_t hr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNGetW3CExceptionDOMError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(void* pbisuserverifyingplatformauthenticatoravailable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webauthn.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbisuserverifyingplatformauthenticatoravailable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbisuserverifyingplatformauthenticatoravailable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAbandonCall(void* serviceproxy, uint32_t callid, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbandonCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceproxy, callid, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceproxy;
    (void)callid;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAbandonMessage(void* channel, void* message, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbandonMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, message, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)message;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAbortChannel(void* channel, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbortChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAbortListener(void* listener, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbortListener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAbortServiceHost(void* servicehost, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbortServiceHost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicehost, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servicehost;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAbortServiceProxy(void* serviceproxy, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAbortServiceProxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceproxy, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceproxy;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAcceptChannel(void* listener, void* channel, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAcceptChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, channel, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)channel;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAddCustomHeader(void* message, void* headerdescription, int32_t writeoption, void* value, uint32_t valuesize, uint32_t headerattributes, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAddCustomHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, headerdescription, writeoption, value, valuesize, headerattributes, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)headerdescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)headerattributes;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAddErrorString(void* error, void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAddErrorString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(error, string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)error;
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAddMappedHeader(void* message, void* headername, int32_t valuetype, int32_t writeoption, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAddMappedHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, headername, valuetype, writeoption, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)headername;
    (void)valuetype;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAddressMessage(void* message, void* address, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAddressMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, address, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)address;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAlloc(void* heap, uint64_t size, void* ptr, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heap, size, ptr, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heap;
    (void)size;
    (void)ptr;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsAsyncExecute(void* asyncstate, void* operation, int32_t callbackmodel, void* callbackstate, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsAsyncExecute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(asyncstate, operation, callbackmodel, callbackstate, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)asyncstate;
    (void)operation;
    (void)callbackmodel;
    (void)callbackstate;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCall(void* serviceproxy, void* operation, void* arguments, void* heap, void* callproperties, uint32_t callpropertycount, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceproxy, operation, arguments, heap, callproperties, callpropertycount, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCheckMustUnderstandHeaders(void* message, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCheckMustUnderstandHeaders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCloseChannel(void* channel, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCloseChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCloseListener(void* listener, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCloseListener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCloseServiceHost(void* servicehost, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCloseServiceHost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicehost, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servicehost;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCloseServiceProxy(void* serviceproxy, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCloseServiceProxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceproxy, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceproxy;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCombineUrl(void* baseurl, void* referenceurl, uint32_t flags, void* heap, void* resulturl, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCombineUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(baseurl, referenceurl, flags, heap, resulturl, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)baseurl;
    (void)referenceurl;
    (void)flags;
    (void)heap;
    (void)resulturl;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCopyError(void* source, void* destination) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCopyError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, destination);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)source;
    (void)destination;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCopyNode(void* writer, void* reader, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCopyNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, reader, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)reader;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateChannel(int32_t channeltype, int32_t channelbinding, void* properties, uint32_t propertycount, void* securitydescription, void* channel, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channeltype, channelbinding, properties, propertycount, securitydescription, channel, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channeltype;
    (void)channelbinding;
    (void)properties;
    (void)propertycount;
    (void)securitydescription;
    (void)channel;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateChannelForListener(void* listener, void* properties, uint32_t propertycount, void* channel, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateChannelForListener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, properties, propertycount, channel, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)properties;
    (void)propertycount;
    (void)channel;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateError(void* properties, uint32_t propertycount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(properties, propertycount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateFaultFromError(void* error, int32_t faulterrorcode, int32_t faultdisclosure, void* heap, void* fault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateFaultFromError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(error, faulterrorcode, faultdisclosure, heap, fault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)error;
    (void)faulterrorcode;
    (void)faultdisclosure;
    (void)heap;
    (void)fault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateHeap(uint64_t maxsize, uint64_t trimsize, void* properties, uint32_t propertycount, void* heap, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateHeap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maxsize, trimsize, properties, propertycount, heap, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)maxsize;
    (void)trimsize;
    (void)properties;
    (void)propertycount;
    (void)heap;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateListener(int32_t channeltype, int32_t channelbinding, void* properties, uint32_t propertycount, void* securitydescription, void* listener, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateListener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channeltype, channelbinding, properties, propertycount, securitydescription, listener, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channeltype;
    (void)channelbinding;
    (void)properties;
    (void)propertycount;
    (void)securitydescription;
    (void)listener;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateMessage(int32_t envelopeversion, int32_t addressingversion, void* properties, uint32_t propertycount, void* message, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(envelopeversion, addressingversion, properties, propertycount, message, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)envelopeversion;
    (void)addressingversion;
    (void)properties;
    (void)propertycount;
    (void)message;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateMessageForChannel(void* channel, void* properties, uint32_t propertycount, void* message, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateMessageForChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, properties, propertycount, message, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)properties;
    (void)propertycount;
    (void)message;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateMetadata(void* properties, uint32_t propertycount, void* metadata, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(properties, propertycount, metadata, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)properties;
    (void)propertycount;
    (void)metadata;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateReader(void* properties, uint32_t propertycount, void* reader, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateReader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(properties, propertycount, reader, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)properties;
    (void)propertycount;
    (void)reader;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateServiceEndpointFromTemplate(int32_t channeltype, void* properties, uint32_t propertycount, void* addressurl, void* contract, void* authorizationcallback, void* heap, int32_t templatetype, void* templatevalue, uint32_t templatesize, void* templatedescription, uint32_t templatedescriptionsize, void* serviceendpoint, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, void*, void*, int32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateServiceEndpointFromTemplate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channeltype, properties, propertycount, addressurl, contract, authorizationcallback, heap, templatetype, templatevalue, templatesize, templatedescription, templatedescriptionsize, serviceendpoint, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateServiceHost(void* endpoints, uint16_t endpointcount, void* serviceproperties, uint32_t servicepropertycount, void* servicehost, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateServiceHost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(endpoints, endpointcount, serviceproperties, servicepropertycount, servicehost, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)endpoints;
    (void)endpointcount;
    (void)serviceproperties;
    (void)servicepropertycount;
    (void)servicehost;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateServiceProxy(int32_t channeltype, int32_t channelbinding, void* securitydescription, void* properties, uint32_t propertycount, void* channelproperties, uint32_t channelpropertycount, void* serviceproxy, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateServiceProxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channeltype, channelbinding, securitydescription, properties, propertycount, channelproperties, channelpropertycount, serviceproxy, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateServiceProxyFromTemplate(int32_t channeltype, void* properties, uint32_t propertycount, int32_t templatetype, void* templatevalue, uint32_t templatesize, void* templatedescription, uint32_t templatedescriptionsize, void* serviceproxy, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, int32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateServiceProxyFromTemplate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channeltype, properties, propertycount, templatetype, templatevalue, templatesize, templatedescription, templatedescriptionsize, serviceproxy, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateWriter(void* properties, uint32_t propertycount, void* writer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateWriter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(properties, propertycount, writer, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)properties;
    (void)propertycount;
    (void)writer;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateXmlBuffer(void* heap, void* properties, uint32_t propertycount, void* buffer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateXmlBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heap, properties, propertycount, buffer, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heap;
    (void)properties;
    (void)propertycount;
    (void)buffer;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsCreateXmlSecurityToken(void* tokenxml, void* tokenkey, void* properties, uint32_t propertycount, void* token, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsCreateXmlSecurityToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenxml, tokenkey, properties, propertycount, token, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenxml;
    (void)tokenkey;
    (void)properties;
    (void)propertycount;
    (void)token;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsDateTimeToFileTime(void* datetime, void* filetime, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsDateTimeToFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datetime, filetime, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datetime;
    (void)filetime;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsDecodeUrl(void* url, uint32_t flags, void* heap, void* outurl, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsDecodeUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(url, flags, heap, outurl, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)url;
    (void)flags;
    (void)heap;
    (void)outurl;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsEncodeUrl(void* url, uint32_t flags, void* heap, void* outurl, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsEncodeUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(url, flags, heap, outurl, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)url;
    (void)flags;
    (void)heap;
    (void)outurl;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsEndReaderCanonicalization(void* reader, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsEndReaderCanonicalization");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsEndWriterCanonicalization(void* writer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsEndWriterCanonicalization");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsFileTimeToDateTime(void* filetime, void* datetime, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFileTimeToDateTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filetime, datetime, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filetime;
    (void)datetime;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsFillBody(void* message, uint32_t minsize, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFillBody");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, minsize, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)minsize;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsFillReader(void* reader, uint32_t minsize, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFillReader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, minsize, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)minsize;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsFindAttribute(void* reader, void* localname, void* ns, int32_t required, void* attributeindex, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFindAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, localname, ns, required, attributeindex, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)localname;
    (void)ns;
    (void)required;
    (void)attributeindex;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsFlushBody(void* message, uint32_t minsize, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFlushBody");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, minsize, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)minsize;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsFlushWriter(void* writer, uint32_t minsize, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFlushWriter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, minsize, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)minsize;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeChannel(void* channel) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(channel);
        return;
    }
    errno = ENOSYS;
#else
    (void)channel;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeError(void* error) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeError");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(error);
        return;
    }
    errno = ENOSYS;
#else
    (void)error;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeHeap(void* heap) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeHeap");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(heap);
        return;
    }
    errno = ENOSYS;
#else
    (void)heap;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeListener(void* listener) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeListener");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listener);
        return;
    }
    errno = ENOSYS;
#else
    (void)listener;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeMessage(void* message) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(message);
        return;
    }
    errno = ENOSYS;
#else
    (void)message;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeMetadata(void* metadata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(metadata);
        return;
    }
    errno = ENOSYS;
#else
    (void)metadata;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeReader(void* reader) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeReader");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(reader);
        return;
    }
    errno = ENOSYS;
#else
    (void)reader;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeSecurityToken(void* token) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeSecurityToken");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(token);
        return;
    }
    errno = ENOSYS;
#else
    (void)token;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeServiceHost(void* servicehost) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeServiceHost");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(servicehost);
        return;
    }
    errno = ENOSYS;
#else
    (void)servicehost;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeServiceProxy(void* serviceproxy) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeServiceProxy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(serviceproxy);
        return;
    }
    errno = ENOSYS;
#else
    (void)serviceproxy;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_windowswebservices_WsFreeWriter(void* writer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsFreeWriter");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(writer);
        return;
    }
    errno = ENOSYS;
#else
    (void)writer;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetChannelProperty(void* channel, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetChannelProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetCustomHeader(void* message, void* customheaderdescription, int32_t repeatingoption, uint32_t headerindex, int32_t readoption, void* heap, void* value, uint32_t valuesize, void* headerattributes, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, int32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetCustomHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, customheaderdescription, repeatingoption, headerindex, readoption, heap, value, valuesize, headerattributes, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetDictionary(int32_t encoding, void* dictionary, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetDictionary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(encoding, dictionary, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)encoding;
    (void)dictionary;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetErrorProperty(void* error, int32_t id, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetErrorProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(error, id, buffer, buffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)error;
    (void)id;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetErrorString(void* error, uint32_t arg_1_index, void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetErrorString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(error, arg_1_index, string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)error;
    (void)arg_1_index;
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetFaultErrorDetail(void* error, void* faultdetaildescription, int32_t readoption, void* heap, void* value, uint32_t valuesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetFaultErrorDetail");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(error, faultdetaildescription, readoption, heap, value, valuesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)error;
    (void)faultdetaildescription;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetFaultErrorProperty(void* error, int32_t id, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetFaultErrorProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(error, id, buffer, buffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)error;
    (void)id;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetHeader(void* message, int32_t headertype, int32_t valuetype, int32_t readoption, void* heap, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, headertype, valuetype, readoption, heap, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetHeaderAttributes(void* message, void* reader, void* headerattributes, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetHeaderAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, reader, headerattributes, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)reader;
    (void)headerattributes;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetHeapProperty(void* heap, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetHeapProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heap, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heap;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetListenerProperty(void* listener, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetListenerProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetMappedHeader(void* message, void* headername, int32_t repeatingoption, uint32_t headerindex, int32_t valuetype, int32_t readoption, void* heap, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, int32_t, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetMappedHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, headername, repeatingoption, headerindex, valuetype, readoption, heap, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetMessageProperty(void* message, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetMessageProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetMetadataEndpoints(void* metadata, void* endpoints, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetMetadataEndpoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(metadata, endpoints, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)metadata;
    (void)endpoints;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetMetadataProperty(void* metadata, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetMetadataProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(metadata, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)metadata;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetMissingMetadataDocumentAddress(void* metadata, void* address, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetMissingMetadataDocumentAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(metadata, address, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)metadata;
    (void)address;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetNamespaceFromPrefix(void* reader, void* prefix, int32_t required, void* ns, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetNamespaceFromPrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, prefix, required, ns, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)prefix;
    (void)required;
    (void)ns;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetOperationContextProperty(void* context, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetOperationContextProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetPolicyAlternativeCount(void* policy, void* count, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetPolicyAlternativeCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy, count, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policy;
    (void)count;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetPolicyProperty(void* policy, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetPolicyProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policy;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetPrefixFromNamespace(void* writer, void* ns, int32_t required, void* prefix, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetPrefixFromNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, ns, required, prefix, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)ns;
    (void)required;
    (void)prefix;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetReaderNode(void* xmlreader, void* node, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetReaderNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(xmlreader, node, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)xmlreader;
    (void)node;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetReaderPosition(void* reader, void* nodeposition, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetReaderPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, nodeposition, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)nodeposition;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetReaderProperty(void* reader, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetReaderProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetSecurityContextProperty(void* securitycontext, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetSecurityContextProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitycontext, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitycontext;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetSecurityTokenProperty(void* securitytoken, int32_t id, void* value, uint32_t valuesize, void* heap, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetSecurityTokenProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitytoken, id, value, valuesize, heap, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitytoken;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)heap;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetServiceHostProperty(void* servicehost, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetServiceHostProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicehost, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servicehost;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetServiceProxyProperty(void* serviceproxy, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetServiceProxyProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceproxy, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceproxy;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetWriterPosition(void* writer, void* nodeposition, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetWriterPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, nodeposition, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)nodeposition;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetWriterProperty(void* writer, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetWriterProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsGetXmlAttribute(void* reader, void* localname, void* heap, void* valuechars, void* valuecharcount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsGetXmlAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, localname, heap, valuechars, valuecharcount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)localname;
    (void)heap;
    (void)valuechars;
    (void)valuecharcount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsInitializeMessage(void* message, int32_t initialization, void* sourcemessage, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsInitializeMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, initialization, sourcemessage, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)initialization;
    (void)sourcemessage;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsMarkHeaderAsUnderstood(void* message, void* headerposition, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsMarkHeaderAsUnderstood");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, headerposition, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)headerposition;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsMatchPolicyAlternative(void* policy, uint32_t alternativeindex, void* policyconstraints, int32_t matchrequired, void* heap, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsMatchPolicyAlternative");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policy, alternativeindex, policyconstraints, matchrequired, heap, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policy;
    (void)alternativeindex;
    (void)policyconstraints;
    (void)matchrequired;
    (void)heap;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsMoveReader(void* reader, int32_t moveto, void* found, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsMoveReader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, moveto, found, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)moveto;
    (void)found;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsMoveWriter(void* writer, int32_t moveto, void* found, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsMoveWriter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, moveto, found, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)moveto;
    (void)found;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsOpenChannel(void* channel, void* endpointaddress, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsOpenChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, endpointaddress, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)endpointaddress;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsOpenListener(void* listener, void* url, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsOpenListener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, url, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)url;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsOpenServiceHost(void* servicehost, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsOpenServiceHost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicehost, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servicehost;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsOpenServiceProxy(void* serviceproxy, void* address, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsOpenServiceProxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceproxy, address, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceproxy;
    (void)address;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsPullBytes(void* writer, void* callback, void* callbackstate, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsPullBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, callback, callbackstate, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)callback;
    (void)callbackstate;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsPushBytes(void* writer, void* callback, void* callbackstate, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsPushBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, callback, callbackstate, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)callback;
    (void)callbackstate;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadArray(void* reader, void* localname, void* ns, int32_t valuetype, void* array, uint32_t arraysize, uint32_t itemoffset, uint32_t itemcount, void* actualitemcount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, localname, ns, valuetype, array, arraysize, itemoffset, itemcount, actualitemcount, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadAttribute(void* reader, void* attributedescription, int32_t readoption, void* heap, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, attributedescription, readoption, heap, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)attributedescription;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadBody(void* message, void* bodydescription, int32_t readoption, void* heap, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadBody");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, bodydescription, readoption, heap, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)bodydescription;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadBytes(void* reader, void* bytes, uint32_t maxbytecount, void* actualbytecount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, bytes, maxbytecount, actualbytecount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)bytes;
    (void)maxbytecount;
    (void)actualbytecount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadChars(void* reader, void* chars, uint32_t maxcharcount, void* actualcharcount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadChars");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, chars, maxcharcount, actualcharcount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)chars;
    (void)maxcharcount;
    (void)actualcharcount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadCharsUtf8(void* reader, void* bytes, uint32_t maxbytecount, void* actualbytecount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadCharsUtf8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, bytes, maxbytecount, actualbytecount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)bytes;
    (void)maxbytecount;
    (void)actualbytecount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadElement(void* reader, void* elementdescription, int32_t readoption, void* heap, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, elementdescription, readoption, heap, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)elementdescription;
    (void)readoption;
    (void)heap;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadEndAttribute(void* reader, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadEndAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadEndElement(void* reader, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadEndElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadEndpointAddressExtension(void* reader, void* endpointaddress, int32_t extensiontype, int32_t readoption, void* heap, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadEndpointAddressExtension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, endpointaddress, extensiontype, readoption, heap, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadEnvelopeEnd(void* message, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadEnvelopeEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadEnvelopeStart(void* message, void* reader, void* donecallback, void* donecallbackstate, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadEnvelopeStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, reader, donecallback, donecallbackstate, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)reader;
    (void)donecallback;
    (void)donecallbackstate;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadMessageEnd(void* channel, void* message, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadMessageEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, message, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)message;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadMessageStart(void* channel, void* message, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadMessageStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, message, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)message;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadMetadata(void* metadata, void* reader, void* url, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(metadata, reader, url, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)metadata;
    (void)reader;
    (void)url;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadNode(void* reader, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadQualifiedName(void* reader, void* heap, void* prefix, void* localname, void* ns, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadQualifiedName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, heap, prefix, localname, ns, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)heap;
    (void)prefix;
    (void)localname;
    (void)ns;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadStartAttribute(void* reader, uint32_t attributeindex, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadStartAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, attributeindex, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)attributeindex;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadStartElement(void* reader, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadStartElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadToStartElement(void* reader, void* localname, void* ns, void* found, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadToStartElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, localname, ns, found, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)localname;
    (void)ns;
    (void)found;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadType(void* reader, int32_t typemapping, int32_t type, void* typedescription, int32_t readoption, void* heap, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, typemapping, type, typedescription, readoption, heap, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadValue(void* reader, int32_t valuetype, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, valuetype, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)valuetype;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadXmlBuffer(void* reader, void* heap, void* xmlbuffer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadXmlBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, heap, xmlbuffer, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)heap;
    (void)xmlbuffer;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReadXmlBufferFromBytes(void* reader, void* encoding, void* properties, uint32_t propertycount, void* bytes, uint32_t bytecount, void* heap, void* xmlbuffer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReadXmlBufferFromBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, encoding, properties, propertycount, bytes, bytecount, heap, xmlbuffer, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsReceiveMessage(void* channel, void* message, void* messagedescriptions, uint32_t messagedescriptioncount, int32_t receiveoption, int32_t readbodyoption, void* heap, void* value, uint32_t valuesize, void* arg_9_index, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, int32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsReceiveMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, message, messagedescriptions, messagedescriptioncount, receiveoption, readbodyoption, heap, value, valuesize, arg_9_index, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsRegisterOperationForCancel(void* context, void* cancelcallback, void* freestatecallback, void* userstate, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRegisterOperationForCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, cancelcallback, freestatecallback, userstate, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)cancelcallback;
    (void)freestatecallback;
    (void)userstate;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsRemoveCustomHeader(void* message, void* headername, void* headerns, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRemoveCustomHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, headername, headerns, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)headername;
    (void)headerns;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsRemoveHeader(void* message, int32_t headertype, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRemoveHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, headertype, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)headertype;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsRemoveMappedHeader(void* message, void* headername, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRemoveMappedHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, headername, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)headername;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsRemoveNode(void* nodeposition, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRemoveNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nodeposition, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nodeposition;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsRequestReply(void* channel, void* requestmessage, void* requestmessagedescription, int32_t writeoption, void* requestbodyvalue, uint32_t requestbodyvaluesize, void* replymessage, void* replymessagedescription, int32_t readoption, void* heap, void* value, uint32_t valuesize, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*, void*, int32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRequestReply");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, requestmessage, requestmessagedescription, writeoption, requestbodyvalue, requestbodyvaluesize, replymessage, replymessagedescription, readoption, heap, value, valuesize, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsRequestSecurityToken(void* channel, void* properties, uint32_t propertycount, void* token, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRequestSecurityToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, properties, propertycount, token, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)properties;
    (void)propertycount;
    (void)token;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsResetChannel(void* channel, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsResetError(void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsResetHeap(void* heap, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetHeap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heap, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heap;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsResetListener(void* listener, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetListener");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsResetMessage(void* message, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsResetMetadata(void* metadata, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(metadata, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)metadata;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsResetServiceHost(void* servicehost, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetServiceHost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicehost, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servicehost;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsResetServiceProxy(void* serviceproxy, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsResetServiceProxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceproxy, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceproxy;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsRevokeSecurityContext(void* securitycontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsRevokeSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitycontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitycontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSendFaultMessageForError(void* channel, void* replymessage, void* faulterror, int32_t faulterrorcode, int32_t faultdisclosure, void* requestmessage, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSendFaultMessageForError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, replymessage, faulterror, faulterrorcode, faultdisclosure, requestmessage, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSendMessage(void* channel, void* message, void* messagedescription, int32_t writeoption, void* bodyvalue, uint32_t bodyvaluesize, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSendMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, message, messagedescription, writeoption, bodyvalue, bodyvaluesize, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSendReplyMessage(void* channel, void* replymessage, void* replymessagedescription, int32_t writeoption, void* replybodyvalue, uint32_t replybodyvaluesize, void* requestmessage, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSendReplyMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, replymessage, replymessagedescription, writeoption, replybodyvalue, replybodyvaluesize, requestmessage, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetChannelProperty(void* channel, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetChannelProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetErrorProperty(void* error, int32_t id, void* value, uint32_t valuesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetErrorProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(error, id, value, valuesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)error;
    (void)id;
    (void)value;
    (void)valuesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetFaultErrorDetail(void* error, void* faultdetaildescription, int32_t writeoption, void* value, uint32_t valuesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetFaultErrorDetail");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(error, faultdetaildescription, writeoption, value, valuesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)error;
    (void)faultdetaildescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetFaultErrorProperty(void* error, int32_t id, void* value, uint32_t valuesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetFaultErrorProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(error, id, value, valuesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)error;
    (void)id;
    (void)value;
    (void)valuesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetHeader(void* message, int32_t headertype, int32_t valuetype, int32_t writeoption, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, headertype, valuetype, writeoption, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)headertype;
    (void)valuetype;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetInput(void* reader, void* encoding, void* input, void* properties, uint32_t propertycount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetInput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, encoding, input, properties, propertycount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)encoding;
    (void)input;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetInputToBuffer(void* reader, void* buffer, void* properties, uint32_t propertycount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetInputToBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, buffer, properties, propertycount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)buffer;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetListenerProperty(void* listener, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetListenerProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listener, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listener;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetMessageProperty(void* message, int32_t id, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetMessageProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, id, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)id;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetOutput(void* writer, void* encoding, void* output, void* properties, uint32_t propertycount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetOutput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, encoding, output, properties, propertycount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)encoding;
    (void)output;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetOutputToBuffer(void* writer, void* buffer, void* properties, uint32_t propertycount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetOutputToBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, buffer, properties, propertycount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)buffer;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetReaderPosition(void* reader, void* nodeposition, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetReaderPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, nodeposition, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)nodeposition;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSetWriterPosition(void* writer, void* nodeposition, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSetWriterPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, nodeposition, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)nodeposition;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsShutdownSessionChannel(void* channel, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsShutdownSessionChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsSkipNode(void* reader, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsSkipNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsStartReaderCanonicalization(void* reader, void* writecallback, void* writecallbackstate, void* properties, uint32_t propertycount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsStartReaderCanonicalization");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reader, writecallback, writecallbackstate, properties, propertycount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reader;
    (void)writecallback;
    (void)writecallbackstate;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsStartWriterCanonicalization(void* writer, void* writecallback, void* writecallbackstate, void* properties, uint32_t propertycount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsStartWriterCanonicalization");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, writecallback, writecallbackstate, properties, propertycount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)writecallback;
    (void)writecallbackstate;
    (void)properties;
    (void)propertycount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsTrimXmlWhitespace(void* chars, uint32_t charcount, void* trimmedchars, void* trimmedcount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsTrimXmlWhitespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(chars, charcount, trimmedchars, trimmedcount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)chars;
    (void)charcount;
    (void)trimmedchars;
    (void)trimmedcount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsVerifyXmlNCName(void* ncnamechars, uint32_t ncnamecharcount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsVerifyXmlNCName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ncnamechars, ncnamecharcount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ncnamechars;
    (void)ncnamecharcount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteArray(void* writer, void* localname, void* ns, int32_t valuetype, void* array, uint32_t arraysize, uint32_t itemoffset, uint32_t itemcount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, localname, ns, valuetype, array, arraysize, itemoffset, itemcount, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteAttribute(void* writer, void* attributedescription, int32_t writeoption, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, attributedescription, writeoption, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)attributedescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteBody(void* message, void* bodydescription, int32_t writeoption, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteBody");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, bodydescription, writeoption, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)bodydescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteBytes(void* writer, void* bytes, uint32_t bytecount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, bytes, bytecount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)bytes;
    (void)bytecount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteChars(void* writer, void* chars, uint32_t charcount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteChars");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, chars, charcount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)chars;
    (void)charcount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteCharsUtf8(void* writer, void* bytes, uint32_t bytecount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteCharsUtf8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, bytes, bytecount, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)bytes;
    (void)bytecount;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteElement(void* writer, void* elementdescription, int32_t writeoption, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, elementdescription, writeoption, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)elementdescription;
    (void)writeoption;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteEndAttribute(void* writer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEndAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteEndCData(void* writer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEndCData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteEndElement(void* writer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEndElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteEndStartElement(void* writer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEndStartElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteEnvelopeEnd(void* message, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEnvelopeEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteEnvelopeStart(void* message, void* writer, void* donecallback, void* donecallbackstate, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteEnvelopeStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, writer, donecallback, donecallbackstate, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)writer;
    (void)donecallback;
    (void)donecallbackstate;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteMessageEnd(void* channel, void* message, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteMessageEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, message, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)message;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteMessageStart(void* channel, void* message, void* asynccontext, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteMessageStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(channel, message, asynccontext, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)channel;
    (void)message;
    (void)asynccontext;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteNode(void* writer, void* node, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, node, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)node;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteQualifiedName(void* writer, void* prefix, void* localname, void* ns, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteQualifiedName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, prefix, localname, ns, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)prefix;
    (void)localname;
    (void)ns;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteStartAttribute(void* writer, void* prefix, void* localname, void* ns, int32_t singlequote, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteStartAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, prefix, localname, ns, singlequote, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)prefix;
    (void)localname;
    (void)ns;
    (void)singlequote;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteStartCData(void* writer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteStartCData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteStartElement(void* writer, void* prefix, void* localname, void* ns, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteStartElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, prefix, localname, ns, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)prefix;
    (void)localname;
    (void)ns;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteText(void* writer, void* text, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, text, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)text;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteType(void* writer, int32_t typemapping, int32_t type, void* typedescription, int32_t writeoption, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, typemapping, type, typedescription, writeoption, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteValue(void* writer, int32_t valuetype, void* value, uint32_t valuesize, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, valuetype, value, valuesize, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)valuetype;
    (void)value;
    (void)valuesize;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteXmlBuffer(void* writer, void* xmlbuffer, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteXmlBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, xmlbuffer, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)xmlbuffer;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteXmlBufferToBytes(void* writer, void* xmlbuffer, void* encoding, void* properties, uint32_t propertycount, void* heap, void* bytes, void* bytecount, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteXmlBufferToBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, xmlbuffer, encoding, properties, propertycount, heap, bytes, bytecount, error);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsWriteXmlnsAttribute(void* writer, void* prefix, void* ns, int32_t singlequote, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsWriteXmlnsAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writer, prefix, ns, singlequote, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writer;
    (void)prefix;
    (void)ns;
    (void)singlequote;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_windowswebservices_WsXmlStringEquals(void* string1, void* string2, void* error) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("webservices.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WsXmlStringEquals");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2, error);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string1;
    (void)string2;
    (void)error;
    errno = ENOSYS;
    return -1;
#endif
}

