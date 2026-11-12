#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_rpc_wrapper.h"
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

int32_t windowssysWindowsWin32SystemRpcDceErrorInqTextA(int32_t rpcstatus, void* errortext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DceErrorInqTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rpcstatus, errortext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rpcstatus;
    (void)errortext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcDceErrorInqTextW(int32_t rpcstatus, void* errortext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DceErrorInqTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rpcstatus, errortext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rpcstatus;
    (void)errortext;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcIunknownAddRefProxy(void* arg0This) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_AddRef_Proxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0This);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)arg0This;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIunknownQueryInterfaceProxy(void* arg0This, void* riid, void* ppvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_QueryInterface_Proxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0This, riid, ppvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg0This;
    (void)riid;
    (void)ppvobject;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcIunknownReleaseProxy(void* arg0This) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_Release_Proxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0This);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)arg0This;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcIRpcAllocate(uint32_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcAsyncAbortCall(void* pasync, uint32_t exceptioncode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcAsyncAbortCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pasync, exceptioncode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pasync;
    (void)exceptioncode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcAsyncSetHandle(void* message, void* pasync) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcAsyncSetHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, pasync);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)pasync;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingCopy(void* sourcebinding, void* destinationbinding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingCopy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcebinding, destinationbinding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcebinding;
    (void)destinationbinding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingCreateNp(void* servername, void* servicename, void* networkoptions, void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingCreateNP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, servicename, networkoptions, binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servername;
    (void)servicename;
    (void)networkoptions;
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingHandleToAsyncHandle(void* binding, void* asynchandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingHandleToAsyncHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, asynchandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)asynchandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingInqClientTokenAttributes(void* binding, void* tokenid, void* authenticationid, void* modifiedid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqClientTokenAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, tokenid, authenticationid, modifiedid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)tokenid;
    (void)authenticationid;
    (void)modifiedid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointA(void* binding, void* dynamicendpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqDynamicEndpointA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, dynamicendpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)dynamicendpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointW(void* binding, void* dynamicendpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqDynamicEndpointW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, dynamicendpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)dynamicendpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingInqLocalClientPid(void* binding, void* pid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqLocalClientPID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, pid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)pid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingInqMarshalledTargetInfo(void* binding, void* marshalledtargetinfosize, void* marshalledtargetinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqMarshalledTargetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, marshalledtargetinfosize, marshalledtargetinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)marshalledtargetinfosize;
    (void)marshalledtargetinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContext(void* binding, void* securitycontexthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqSecurityContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, securitycontexthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)securitycontexthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContextKeyInfo(void* binding, void* keyinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqSecurityContextKeyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, keyinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)keyinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingInqTransportType(void* binding, void* type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqTransportType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingInqWireIdForSnego(void* binding, void* wireid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqWireIdForSnego");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, wireid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)wireid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingIsClientLocal(void* bindinghandle, void* clientlocalflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingIsClientLocal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindinghandle, clientlocalflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bindinghandle;
    (void)clientlocalflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingIsServerLocal(void* binding, void* serverlocalflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingIsServerLocal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, serverlocalflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)serverlocalflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingSetPrivateOption(void* hbinding, uint32_t option, uint64_t optionvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingSetPrivateOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbinding, option, optionvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbinding;
    (void)option;
    (void)optionvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcBindingToStaticStringBindingW(void* binding, void* stringbinding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingToStaticStringBindingW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, stringbinding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)stringbinding;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcIRpcClearMutex(void* mutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcClearMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)mutex;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcIRpcDeleteMutex(void* mutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcDeleteMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)mutex;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcExceptionFilter(uint32_t exceptioncode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcExceptionFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exceptioncode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)exceptioncode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcIRpcFree(void* object) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(object);
        return;
    }
    errno = ENOSYS;
#else
    (void)object;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcFreeBuffer(void* message) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcFreeBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcFreePipeBuffer(void* message) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcFreePipeBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcGetBuffer(void* message) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcGetBufferWithObject(void* message, void* objectuuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetBufferWithObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, objectuuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)objectuuid;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemRpcIRpcGetCurrentCallHandle(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetCurrentCallHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcGetDefaultSd(void* ppsecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetDefaultSD");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppsecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppsecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcGetExtendedError(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetExtendedError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcIfInqTransferSyntaxes(void* rpcifhandle, void* transfersyntaxes, uint32_t transfersyntaxsize, void* transfersyntaxcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcIfInqTransferSyntaxes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rpcifhandle, transfersyntaxes, transfersyntaxsize, transfersyntaxcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rpcifhandle;
    (void)transfersyntaxes;
    (void)transfersyntaxsize;
    (void)transfersyntaxcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcMapWin32Status(int32_t status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcMapWin32Status");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcMgmtEnableDedicatedThreadPool(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcMgmtEnableDedicatedThreadPool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcNegotiateTransferSyntax(void* message) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNegotiateTransferSyntax");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameA(void* binding, uint32_t entrynamesyntax, void* entryname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsBindingSetEntryNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, entrynamesyntax, entryname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameW(void* binding, uint32_t entrynamesyntax, void* entryname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsBindingSetEntryNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, entrynamesyntax, entryname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcNsGetBuffer(void* message) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsGetBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcNsInterfaceExported(uint32_t entrynamesyntax, void* entryname, void* rpcinterfaceinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsInterfaceExported");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, rpcinterfaceinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)rpcinterfaceinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcNsInterfaceUnexported(uint32_t entrynamesyntax, void* entryname, void* rpcinterfaceinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsInterfaceUnexported");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, rpcinterfaceinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)rpcinterfaceinformation;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcIRpcNsRaiseException(void* message, int32_t status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsRaiseException");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(message, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)message;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcNsSendReceive(void* message, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsSendReceive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcOpenClientProcess(void* binding, uint32_t desiredaccess, void* clientprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcOpenClientProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, desiredaccess, clientprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)desiredaccess;
    (void)clientprocess;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcIRpcPauseExecution(uint32_t milliseconds) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcPauseExecution");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(milliseconds);
        return;
    }
    errno = ENOSYS;
#else
    (void)milliseconds;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcReBindBuffer(void* message) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcReBindBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcReallocPipeBuffer(void* message, uint32_t newsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcReallocPipeBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, newsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)newsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcReceive(void* message, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcReceive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcIRpcRecordCalloutFailure(int32_t rpcstatus, void* calloutstate, void* dllname) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcRecordCalloutFailure");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(rpcstatus, calloutstate, dllname);
        return;
    }
    errno = ENOSYS;
#else
    (void)rpcstatus;
    (void)calloutstate;
    (void)dllname;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcIRpcRequestMutex(void* mutex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcRequestMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mutex);
        return;
    }
    errno = ENOSYS;
#else
    (void)mutex;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcSend(void* message) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcSendReceive(void* message) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSendReceive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerCheckClientRestriction(void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerCheckClientRestriction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerDisableExceptionFilter(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerDisableExceptionFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerGetAssociationId(void* binding, void* associationid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerGetAssociationID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, associationid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)associationid;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemRpcIRpcServerInqAddressChangeFn(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqAddressChangeFn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerInqLocalConnAddress(void* binding, void* buffer, void* buffersize, void* addressformat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqLocalConnAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, buffer, buffersize, addressformat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)buffer;
    (void)buffersize;
    (void)addressformat;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerInqRemoteConnAddress(void* binding, void* buffer, void* buffersize, void* addressformat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqRemoteConnAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, buffer, buffersize, addressformat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)buffer;
    (void)buffersize;
    (void)addressformat;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerInqTransportType(void* type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqTransportType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerRegisterForwardFunction(void* pforwardfunction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerRegisterForwardFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pforwardfunction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pforwardfunction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerSetAddressChangeFn(void* paddresschangefn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerSetAddressChangeFn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(paddresschangefn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)paddresschangefn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerStartService(void* protseq, void* endpoint, void* ifspec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerStartService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, endpoint, ifspec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)endpoint;
    (void)ifspec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification(void* binding, void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerSubscribeForDisconnectNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification2(void* binding, void* hevent, void* subscriptionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerSubscribeForDisconnectNotification2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, hevent, subscriptionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)hevent;
    (void)subscriptionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2A(void* networkaddress, void* protseq, uint32_t maxcalls, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseq2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(networkaddress, protseq, maxcalls, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2W(void* networkaddress, void* protseq, uint32_t maxcalls, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseq2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(networkaddress, protseq, maxcalls, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2A(void* networkaddress, void* protseq, uint32_t maxcalls, void* endpoint, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseqEp2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(networkaddress, protseq, maxcalls, endpoint, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2W(void* networkaddress, void* protseq, uint32_t maxcalls, void* endpoint, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseqEp2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(networkaddress, protseq, maxcalls, endpoint, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcIRpcSessionStrictContextHandle(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSessionStrictContextHandle");
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

void windowssysWindowsWin32SystemRpcIRpcSsDontSerializeContext(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSsDontSerializeContext");
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

int32_t windowssysWindowsWin32SystemRpcIRpcSystemHandleTypeSpecificWork(void* handle, uint8_t actualtype, uint8_t idltype, int32_t marshaldirection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSystemHandleTypeSpecificWork");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, actualtype, idltype, marshaldirection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)actualtype;
    (void)idltype;
    (void)marshaldirection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIRpcTurnOnEeinfoPropagation(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcTurnOnEEInfoPropagation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcIUuidCreate(void* uuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_UuidCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcMesBufferHandleReset(void* handle, uint32_t handlestyle, int32_t operation, void* pbuffer, uint32_t buffersize, void* pencodedsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesBufferHandleReset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, handlestyle, operation, pbuffer, buffersize, pencodedsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)handlestyle;
    (void)operation;
    (void)pbuffer;
    (void)buffersize;
    (void)pencodedsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcMesDecodeBufferHandleCreate(void* buffer, uint32_t buffersize, void* phandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesDecodeBufferHandleCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, buffersize, phandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)buffer;
    (void)buffersize;
    (void)phandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcMesDecodeIncrementalHandleCreate(void* userstate, void* readfn, void* phandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesDecodeIncrementalHandleCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(userstate, readfn, phandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)userstate;
    (void)readfn;
    (void)phandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcMesEncodeDynBufferHandleCreate(void* pbuffer, void* pencodedsize, void* phandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesEncodeDynBufferHandleCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbuffer, pencodedsize, phandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbuffer;
    (void)pencodedsize;
    (void)phandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcMesEncodeFixedBufferHandleCreate(void* pbuffer, uint32_t buffersize, void* pencodedsize, void* phandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesEncodeFixedBufferHandleCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbuffer, buffersize, pencodedsize, phandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbuffer;
    (void)buffersize;
    (void)pencodedsize;
    (void)phandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcMesEncodeIncrementalHandleCreate(void* userstate, void* allocfn, void* writefn, void* phandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesEncodeIncrementalHandleCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(userstate, allocfn, writefn, phandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)userstate;
    (void)allocfn;
    (void)writefn;
    (void)phandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcMesHandleFree(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesHandleFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcMesIncrementalHandleReset(void* handle, void* userstate, void* allocfn, void* writefn, void* readfn, int32_t operation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesIncrementalHandleReset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, userstate, allocfn, writefn, readfn, operation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)userstate;
    (void)allocfn;
    (void)writefn;
    (void)readfn;
    (void)operation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcMesInqProcEncodingId(void* handle, void* pinterfaceid, void* pprocnum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesInqProcEncodingId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, pinterfaceid, pprocnum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)pinterfaceid;
    (void)pprocnum;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemRpcNDRCContextBinding(int64_t ccontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRCContextBinding");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ccontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ccontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNDRCContextMarshall(int64_t ccontext, void* pbuff) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRCContextMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ccontext, pbuff);
        return;
    }
    errno = ENOSYS;
#else
    (void)ccontext;
    (void)pbuff;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNDRCContextUnmarshall(void* pccontext, void* hbinding, void* pbuff, uint32_t datarepresentation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRCContextUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pccontext, hbinding, pbuff, datarepresentation);
        return;
    }
    errno = ENOSYS;
#else
    (void)pccontext;
    (void)hbinding;
    (void)pbuff;
    (void)datarepresentation;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNDRSContextMarshall(void* ccontext, void* pbuff, void* userrundownin) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ccontext, pbuff, userrundownin);
        return;
    }
    errno = ENOSYS;
#else
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNDRSContextMarshall2(void* bindinghandle, void* ccontext, void* pbuff, void* userrundownin, void* ctxguard, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextMarshall2");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bindinghandle, ccontext, pbuff, userrundownin, ctxguard, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)bindinghandle;
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
    (void)ctxguard;
    (void)flags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNDRSContextMarshallEx(void* bindinghandle, void* ccontext, void* pbuff, void* userrundownin) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextMarshallEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bindinghandle, ccontext, pbuff, userrundownin);
        return;
    }
    errno = ENOSYS;
#else
    (void)bindinghandle;
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNDRSContextUnmarshall(void* pbuff, uint32_t datarepresentation) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbuff, datarepresentation);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pbuff;
    (void)datarepresentation;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNDRSContextUnmarshall2(void* bindinghandle, void* pbuff, uint32_t datarepresentation, void* ctxguard, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextUnmarshall2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindinghandle, pbuff, datarepresentation, ctxguard, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bindinghandle;
    (void)pbuff;
    (void)datarepresentation;
    (void)ctxguard;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNDRSContextUnmarshallEx(void* bindinghandle, void* pbuff, uint32_t datarepresentation) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextUnmarshallEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindinghandle, pbuff, datarepresentation);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bindinghandle;
    (void)pbuff;
    (void)datarepresentation;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdr64AsyncServerCall64(void* prpcmsg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ndr64AsyncServerCall64");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prpcmsg);
        return;
    }
    errno = ENOSYS;
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdr64AsyncServerCallAll(void* prpcmsg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ndr64AsyncServerCallAll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prpcmsg);
        return;
    }
    errno = ENOSYS;
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcNdr64DcomAsyncStubCall(void* pthis, void* pchannel, void* prpcmsg, void* pdwstubphase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ndr64DcomAsyncStubCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pthis, pchannel, prpcmsg, pdwstubphase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrAllocate(void* pstubmsg, uint64_t len) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, len);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)len;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrAsyncServerCall(void* prpcmsg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrAsyncServerCall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prpcmsg);
        return;
    }
    errno = ENOSYS;
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrByteCountPointerBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrByteCountPointerFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrByteCountPointerMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrByteCountPointerUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrClearOutParameters(void* pstubmsg, void* pformat, void* argaddr) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClearOutParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pformat, argaddr);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pformat;
    (void)argaddr;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrClientContextMarshall(void* pstubmsg, int64_t contexthandle, int32_t fcheck) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientContextMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, contexthandle, fcheck);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)fcheck;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrClientContextUnmarshall(void* pstubmsg, void* pcontexthandle, void* bindhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientContextUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pcontexthandle, bindhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pcontexthandle;
    (void)bindhandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrClientInitialize(void* prpcmsg, void* pstubmsg, void* pstubdescriptor, uint32_t procnum) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prpcmsg, pstubmsg, pstubdescriptor, procnum);
        return;
    }
    errno = ENOSYS;
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)procnum;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrClientInitializeNew(void* prpcmsg, void* pstubmsg, void* pstubdescriptor, uint32_t procnum) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientInitializeNew");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prpcmsg, pstubmsg, pstubdescriptor, procnum);
        return;
    }
    errno = ENOSYS;
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)procnum;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrComplexArrayBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrComplexArrayFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrComplexArrayMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrComplexArrayMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrComplexArrayUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrComplexStructBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrComplexStructFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrComplexStructMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrComplexStructMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrComplexStructUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConformantArrayBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConformantArrayFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrConformantArrayMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrConformantArrayMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrConformantArrayUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConformantStringBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrConformantStringMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrConformantStringMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrConformantStringUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConformantStructBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConformantStructFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrConformantStructMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrConformantStructMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrConformantStructUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConformantVaryingStructBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConformantVaryingStructFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrConformantVaryingStructUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrContextHandleInitialize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrContextHandleInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrContextHandleSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrContextHandleSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConvert(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConvert");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrConvert2(void* pstubmsg, void* pformat, int32_t numberparams) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConvert2");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pformat, numberparams);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pformat;
    (void)numberparams;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrCorrelationFree(void* pstubmsg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCorrelationFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrCorrelationInitialize(void* pstubmsg, void* pmemory, uint32_t cachesize, uint32_t flags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCorrelationInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, cachesize, flags);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)cachesize;
    (void)flags;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrCorrelationPass(void* pstubmsg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCorrelationPass");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcNdrCreateServerInterfaceFromStub(void* pstub, void* pserverif) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCreateServerInterfaceFromStub");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstub, pserverif);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstub;
    (void)pserverif;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcNdrDcomAsyncStubCall(void* pthis, void* pchannel, void* prpcmsg, void* pdwstubphase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrDcomAsyncStubCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pthis, pchannel, prpcmsg, pdwstubphase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrFixedArrayBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrFixedArrayFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrFixedArrayMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrFixedArrayMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrFixedArrayUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrFreeBuffer(void* pstubmsg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFreeBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrFullPointerXlatFree(void* pxlattables) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFullPointerXlatFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pxlattables);
        return;
    }
    errno = ENOSYS;
#else
    (void)pxlattables;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrFullPointerXlatInit(uint32_t numberofpointers, int32_t xlatside) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFullPointerXlatInit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberofpointers, xlatside);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)numberofpointers;
    (void)xlatside;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrGetBuffer(void* pstubmsg, uint32_t bufferlength, void* handle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrGetBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, bufferlength, handle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)bufferlength;
    (void)handle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemRpcNdrGetDcomProtocolVersion(void* pstubmsg, void* pversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrGetDcomProtocolVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstubmsg;
    (void)pversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcNdrGetUserMarshalInfo(void* pflags, uint32_t informationlevel, void* pmarshalinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrGetUserMarshalInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pflags, informationlevel, pmarshalinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pflags;
    (void)informationlevel;
    (void)pmarshalinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcNdrInterfacePointerBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrInterfacePointerFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrInterfacePointerMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrInterfacePointerMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrInterfacePointerUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemRpcNdrMapCommAndFaultStatus(void* pstubmsg, void* pcommstatus, void* pfaultstatus, int32_t status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMapCommAndFaultStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pcommstatus, pfaultstatus, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstubmsg;
    (void)pcommstatus;
    (void)pfaultstatus;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesProcEncodeDecode(void* handle, void* pstubdesc, void* pformatstring, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef void (*km_fn_t)(void*, void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesProcEncodeDecode");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr(handle, pstubdesc, pformatstring); break;
            case 1: km_fn_ptr(handle, pstubdesc, pformatstring, (intptr_t)km_va0); break;
            case 2: km_fn_ptr(handle, pstubdesc, pformatstring, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr(handle, pstubdesc, pformatstring, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr(handle, pstubdesc, pformatstring, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
#endif
}

uint64_t windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSize(void* param0) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeAlignSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSizeAll(void* handle, void* pproxyinfo) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeAlignSizeAll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, pproxyinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)pproxyinfo;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecode(void* handle, void* pobject, int16_t size) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeDecode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, pobject, size);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)pobject;
    (void)size;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecodeAll(void* handle, void* pproxyinfo, void* pobject, int16_t size) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeDecodeAll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, pproxyinfo, pobject, size);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)pproxyinfo;
    (void)pobject;
    (void)size;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncode(void* handle, void* pstubdesc, void* pobject, int16_t size) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeEncode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, pstubdesc, pobject, size);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)pstubdesc;
    (void)pobject;
    (void)size;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncodeAll(void* handle, void* pproxyinfo, void* pobject, int16_t size) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeEncodeAll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, pproxyinfo, pobject, size);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)pproxyinfo;
    (void)pobject;
    (void)size;
    errno = ENOSYS;
#endif
}

uint64_t windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize(void* handle, void* pstubdesc, void* pformatstring, void* pobject) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeAlignSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, pstubdesc, pformatstring, pobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize2(void* handle, void* ppicklinginfo, void* pstubdesc, void* pformatstring, void* pobject) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeAlignSize2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, ppicklinginfo, pstubdesc, pformatstring, pobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize3(void* handle, void* ppicklinginfo, void* pproxyinfo, void* arrtypeoffset, uint32_t ntypeindex, void* pobject) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeAlignSize3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex, pobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesTypeDecode(void* handle, void* pstubdesc, void* pformatstring, void* pobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeDecode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, pstubdesc, pformatstring, pobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesTypeDecode2(void* handle, void* ppicklinginfo, void* pstubdesc, void* pformatstring, void* pobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeDecode2");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, ppicklinginfo, pstubdesc, pformatstring, pobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesTypeDecode3(void* handle, void* ppicklinginfo, void* pproxyinfo, void* arrtypeoffset, uint32_t ntypeindex, void* pobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeDecode3");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex, pobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesTypeEncode(void* handle, void* pstubdesc, void* pformatstring, void* pobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeEncode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, pstubdesc, pformatstring, pobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesTypeEncode2(void* handle, void* ppicklinginfo, void* pstubdesc, void* pformatstring, void* pobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeEncode2");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, ppicklinginfo, pstubdesc, pformatstring, pobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesTypeEncode3(void* handle, void* ppicklinginfo, void* pproxyinfo, void* arrtypeoffset, uint32_t ntypeindex, void* pobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeEncode3");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex, pobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesTypeFree2(void* handle, void* ppicklinginfo, void* pstubdesc, void* pformatstring, void* pobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeFree2");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, ppicklinginfo, pstubdesc, pformatstring, pobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrMesTypeFree3(void* handle, void* ppicklinginfo, void* pproxyinfo, void* arrtypeoffset, uint32_t ntypeindex, void* pobject) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeFree3");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex, pobject);
        return;
    }
    errno = ENOSYS;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrNonConformantStringBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrNonConformantStringMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrNonConformantStringMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrNonConformantStringUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrNsGetBuffer(void* pstubmsg, uint32_t bufferlength, void* handle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNsGetBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, bufferlength, handle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)bufferlength;
    (void)handle;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrNsSendReceive(void* pstubmsg, void* pbufferend, void* pautohandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNsSendReceive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pbufferend, pautohandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pbufferend;
    (void)pautohandle;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrOleAllocate(uint64_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrOleAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrOleFree(void* nodetofree) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrOleFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nodetofree);
        return;
    }
    errno = ENOSYS;
#else
    (void)nodetofree;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientBufferSize(void* pstubmsg, void* pmemory) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreClientBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientMarshall(void* pstubmsg, void* pmemory) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreClientMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerInitialize(void* pstubmsg, void* ppmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreServerInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, ppmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerUnmarshall(void* pstubmsg, void* ppmemory) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreServerUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, ppmemory);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)ppmemory;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrPointerBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrPointerFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrPointerMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrPointerMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrPointerUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrRangeUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRangeUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrRpcSmClientAllocate(uint64_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSmClientAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrRpcSmClientFree(void* nodetofree) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSmClientFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nodetofree);
        return;
    }
    errno = ENOSYS;
#else
    (void)nodetofree;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrRpcSmSetClientToOsf(void* pmessage) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSmSetClientToOsf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pmessage);
        return;
    }
    errno = ENOSYS;
#else
    (void)pmessage;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrRpcSsDefaultAllocate(uint64_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsDefaultAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrRpcSsDefaultFree(void* nodetofree) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsDefaultFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nodetofree);
        return;
    }
    errno = ENOSYS;
#else
    (void)nodetofree;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrRpcSsDisableAllocate(void* pmessage) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsDisableAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pmessage);
        return;
    }
    errno = ENOSYS;
#else
    (void)pmessage;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrRpcSsEnableAllocate(void* pmessage) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsEnableAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pmessage);
        return;
    }
    errno = ENOSYS;
#else
    (void)pmessage;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrSendReceive(void* pstubmsg, void* pbufferend) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSendReceive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pbufferend);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pbufferend;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrServerCall2(void* prpcmsg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerCall2");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prpcmsg);
        return;
    }
    errno = ENOSYS;
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrServerCallAll(void* prpcmsg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerCallAll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prpcmsg);
        return;
    }
    errno = ENOSYS;
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrServerCallNdr64(void* prpcmsg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerCallNdr64");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prpcmsg);
        return;
    }
    errno = ENOSYS;
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrServerContextMarshall(void* pstubmsg, void* contexthandle, void* rundownroutine) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, contexthandle, rundownroutine);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)rundownroutine;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrServerContextNewMarshall(void* pstubmsg, void* contexthandle, void* rundownroutine, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextNewMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, contexthandle, rundownroutine, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)rundownroutine;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrServerContextNewUnmarshall(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextNewUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrServerContextUnmarshall(void* pstubmsg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrServerInitialize(void* prpcmsg, void* pstubmsg, void* pstubdescriptor) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prpcmsg, pstubmsg, pstubdescriptor);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrServerInitializeMarshall(void* prpcmsg, void* pstubmsg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializeMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prpcmsg, pstubmsg);
        return;
    }
    errno = ENOSYS;
#else
    (void)prpcmsg;
    (void)pstubmsg;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrServerInitializeNew(void* prpcmsg, void* pstubmsg, void* pstubdescriptor) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializeNew");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prpcmsg, pstubmsg, pstubdescriptor);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrServerInitializePartial(void* prpcmsg, void* pstubmsg, void* pstubdescriptor, uint32_t requestedbuffersize) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializePartial");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(prpcmsg, pstubmsg, pstubdescriptor, requestedbuffersize);
        return;
    }
    errno = ENOSYS;
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)requestedbuffersize;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrServerInitializeUnmarshall(void* pstubmsg, void* pstubdescriptor, void* prpcmsg) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializeUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pstubdescriptor, prpcmsg);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)prpcmsg;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrSimpleStructBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrSimpleStructFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrSimpleStructMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrSimpleStructMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrSimpleStructUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrSimpleTypeMarshall(void* pstubmsg, void* pmemory, uint8_t formatchar) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleTypeMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, formatchar);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)formatchar;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrSimpleTypeUnmarshall(void* pstubmsg, void* pmemory, uint8_t formatchar) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleTypeUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, formatchar);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)formatchar;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcNdrStubCall2(void* pthis, void* pchannel, void* prpcmsg, void* pdwstubphase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrStubCall2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pthis, pchannel, prpcmsg, pdwstubphase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcNdrStubCall3(void* pthis, void* pchannel, void* prpcmsg, void* pdwstubphase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrStubCall3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pthis, pchannel, prpcmsg, pdwstubphase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcNdrUserMarshalBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrUserMarshalFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrUserMarshalMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrUserMarshalMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrUserMarshalSimpleTypeConvert(void* pflags, void* pbuffer, uint8_t formatchar) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalSimpleTypeConvert");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pflags, pbuffer, formatchar);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pflags;
    (void)pbuffer;
    (void)formatchar;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrUserMarshalUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrVaryingArrayBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrVaryingArrayFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrVaryingArrayMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrVaryingArrayMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrVaryingArrayUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcNdrXmitOrRepAsBufferSize(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcNdrXmitOrRepAsFree(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pstubmsg, pmemory, pformat);
        return;
    }
    errno = ENOSYS;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMarshall(void* pstubmsg, void* pmemory, void* pformat) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pmemory, pformat);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMemorySize(void* pstubmsg, void* pformat) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, pformat);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemRpcNdrXmitOrRepAsUnmarshall(void* pstubmsg, void* ppmemory, void* pformat, uint8_t fmustalloc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsUnmarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcAsyncAbortCall(void* pasync, uint32_t exceptioncode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncAbortCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pasync, exceptioncode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pasync;
    (void)exceptioncode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcAsyncCancelCall(void* pasync, int32_t fabort) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncCancelCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pasync, fabort);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pasync;
    (void)fabort;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcAsyncCompleteCall(void* pasync, void* reply) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncCompleteCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pasync, reply);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pasync;
    (void)reply;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcAsyncGetCallStatus(void* pasync) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncGetCallStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pasync);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pasync;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcAsyncInitializeHandle(void* pasync, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncInitializeHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pasync, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pasync;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcAsyncRegisterInfo(void* pasync) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncRegisterInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pasync);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pasync;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingBind(void* pasync, void* binding, void* ifspec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingBind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pasync, binding, ifspec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pasync;
    (void)binding;
    (void)ifspec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingCopy(void* sourcebinding, void* destinationbinding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingCopy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcebinding, destinationbinding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcebinding;
    (void)destinationbinding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingCreateA(void* arg0Template, void* security, void* options, void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingCreateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Template, security, options, binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg0Template;
    (void)security;
    (void)options;
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingCreateW(void* arg0Template, void* security, void* options, void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingCreateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Template, security, options, binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg0Template;
    (void)security;
    (void)options;
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingFree(void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingA(void* stringbinding, void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingFromStringBindingA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringbinding, binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stringbinding;
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingW(void* stringbinding, void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingFromStringBindingW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringbinding, binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stringbinding;
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientA(void* clientbinding, void* privs, void* serverprincname, void* authnlevel, void* authnsvc, void* authzsvc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExA(void* clientbinding, void* privs, void* serverprincname, void* authnlevel, void* authnsvc, void* authzsvc, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExW(void* clientbinding, void* privs, void* serverprincname, void* authnlevel, void* authnsvc, void* authzsvc, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientW(void* clientbinding, void* privs, void* serverprincname, void* authnlevel, void* authnsvc, void* authzsvc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoA(void* binding, void* serverprincname, void* authnlevel, void* authnsvc, void* authidentity, void* authzsvc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExA(void* binding, void* serverprincname, void* authnlevel, void* authnsvc, void* authidentity, void* authzsvc, uint32_t rpcqosversion, void* securityqos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, rpcqosversion, securityqos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)rpcqosversion;
    (void)securityqos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExW(void* binding, void* serverprincname, void* authnlevel, void* authnsvc, void* authidentity, void* authzsvc, uint32_t rpcqosversion, void* securityqos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, rpcqosversion, securityqos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)rpcqosversion;
    (void)securityqos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoW(void* binding, void* serverprincname, void* authnlevel, void* authnsvc, void* authidentity, void* authzsvc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqMaxCalls(void* binding, void* maxcalls) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqMaxCalls");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, maxcalls);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)maxcalls;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqObject(void* binding, void* objectuuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, objectuuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)objectuuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingInqOption(void* hbinding, uint32_t option, void* poptionvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbinding, option, poptionvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbinding;
    (void)option;
    (void)poptionvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingReset(void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingReset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingServerFromClient(void* clientbinding, void* serverbinding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingServerFromClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientbinding, serverbinding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientbinding;
    (void)serverbinding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoA(void* binding, void* serverprincname, uint32_t authnlevel, uint32_t authnsvc, void* authidentity, uint32_t authzsvc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExA(void* binding, void* serverprincname, uint32_t authnlevel, uint32_t authnsvc, void* authidentity, uint32_t authzsvc, void* securityqos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, securityqos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)securityqos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExW(void* binding, void* serverprincname, uint32_t authnlevel, uint32_t authnsvc, void* authidentity, uint32_t authzsvc, void* securityqos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, securityqos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)securityqos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoW(void* binding, void* serverprincname, uint32_t authnlevel, uint32_t authnsvc, void* authidentity, uint32_t authzsvc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingSetObject(void* binding, void* objectuuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, objectuuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)objectuuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingSetOption(void* hbinding, uint32_t option, uint64_t optionvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbinding, option, optionvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbinding;
    (void)option;
    (void)optionvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingToStringBindingA(void* binding, void* stringbinding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingToStringBindingA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, stringbinding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)stringbinding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingToStringBindingW(void* binding, void* stringbinding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingToStringBindingW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, stringbinding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)stringbinding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingUnbind(void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingUnbind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcBindingVectorFree(void* bindingvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingVectorFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindingvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bindingvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcCancelThread(void* thread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCancelThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcCancelThreadEx(void* thread, int32_t timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCancelThreadEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameA(void* context, uint32_t flags, void* pbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCertGeneratePrincipalNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, flags, pbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)flags;
    (void)pbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameW(void* context, uint32_t flags, void* pbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCertGeneratePrincipalNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, flags, pbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)flags;
    (void)pbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcEpRegisterA(void* ifspec, void* bindingvector, void* uuidvector, void* annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, bindingvector, uuidvector, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceA(void* ifspec, void* bindingvector, void* uuidvector, void* annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterNoReplaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, bindingvector, uuidvector, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceW(void* ifspec, void* bindingvector, void* uuidvector, void* annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterNoReplaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, bindingvector, uuidvector, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcEpRegisterW(void* ifspec, void* bindingvector, void* uuidvector, void* annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, bindingvector, uuidvector, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcEpResolveBinding(void* binding, void* ifspec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpResolveBinding");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, ifspec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)ifspec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcEpUnregister(void* ifspec, void* bindingvector, void* uuidvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpUnregister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, bindingvector, uuidvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcErrorAddRecord(void* errorinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorAddRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcRpcErrorClearInformation(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorClearInformation");
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

int32_t windowssysWindowsWin32SystemRpcRpcErrorEndEnumeration(void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorEndEnumeration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcErrorGetNextRecord(void* enumhandle, int32_t copystrings, void* errorinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorGetNextRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enumhandle, copystrings, errorinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enumhandle;
    (void)copystrings;
    (void)errorinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcErrorGetNumberOfRecords(void* enumhandle, void* records) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorGetNumberOfRecords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enumhandle, records);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enumhandle;
    (void)records;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcErrorLoadErrorInfo(void* errorblob, uint64_t blobsize, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorLoadErrorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errorblob, blobsize, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)errorblob;
    (void)blobsize;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcErrorResetEnumeration(void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorResetEnumeration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcErrorSaveErrorInfo(void* enumhandle, void* errorblob, void* blobsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorSaveErrorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enumhandle, errorblob, blobsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enumhandle;
    (void)errorblob;
    (void)blobsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcErrorStartEnumeration(void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorStartEnumeration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcExceptionFilter(uint32_t exceptioncode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcExceptionFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exceptioncode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)exceptioncode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcFreeAuthorizationContext(void* pauthzclientcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcFreeAuthorizationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pauthzclientcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pauthzclientcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcIfIdVectorFree(void* ifidvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcIfIdVectorFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifidvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifidvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcIfInqId(void* rpcifhandle, void* rpcifid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcIfInqId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rpcifhandle, rpcifid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rpcifhandle;
    (void)rpcifid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcImpersonateClient(void* bindinghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcImpersonateClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindinghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bindinghandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcImpersonateClient2(void* bindinghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcImpersonateClient2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindinghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bindinghandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcImpersonateClientContainer(void* bindinghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcImpersonateClientContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindinghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bindinghandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtEnableIdleCleanup(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEnableIdleCleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqBegin(void* epbinding, uint32_t inquirytype, void* ifid, uint32_t versoption, void* objectuuid, void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqBegin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(epbinding, inquirytype, ifid, versoption, objectuuid, inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)epbinding;
    (void)inquirytype;
    (void)ifid;
    (void)versoption;
    (void)objectuuid;
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqDone(void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqDone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextA(void* inquirycontext, void* ifid, void* binding, void* objectuuid, void* annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqNextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext, ifid, binding, objectuuid, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextW(void* inquirycontext, void* ifid, void* binding, void* objectuuid, void* annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqNextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext, ifid, binding, objectuuid, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtEpUnregister(void* epbinding, void* ifid, void* binding, void* objectuuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpUnregister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(epbinding, ifid, binding, objectuuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)epbinding;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtInqComTimeout(void* binding, void* timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqComTimeout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtInqDefaultProtectLevel(uint32_t authnsvc, void* authnlevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqDefaultProtectLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authnsvc, authnlevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authnsvc;
    (void)authnlevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtInqIfIds(void* binding, void* ifidvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqIfIds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, ifidvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)ifidvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameA(void* binding, uint32_t authnsvc, void* serverprincname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqServerPrincNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, authnsvc, serverprincname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)authnsvc;
    (void)serverprincname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameW(void* binding, uint32_t authnsvc, void* serverprincname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqServerPrincNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, authnsvc, serverprincname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)authnsvc;
    (void)serverprincname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtInqStats(void* binding, void* statistics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, statistics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)statistics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtIsServerListening(void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtIsServerListening");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtSetAuthorizationFn(void* authorizationfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetAuthorizationFn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authorizationfn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authorizationfn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtSetCancelTimeout(int32_t timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetCancelTimeout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtSetComTimeout(void* binding, uint32_t timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetComTimeout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtSetServerStackSize(uint32_t threadstacksize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetServerStackSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadstacksize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadstacksize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtStatsVectorFree(void* statsvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtStatsVectorFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statsvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statsvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtStopServerListening(void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtStopServerListening");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcMgmtWaitServerListen(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtWaitServerListen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsA(void* protseqvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkInqProtseqsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseqvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseqvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsW(void* protseqvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkInqProtseqsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseqvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseqvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidA(void* protseq) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkIsProtseqValidA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidW(void* protseq) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkIsProtseqValidW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingExportA(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* bindingvec, void* objectuuidvec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, bindingvec, objectuuidvec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)bindingvec;
    (void)objectuuidvec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPA(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* objectvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportPnPA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, objectvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPW(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* objectvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportPnPW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, objectvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingExportW(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* bindingvec, void* objectuuidvec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, bindingvec, objectuuidvec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)bindingvec;
    (void)objectuuidvec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginA(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* objuuid, void* importcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportBeginA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, objuuid, importcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)importcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginW(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* objuuid, void* importcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportBeginW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, objuuid, importcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)importcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingImportDone(void* importcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportDone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(importcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)importcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingImportNext(void* importcontext, void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(importcontext, binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)importcontext;
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameA(void* binding, uint32_t entrynamesyntax, void* entryname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingInqEntryNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, entrynamesyntax, entryname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameW(void* binding, uint32_t entrynamesyntax, void* entryname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingInqEntryNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, entrynamesyntax, entryname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginA(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* objuuid, uint32_t bindingmaxcount, void* lookupcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupBeginA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, objuuid, bindingmaxcount, lookupcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)bindingmaxcount;
    (void)lookupcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginW(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* objuuid, uint32_t bindingmaxcount, void* lookupcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupBeginW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, objuuid, bindingmaxcount, lookupcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)bindingmaxcount;
    (void)lookupcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingLookupDone(void* lookupcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupDone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lookupcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lookupcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingLookupNext(void* lookupcontext, void* bindingvec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lookupcontext, bindingvec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lookupcontext;
    (void)bindingvec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingSelect(void* bindingvec, void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingSelect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindingvec, binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bindingvec;
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingUnexportA(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* objectuuidvec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, objectuuidvec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectuuidvec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPA(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* objectvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportPnPA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, objectvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPW(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* objectvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportPnPW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, objectvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsBindingUnexportW(uint32_t entrynamesyntax, void* entryname, void* ifspec, void* objectuuidvec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifspec, objectuuidvec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectuuidvec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameA(uint32_t entrynamesyntax, void* entryname, void* expandedname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryExpandNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, expandedname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)expandedname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameW(uint32_t entrynamesyntax, void* entryname, void* expandedname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryExpandNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, expandedname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)expandedname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginA(uint32_t entrynamesyntax, void* entryname, void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqBeginA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginW(uint32_t entrynamesyntax, void* entryname, void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqBeginW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqDone(void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqDone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqNext(void* inquirycontext, void* objuuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext, objuuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    (void)objuuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupDeleteA(uint32_t groupnamesyntax, void* groupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupDeleteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnamesyntax, groupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupDeleteW(uint32_t groupnamesyntax, void* groupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupDeleteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnamesyntax, groupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddA(uint32_t groupnamesyntax, void* groupname, uint32_t membernamesyntax, void* membername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrAddA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, membername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddW(uint32_t groupnamesyntax, void* groupname, uint32_t membernamesyntax, void* membername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrAddW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, membername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginA(uint32_t groupnamesyntax, void* groupname, uint32_t membernamesyntax, void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqBeginA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginW(uint32_t groupnamesyntax, void* groupname, uint32_t membernamesyntax, void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqBeginW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqDone(void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqDone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextA(void* inquirycontext, void* membername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqNextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext, membername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    (void)membername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextW(void* inquirycontext, void* membername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqNextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext, membername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    (void)membername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveA(uint32_t groupnamesyntax, void* groupname, uint32_t membernamesyntax, void* membername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrRemoveA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, membername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveW(uint32_t groupnamesyntax, void* groupname, uint32_t membernamesyntax, void* membername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrRemoveW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, membername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportA(uint32_t entrynamesyntax, void* entryname, void* ifid, uint32_t versoption, void* objectuuidvec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtBindingUnexportA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifid, versoption, objectuuidvec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifid;
    (void)versoption;
    (void)objectuuidvec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportW(uint32_t entrynamesyntax, void* entryname, void* ifid, uint32_t versoption, void* objectuuidvec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtBindingUnexportW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifid, versoption, objectuuidvec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifid;
    (void)versoption;
    (void)objectuuidvec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateA(uint32_t entrynamesyntax, void* entryname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryCreateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateW(uint32_t entrynamesyntax, void* entryname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryCreateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteA(uint32_t entrynamesyntax, void* entryname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryDeleteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteW(uint32_t entrynamesyntax, void* entryname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryDeleteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsA(uint32_t entrynamesyntax, void* entryname, void* ifidvec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryInqIfIdsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifidvec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifidvec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsW(uint32_t entrynamesyntax, void* entryname, void* ifidvec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryInqIfIdsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(entrynamesyntax, entryname, ifidvec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifidvec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtHandleSetExpAge(void* nshandle, uint32_t expirationage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtHandleSetExpAge");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nshandle, expirationage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nshandle;
    (void)expirationage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtInqExpAge(void* expirationage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtInqExpAge");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(expirationage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)expirationage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsMgmtSetExpAge(uint32_t expirationage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtSetExpAge");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(expirationage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)expirationage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileDeleteA(uint32_t profilenamesyntax, void* profilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileDeleteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilenamesyntax, profilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileDeleteW(uint32_t profilenamesyntax, void* profilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileDeleteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilenamesyntax, profilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileEltAddA(uint32_t profilenamesyntax, void* profilename, void* ifid, uint32_t membernamesyntax, void* membername, uint32_t priority, void* annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltAddA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilenamesyntax, profilename, ifid, membernamesyntax, membername, priority, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    (void)priority;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileEltAddW(uint32_t profilenamesyntax, void* profilename, void* ifid, uint32_t membernamesyntax, void* membername, uint32_t priority, void* annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltAddW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilenamesyntax, profilename, ifid, membernamesyntax, membername, priority, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    (void)priority;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginA(uint32_t profilenamesyntax, void* profilename, uint32_t inquirytype, void* ifid, uint32_t versoption, uint32_t membernamesyntax, void* membername, void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqBeginA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilenamesyntax, profilename, inquirytype, ifid, versoption, membernamesyntax, membername, inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)inquirytype;
    (void)ifid;
    (void)versoption;
    (void)membernamesyntax;
    (void)membername;
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginW(uint32_t profilenamesyntax, void* profilename, uint32_t inquirytype, void* ifid, uint32_t versoption, uint32_t membernamesyntax, void* membername, void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqBeginW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilenamesyntax, profilename, inquirytype, ifid, versoption, membernamesyntax, membername, inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)inquirytype;
    (void)ifid;
    (void)versoption;
    (void)membernamesyntax;
    (void)membername;
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileEltInqDone(void* inquirycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqDone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextA(void* inquirycontext, void* ifid, void* membername, void* priority, void* annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqNextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext, ifid, membername, priority, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)membername;
    (void)priority;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextW(void* inquirycontext, void* ifid, void* membername, void* priority, void* annotation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqNextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquirycontext, ifid, membername, priority, annotation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)membername;
    (void)priority;
    (void)annotation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveA(uint32_t profilenamesyntax, void* profilename, void* ifid, uint32_t membernamesyntax, void* membername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltRemoveA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilenamesyntax, profilename, ifid, membernamesyntax, membername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveW(uint32_t profilenamesyntax, void* profilename, void* ifid, uint32_t membernamesyntax, void* membername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltRemoveW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(profilenamesyntax, profilename, ifid, membernamesyntax, membername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcObjectInqType(void* objuuid, void* typeuuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcObjectInqType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objuuid, typeuuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objuuid;
    (void)typeuuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcObjectSetInqFn(void* inquiryfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcObjectSetInqFn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inquiryfn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inquiryfn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcObjectSetType(void* objuuid, void* typeuuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcObjectSetType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objuuid, typeuuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objuuid;
    (void)typeuuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeA(void* protseqvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcProtseqVectorFreeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseqvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseqvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeW(void* protseqvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcProtseqVectorFreeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseqvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseqvector;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcRpcRaiseException(int32_t exception) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRaiseException");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(exception);
        return;
    }
    errno = ENOSYS;
#else
    (void)exception;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcRevertContainerImpersonation(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRevertContainerImpersonation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcRevertToSelf(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRevertToSelf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcRevertToSelfEx(void* bindinghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRevertToSelfEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindinghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bindinghandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerCompleteSecurityCallback(void* bindinghandle, int32_t status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerCompleteSecurityCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindinghandle, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bindinghandle;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInqBindingHandle(void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqBindingHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInqBindings(void* bindingvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqBindings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindingvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bindingvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInqBindingsEx(void* securitydescriptor, void* bindingvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqBindingsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, bindingvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securitydescriptor;
    (void)bindingvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesA(void* clientbinding, void* rpccallattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqCallAttributesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientbinding, rpccallattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientbinding;
    (void)rpccallattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesW(void* clientbinding, void* rpccallattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqCallAttributesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientbinding, rpccallattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientbinding;
    (void)rpccallattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameA(uint32_t authnsvc, void* princname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqDefaultPrincNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authnsvc, princname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authnsvc;
    (void)princname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameW(uint32_t authnsvc, void* princname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqDefaultPrincNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(authnsvc, princname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)authnsvc;
    (void)princname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInqIf(void* ifspec, void* mgrtypeuuid, void* mgrepv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqIf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, mgrtypeuuid, mgrepv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupActivate(void* ifgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupActivate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupClose(void* ifgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateA(void* interfaces, uint32_t numifs, void* endpoints, uint32_t numendpoints, uint32_t idleperiod, void* idlecallbackfn, void* idlecallbackcontext, void* ifgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupCreateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaces, numifs, endpoints, numendpoints, idleperiod, idlecallbackfn, idlecallbackcontext, ifgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfaces;
    (void)numifs;
    (void)endpoints;
    (void)numendpoints;
    (void)idleperiod;
    (void)idlecallbackfn;
    (void)idlecallbackcontext;
    (void)ifgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateW(void* interfaces, uint32_t numifs, void* endpoints, uint32_t numendpoints, uint32_t idleperiod, void* idlecallbackfn, void* idlecallbackcontext, void* ifgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupCreateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaces, numifs, endpoints, numendpoints, idleperiod, idlecallbackfn, idlecallbackcontext, ifgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfaces;
    (void)numifs;
    (void)endpoints;
    (void)numendpoints;
    (void)idleperiod;
    (void)idlecallbackfn;
    (void)idlecallbackcontext;
    (void)ifgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupDeactivate(void* ifgroup, uint32_t forcedeactivation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupDeactivate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifgroup, forcedeactivation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifgroup;
    (void)forcedeactivation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupInqBindings(void* ifgroup, void* bindingvector) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupInqBindings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifgroup, bindingvector);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifgroup;
    (void)bindingvector;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerListen(uint32_t minimumcallthreads, uint32_t maxcalls, uint32_t dontwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerListen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(minimumcallthreads, maxcalls, dontwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)minimumcallthreads;
    (void)maxcalls;
    (void)dontwait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoA(void* serverprincname, uint32_t authnsvc, void* getkeyfn, void* arg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterAuthInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serverprincname, authnsvc, getkeyfn, arg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serverprincname;
    (void)authnsvc;
    (void)getkeyfn;
    (void)arg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoW(void* serverprincname, uint32_t authnsvc, void* getkeyfn, void* arg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterAuthInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serverprincname, authnsvc, getkeyfn, arg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serverprincname;
    (void)authnsvc;
    (void)getkeyfn;
    (void)arg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerRegisterIf(void* ifspec, void* mgrtypeuuid, void* mgrepv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, mgrtypeuuid, mgrepv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerRegisterIf2(void* ifspec, void* mgrtypeuuid, void* mgrepv, uint32_t flags, uint32_t maxcalls, uint32_t maxrpcsize, void* ifcallbackfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIf2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, mgrtypeuuid, mgrepv, flags, maxcalls, maxrpcsize, ifcallbackfn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    (void)flags;
    (void)maxcalls;
    (void)maxrpcsize;
    (void)ifcallbackfn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerRegisterIf3(void* ifspec, void* mgrtypeuuid, void* mgrepv, uint32_t flags, uint32_t maxcalls, uint32_t maxrpcsize, void* ifcallback, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIf3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, mgrtypeuuid, mgrepv, flags, maxcalls, maxrpcsize, ifcallback, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    (void)flags;
    (void)maxcalls;
    (void)maxrpcsize;
    (void)ifcallback;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerRegisterIfEx(void* ifspec, void* mgrtypeuuid, void* mgrepv, uint32_t flags, uint32_t maxcalls, void* ifcallback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIfEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, mgrtypeuuid, mgrepv, flags, maxcalls, ifcallback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    (void)flags;
    (void)maxcalls;
    (void)ifcallback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerSubscribeForNotification(void* binding, int32_t notification, int32_t notificationtype, void* notificationinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerSubscribeForNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, notification, notificationtype, notificationinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)notification;
    (void)notificationtype;
    (void)notificationinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerTestCancel(void* bindinghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerTestCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bindinghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bindinghandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUnregisterIf(void* ifspec, void* mgrtypeuuid, uint32_t waitforcallstocomplete) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUnregisterIf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, mgrtypeuuid, waitforcallstocomplete);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)waitforcallstocomplete;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUnregisterIfEx(void* ifspec, void* mgrtypeuuid, int32_t rundowncontexthandles) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUnregisterIfEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ifspec, mgrtypeuuid, rundowncontexthandles);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)rundowncontexthandles;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUnsubscribeForNotification(void* binding, int32_t notification, void* notificationsqueued) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUnsubscribeForNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binding, notification, notificationsqueued);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binding;
    (void)notification;
    (void)notificationsqueued;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqs(uint32_t maxcalls, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maxcalls, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)maxcalls;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsEx(uint32_t maxcalls, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maxcalls, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIf(uint32_t maxcalls, void* ifspec, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsIf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maxcalls, ifspec, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIfEx(uint32_t maxcalls, void* ifspec, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsIfEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maxcalls, ifspec, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqA(void* protseq, uint32_t maxcalls, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpA(void* protseq, uint32_t maxcalls, void* endpoint, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, endpoint, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExA(void* protseq, uint32_t maxcalls, void* endpoint, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, endpoint, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExW(void* protseq, uint32_t maxcalls, void* endpoint, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, endpoint, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpW(void* protseq, uint32_t maxcalls, void* endpoint, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, endpoint, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqExA(void* protseq, uint32_t maxcalls, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqExW(void* protseq, uint32_t maxcalls, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfA(void* protseq, uint32_t maxcalls, void* ifspec, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, ifspec, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExA(void* protseq, uint32_t maxcalls, void* ifspec, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, ifspec, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExW(void* protseq, uint32_t maxcalls, void* ifspec, void* securitydescriptor, void* policy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, ifspec, securitydescriptor, policy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfW(void* protseq, uint32_t maxcalls, void* ifspec, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, ifspec, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcServerUseProtseqW(void* protseq, uint32_t maxcalls, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protseq, maxcalls, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcRpcServerYield(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerYield");
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

void* windowssysWindowsWin32SystemRpcRpcSmAllocate(uint64_t size, void* pstatus) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size, pstatus);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)size;
    (void)pstatus;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSmClientFree(void* pnodetofree) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmClientFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pnodetofree);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pnodetofree;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSmDestroyClientContext(void* contexthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmDestroyClientContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(contexthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)contexthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSmDisableAllocate(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmDisableAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSmEnableAllocate(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmEnableAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSmFree(void* nodetofree) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nodetofree);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nodetofree;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemRpcRpcSmGetThreadHandle(void* pstatus) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmGetThreadHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstatus);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstatus;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSmSetClientAllocFree(void* clientalloc, void* clientfree) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmSetClientAllocFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientalloc, clientfree);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientalloc;
    (void)clientfree;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSmSetThreadHandle(void* id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmSetThreadHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSmSwapClientAllocFree(void* clientalloc, void* clientfree, void* oldclientalloc, void* oldclientfree) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmSwapClientAllocFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clientalloc, clientfree, oldclientalloc, oldclientfree);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clientalloc;
    (void)clientfree;
    (void)oldclientalloc;
    (void)oldclientfree;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemRpcRpcSsAllocate(uint64_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSsContextLockExclusive(void* serverbindinghandle, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsContextLockExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serverbindinghandle, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serverbindinghandle;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSsContextLockShared(void* serverbindinghandle, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsContextLockShared");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serverbindinghandle, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serverbindinghandle;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcRpcSsDestroyClientContext(void* contexthandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsDestroyClientContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(contexthandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)contexthandle;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcRpcSsDisableAllocate(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsDisableAllocate");
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

void windowssysWindowsWin32SystemRpcRpcSsDontSerializeContext(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsDontSerializeContext");
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

void windowssysWindowsWin32SystemRpcRpcSsEnableAllocate(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsEnableAllocate");
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

void windowssysWindowsWin32SystemRpcRpcSsFree(void* nodetofree) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nodetofree);
        return;
    }
    errno = ENOSYS;
#else
    (void)nodetofree;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcSsGetContextBinding(void* contexthandle, void* binding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsGetContextBinding");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(contexthandle, binding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)contexthandle;
    (void)binding;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemRpcRpcSsGetThreadHandle(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsGetThreadHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemRpcRpcSsSetClientAllocFree(void* clientalloc, void* clientfree) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsSetClientAllocFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(clientalloc, clientfree);
        return;
    }
    errno = ENOSYS;
#else
    (void)clientalloc;
    (void)clientfree;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcRpcSsSetThreadHandle(void* id) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsSetThreadHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(id);
        return;
    }
    errno = ENOSYS;
#else
    (void)id;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemRpcRpcSsSwapClientAllocFree(void* clientalloc, void* clientfree, void* oldclientalloc, void* oldclientfree) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsSwapClientAllocFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(clientalloc, clientfree, oldclientalloc, oldclientfree);
        return;
    }
    errno = ENOSYS;
#else
    (void)clientalloc;
    (void)clientfree;
    (void)oldclientalloc;
    (void)oldclientfree;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcStringBindingComposeA(void* objuuid, void* protseq, void* networkaddr, void* endpoint, void* options, void* stringbinding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingComposeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objuuid, protseq, networkaddr, endpoint, options, stringbinding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)options;
    (void)stringbinding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcStringBindingComposeW(void* objuuid, void* protseq, void* networkaddr, void* endpoint, void* options, void* stringbinding) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingComposeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objuuid, protseq, networkaddr, endpoint, options, stringbinding);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)options;
    (void)stringbinding;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcStringBindingParseA(void* stringbinding, void* objuuid, void* protseq, void* networkaddr, void* endpoint, void* networkoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingParseA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringbinding, objuuid, protseq, networkaddr, endpoint, networkoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stringbinding;
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)networkoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcStringBindingParseW(void* stringbinding, void* objuuid, void* protseq, void* networkaddr, void* endpoint, void* networkoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingParseW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringbinding, objuuid, protseq, networkaddr, endpoint, networkoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stringbinding;
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)networkoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcStringFreeA(void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringFreeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcStringFreeW(void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringFreeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcRpcTestCancel(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcTestCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemRpcRpcUserFree(void* asynchandle, void* pbuffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcUserFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(asynchandle, pbuffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)asynchandle;
    (void)pbuffer;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemRpcUuidCompare(void* uuid1, void* uuid2, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCompare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uuid1, uuid2, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uuid1;
    (void)uuid2;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcUuidCreate(void* uuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcUuidCreateNil(void* niluuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCreateNil");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(niluuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)niluuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcUuidCreateSequential(void* uuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCreateSequential");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcUuidEqual(void* uuid1, void* uuid2, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uuid1, uuid2, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uuid1;
    (void)uuid2;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcUuidFromStringA(void* stringuuid, void* uuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidFromStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringuuid, uuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stringuuid;
    (void)uuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcUuidFromStringW(void* stringuuid, void* uuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidFromStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stringuuid, uuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stringuuid;
    (void)uuid;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssysWindowsWin32SystemRpcUuidHash(void* uuid, void* status) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uuid, status);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uuid;
    (void)status;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemRpcUuidIsNil(void* uuid, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidIsNil");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uuid, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uuid;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcUuidToStringA(void* uuid, void* stringuuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidToStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uuid, stringuuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uuid;
    (void)stringuuid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemRpcUuidToStringW(void* uuid, void* stringuuid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidToStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uuid, stringuuid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uuid;
    (void)stringuuid;
    errno = ENOSYS;
    return -1;
#endif
}

