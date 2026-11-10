#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networking_websocket_wrapper.h"
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

void windowssys_windows_win32_networking_websocket_webSocketAbortHandle(void* hwebsocket) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketAbortHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hwebsocket);
        return;
    }
    errno = ENOSYS;
#else
    (void)hwebsocket;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networking_websocket_webSocketBeginClientHandshake(void* hwebsocket, void* pszsubprotocols, uint32_t ulsubprotocolcount, void* pszextensions, uint32_t ulextensioncount, void* pinitialheaders, uint32_t ulinitialheadercount, void* padditionalheaders, void* puladditionalheadercount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketBeginClientHandshake");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, pszsubprotocols, ulsubprotocolcount, pszextensions, ulextensioncount, pinitialheaders, ulinitialheadercount, padditionalheaders, puladditionalheadercount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)pszsubprotocols;
    (void)ulsubprotocolcount;
    (void)pszextensions;
    (void)ulextensioncount;
    (void)pinitialheaders;
    (void)ulinitialheadercount;
    (void)padditionalheaders;
    (void)puladditionalheadercount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_websocket_webSocketBeginServerHandshake(void* hwebsocket, void* pszsubprotocolselected, void* pszextensionselected, uint32_t ulextensionselectedcount, void* prequestheaders, uint32_t ulrequestheadercount, void* presponseheaders, void* pulresponseheadercount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketBeginServerHandshake");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, pszsubprotocolselected, pszextensionselected, ulextensionselectedcount, prequestheaders, ulrequestheadercount, presponseheaders, pulresponseheadercount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)pszsubprotocolselected;
    (void)pszextensionselected;
    (void)ulextensionselectedcount;
    (void)prequestheaders;
    (void)ulrequestheadercount;
    (void)presponseheaders;
    (void)pulresponseheadercount;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_websocket_webSocketCompleteAction(void* hwebsocket, void* pvactioncontext, uint32_t ulbytestransferred) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketCompleteAction");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hwebsocket, pvactioncontext, ulbytestransferred);
        return;
    }
    errno = ENOSYS;
#else
    (void)hwebsocket;
    (void)pvactioncontext;
    (void)ulbytestransferred;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networking_websocket_webSocketCreateClientHandle(void* pproperties, uint32_t ulpropertycount, void* phwebsocket) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketCreateClientHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pproperties, ulpropertycount, phwebsocket);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pproperties;
    (void)ulpropertycount;
    (void)phwebsocket;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_websocket_webSocketCreateServerHandle(void* pproperties, uint32_t ulpropertycount, void* phwebsocket) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketCreateServerHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pproperties, ulpropertycount, phwebsocket);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pproperties;
    (void)ulpropertycount;
    (void)phwebsocket;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_websocket_webSocketDeleteHandle(void* hwebsocket) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketDeleteHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hwebsocket);
        return;
    }
    errno = ENOSYS;
#else
    (void)hwebsocket;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networking_websocket_webSocketEndClientHandshake(void* hwebsocket, void* presponseheaders, uint32_t ulreponseheadercount, void* pulselectedextensions, void* pulselectedextensioncount, void* pulselectedsubprotocol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketEndClientHandshake");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, presponseheaders, ulreponseheadercount, pulselectedextensions, pulselectedextensioncount, pulselectedsubprotocol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)presponseheaders;
    (void)ulreponseheadercount;
    (void)pulselectedextensions;
    (void)pulselectedextensioncount;
    (void)pulselectedsubprotocol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_websocket_webSocketEndServerHandshake(void* hwebsocket) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketEndServerHandshake");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_websocket_webSocketGetAction(void* hwebsocket, int32_t eactionqueue, void* pdatabuffers, void* puldatabuffercount, void* paction, void* pbuffertype, void* pvapplicationcontext, void* pvactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketGetAction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, eactionqueue, pdatabuffers, puldatabuffercount, paction, pbuffertype, pvapplicationcontext, pvactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)eactionqueue;
    (void)pdatabuffers;
    (void)puldatabuffercount;
    (void)paction;
    (void)pbuffertype;
    (void)pvapplicationcontext;
    (void)pvactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_websocket_webSocketGetGlobalProperty(int32_t etype, void* pvvalue, void* ulsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketGetGlobalProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(etype, pvvalue, ulsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)etype;
    (void)pvvalue;
    (void)ulsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_websocket_webSocketReceive(void* hwebsocket, void* pbuffer, void* pvcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketReceive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, pbuffer, pvcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)pbuffer;
    (void)pvcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_websocket_webSocketSend(void* hwebsocket, int32_t buffertype, void* pbuffer, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketSend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, buffertype, pbuffer, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)buffertype;
    (void)pbuffer;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

