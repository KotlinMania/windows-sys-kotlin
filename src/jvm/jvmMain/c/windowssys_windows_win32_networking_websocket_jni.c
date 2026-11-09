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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketAbortHandle(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketAbortHandle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hwebsocket);
#else
    (void)hwebsocket;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketBeginClientHandshake(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong pszsubprotocols, jint ulsubprotocolcount, jlong pszextensions, jint ulextensioncount, jlong pinitialheaders, jint ulinitialheadercount, jlong padditionalheaders, jlong puladditionalheadercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketBeginClientHandshake");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)pszsubprotocols, (uint32_t)ulsubprotocolcount, (void*)(uintptr_t)pszextensions, (uint32_t)ulextensioncount, (void*)(uintptr_t)pinitialheaders, (uint32_t)ulinitialheadercount, (void*)(uintptr_t)padditionalheaders, (void*)(uintptr_t)puladditionalheadercount) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketBeginServerHandshake(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong pszsubprotocolselected, jlong pszextensionselected, jint ulextensionselectedcount, jlong prequestheaders, jint ulrequestheadercount, jlong presponseheaders, jlong pulresponseheadercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketBeginServerHandshake");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)pszsubprotocolselected, (void*)(uintptr_t)pszextensionselected, (uint32_t)ulextensionselectedcount, (void*)(uintptr_t)prequestheaders, (uint32_t)ulrequestheadercount, (void*)(uintptr_t)presponseheaders, (void*)(uintptr_t)pulresponseheadercount) : -1;
#else
    (void)hwebsocket;
    (void)pszsubprotocolselected;
    (void)pszextensionselected;
    (void)ulextensionselectedcount;
    (void)prequestheaders;
    (void)ulrequestheadercount;
    (void)presponseheaders;
    (void)pulresponseheadercount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketCompleteAction(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong pvactioncontext, jint ulbytestransferred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketCompleteAction");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)pvactioncontext, (uint32_t)ulbytestransferred);
#else
    (void)hwebsocket;
    (void)pvactioncontext;
    (void)ulbytestransferred;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketCreateClientHandle(JNIEnv* km_env, jclass km_clazz, jlong pproperties, jint ulpropertycount, jlong phwebsocket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketCreateClientHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pproperties, (uint32_t)ulpropertycount, (void*)(uintptr_t)phwebsocket) : -1;
#else
    (void)pproperties;
    (void)ulpropertycount;
    (void)phwebsocket;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketCreateServerHandle(JNIEnv* km_env, jclass km_clazz, jlong pproperties, jint ulpropertycount, jlong phwebsocket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketCreateServerHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pproperties, (uint32_t)ulpropertycount, (void*)(uintptr_t)phwebsocket) : -1;
#else
    (void)pproperties;
    (void)ulpropertycount;
    (void)phwebsocket;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketDeleteHandle(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketDeleteHandle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hwebsocket);
#else
    (void)hwebsocket;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketEndClientHandshake(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong presponseheaders, jint ulreponseheadercount, jlong pulselectedextensions, jlong pulselectedextensioncount, jlong pulselectedsubprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketEndClientHandshake");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)presponseheaders, (uint32_t)ulreponseheadercount, (void*)(uintptr_t)pulselectedextensions, (void*)(uintptr_t)pulselectedextensioncount, (void*)(uintptr_t)pulselectedsubprotocol) : -1;
#else
    (void)hwebsocket;
    (void)presponseheaders;
    (void)ulreponseheadercount;
    (void)pulselectedextensions;
    (void)pulselectedextensioncount;
    (void)pulselectedsubprotocol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketEndServerHandshake(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketEndServerHandshake");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket) : -1;
#else
    (void)hwebsocket;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketGetAction(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jint eactionqueue, jlong pdatabuffers, jlong puldatabuffercount, jlong paction, jlong pbuffertype, jlong pvapplicationcontext, jlong pvactioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketGetAction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (int32_t)eactionqueue, (void*)(uintptr_t)pdatabuffers, (void*)(uintptr_t)puldatabuffercount, (void*)(uintptr_t)paction, (void*)(uintptr_t)pbuffertype, (void*)(uintptr_t)pvapplicationcontext, (void*)(uintptr_t)pvactioncontext) : -1;
#else
    (void)hwebsocket;
    (void)eactionqueue;
    (void)pdatabuffers;
    (void)puldatabuffercount;
    (void)paction;
    (void)pbuffertype;
    (void)pvapplicationcontext;
    (void)pvactioncontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketGetGlobalProperty(JNIEnv* km_env, jclass km_clazz, jint etype, jlong pvvalue, jlong ulsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketGetGlobalProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)etype, (void*)(uintptr_t)pvvalue, (void*)(uintptr_t)ulsize) : -1;
#else
    (void)etype;
    (void)pvvalue;
    (void)ulsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketReceive(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong pbuffer, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketReceive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pvcontext) : -1;
#else
    (void)hwebsocket;
    (void)pbuffer;
    (void)pvcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_websocket_WindowsWin32NetworkingWebsocketJniBridge_windowssys_1windows_1win32_1networking_1websocket_1WebSocketSend(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jint buffertype, jlong pbuffer, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("websocket.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WebSocketSend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (int32_t)buffertype, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)context) : -1;
#else
    (void)hwebsocket;
    (void)buffertype;
    (void)pbuffer;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

