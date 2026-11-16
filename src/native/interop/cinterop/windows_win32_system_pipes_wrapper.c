#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_pipes_wrapper.h"
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

int32_t windowssysWindowsWin32SystemPipesCallNamedPipeA(void* lpnamedpipename, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, uint32_t ntimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNamedPipeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnamedpipename, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesread, ntimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpnamedpipename;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesread;
    (void)ntimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesCallNamedPipeW(void* lpnamedpipename, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, uint32_t ntimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNamedPipeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnamedpipename, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesread, ntimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpnamedpipename;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesread;
    (void)ntimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesConnectNamedPipe(void* hnamedpipe, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConnectNamedPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnamedpipe, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnamedpipe;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemPipesCreateNamedPipeA(void* lpname, uint32_t dwopenmode, uint32_t dwpipemode, uint32_t nmaxinstances, uint32_t noutbuffersize, uint32_t ninbuffersize, uint32_t ndefaulttimeout, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateNamedPipeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, dwopenmode, dwpipemode, nmaxinstances, noutbuffersize, ninbuffersize, ndefaulttimeout, lpsecurityattributes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpname;
    (void)dwopenmode;
    (void)dwpipemode;
    (void)nmaxinstances;
    (void)noutbuffersize;
    (void)ninbuffersize;
    (void)ndefaulttimeout;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemPipesCreateNamedPipeW(void* lpname, uint32_t dwopenmode, uint32_t dwpipemode, uint32_t nmaxinstances, uint32_t noutbuffersize, uint32_t ninbuffersize, uint32_t ndefaulttimeout, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateNamedPipeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, dwopenmode, dwpipemode, nmaxinstances, noutbuffersize, ninbuffersize, ndefaulttimeout, lpsecurityattributes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpname;
    (void)dwopenmode;
    (void)dwpipemode;
    (void)nmaxinstances;
    (void)noutbuffersize;
    (void)ninbuffersize;
    (void)ndefaulttimeout;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemPipesCreatePipe(void* hreadpipe, void* hwritepipe, void* lppipeattributes, uint32_t nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreadpipe, hwritepipe, lppipeattributes, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreadpipe;
    (void)hwritepipe;
    (void)lppipeattributes;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesDisconnectNamedPipe(void* hnamedpipe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisconnectNamedPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnamedpipe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnamedpipe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA(void* arg0Pipe, void* clientcomputername, uint32_t clientcomputernamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientComputerNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Pipe, clientcomputername, clientcomputernamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg0Pipe;
    (void)clientcomputername;
    (void)clientcomputernamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW(void* arg0Pipe, void* clientcomputername, uint32_t clientcomputernamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientComputerNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Pipe, clientcomputername, clientcomputernamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg0Pipe;
    (void)clientcomputername;
    (void)clientcomputernamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId(void* arg0Pipe, void* clientprocessid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientProcessId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Pipe, clientprocessid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg0Pipe;
    (void)clientprocessid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId(void* arg0Pipe, void* clientsessionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeClientSessionId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Pipe, clientsessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg0Pipe;
    (void)clientsessionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA(void* hnamedpipe, void* lpstate, void* lpcurinstances, void* lpmaxcollectioncount, void* lpcollectdatatimeout, void* lpusername, uint32_t nmaxusernamesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeHandleStateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnamedpipe, lpstate, lpcurinstances, lpmaxcollectioncount, lpcollectdatatimeout, lpusername, nmaxusernamesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnamedpipe;
    (void)lpstate;
    (void)lpcurinstances;
    (void)lpmaxcollectioncount;
    (void)lpcollectdatatimeout;
    (void)lpusername;
    (void)nmaxusernamesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW(void* hnamedpipe, void* lpstate, void* lpcurinstances, void* lpmaxcollectioncount, void* lpcollectdatatimeout, void* lpusername, uint32_t nmaxusernamesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeHandleStateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnamedpipe, lpstate, lpcurinstances, lpmaxcollectioncount, lpcollectdatatimeout, lpusername, nmaxusernamesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnamedpipe;
    (void)lpstate;
    (void)lpcurinstances;
    (void)lpmaxcollectioncount;
    (void)lpcollectdatatimeout;
    (void)lpusername;
    (void)nmaxusernamesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesGetNamedPipeInfo(void* hnamedpipe, void* lpflags, void* lpoutbuffersize, void* lpinbuffersize, void* lpmaxinstances) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnamedpipe, lpflags, lpoutbuffersize, lpinbuffersize, lpmaxinstances);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnamedpipe;
    (void)lpflags;
    (void)lpoutbuffersize;
    (void)lpinbuffersize;
    (void)lpmaxinstances;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId(void* arg0Pipe, void* serverprocessid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeServerProcessId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Pipe, serverprocessid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg0Pipe;
    (void)serverprocessid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId(void* arg0Pipe, void* serversessionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedPipeServerSessionId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg0Pipe, serversessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg0Pipe;
    (void)serversessionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesImpersonateNamedPipeClient(void* hnamedpipe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateNamedPipeClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnamedpipe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnamedpipe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesPeekNamedPipe(void* hnamedpipe, void* lpbuffer, uint32_t nbuffersize, void* lpbytesread, void* lptotalbytesavail, void* lpbytesleftthismessage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekNamedPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnamedpipe, lpbuffer, nbuffersize, lpbytesread, lptotalbytesavail, lpbytesleftthismessage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnamedpipe;
    (void)lpbuffer;
    (void)nbuffersize;
    (void)lpbytesread;
    (void)lptotalbytesavail;
    (void)lpbytesleftthismessage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesSetNamedPipeHandleState(void* hnamedpipe, void* lpmode, void* lpmaxcollectioncount, void* lpcollectdatatimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNamedPipeHandleState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnamedpipe, lpmode, lpmaxcollectioncount, lpcollectdatatimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnamedpipe;
    (void)lpmode;
    (void)lpmaxcollectioncount;
    (void)lpcollectdatatimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesTransactNamedPipe(void* hnamedpipe, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransactNamedPipe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnamedpipe, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesread, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnamedpipe;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesread;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesWaitNamedPipeA(void* lpnamedpipename, uint32_t ntimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitNamedPipeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnamedpipename, ntimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpnamedpipename;
    (void)ntimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemPipesWaitNamedPipeW(void* lpnamedpipename, uint32_t ntimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitNamedPipeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnamedpipename, ntimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpnamedpipename;
    (void)ntimeout;
    errno = ENOSYS;
    return -1;
#endif
}

