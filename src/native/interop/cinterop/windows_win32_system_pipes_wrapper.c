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

int32_t windowssys_windows_win32_system_pipes_callNamedPipeA(void* lpnamedpipename, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, uint32_t ntimeout) {
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

int32_t windowssys_windows_win32_system_pipes_callNamedPipeW(void* lpnamedpipename, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, uint32_t ntimeout) {
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

int32_t windowssys_windows_win32_system_pipes_connectNamedPipe(void* hnamedpipe, void* lpoverlapped) {
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

void* windowssys_windows_win32_system_pipes_createNamedPipeA(void* lpname, uint32_t dwopenmode, uint32_t dwpipemode, uint32_t nmaxinstances, uint32_t noutbuffersize, uint32_t ninbuffersize, uint32_t ndefaulttimeout, void* lpsecurityattributes) {
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

void* windowssys_windows_win32_system_pipes_createNamedPipeW(void* lpname, uint32_t dwopenmode, uint32_t dwpipemode, uint32_t nmaxinstances, uint32_t noutbuffersize, uint32_t ninbuffersize, uint32_t ndefaulttimeout, void* lpsecurityattributes) {
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

int32_t windowssys_windows_win32_system_pipes_createPipe(void* hreadpipe, void* hwritepipe, void* lppipeattributes, uint32_t nsize) {
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

int32_t windowssys_windows_win32_system_pipes_disconnectNamedPipe(void* hnamedpipe) {
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

int32_t windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameA(void* arg_0_pipe, void* clientcomputername, uint32_t clientcomputernamelength) {
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
        return km_fn_ptr(arg_0_pipe, clientcomputername, clientcomputernamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    (void)clientcomputername;
    (void)clientcomputernamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameW(void* arg_0_pipe, void* clientcomputername, uint32_t clientcomputernamelength) {
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
        return km_fn_ptr(arg_0_pipe, clientcomputername, clientcomputernamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    (void)clientcomputername;
    (void)clientcomputernamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_pipes_getNamedPipeClientProcessId(void* arg_0_pipe, void* clientprocessid) {
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
        return km_fn_ptr(arg_0_pipe, clientprocessid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    (void)clientprocessid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_pipes_getNamedPipeClientSessionId(void* arg_0_pipe, void* clientsessionid) {
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
        return km_fn_ptr(arg_0_pipe, clientsessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    (void)clientsessionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_pipes_getNamedPipeHandleStateA(void* hnamedpipe, void* lpstate, void* lpcurinstances, void* lpmaxcollectioncount, void* lpcollectdatatimeout, void* lpusername, uint32_t nmaxusernamesize) {
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

int32_t windowssys_windows_win32_system_pipes_getNamedPipeHandleStateW(void* hnamedpipe, void* lpstate, void* lpcurinstances, void* lpmaxcollectioncount, void* lpcollectdatatimeout, void* lpusername, uint32_t nmaxusernamesize) {
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

int32_t windowssys_windows_win32_system_pipes_getNamedPipeInfo(void* hnamedpipe, void* lpflags, void* lpoutbuffersize, void* lpinbuffersize, void* lpmaxinstances) {
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

int32_t windowssys_windows_win32_system_pipes_getNamedPipeServerProcessId(void* arg_0_pipe, void* serverprocessid) {
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
        return km_fn_ptr(arg_0_pipe, serverprocessid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    (void)serverprocessid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_pipes_getNamedPipeServerSessionId(void* arg_0_pipe, void* serversessionid) {
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
        return km_fn_ptr(arg_0_pipe, serversessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_pipe;
    (void)serversessionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_pipes_impersonateNamedPipeClient(void* hnamedpipe) {
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

int32_t windowssys_windows_win32_system_pipes_peekNamedPipe(void* hnamedpipe, void* lpbuffer, uint32_t nbuffersize, void* lpbytesread, void* lptotalbytesavail, void* lpbytesleftthismessage) {
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

int32_t windowssys_windows_win32_system_pipes_setNamedPipeHandleState(void* hnamedpipe, void* lpmode, void* lpmaxcollectioncount, void* lpcollectdatatimeout) {
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

int32_t windowssys_windows_win32_system_pipes_transactNamedPipe(void* hnamedpipe, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, void* lpoverlapped) {
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

int32_t windowssys_windows_win32_system_pipes_waitNamedPipeA(void* lpnamedpipename, uint32_t ntimeout) {
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

int32_t windowssys_windows_win32_system_pipes_waitNamedPipeW(void* lpnamedpipename, uint32_t ntimeout) {
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

